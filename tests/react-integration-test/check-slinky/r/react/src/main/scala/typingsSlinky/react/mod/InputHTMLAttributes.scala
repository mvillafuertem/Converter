package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var accept: scala.Unit | String = js.native
  
  var alt: scala.Unit | String = js.native
  
  var autoComplete: scala.Unit | String = js.native
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var capture: scala.Unit | Boolean | String = js.native
  
   // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: scala.Unit | Boolean = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var formAction: scala.Unit | String = js.native
  
  var formEncType: scala.Unit | String = js.native
  
  var formMethod: scala.Unit | String = js.native
  
  var formNoValidate: scala.Unit | Boolean = js.native
  
  var formTarget: scala.Unit | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var list: scala.Unit | String = js.native
  
  var max: scala.Unit | Double | String = js.native
  
  var maxLength: scala.Unit | Double = js.native
  
  var min: scala.Unit | Double | String = js.native
  
  var minLength: scala.Unit | Double = js.native
  
  var multiple: scala.Unit | Boolean = js.native
  
  var name: scala.Unit | String = js.native
  
  @JSName("onChange")
  var onChange_InputHTMLAttributes: scala.Unit | ChangeEventHandler[T] = js.native
  
  var pattern: scala.Unit | String = js.native
  
  var readOnly: scala.Unit | Boolean = js.native
  
  var required: scala.Unit | Boolean = js.native
  
  var size: scala.Unit | Double = js.native
  
  var src: scala.Unit | String = js.native
  
  var step: scala.Unit | Double | String = js.native
  
  var `type`: scala.Unit | String = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object InputHTMLAttributes {
  
  @scala.inline
  def apply[T](): InputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class InputHTMLAttributesOps[Self <: InputHTMLAttributes[?], T] (val x: Self & InputHTMLAttributes[T]) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", ())
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", ())
    
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", ())
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", ())
    
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", ())
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", ())
    
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", ())
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", ())
    
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", ())
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", ())
    
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", ())
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", ())
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setOnChange(value: ChangeEvent[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", ())
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", ())
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", ())
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", ())
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
    
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", ())
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", ())
  }
}
