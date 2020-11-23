package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cite: scala.Unit | String = js.native
  
  var dateTime: scala.Unit | String = js.native
}
object DelHTMLAttributes {
  
  @scala.inline
  def apply[T](): DelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DelHTMLAttributesOps[Self <: DelHTMLAttributes[?], T] (val x: Self & DelHTMLAttributes[T]) extends AnyVal {
    
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
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCite: Self = this.set("cite", ())
    
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", ())
  }
}
