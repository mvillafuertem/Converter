package typingsSlinky.semanticUiReact

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.HtmlInputrops
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`left corner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`right corner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod {
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  @js.native
  trait InputOnChangeData extends StrictInputProps {
    
    @JSName("value")
    var value_InputOnChangeData: String = js.native
  }
  object InputOnChangeData {
    
    @scala.inline
    def apply(value: String): InputOnChangeData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOnChangeData]
    }
    
    @scala.inline
    implicit class InputOnChangeDataOps[Self <: InputOnChangeData] (val x: Self) extends AnyVal {
      
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
      def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrictInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    /** An Input can be formatted to alert the user to an action they may perform. */
    var action: scala.Unit | js.Any | Boolean = js.native
    
    /** An action can appear along side an Input on the left or right. */
    var actionPosition: scala.Unit | left = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** An Input field can show the data contains errors. */
    var error: scala.Unit | Boolean = js.native
    
    /** Take on the size of its container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** An Input field can show a user is currently interacting with it. */
    var focus: scala.Unit | Boolean = js.native
    
    /** Optional Icon to display inside the Input. */
    var icon: scala.Unit | js.Any | SemanticShorthandItem[InputProps] = js.native
    
    /** An Icon can appear inside an Input on the left. */
    var iconPosition: scala.Unit | left = js.native
    
    /** Shorthand for creating the HTML Input. */
    var input: scala.Unit | SemanticShorthandItem[HtmlInputrops] = js.native
    
    /** Format to appear on dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Optional Label to display along side the Input. */
    var label: scala.Unit | (SemanticShorthandItem[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
      ]) = js.native
    
    /** A Label can appear outside an Input on the left or right. */
    var labelPosition: scala.Unit | left | right | (`left corner`) | (`right corner`) = js.native
    
    /** An Icon Input field can show that it is currently loading data. */
    var loading: scala.Unit | Boolean = js.native
    
    /**
      * Called on change.
      *
      * @param {ChangeEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and a proposed value.
      */
    @JSName("onChange")
    var onChange_StrictInputProps: scala.Unit | (js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData, Unit]) = js.native
    
    /** An Input can vary in size. */
    @JSName("size")
    var size_StrictInputProps: scala.Unit | mini | small | large | big | huge | massive = js.native
    
    /** An Input can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictInputProps: scala.Unit | Double | String = js.native
    
    /** Transparent Input has no background. */
    var transparent: scala.Unit | Boolean = js.native
  }
  object StrictInputProps {
    
    @scala.inline
    def apply(): StrictInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictInputProps]
    }
    
    @scala.inline
    implicit class StrictInputPropsOps[Self <: StrictInputProps] (val x: Self) extends AnyVal {
      
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
      def setAction(value: js.Any | Boolean): Self = this.set("action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAction: Self = this.set("action", ())
      
      @scala.inline
      def setActionPosition(value: left): Self = this.set("actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteActionPosition: Self = this.set("actionPosition", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteAs: Self = this.set("as", ())
      
      @scala.inline
      def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteError: Self = this.set("error", ())
      
      @scala.inline
      def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFluid: Self = this.set("fluid", ())
      
      @scala.inline
      def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFocus: Self = this.set("focus", ())
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ReactType[InputProps], InputProps, /* children */ scala.Unit | ReactElement | ReactNodeArray) => ReactElement | Null
      ): Self = this.set("icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIcon(value: js.Any | SemanticShorthandItem[InputProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteIcon: Self = this.set("icon", ())
      
      @scala.inline
      def setIconPosition(value: left): Self = this.set("iconPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteIconPosition: Self = this.set("iconPosition", ())
      
      @scala.inline
      def setInputReactElement(value: ReactElement): Self = this.set("input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFunction3(
        value: (/* component */ ReactType[HtmlInputrops], HtmlInputrops, /* children */ scala.Unit | ReactElement | ReactNodeArray) => ReactElement | Null
      ): Self = this.set("input", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInput(value: SemanticShorthandItem[HtmlInputrops]): Self = this.set("input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInput: Self = this.set("input", ())
      
      @scala.inline
      def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInverted: Self = this.set("inverted", ())
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactType[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
            ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any, /* children */ scala.Unit | ReactElement | ReactNodeArray) => ReactElement | Null
      ): Self = this.set("label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabel(
        value: SemanticShorthandItem[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
            ]
      ): Self = this.set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteLabel: Self = this.set("label", ())
      
      @scala.inline
      def setLabelPosition(value: left | right | (`left corner`) | (`right corner`)): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteLabelPosition: Self = this.set("labelPosition", ())
      
      @scala.inline
      def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteLoading: Self = this.set("loading", ())
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def deleteOnChange: Self = this.set("onChange", ())
      
      @scala.inline
      def setSize(value: mini | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteSize: Self = this.set("size", ())
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTabIndex: Self = this.set("tabIndex", ())
      
      @scala.inline
      def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTransparent: Self = this.set("transparent", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Input/Input", JSImport.Default)
  @js.native
  class default () extends Input
  
  type InputProps = StrictInputProps
}
