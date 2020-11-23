package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoComplete: scala.Unit | String = js.native
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var cols: scala.Unit | Double = js.native
  
  var dirName: scala.Unit | String = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var maxLength: scala.Unit | Double = js.native
  
  var minLength: scala.Unit | Double = js.native
  
  var name: scala.Unit | String = js.native
  
  @JSName("onChange")
  var onChange_TextareaHTMLAttributes: scala.Unit | ChangeEventHandler[T] = js.native
  
  var readOnly: scala.Unit | Boolean = js.native
  
  var required: scala.Unit | Boolean = js.native
  
  var rows: scala.Unit | Double = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
  
  var wrap: scala.Unit | String = js.native
}
object TextareaHTMLAttributes {
  
  @scala.inline
  def apply[T](): TextareaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TextareaHTMLAttributesOps[Self <: TextareaHTMLAttributes[?], T] (val x: Self & TextareaHTMLAttributes[T]) extends AnyVal {
    
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
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", ())
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", ())
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", ())
    
    @scala.inline
    def setDirName(value: String): Self = this.set("dirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirName: Self = this.set("dirName", ())
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", ())
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", ())
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setOnChange(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", ())
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", ())
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", ())
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", ())
    
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", ())
  }
}
