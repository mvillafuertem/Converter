package typingsSlinky.react.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Props / DOM Attributes
// ----------------------------------------------------------------------
/**
  * @deprecated. This was used to allow clients to pass `ref` and `key`
  * to `createElement`, which is no longer necessary due to intersection
  * types. If you need to declare a props object before passing it to
  * `createElement` or a factory, use `ClassAttributes<T>`:
  *
  * ```ts
  * var b: Button | null;
  * var props: ButtonProps & ClassAttributes<Button> = {
  *     ref: b => button = b, // ok!
  *     label: "I'm a Button"
  * };
  * ```
  */
@js.native
trait Props[T] extends js.Object {
  
  var children: scala.Unit | slinky.core.facade.ReactElement = js.native
  
  var key: scala.Unit | Key = js.native
  
  var ref: scala.Unit | LegacyRef[T] = js.native
}
object Props {
  
  @scala.inline
  def apply[T](): Props[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[?], T] (val x: Self & Props[T]) extends AnyVal {
    
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
    def setChildrenReactElement(value: slinky.core.facade.ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: slinky.core.facade.ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", ())
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", ())
    
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
