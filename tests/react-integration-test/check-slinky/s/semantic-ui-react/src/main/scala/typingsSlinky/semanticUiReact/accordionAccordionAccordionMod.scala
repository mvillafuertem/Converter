package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionAccordionMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AccordionAccordionProps] = js.native
  
  @js.native
  trait AccordionAccordionProps
    extends StrictAccordionAccordionProps
       with /* key */ StringDictionary[js.Any]
  object AccordionAccordionProps {
    
    @scala.inline
    def apply(): AccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionAccordionProps]
    }
  }
  
  @js.native
  trait StrictAccordionAccordionProps extends js.Object {
    
    /** Index of the currently active panel. */
    var activeIndex: scala.Unit | Double | js.Array[Double] = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | ReactElement = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Initial activeIndex value. */
    var defaultActiveIndex: scala.Unit | Double | js.Array[Double] = js.native
    
    /** Only allow one panel open at a time. */
    var exclusive: scala.Unit | Boolean = js.native
    
    /**
      * Called when a panel title is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {AccordionTitleProps} data - All item props.
      */
    var onTitleClick: scala.Unit | (js.Function2[
        /* event */ SyntheticMouseEvent[HTMLDivElement], 
        /* data */ AccordionTitleProps, 
        Unit
      ]) = js.native
    
    /** Shorthand array of props for Accordion. */
    var panels: scala.Unit | SemanticShorthandCollection[AccordionPanelProps] = js.native
  }
  object StrictAccordionAccordionProps {
    
    @scala.inline
    def apply(): StrictAccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionAccordionProps]
    }
    
    @scala.inline
    implicit class StrictAccordionAccordionPropsOps[Self <: StrictAccordionAccordionProps] (val x: Self) extends AnyVal {
      
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
      def setActiveIndexVarargs(value: Double*): Self = this.set("activeIndex", js.Array(value :_*))
      
      @scala.inline
      def setActiveIndex(value: Double | js.Array[Double]): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteActiveIndex: Self = this.set("activeIndex", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAs: Self = this.set("as", ())
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteChildren: Self = this.set("children", ())
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", ())
      
      @scala.inline
      def setDefaultActiveIndexVarargs(value: Double*): Self = this.set("defaultActiveIndex", js.Array(value :_*))
      
      @scala.inline
      def setDefaultActiveIndex(value: Double | js.Array[Double]): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", ())
      
      @scala.inline
      def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteExclusive: Self = this.set("exclusive", ())
      
      @scala.inline
      def setOnTitleClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit): Self = this.set("onTitleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def deleteOnTitleClick: Self = this.set("onTitleClick", ())
      
      @scala.inline
      def setPanelsVarargs(value: SemanticShorthandItem[AccordionPanelProps]*): Self = this.set("panels", js.Array(value :_*))
      
      @scala.inline
      def setPanels(value: SemanticShorthandCollection[AccordionPanelProps]): Self = this.set("panels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePanels: Self = this.set("panels", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AccordionAccordionProps, js.Object, js.Any] {
    def this(props: AccordionAccordionProps) = this()
    def this(props: AccordionAccordionProps, context: js.Any) = this()
  }
}
