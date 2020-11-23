package typingsSlinky.materialUi

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUI {
  
  object BottomNavigation {
    
    @js.native
    trait BottomNavigationItemProps extends js.Object {
      
      var children: Double = js.native
      
      var className: scala.Unit | String = js.native
    }
    object BottomNavigationItemProps {
      
      @scala.inline
      def apply(children: Double): BottomNavigationItemProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[BottomNavigationItemProps]
      }
      
      @scala.inline
      implicit class BottomNavigationItemPropsOps[Self <: BottomNavigationItemProps] (val x: Self) extends AnyVal {
        
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
        def setChildren(value: Double): Self = this.set("children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def deleteClassName: Self = this.set("className", ())
      }
    }
    
    type BottomNavigationItem = ReactComponentClass[BottomNavigationItemProps]
  }
  
  object Styles {
    
    @js.native
    trait MuiTheme extends js.Object {
      
      var spacing: scala.Unit | js.Any = js.native
    }
    object MuiTheme {
      
      @scala.inline
      def apply(): MuiTheme = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MuiTheme]
      }
      
      @scala.inline
      implicit class MuiThemeOps[Self <: MuiTheme] (val x: Self) extends AnyVal {
        
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
        def setSpacing(value: js.Any): Self = this.set("spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def deleteSpacing: Self = this.set("spacing", ())
      }
    }
  }
  
  type SvgIcon = ReactComponentClass[js.Object]
}
