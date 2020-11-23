package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.accordionContentMod.AccordionContentProps
import typingsSlinky.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionPanelMod {
  
  @js.native
  trait AccordionPanelProps
    extends StrictAccordionPanelProps
       with /* key */ StringDictionary[js.Any]
  object AccordionPanelProps {
    
    @scala.inline
    def apply(): AccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelProps]
    }
  }
  
  @js.native
  trait StrictAccordionPanelProps extends js.Object {
    
    /** Whether or not the title is in the open state. */
    var active: scala.Unit | Boolean = js.native
    
    /** A shorthand for Accordion.Content. */
    var content: scala.Unit | SemanticShorthandItem[AccordionContentProps] = js.native
    
    /** A panel index. */
    var index: scala.Unit | Double | String = js.native
    
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
    
    /** A shorthand for Accordion.Title. */
    var title: scala.Unit | SemanticShorthandItem[AccordionTitleProps] = js.native
  }
  object StrictAccordionPanelProps {
    
    @scala.inline
    def apply(): StrictAccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionPanelProps]
    }
    
    @scala.inline
    implicit class StrictAccordionPanelPropsOps[Self <: StrictAccordionPanelProps] (val x: Self) extends AnyVal {
      
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
      def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteActive: Self = this.set("active", ())
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction3(
        value: (/* component */ ReactType[AccordionContentProps], AccordionContentProps, /* children */ scala.Unit | ReactElement | ReactNodeArray) => ReactElement | Null
      ): Self = this.set("content", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContent(value: SemanticShorthandItem[AccordionContentProps]): Self = this.set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteContent: Self = this.set("content", ())
      
      @scala.inline
      def setIndex(value: Double | String): Self = this.set("index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteIndex: Self = this.set("index", ())
      
      @scala.inline
      def setOnTitleClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit): Self = this.set("onTitleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def deleteOnTitleClick: Self = this.set("onTitleClick", ())
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction3(
        value: (/* component */ ReactType[AccordionTitleProps], AccordionTitleProps, /* children */ scala.Unit | ReactElement | ReactNodeArray) => ReactElement | Null
      ): Self = this.set("title", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitle(value: SemanticShorthandItem[AccordionTitleProps]): Self = this.set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTitle: Self = this.set("title", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionPanel", JSImport.Default)
  @js.native
  class default ()
    extends Component[AccordionPanelProps, js.Object, js.Any]
  
  type AccordionPanel = ReactComponentClass[AccordionPanelProps]
}
