package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoHTMLAttributes[T] extends MediaHTMLAttributes[T] {
  
  var disablePictureInPicture: scala.Unit | Boolean = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var playsInline: scala.Unit | Boolean = js.native
  
  var poster: scala.Unit | String = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object VideoHTMLAttributes {
  
  @scala.inline
  def apply[T](): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class VideoHTMLAttributesOps[Self <: VideoHTMLAttributes[?], T] (val x: Self & VideoHTMLAttributes[T]) extends AnyVal {
    
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
    def setDisablePictureInPicture(value: Boolean): Self = this.set("disablePictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePictureInPicture: Self = this.set("disablePictureInPicture", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", ())
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", ())
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", ())
  }
}
