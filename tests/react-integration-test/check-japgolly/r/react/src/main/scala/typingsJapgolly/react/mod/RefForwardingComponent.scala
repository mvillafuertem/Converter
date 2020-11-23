package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefForwardingComponent[T, P] extends js.Object {
  
  def apply(props: PropsWithChildren[P], ref: japgolly.scalajs.react.raw.React.Ref): Element | Null = js.native
  
  var contextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var defaultProps: scala.Unit | Partial[P] = js.native
  
  var displayName: scala.Unit | String = js.native
  
  var propTypes: scala.Unit | WeakValidationMap[P] = js.native
}
