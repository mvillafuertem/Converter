package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColgroupHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var span: scala.Unit | Double = js.native
}
object ColgroupHTMLAttributes {
  
  @scala.inline
  def apply[T](): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ColgroupHTMLAttributesOps[Self <: ColgroupHTMLAttributes[?], T] (val x: Self & ColgroupHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self & Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self & Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", ())
  }
}
