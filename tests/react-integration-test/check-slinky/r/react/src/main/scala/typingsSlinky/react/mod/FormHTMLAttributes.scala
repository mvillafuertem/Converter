package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var acceptCharset: scala.Unit | String = js.native
  
  var action: scala.Unit | String = js.native
  
  var autoComplete: scala.Unit | String = js.native
  
  var encType: scala.Unit | String = js.native
  
  var method: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
  
  var noValidate: scala.Unit | Boolean = js.native
  
  var target: scala.Unit | String = js.native
}
object FormHTMLAttributes {
  
  @scala.inline
  def apply[T](): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class FormHTMLAttributesOps[Self <: FormHTMLAttributes[?], T] (val x: Self & FormHTMLAttributes[T]) extends AnyVal {
    
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
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", ())
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", ())
    
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", ())
    
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncType: Self = this.set("encType", ())
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", ())
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", ())
  }
}
