package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cellPadding: scala.Unit | Double | String = js.native
  
  var cellSpacing: scala.Unit | Double | String = js.native
  
  var summary: scala.Unit | String = js.native
}
object TableHTMLAttributes {
  
  @scala.inline
  def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TableHTMLAttributesOps[Self <: TableHTMLAttributes[?], T] (val x: Self & TableHTMLAttributes[T]) extends AnyVal {
    
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
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", ())
    
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", ())
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", ())
  }
}
