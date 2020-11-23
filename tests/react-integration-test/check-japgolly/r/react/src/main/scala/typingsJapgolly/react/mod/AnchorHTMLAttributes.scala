package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var download: scala.Unit | js.Any = js.native
  
  var href: scala.Unit | String = js.native
  
  var hrefLang: scala.Unit | String = js.native
  
  var media: scala.Unit | String = js.native
  
  var ping: scala.Unit | String = js.native
  
  var referrerPolicy: scala.Unit | String = js.native
  
  var rel: scala.Unit | String = js.native
  
  var target: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
}
object AnchorHTMLAttributes {
  
  @scala.inline
  def apply[T](): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class AnchorHTMLAttributesOps[Self <: AnchorHTMLAttributes[?], T] (val x: Self & AnchorHTMLAttributes[T]) extends AnyVal {
    
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
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", ())
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", ())
    
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", ())
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", ())
    
    @scala.inline
    def setPing(value: String): Self = this.set("ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePing: Self = this.set("ping", ())
    
    @scala.inline
    def setReferrerPolicy(value: String): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", ())
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", ())
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", ())
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
  }
}
