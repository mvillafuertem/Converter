package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeygenHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var challenge: scala.Unit | String = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var keyParams: scala.Unit | String = js.native
  
  var keyType: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
}
object KeygenHTMLAttributes {
  
  @scala.inline
  def apply[T](): KeygenHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeygenHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class KeygenHTMLAttributesOps[Self <: KeygenHTMLAttributes[?], T] (val x: Self & KeygenHTMLAttributes[T]) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", ())
    
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", ())
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", ())
    
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", ())
    
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
  }
}
