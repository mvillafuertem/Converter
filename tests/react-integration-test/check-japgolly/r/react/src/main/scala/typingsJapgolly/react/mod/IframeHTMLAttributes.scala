package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var allow: scala.Unit | String = js.native
  
  var allowFullScreen: scala.Unit | Boolean = js.native
  
  var allowTransparency: scala.Unit | Boolean = js.native
  
  var frameBorder: scala.Unit | Double | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var marginHeight: scala.Unit | Double = js.native
  
  var marginWidth: scala.Unit | Double = js.native
  
  var name: scala.Unit | String = js.native
  
  var referrerPolicy: scala.Unit | String = js.native
  
  var sandbox: scala.Unit | String = js.native
  
  var scrolling: scala.Unit | String = js.native
  
  var seamless: scala.Unit | Boolean = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcDoc: scala.Unit | String = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object IframeHTMLAttributes {
  
  @scala.inline
  def apply[T](): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class IframeHTMLAttributesOps[Self <: IframeHTMLAttributes[?], T] (val x: Self & IframeHTMLAttributes[T]) extends AnyVal {
    
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
    def setAllow(value: String): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", ())
    
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", ())
    
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", ())
    
    @scala.inline
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", ())
    
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", ())
    
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setReferrerPolicy(value: String): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", ())
    
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", ())
    
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", ())
    
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
    
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", ())
  }
}
