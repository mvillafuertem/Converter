package typings.vue

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import typings.vue.anon.Render
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod {
  
  @js.native
  trait VNode extends js.Object {
    
    var children: scala.Unit | js.Array[VNode] = js.native
    
    var componentInstance: scala.Unit | Vue = js.native
    
    var componentOptions: scala.Unit | VNodeComponentOptions = js.native
    
    var context: scala.Unit | Vue = js.native
    
    var data: scala.Unit | VNodeData = js.native
    
    var elm: scala.Unit | Node = js.native
    
    var isComment: Boolean = js.native
    
    var isRootInsert: Boolean = js.native
    
    var isStatic: scala.Unit | Boolean = js.native
    
    var key: scala.Unit | String | Double = js.native
    
    var ns: scala.Unit | String = js.native
    
    var parent: scala.Unit | VNode = js.native
    
    var raw: scala.Unit | Boolean = js.native
    
    var tag: scala.Unit | String = js.native
    
    var text: scala.Unit | String = js.native
  }
  object VNode {
    
    @scala.inline
    def apply(isComment: Boolean, isRootInsert: Boolean): VNode = {
      val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    @scala.inline
    implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
      
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
      def setIsComment(value: Boolean): Self = this.set("isComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRootInsert(value: Boolean): Self = this.set("isRootInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteChildren: Self = this.set("children", ())
      
      @scala.inline
      def setComponentInstance(value: Vue): Self = this.set("componentInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteComponentInstance: Self = this.set("componentInstance", ())
      
      @scala.inline
      def setComponentOptions(value: VNodeComponentOptions): Self = this.set("componentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteComponentOptions: Self = this.set("componentOptions", ())
      
      @scala.inline
      def setContext(value: Vue): Self = this.set("context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteContext: Self = this.set("context", ())
      
      @scala.inline
      def setData(value: VNodeData): Self = this.set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteData: Self = this.set("data", ())
      
      @scala.inline
      def setElm(value: Node): Self = this.set("elm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteElm: Self = this.set("elm", ())
      
      @scala.inline
      def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteIsStatic: Self = this.set("isStatic", ())
      
      @scala.inline
      def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteKey: Self = this.set("key", ())
      
      @scala.inline
      def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteNs: Self = this.set("ns", ())
      
      @scala.inline
      def setParent(value: VNode): Self = this.set("parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteParent: Self = this.set("parent", ())
      
      @scala.inline
      def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRaw: Self = this.set("raw", ())
      
      @scala.inline
      def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTag: Self = this.set("tag", ())
      
      @scala.inline
      def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteText: Self = this.set("text", ())
    }
  }
  
  @js.native
  trait VNodeChildrenArrayContents extends /* x */ NumberDictionary[VNode | String | VNodeChildren]
  object VNodeChildrenArrayContents {
    
    @scala.inline
    def apply(): VNodeChildrenArrayContents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeChildrenArrayContents]
    }
  }
  
  @js.native
  trait VNodeComponentOptions extends js.Object {
    
    var Ctor: VueConstructor[Vue] = js.native
    
    var children: scala.Unit | VNodeChildren = js.native
    
    var listeners: scala.Unit | js.Object = js.native
    
    var propsData: scala.Unit | js.Object = js.native
    
    var tag: scala.Unit | String = js.native
  }
  object VNodeComponentOptions {
    
    @scala.inline
    def apply(Ctor: VueConstructor[Vue]): VNodeComponentOptions = {
      val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeComponentOptions]
    }
    
    @scala.inline
    implicit class VNodeComponentOptionsOps[Self <: VNodeComponentOptions] (val x: Self) extends AnyVal {
      
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
      def setCtor(value: VueConstructor[Vue]): Self = this.set("Ctor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ScopedSlot*): Self = this.set("children", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: VNodeChildren): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteChildren: Self = this.set("children", ())
      
      @scala.inline
      def setListeners(value: js.Object): Self = this.set("listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteListeners: Self = this.set("listeners", ())
      
      @scala.inline
      def setPropsData(value: js.Object): Self = this.set("propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePropsData: Self = this.set("propsData", ())
      
      @scala.inline
      def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTag: Self = this.set("tag", ())
    }
  }
  
  @js.native
  trait VNodeData extends js.Object {
    
    var attrs: scala.Unit | StringDictionary[js.Any] = js.native
    
    var `class`: scala.Unit | js.Any = js.native
    
    var directives: scala.Unit | js.Array[VNodeDirective] = js.native
    
    var domProps: scala.Unit | StringDictionary[js.Any] = js.native
    
    var hook: scala.Unit | StringDictionary[js.Function] = js.native
    
    var inlineTemplate: scala.Unit | Render = js.native
    
    var keepAlive: scala.Unit | Boolean = js.native
    
    var key: scala.Unit | String | Double = js.native
    
    var nativeOn: scala.Unit | (StringDictionary[js.Function | js.Array[js.Function]]) = js.native
    
    var on: scala.Unit | (StringDictionary[js.Function | js.Array[js.Function]]) = js.native
    
    var props: scala.Unit | StringDictionary[js.Any] = js.native
    
    var ref: scala.Unit | String = js.native
    
    var scopedSlots: scala.Unit | StringDictionary[ScopedSlot] = js.native
    
    var show: scala.Unit | Boolean = js.native
    
    var slot: scala.Unit | String = js.native
    
    var staticClass: scala.Unit | String = js.native
    
    var staticStyle: scala.Unit | StringDictionary[js.Any] = js.native
    
    var style: scala.Unit | js.Array[js.Object] | js.Object = js.native
    
    var tag: scala.Unit | String = js.native
    
    var transition: scala.Unit | js.Object = js.native
  }
  object VNodeData {
    
    @scala.inline
    def apply(): VNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeData]
    }
    
    @scala.inline
    implicit class VNodeDataOps[Self <: VNodeData] (val x: Self) extends AnyVal {
      
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
      def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAttrs: Self = this.set("attrs", ())
      
      @scala.inline
      def setClass(value: js.Any): Self = this.set("class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClass: Self = this.set("class", ())
      
      @scala.inline
      def setDirectivesVarargs(value: VNodeDirective*): Self = this.set("directives", js.Array(value :_*))
      
      @scala.inline
      def setDirectives(value: js.Array[VNodeDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDirectives: Self = this.set("directives", ())
      
      @scala.inline
      def setDomProps(value: StringDictionary[js.Any]): Self = this.set("domProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDomProps: Self = this.set("domProps", ())
      
      @scala.inline
      def setHook(value: StringDictionary[js.Function]): Self = this.set("hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHook: Self = this.set("hook", ())
      
      @scala.inline
      def setInlineTemplate(value: Render): Self = this.set("inlineTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInlineTemplate: Self = this.set("inlineTemplate", ())
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteKeepAlive: Self = this.set("keepAlive", ())
      
      @scala.inline
      def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteKey: Self = this.set("key", ())
      
      @scala.inline
      def setNativeOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = this.set("nativeOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteNativeOn: Self = this.set("nativeOn", ())
      
      @scala.inline
      def setOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = this.set("on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteOn: Self = this.set("on", ())
      
      @scala.inline
      def setProps(value: StringDictionary[js.Any]): Self = this.set("props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteProps: Self = this.set("props", ())
      
      @scala.inline
      def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRef: Self = this.set("ref", ())
      
      @scala.inline
      def setScopedSlots(value: StringDictionary[ScopedSlot]): Self = this.set("scopedSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteScopedSlots: Self = this.set("scopedSlots", ())
      
      @scala.inline
      def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteShow: Self = this.set("show", ())
      
      @scala.inline
      def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteSlot: Self = this.set("slot", ())
      
      @scala.inline
      def setStaticClass(value: String): Self = this.set("staticClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStaticClass: Self = this.set("staticClass", ())
      
      @scala.inline
      def setStaticStyle(value: StringDictionary[js.Any]): Self = this.set("staticStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStaticStyle: Self = this.set("staticStyle", ())
      
      @scala.inline
      def setStyleVarargs(value: js.Object*): Self = this.set("style", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Array[js.Object] | js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStyle: Self = this.set("style", ())
      
      @scala.inline
      def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTag: Self = this.set("tag", ())
      
      @scala.inline
      def setTransition(value: js.Object): Self = this.set("transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTransition: Self = this.set("transition", ())
    }
  }
  
  @js.native
  trait VNodeDirective extends js.Object {
    
    val arg: String = js.native
    
    val expression: js.Any = js.native
    
    val modifiers: StringDictionary[Boolean] = js.native
    
    val name: String = js.native
    
    val oldValue: js.Any = js.native
    
    val value: js.Any = js.native
  }
  object VNodeDirective {
    
    @scala.inline
    def apply(
      arg: String,
      expression: js.Any,
      modifiers: StringDictionary[Boolean],
      name: String,
      oldValue: js.Any,
      value: js.Any
    ): VNodeDirective = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeDirective]
    }
    
    @scala.inline
    implicit class VNodeDirectiveOps[Self <: VNodeDirective] (val x: Self) extends AnyVal {
      
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
      def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpression(value: js.Any): Self = this.set("expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiers(value: StringDictionary[Boolean]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    }
  }
  
  type ScopedSlot = js.Function1[/* props */ js.Any, VNodeChildrenArrayContents | String]
  
  type VNodeChildren = VNodeChildrenArrayContents | js.Array[ScopedSlot] | String
}
