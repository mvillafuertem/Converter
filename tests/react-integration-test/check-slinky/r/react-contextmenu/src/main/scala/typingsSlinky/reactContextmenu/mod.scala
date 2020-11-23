package typingsSlinky.reactContextmenu

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactText
import typingsSlinky.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  val ContextMenu: ReactComponentClass[ContextMenuProps] = js.native
  
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  val ContextMenuTrigger: ReactComponentClass[ContextMenuTriggerProps] = js.native
  
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  val MenuItem: ReactComponentClass[MenuItemProps] = js.native
  
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  val SubMenu: ReactComponentClass[SubMenuProps] = js.native
  
  @JSImport("react-contextmenu", "connectMenu")
  @js.native
  def connectMenu(menuId: String): js.Function1[/* menu */ js.Any, ?] = js.native
  
  @JSImport("react-contextmenu", "hideMenu")
  @js.native
  def hideMenu(): Unit = js.native
  @JSImport("react-contextmenu", "hideMenu")
  @js.native
  def hideMenu(opts: js.Any): Unit = js.native
  @JSImport("react-contextmenu", "hideMenu")
  @js.native
  def hideMenu(opts: js.Any, target: HTMLElement): Unit = js.native
  @JSImport("react-contextmenu", "hideMenu")
  @js.native
  def hideMenu(opts: Unit, target: HTMLElement): Unit = js.native
  
  @JSImport("react-contextmenu", "showMenu")
  @js.native
  def showMenu(): Unit = js.native
  @JSImport("react-contextmenu", "showMenu")
  @js.native
  def showMenu(opts: js.Any): Unit = js.native
  @JSImport("react-contextmenu", "showMenu")
  @js.native
  def showMenu(opts: js.Any, target: HTMLElement): Unit = js.native
  @JSImport("react-contextmenu", "showMenu")
  @js.native
  def showMenu(opts: Unit, target: HTMLElement): Unit = js.native
  
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  class ContextMenu protected ()
    extends Component[ContextMenuProps, js.Object, js.Any] {
    def this(props: ContextMenuProps) = this()
    def this(props: ContextMenuProps, context: js.Any) = this()
  }
  
  @js.native
  trait ContextMenuProps extends js.Object {
    
    var className: scala.Unit | String = js.native
    
    var data: scala.Unit | js.Any = js.native
    
    var hideOnLeave: scala.Unit | Boolean = js.native
    
    var id: String = js.native
    
    var onHide: scala.Unit | (js.Function1[/* event */ js.Any, Unit]) = js.native
    
    var onMouseLeave: scala.Unit | (js.Function3[
        /* event */ SyntheticMouseEvent[HTMLElement], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
        /* target */ HTMLElement, 
        Unit
      ]) | js.Function = js.native
    
    var onShow: scala.Unit | (js.Function1[/* event */ js.Any, Unit]) = js.native
    
    var rtl: scala.Unit | Boolean = js.native
  }
  object ContextMenuProps {
    
    @scala.inline
    def apply(id: String): ContextMenuProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuProps]
    }
    
    @scala.inline
    implicit class ContextMenuPropsOps[Self <: ContextMenuProps] (val x: Self) extends AnyVal {
      
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
      def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", ())
      
      @scala.inline
      def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteData: Self = this.set("data", ())
      
      @scala.inline
      def setHideOnLeave(value: Boolean): Self = this.set("hideOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHideOnLeave: Self = this.set("hideOnLeave", ())
      
      @scala.inline
      def setOnHide(value: /* event */ js.Any => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteOnHide: Self = this.set("onHide", ())
      
      @scala.inline
      def setOnMouseLeaveFunction3(
        value: (/* event */ SyntheticMouseEvent[HTMLElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = this.set("onMouseLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMouseLeave(
        value: (js.Function3[
              /* event */ SyntheticMouseEvent[HTMLElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteOnMouseLeave: Self = this.set("onMouseLeave", ())
      
      @scala.inline
      def setOnShow(value: /* event */ js.Any => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteOnShow: Self = this.set("onShow", ())
      
      @scala.inline
      def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRtl: Self = this.set("rtl", ())
    }
  }
  
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  class ContextMenuTrigger protected ()
    extends Component[ContextMenuTriggerProps, js.Object, js.Any] {
    def this(props: ContextMenuTriggerProps) = this()
    def this(props: ContextMenuTriggerProps, context: js.Any) = this()
  }
  
  @js.native
  trait ContextMenuTriggerProps extends js.Object {
    
    var attributes: scala.Unit | HTMLAttributes[?] = js.native
    
    var collect: scala.Unit | (js.Function1[/* data */ js.Any, ?]) = js.native
    
    var disable: scala.Unit | Boolean = js.native
    
    var holdToDisplay: scala.Unit | Double = js.native
    
    var id: String = js.native
    
    var renderTag: scala.Unit | ReactType[js.Any] = js.native
  }
  object ContextMenuTriggerProps {
    
    @scala.inline
    def apply(id: String): ContextMenuTriggerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuTriggerProps]
    }
    
    @scala.inline
    implicit class ContextMenuTriggerPropsOps[Self <: ContextMenuTriggerProps] (val x: Self) extends AnyVal {
      
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
      def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: HTMLAttributes[?]): Self = this.set("attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAttributes: Self = this.set("attributes", ())
      
      @scala.inline
      def setCollect(value: /* data */ js.Any => ?): Self = this.set("collect", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteCollect: Self = this.set("collect", ())
      
      @scala.inline
      def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDisable: Self = this.set("disable", ())
      
      @scala.inline
      def setHoldToDisplay(value: Double): Self = this.set("holdToDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHoldToDisplay: Self = this.set("holdToDisplay", ())
      
      @scala.inline
      def setRenderTagFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("renderTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTagComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("renderTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTag(value: ReactType[js.Any]): Self = this.set("renderTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRenderTag: Self = this.set("renderTag", ())
    }
  }
  
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, js.Any] {
    def this(props: MenuItemProps) = this()
    def this(props: MenuItemProps, context: js.Any) = this()
  }
  
  @js.native
  trait MenuItemProps extends js.Object {
    
    var attributes: scala.Unit | HTMLAttributes[HTMLDivElement] = js.native
    
    var className: scala.Unit | String = js.native
    
    var data: scala.Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any) = js.native
    
    var disabled: scala.Unit | Boolean = js.native
    
    var divider: scala.Unit | Boolean = js.native
    
    var onClick: scala.Unit | (js.Function3[
        /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
        /* target */ HTMLElement, 
        Unit
      ]) | js.Function = js.native
    
    var preventClose: scala.Unit | Boolean = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
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
      def setAttributes(value: HTMLAttributes[HTMLDivElement]): Self = this.set("attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAttributes: Self = this.set("attributes", ())
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", ())
      
      @scala.inline
      def setData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any
      ): Self = this.set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteData: Self = this.set("data", ())
      
      @scala.inline
      def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDisabled: Self = this.set("disabled", ())
      
      @scala.inline
      def setDivider(value: Boolean): Self = this.set("divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDivider: Self = this.set("divider", ())
      
      @scala.inline
      def setOnClickFunction3(
        value: (/* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = this.set("onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClick(
        value: (js.Function3[
              /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = this.set("onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteOnClick: Self = this.set("onClick", ())
      
      @scala.inline
      def setPreventClose(value: Boolean): Self = this.set("preventClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePreventClose: Self = this.set("preventClose", ())
    }
  }
  
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  class SubMenu protected ()
    extends Component[SubMenuProps, js.Object, js.Any] {
    def this(props: SubMenuProps) = this()
    def this(props: SubMenuProps, context: js.Any) = this()
  }
  
  @js.native
  trait SubMenuProps extends js.Object {
    
    var className: scala.Unit | String = js.native
    
    var disabled: scala.Unit | Boolean = js.native
    
    var hoverDelay: scala.Unit | Double = js.native
    
    var onClick: scala.Unit | (js.Function3[
        /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
        /* target */ HTMLElement, 
        Unit
      ]) | js.Function = js.native
    
    var preventCloseOnClick: scala.Unit | Boolean = js.native
    
    var rtl: scala.Unit | Boolean = js.native
    
    var title: ReactElement | ReactText = js.native
  }
  object SubMenuProps {
    
    @scala.inline
    def apply(title: ReactElement | ReactText): SubMenuProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuProps]
    }
    
    @scala.inline
    implicit class SubMenuPropsOps[Self <: SubMenuProps] (val x: Self) extends AnyVal {
      
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
      def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement | ReactText): Self = this.set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", ())
      
      @scala.inline
      def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDisabled: Self = this.set("disabled", ())
      
      @scala.inline
      def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHoverDelay: Self = this.set("hoverDelay", ())
      
      @scala.inline
      def setOnClickFunction3(
        value: (/* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = this.set("onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClick(
        value: (js.Function3[
              /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = this.set("onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteOnClick: Self = this.set("onClick", ())
      
      @scala.inline
      def setPreventCloseOnClick(value: Boolean): Self = this.set("preventCloseOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePreventCloseOnClick: Self = this.set("preventCloseOnClick", ())
      
      @scala.inline
      def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteRtl: Self = this.set("rtl", ())
    }
  }
}
