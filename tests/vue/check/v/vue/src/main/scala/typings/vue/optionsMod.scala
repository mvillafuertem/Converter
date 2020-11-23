package typings.vue

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import typings.vue.anon.Default
import typings.vue.anon.Event
import typings.vue.anon.Instantiable
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vnodeMod.VNodeDirective
import typings.vue.vueMod.CombinedVueInstance
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef] extends js.Object {
    
    var activated: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeCreate: scala.Unit | (js.ThisFunction0[/* this */ V, Unit]) = js.native
    
    var beforeDestroy: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeMount: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeUpdate: scala.Unit | js.Function0[Unit] = js.native
    
    var comments: scala.Unit | Boolean = js.native
    
    var components: scala.Unit | (StringDictionary[
        (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
      ]) = js.native
    
    var computed: scala.Unit | Accessors[Computed] = js.native
    
    var created: scala.Unit | js.Function0[Unit] = js.native
    
    var data: scala.Unit | Data = js.native
    
    var deactivated: scala.Unit | js.Function0[Unit] = js.native
    
    var delimiters: scala.Unit | (js.Tuple2[String, String]) = js.native
    
    var destroyed: scala.Unit | js.Function0[Unit] = js.native
    
    var directives: scala.Unit | (StringDictionary[DirectiveFunction | DirectiveOptions]) = js.native
    
    var el: scala.Unit | Element | String = js.native
    
    var errorCaptured: scala.Unit | (js.Function0[Boolean | Unit]) = js.native
    
    // TODO: support properly inferred 'extends'
    var `extends`: scala.Unit | (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]) | VueConstructor[Vue] = js.native
    
    var filters: scala.Unit | StringDictionary[js.Function] = js.native
    
    var inheritAttrs: scala.Unit | Boolean = js.native
    
    var inject: scala.Unit | InjectOptions = js.native
    
    var methods: scala.Unit | Methods = js.native
    
    var mixins: scala.Unit | (js.Array[
        (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps]
        ]) | VueConstructor[Vue]
      ]) = js.native
    
    var model: scala.Unit | Event = js.native
    
    var mounted: scala.Unit | js.Function0[Unit] = js.native
    
    var name: scala.Unit | String = js.native
    
    var parent: scala.Unit | Vue = js.native
    
    var props: scala.Unit | PropsDef = js.native
    
    var propsData: scala.Unit | js.Object = js.native
    
    var provide: scala.Unit | js.Object | js.Function0[js.Object] = js.native
    
    var render: scala.Unit | (js.Function1[/* createElement */ CreateElement, VNode]) = js.native
    
    var renderError: scala.Unit | (js.Function2[/* h */ js.Function0[VNode], /* err */ Error, VNode]) = js.native
    
    var staticRenderFns: scala.Unit | (js.Array[js.Function1[/* createElement */ CreateElement, VNode]]) = js.native
    
    var template: scala.Unit | String = js.native
    
    var transitions: scala.Unit | StringDictionary[js.Object] = js.native
    
    var updated: scala.Unit | js.Function0[Unit] = js.native
    
    var watch: scala.Unit | (Record[String, WatchOptionsWithHandler[?] | WatchHandler[js.Any] | String]) = js.native
  }
  object ComponentOptions {
    
    @scala.inline
    def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef](): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    
    @scala.inline
    implicit class ComponentOptionsOps[Self <: ComponentOptions[?, ?, ?, ?, ?], V /* <: Vue */, Data, Methods, Computed, PropsDef] (val x: Self & (ComponentOptions[V, Data, Methods, Computed, PropsDef])) extends AnyVal {
      
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
      def setActivated(value: () => Unit): Self = this.set("activated", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteActivated: Self = this.set("activated", ())
      
      @scala.inline
      def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = this.set("beforeCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBeforeCreate: Self = this.set("beforeCreate", ())
      
      @scala.inline
      def setBeforeDestroy(value: () => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteBeforeDestroy: Self = this.set("beforeDestroy", ())
      
      @scala.inline
      def setBeforeMount(value: () => Unit): Self = this.set("beforeMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteBeforeMount: Self = this.set("beforeMount", ())
      
      @scala.inline
      def setBeforeUpdate(value: () => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteBeforeUpdate: Self = this.set("beforeUpdate", ())
      
      @scala.inline
      def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteComments: Self = this.set("comments", ())
      
      @scala.inline
      def setComponents(
        value: StringDictionary[
              (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
            ]
      ): Self = this.set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteComponents: Self = this.set("components", ())
      
      @scala.inline
      def setComputed(value: Accessors[Computed]): Self = this.set("computed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteComputed: Self = this.set("computed", ())
      
      @scala.inline
      def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteCreated: Self = this.set("created", ())
      
      @scala.inline
      def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteData: Self = this.set("data", ())
      
      @scala.inline
      def setDeactivated(value: () => Unit): Self = this.set("deactivated", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteDeactivated: Self = this.set("deactivated", ())
      
      @scala.inline
      def setDelimiters(value: js.Tuple2[String, String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDelimiters: Self = this.set("delimiters", ())
      
      @scala.inline
      def setDestroyed(value: () => Unit): Self = this.set("destroyed", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteDestroyed: Self = this.set("destroyed", ())
      
      @scala.inline
      def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = this.set("directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDirectives: Self = this.set("directives", ())
      
      @scala.inline
      def setEl(value: Element | String): Self = this.set("el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteEl: Self = this.set("el", ())
      
      @scala.inline
      def setErrorCaptured(value: () => Boolean | Unit): Self = this.set("errorCaptured", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteErrorCaptured: Self = this.set("errorCaptured", ())
      
      @scala.inline
      def setExtends(
        value: (ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps]
            ]) | VueConstructor[Vue]
      ): Self = this.set("extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteExtends: Self = this.set("extends", ())
      
      @scala.inline
      def setFilters(value: StringDictionary[js.Function]): Self = this.set("filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFilters: Self = this.set("filters", ())
      
      @scala.inline
      def setInheritAttrs(value: Boolean): Self = this.set("inheritAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInheritAttrs: Self = this.set("inheritAttrs", ())
      
      @scala.inline
      def setInjectVarargs(value: String*): Self = this.set("inject", js.Array(value :_*))
      
      @scala.inline
      def setInject(value: InjectOptions): Self = this.set("inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInject: Self = this.set("inject", ())
      
      @scala.inline
      def setMethods(value: Methods): Self = this.set("methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteMethods: Self = this.set("methods", ())
      
      @scala.inline
      def setMixinsVarargs(
        value: ((ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps]
            ]) | VueConstructor[Vue])*
      ): Self = this.set("mixins", js.Array(value :_*))
      
      @scala.inline
      def setMixins(
        value: js.Array[
              (ComponentOptions[
                Vue, 
                DefaultData[Vue], 
                DefaultMethods[Vue], 
                DefaultComputed, 
                PropsDefinition[DefaultProps]
              ]) | VueConstructor[Vue]
            ]
      ): Self = this.set("mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteMixins: Self = this.set("mixins", ())
      
      @scala.inline
      def setModel(value: Event): Self = this.set("model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteModel: Self = this.set("model", ())
      
      @scala.inline
      def setMounted(value: () => Unit): Self = this.set("mounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteMounted: Self = this.set("mounted", ())
      
      @scala.inline
      def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteName: Self = this.set("name", ())
      
      @scala.inline
      def setParent(value: Vue): Self = this.set("parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteParent: Self = this.set("parent", ())
      
      @scala.inline
      def setProps(value: PropsDef): Self = this.set("props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteProps: Self = this.set("props", ())
      
      @scala.inline
      def setPropsData(value: js.Object): Self = this.set("propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePropsData: Self = this.set("propsData", ())
      
      @scala.inline
      def setProvideFunction0(value: () => js.Object): Self = this.set("provide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProvide(value: js.Object | js.Function0[js.Object]): Self = this.set("provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteProvide: Self = this.set("provide", ())
      
      @scala.inline
      def setRender(value: /* createElement */ CreateElement => VNode): Self = this.set("render", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteRender: Self = this.set("render", ())
      
      @scala.inline
      def setRenderError(value: (/* h */ js.Function0[VNode], /* err */ Error) => VNode): Self = this.set("renderError", js.Any.fromFunction2(value))
      
      @scala.inline
      def deleteRenderError: Self = this.set("renderError", ())
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = this.set("staticRenderFns", js.Array(value :_*))
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = this.set("staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStaticRenderFns: Self = this.set("staticRenderFns", ())
      
      @scala.inline
      def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTemplate: Self = this.set("template", ())
      
      @scala.inline
      def setTransitions(value: StringDictionary[js.Object]): Self = this.set("transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTransitions: Self = this.set("transitions", ())
      
      @scala.inline
      def setUpdated(value: () => Unit): Self = this.set("updated", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteUpdated: Self = this.set("updated", ())
      
      @scala.inline
      def setWatch(value: Record[String, WatchOptionsWithHandler[?] | WatchHandler[js.Any] | String]): Self = this.set("watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteWatch: Self = this.set("watch", ())
    }
  }
  
  @js.native
  trait ComputedOptions[T] extends js.Object {
    
    var cache: scala.Unit | Boolean = js.native
    
    var get: scala.Unit | js.Function0[T] = js.native
    
    var set: scala.Unit | (js.Function1[/* value */ T, Unit]) = js.native
  }
  object ComputedOptions {
    
    @scala.inline
    def apply[T](): ComputedOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputedOptions[T]]
    }
    
    @scala.inline
    implicit class ComputedOptionsOps[Self <: ComputedOptions[?], T] (val x: Self & ComputedOptions[T]) extends AnyVal {
      
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
      def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteCache: Self = this.set("cache", ())
      
      @scala.inline
      def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
      
      @scala.inline
      def deleteGet: Self = this.set("get", ())
      
      @scala.inline
      def setSet(value: /* value */ T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteSet: Self = this.set("set", ())
    }
  }
  
  @js.native
  trait Constructor
    extends Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  @js.native
  trait DirectiveOptions extends js.Object {
    
    var bind: scala.Unit | DirectiveFunction = js.native
    
    var componentUpdated: scala.Unit | DirectiveFunction = js.native
    
    var inserted: scala.Unit | DirectiveFunction = js.native
    
    var unbind: scala.Unit | DirectiveFunction = js.native
    
    var update: scala.Unit | DirectiveFunction = js.native
  }
  object DirectiveOptions {
    
    @scala.inline
    def apply(): DirectiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectiveOptions]
    }
    
    @scala.inline
    implicit class DirectiveOptionsOps[Self <: DirectiveOptions] (val x: Self) extends AnyVal {
      
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
      def setBind(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = this.set("bind", js.Any.fromFunction4(value))
      
      @scala.inline
      def deleteBind: Self = this.set("bind", ())
      
      @scala.inline
      def setComponentUpdated(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = this.set("componentUpdated", js.Any.fromFunction4(value))
      
      @scala.inline
      def deleteComponentUpdated: Self = this.set("componentUpdated", ())
      
      @scala.inline
      def setInserted(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = this.set("inserted", js.Any.fromFunction4(value))
      
      @scala.inline
      def deleteInserted: Self = this.set("inserted", ())
      
      @scala.inline
      def setUnbind(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = this.set("unbind", js.Any.fromFunction4(value))
      
      @scala.inline
      def deleteUnbind: Self = this.set("unbind", ())
      
      @scala.inline
      def setUpdate(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = this.set("update", js.Any.fromFunction4(value))
      
      @scala.inline
      def deleteUpdate: Self = this.set("update", ())
    }
  }
  
  @js.native
  trait EsModuleComponent extends js.Object {
    
    var default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps] = js.native
  }
  object EsModuleComponent {
    
    @scala.inline
    def apply(default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): EsModuleComponent = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsModuleComponent]
    }
    
    @scala.inline
    implicit class EsModuleComponentOps[Self <: EsModuleComponent] (val x: Self) extends AnyVal {
      
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
      def setDefault(value: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): Self = this.set("default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
    
    var functional: Boolean = js.native
    
    var inject: scala.Unit | InjectOptions = js.native
    
    var name: scala.Unit | String = js.native
    
    var props: scala.Unit | PropDefs = js.native
    
    def render(createElement: CreateElement, context: RenderContext[Props]): VNode = js.native
  }
  object FunctionalComponentOptions {
    
    @scala.inline
    def apply[Props, PropDefs](functional: Boolean, render: (CreateElement, RenderContext[Props]) => VNode): FunctionalComponentOptions[Props, PropDefs] = {
      val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
    }
    
    @scala.inline
    implicit class FunctionalComponentOptionsOps[Self <: FunctionalComponentOptions[?, ?], Props, PropDefs] (val x: Self & (FunctionalComponentOptions[Props, PropDefs])) extends AnyVal {
      
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
      def setFunctional(value: Boolean): Self = this.set("functional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: (CreateElement, RenderContext[Props]) => VNode): Self = this.set("render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInjectVarargs(value: String*): Self = this.set("inject", js.Array(value :_*))
      
      @scala.inline
      def setInject(value: InjectOptions): Self = this.set("inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInject: Self = this.set("inject", ())
      
      @scala.inline
      def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteName: Self = this.set("name", ())
      
      @scala.inline
      def setProps(value: PropDefs): Self = this.set("props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteProps: Self = this.set("props", ())
    }
  }
  
  @js.native
  trait PropOptions[T] extends js.Object {
    
    var default: scala.Unit | T | Null | js.Function0[js.Object] = js.native
    
    var required: scala.Unit | Boolean = js.native
    
    var `type`: scala.Unit | Prop[T] | js.Array[Prop[T]] = js.native
    
    var validator: scala.Unit | (js.Function1[/* value */ T, Boolean]) = js.native
  }
  object PropOptions {
    
    @scala.inline
    def apply[T](): PropOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropOptions[T]]
    }
    
    @scala.inline
    implicit class PropOptionsOps[Self <: PropOptions[?], T] (val x: Self & PropOptions[T]) extends AnyVal {
      
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
      def setDefaultFunction0(value: () => js.Object): Self = this.set("default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefault(value: T | js.Function0[js.Object]): Self = this.set("default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDefault: Self = this.set("default", ())
      
      @scala.inline
      def setDefaultNull: Self = this.set("default", null)
      
      @scala.inline
      def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRequired: Self = this.set("required", ())
      
      @scala.inline
      def setTypeVarargs(value: Prop[T]*): Self = this.set("type", js.Array(value :_*))
      
      @scala.inline
      def setTypeFunction0(value: () => T): Self = this.set("type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: Prop[T] | js.Array[Prop[T]]): Self = this.set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteType: Self = this.set("type", ())
      
      @scala.inline
      def setValidator(value: /* value */ T => Boolean): Self = this.set("validator", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteValidator: Self = this.set("validator", ())
    }
  }
  
  @js.native
  trait RenderContext[Props] extends js.Object {
    
    var children: js.Array[VNode] = js.native
    
    var data: VNodeData = js.native
    
    var injections: js.Any = js.native
    
    var parent: Vue = js.native
    
    var props: Props = js.native
    
    def slots(): js.Any = js.native
  }
  object RenderContext {
    
    @scala.inline
    def apply[Props](
      children: js.Array[VNode],
      data: VNodeData,
      injections: js.Any,
      parent: Vue,
      props: Props,
      slots: () => js.Any
    ): RenderContext[Props] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
      __obj.asInstanceOf[RenderContext[Props]]
    }
    
    @scala.inline
    implicit class RenderContextOps[Self <: RenderContext[?], Props] (val x: Self & RenderContext[Props]) extends AnyVal {
      
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
      def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: VNodeData): Self = this.set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjections(value: js.Any): Self = this.set("injections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Vue): Self = this.set("parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: () => js.Any): Self = this.set("slots", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WatchOptions extends js.Object {
    
    var deep: scala.Unit | Boolean = js.native
    
    var immediate: scala.Unit | Boolean = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
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
      def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDeep: Self = this.set("deep", ())
      
      @scala.inline
      def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteImmediate: Self = this.set("immediate", ())
    }
  }
  
  @js.native
  trait WatchOptionsWithHandler[T] extends WatchOptions {
    
    def handler(`val`: T, oldVal: T): Unit = js.native
    @JSName("handler")
    var handler_Original: WatchHandler[T] = js.native
  }
  
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typings.vue.vueStrings.Accessors & TopLevel[js.Any]
  
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]
  
  type AsyncComponent[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit], 
    /* reject */ js.Function1[/* reason */ scala.Unit | js.Any, Unit], 
    (js.Promise[
      (Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]) | EsModuleComponent
    ]) | Unit
  ]
  
  type Component[Data, Methods, Computed, Props] = VueConstructor[Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[Vue, Data, Methods, Computed, Props])
  
  type DefaultComputed = StringDictionary[js.Any]
  
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  
  type DefaultProps = Record[String, js.Any]
  
  type DirectiveFunction = js.Function4[
    /* el */ HTMLElement, 
    /* binding */ VNodeDirective, 
    /* vnode */ VNode, 
    /* oldVnode */ VNode, 
    Unit
  ]
  
  type InjectKey = String | js.Symbol
  
  type InjectOptions = (StringDictionary[InjectKey | Default]) | js.Array[String]
  
  type Prop[T] = js.Function0[T] | Instantiable[T]
  
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typings.vue.vueStrings.RecordPropsDefinition & TopLevel[T]
  
  type ThisTypedComponentOptionsWithArrayProps[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */] = js.Object & (ComponentOptions[
    V, 
    Data | (js.ThisFunction0[/* this */ (Record[PropNames, ?]) & V, Data]), 
    Methods, 
    Computed, 
    js.Array[PropNames]
  ]) & (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Record[PropNames, ?]]])
  
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Vue */, Data, Methods, Computed, Props] = js.Object & (ComponentOptions[
    V, 
    Data | (js.ThisFunction0[/* this */ Props & V, Data]), 
    Methods, 
    Computed, 
    RecordPropsDefinition[Props]
  ]) & (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Props]])
  
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, Unit]
}
