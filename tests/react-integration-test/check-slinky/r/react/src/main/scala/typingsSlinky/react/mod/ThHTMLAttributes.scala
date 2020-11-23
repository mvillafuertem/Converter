package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.center
import typingsSlinky.react.reactStrings.char
import typingsSlinky.react.reactStrings.justify
import typingsSlinky.react.reactStrings.left
import typingsSlinky.react.reactStrings.right
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var align: scala.Unit | left | center | right | justify | char = js.native
  
  var colSpan: scala.Unit | Double = js.native
  
  var headers: scala.Unit | String = js.native
  
  var rowSpan: scala.Unit | Double = js.native
  
  var scope: scala.Unit | String = js.native
}
object ThHTMLAttributes {
  
  @scala.inline
  def apply[T](): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ThHTMLAttributesOps[Self <: ThHTMLAttributes[?], T] (val x: Self & ThHTMLAttributes[T]) extends AnyVal {
    
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
    def setAlign(value: left | center | right | justify | char): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", ())
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", ())
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", ())
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", ())
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", ())
  }
}
