package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoPlay: scala.Unit | Boolean = js.native
  
  var controls: scala.Unit | Boolean = js.native
  
  var controlsList: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var loop: scala.Unit | Boolean = js.native
  
  var mediaGroup: scala.Unit | String = js.native
  
  var muted: scala.Unit | Boolean = js.native
  
  var playsinline: scala.Unit | Boolean = js.native
  
  var preload: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
}
object MediaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MediaHTMLAttributesOps[Self <: MediaHTMLAttributes[?], T] (val x: Self & MediaHTMLAttributes[T]) extends AnyVal {
    
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", ())
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", ())
    
    @scala.inline
    def setControlsList(value: String): Self = this.set("controlsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsList: Self = this.set("controlsList", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", ())
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", ())
    
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", ())
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", ())
    
    @scala.inline
    def setPlaysinline(value: Boolean): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", ())
    
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
  }
}
