package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebViewHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var allowFullScreen: scala.Unit | Boolean = js.native
  
  var allowpopups: scala.Unit | Boolean = js.native
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var autosize: scala.Unit | Boolean = js.native
  
  var blinkfeatures: scala.Unit | String = js.native
  
  var disableblinkfeatures: scala.Unit | String = js.native
  
  var disableguestresize: scala.Unit | Boolean = js.native
  
  var disablewebsecurity: scala.Unit | Boolean = js.native
  
  var guestinstance: scala.Unit | String = js.native
  
  var httpreferrer: scala.Unit | String = js.native
  
  var nodeintegration: scala.Unit | Boolean = js.native
  
  var partition: scala.Unit | String = js.native
  
  var plugins: scala.Unit | Boolean = js.native
  
  var preload: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var useragent: scala.Unit | String = js.native
  
  var webpreferences: scala.Unit | String = js.native
}
object WebViewHTMLAttributes {
  
  @scala.inline
  def apply[T](): WebViewHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class WebViewHTMLAttributesOps[Self <: WebViewHTMLAttributes[?], T] (val x: Self & WebViewHTMLAttributes[T]) extends AnyVal {
    
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
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", ())
    
    @scala.inline
    def setAllowpopups(value: Boolean): Self = this.set("allowpopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowpopups: Self = this.set("allowpopups", ())
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", ())
    
    @scala.inline
    def setAutosize(value: Boolean): Self = this.set("autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosize: Self = this.set("autosize", ())
    
    @scala.inline
    def setBlinkfeatures(value: String): Self = this.set("blinkfeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlinkfeatures: Self = this.set("blinkfeatures", ())
    
    @scala.inline
    def setDisableblinkfeatures(value: String): Self = this.set("disableblinkfeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableblinkfeatures: Self = this.set("disableblinkfeatures", ())
    
    @scala.inline
    def setDisableguestresize(value: Boolean): Self = this.set("disableguestresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableguestresize: Self = this.set("disableguestresize", ())
    
    @scala.inline
    def setDisablewebsecurity(value: Boolean): Self = this.set("disablewebsecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablewebsecurity: Self = this.set("disablewebsecurity", ())
    
    @scala.inline
    def setGuestinstance(value: String): Self = this.set("guestinstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestinstance: Self = this.set("guestinstance", ())
    
    @scala.inline
    def setHttpreferrer(value: String): Self = this.set("httpreferrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpreferrer: Self = this.set("httpreferrer", ())
    
    @scala.inline
    def setNodeintegration(value: Boolean): Self = this.set("nodeintegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeintegration: Self = this.set("nodeintegration", ())
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", ())
    
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", ())
    
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
    
    @scala.inline
    def setUseragent(value: String): Self = this.set("useragent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseragent: Self = this.set("useragent", ())
    
    @scala.inline
    def setWebpreferences(value: String): Self = this.set("webpreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebpreferences: Self = this.set("webpreferences", ())
  }
}
