package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.buttonMod.ButtonProps
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonGroup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonGroupProps] = js.native
  
  @js.native
  trait ButtonGroupProps
    extends StrictButtonGroupProps
       with /* key */ StringDictionary[js.Any]
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
  }
  
  @js.native
  trait StrictButtonGroupProps extends js.Object {
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Groups can be attached to other content. */
    var attached: scala.Unit | Boolean | left | right | top | bottom = js.native
    
    /** Groups can be less pronounced. */
    var basic: scala.Unit | Boolean = js.native
    
    /** Array of shorthand Button values. */
    var buttons: scala.Unit | SemanticShorthandCollection[ButtonProps] = js.native
    
    /** Primary content. */
    var children: scala.Unit | ReactElement = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Groups can have a shared color. */
    var color: scala.Unit | SemanticCOLORS = js.native
    
    /** Groups can reduce their padding to fit into tighter spaces. */
    var compact: scala.Unit | Boolean = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** Groups can be aligned to the left or right of its container. */
    var floated: scala.Unit | SemanticFLOATS = js.native
    
    /** Groups can take the width of their container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted as icons. */
    var icon: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to appear on dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted as labeled icon buttons. */
    var labeled: scala.Unit | Boolean = js.native
    
    /** Groups can hint towards a negative consequence. */
    var negative: scala.Unit | Boolean = js.native
    
    /** Groups can hint towards a positive consequence. */
    var positive: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to show different levels of emphasis. */
    var primary: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to show different levels of emphasis. */
    var secondary: scala.Unit | Boolean = js.native
    
    /** Groups can have different sizes. */
    var size: scala.Unit | SemanticSIZES = js.native
    
    /** Groups can be formatted to toggle on and off. */
    var toggle: scala.Unit | Boolean = js.native
    
    /** Groups can be formatted to appear vertically. */
    var vertical: scala.Unit | Boolean = js.native
    
    /** Groups can have their widths divided evenly. */
    var widths: scala.Unit | SemanticWIDTHS = js.native
  }
  object StrictButtonGroupProps {
    
    @scala.inline
    def apply(): StrictButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonGroupProps]
    }
    
    @scala.inline
    implicit class StrictButtonGroupPropsOps[Self <: StrictButtonGroupProps] (val x: Self) extends AnyVal {
      
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
      def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAs: Self = this.set("as", ())
      
      @scala.inline
      def setAttached(value: Boolean | left | right | top | bottom): Self = this.set("attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAttached: Self = this.set("attached", ())
      
      @scala.inline
      def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBasic: Self = this.set("basic", ())
      
      @scala.inline
      def setButtonsVarargs(value: SemanticShorthandItem[ButtonProps]*): Self = this.set("buttons", js.Array(value :_*))
      
      @scala.inline
      def setButtons(value: SemanticShorthandCollection[ButtonProps]): Self = this.set("buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteButtons: Self = this.set("buttons", ())
      
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
      def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteColor: Self = this.set("color", ())
      
      @scala.inline
      def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteCompact: Self = this.set("compact", ())
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteContent: Self = this.set("content", ())
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFloated: Self = this.set("floated", ())
      
      @scala.inline
      def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFluid: Self = this.set("fluid", ())
      
      @scala.inline
      def setIcon(value: Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteIcon: Self = this.set("icon", ())
      
      @scala.inline
      def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInverted: Self = this.set("inverted", ())
      
      @scala.inline
      def setLabeled(value: Boolean): Self = this.set("labeled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteLabeled: Self = this.set("labeled", ())
      
      @scala.inline
      def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteNegative: Self = this.set("negative", ())
      
      @scala.inline
      def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePositive: Self = this.set("positive", ())
      
      @scala.inline
      def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deletePrimary: Self = this.set("primary", ())
      
      @scala.inline
      def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteSecondary: Self = this.set("secondary", ())
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = this.set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteSize: Self = this.set("size", ())
      
      @scala.inline
      def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteToggle: Self = this.set("toggle", ())
      
      @scala.inline
      def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteVertical: Self = this.set("vertical", ())
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS): Self = this.set("widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteWidths: Self = this.set("widths", ())
    }
  }
}
