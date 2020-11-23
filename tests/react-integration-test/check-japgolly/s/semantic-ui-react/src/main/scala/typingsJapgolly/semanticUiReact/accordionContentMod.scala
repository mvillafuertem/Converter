package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionContentMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[AccordionContentProps] = js.native
  
  @js.native
  trait AccordionContentProps
    extends StrictAccordionContentProps
       with /* key */ StringDictionary[js.Any]
  object AccordionContentProps {
    
    @scala.inline
    def apply(): AccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionContentProps]
    }
  }
  
  @js.native
  trait StrictAccordionContentProps extends js.Object {
    
    /** Whether or not the content is visible. */
    var active: scala.Unit | Boolean = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | Node = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
  }
  object StrictAccordionContentProps {
    
    @scala.inline
    def apply(): StrictAccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionContentProps]
    }
    
    @scala.inline
    implicit class StrictAccordionContentPropsOps[Self <: StrictAccordionContentProps] (val x: Self) extends AnyVal {
      
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
      def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAs: Self = this.set("as", ())
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = this.set("children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: VdomNode): Self = this.set("children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteChildren: Self = this.set("children", ())
      
      @scala.inline
      def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteClassName: Self = this.set("className", ())
      
      @scala.inline
      def setContentVdomElement(value: VdomElement): Self = this.set("content", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteContent: Self = this.set("content", ())
    }
  }
}
