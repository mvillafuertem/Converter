package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("react-bootstrap/lib/ButtonGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ButtonGroupProps, js.Object, js.Any]
  
  @js.native
  trait ButtonGroup
    extends Component[ButtonGroupProps, js.Object, js.Any]
  
  @js.native
  trait ButtonGroupProps extends HTMLProps[ButtonGroup] {
    
    var block: scala.Unit | Boolean = js.native
    
    var bsSize: scala.Unit | Sizes = js.native
    
    var bsStyle: scala.Unit | String = js.native
    
    var justified: scala.Unit | Boolean = js.native
    
    var vertical: scala.Unit | Boolean = js.native
  }
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
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
      def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBlock: Self = this.set("block", ())
      
      @scala.inline
      def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBsSize: Self = this.set("bsSize", ())
      
      @scala.inline
      def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBsStyle: Self = this.set("bsStyle", ())
      
      @scala.inline
      def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteJustified: Self = this.set("justified", ())
      
      @scala.inline
      def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteVertical: Self = this.set("vertical", ())
    }
  }
}
