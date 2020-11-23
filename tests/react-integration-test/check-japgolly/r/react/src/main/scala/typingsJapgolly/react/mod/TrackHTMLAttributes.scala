package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var default: scala.Unit | Boolean = js.native
  
  var kind: scala.Unit | String = js.native
  
  var label: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcLang: scala.Unit | String = js.native
}
object TrackHTMLAttributes {
  
  @scala.inline
  def apply[T](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TrackHTMLAttributesOps[Self <: TrackHTMLAttributes[?], T] (val x: Self & TrackHTMLAttributes[T]) extends AnyVal {
    
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", ())
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", ())
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
    
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", ())
  }
}
