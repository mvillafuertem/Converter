package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context[T] extends js.Object {
  
  var Consumer: typingsJapgolly.react.mod.Consumer[T] = js.native
  
  var Provider: typingsJapgolly.react.mod.Provider[T] = js.native
  
  var displayName: scala.Unit | String = js.native
}
object Context {
  
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T]): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
    
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
    def setConsumer(value: Consumer[T]): Self = this.set("Consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: Provider[T]): Self = this.set("Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", ())
  }
}
