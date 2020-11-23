package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var charSet: scala.Unit | String = js.native
  
  var content: scala.Unit | String = js.native
  
  var httpEquiv: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
}
object MetaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MetaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MetaHTMLAttributesOps[Self <: MetaHTMLAttributes[?], T] (val x: Self & MetaHTMLAttributes[T]) extends AnyVal {
    
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
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", ())
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", ())
    
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
  }
}
