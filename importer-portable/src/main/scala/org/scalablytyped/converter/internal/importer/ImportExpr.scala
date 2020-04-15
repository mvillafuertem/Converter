package org.scalablytyped.converter.internal
package importer

import org.scalablytyped.converter.internal.scalajs.ExprTree
import org.scalablytyped.converter.internal.scalajs.transforms.FakeLiterals
import org.scalablytyped.converter.internal.ts._

class ImportExpr(importType: ImportType, importName: AdaptiveNamingImport) {
  def apply(tsExpr: TsExpr, scope: TsTreeScope): ExprTree =
    tsExpr match {
      case TsExpr.Ref(value) =>
        ExprTree.Ref(importName(value))

      case TsExpr.Literal(value) =>
        value match {
          case TsLiteralNumber(value) if FakeLiterals.isTooBigForInt(value).isDefined =>
            ExprTree.NumberLit(value + ".0")
          case TsLiteralNumber(value)  => ExprTree.NumberLit(value)
          case TsLiteralString(value)  => ExprTree.StringLit(value)
          case TsLiteralBoolean(value) => ExprTree.BooleanLit(value)
        }

      case TsExpr.Call(function, params) =>
        ExprTree.Call(apply(function, scope), IArray(params.map(p => apply(p, scope))))
      case TsExpr.Unary(op, expr) =>
        ExprTree.Unary(op, apply(expr, scope))
      case TsExpr.BinaryOp(one, op, two) =>
        ExprTree.BinaryOp(apply(one, scope), op, apply(two, scope))
    }
}