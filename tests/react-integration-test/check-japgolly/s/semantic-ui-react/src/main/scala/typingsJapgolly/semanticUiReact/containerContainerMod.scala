package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container/Container", JSImport.Default)
  @js.native
  val default: StatelessComponent[ContainerProps] = js.native
  
  @js.native
  trait ContainerProps
    extends StrictContainerProps
       with /* key */ StringDictionary[js.Any]
  object ContainerProps {
    
    @scala.inline
    def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
  }
  
  @js.native
  trait StrictContainerProps extends js.Object {
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | Node = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** Container has no maximum width. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** Reduce maximum width to more naturally accommodate text. */
    var text: scala.Unit | Boolean = js.native
    
    /** Describes how the text inside this component should be aligned. */
    var textAlign: scala.Unit | SemanticTEXTALIGNMENTS = js.native
  }
  object StrictContainerProps {
    
    @scala.inline
    def apply(): StrictContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictContainerProps]
    }
    
    @scala.inline
    implicit class StrictContainerPropsOps[Self <: StrictContainerProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFluid: Self = this.set("fluid", ())
      
      @scala.inline
      def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteText: Self = this.set("text", ())
      
      @scala.inline
      def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteTextAlign: Self = this.set("textAlign", ())
    }
  }
}
