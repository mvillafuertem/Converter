package typingsSlinky.react.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassAttributes[T] extends Attributes {
  
  var ref: scala.Unit | LegacyRef[T] = js.native
}
object ClassAttributes {
  
  @scala.inline
  def apply[T](): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  
  @scala.inline
  implicit class ClassAttributesOps[Self <: ClassAttributes[?], T] (val x: Self & ClassAttributes[T]) extends AnyVal {
    
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
    def setRefRefObject(value: ReactRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", ())
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
