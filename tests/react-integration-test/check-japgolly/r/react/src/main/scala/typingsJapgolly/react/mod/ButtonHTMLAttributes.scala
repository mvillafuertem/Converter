package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.button
import typingsJapgolly.react.reactStrings.reset
import typingsJapgolly.react.reactStrings.submit
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var formAction: scala.Unit | String = js.native
  
  var formEncType: scala.Unit | String = js.native
  
  var formMethod: scala.Unit | String = js.native
  
  var formNoValidate: scala.Unit | Boolean = js.native
  
  var formTarget: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
  
  var `type`: scala.Unit | submit | reset | button = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
}
object ButtonHTMLAttributes {
  
  @scala.inline
  def apply[T](): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ButtonHTMLAttributesOps[Self <: ButtonHTMLAttributes[?], T] (val x: Self & ButtonHTMLAttributes[T]) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", ())
    
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", ())
    
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", ())
    
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", ())
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", ())
    
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", ())
  }
}
