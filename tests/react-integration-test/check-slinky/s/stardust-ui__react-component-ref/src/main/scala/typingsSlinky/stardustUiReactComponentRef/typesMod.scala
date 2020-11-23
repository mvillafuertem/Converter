package typingsSlinky.stardustUiReactComponentRef

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/types", "refPropType")
  @js.native
  val refPropType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any = js.native
  
  @js.native
  trait RefProps extends js.Object {
    
    var children: ReactElement = js.native
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: Ref[js.Any] = js.native
  }
  object RefProps {
    
    @scala.inline
    def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefProps]
    }
    
    @scala.inline
    implicit class RefPropsOps[Self <: RefProps] (val x: Self) extends AnyVal {
      
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
      def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[js.Any]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefNull: Self = this.set("innerRef", null)
    }
  }
}
