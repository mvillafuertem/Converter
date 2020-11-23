package typingsSlinky.react.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mixin[P, S]
  extends ComponentLifecycle[P, S, js.Any] {
  
  var childContextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var contextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var displayName: scala.Unit | String = js.native
  
  var getDefaultProps: scala.Unit | js.Function0[P] = js.native
  
  var getInitialState: scala.Unit | js.Function0[S] = js.native
  
  var mixins: scala.Unit | (js.Array[Mixin[P, S]]) = js.native
  
  var propTypes: scala.Unit | ValidationMap[?] = js.native
  
  var statics: scala.Unit | StringDictionary[js.Any] = js.native
}
object Mixin {
  
  @scala.inline
  def apply[P, S](): Mixin[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin[P, S]]
  }
  
  @scala.inline
  implicit class MixinOps[Self <: Mixin[?, ?], P, S] (val x: Self & (Mixin[P, S])) extends AnyVal {
    
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
    def setChildContextTypes(value: ValidationMap[?]): Self = this.set("childContextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildContextTypes: Self = this.set("childContextTypes", ())
    
    @scala.inline
    def setContextTypes(value: ValidationMap[?]): Self = this.set("contextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextTypes: Self = this.set("contextTypes", ())
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", ())
    
    @scala.inline
    def setGetDefaultProps(value: () => P): Self = this.set("getDefaultProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultProps: Self = this.set("getDefaultProps", ())
    
    @scala.inline
    def setGetInitialState(value: () => S): Self = this.set("getInitialState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialState: Self = this.set("getInitialState", ())
    
    @scala.inline
    def setMixinsVarargs(value: (Mixin[P, S])*): Self = this.set("mixins", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[Mixin[P, S]]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", ())
    
    @scala.inline
    def setPropTypes(value: ValidationMap[?]): Self = this.set("propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropTypes: Self = this.set("propTypes", ())
    
    @scala.inline
    def setStatics(value: StringDictionary[js.Any]): Self = this.set("statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatics: Self = this.set("statics", ())
  }
}
