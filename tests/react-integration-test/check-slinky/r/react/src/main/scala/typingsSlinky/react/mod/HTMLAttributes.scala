package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  
  // RDFa Attributes
  var about: scala.Unit | String = js.native
  
  // Standard HTML Attributes
  var accessKey: scala.Unit | String = js.native
  
  // Non-standard Attributes
  var autoCapitalize: scala.Unit | String = js.native
  
  var autoCorrect: scala.Unit | String = js.native
  
  var autoSave: scala.Unit | String = js.native
  
  var className: scala.Unit | String = js.native
  
  var color: scala.Unit | String = js.native
  
  var contentEditable: scala.Unit | Boolean = js.native
  
  var contextMenu: scala.Unit | String = js.native
  
  var datatype: scala.Unit | String = js.native
  
  // React-specific Attributes
  var defaultChecked: scala.Unit | Boolean = js.native
  
  var defaultValue: scala.Unit | String | js.Array[String] = js.native
  
  var dir: scala.Unit | String = js.native
  
  var draggable: scala.Unit | Boolean = js.native
  
  var hidden: scala.Unit | Boolean = js.native
  
  var id: scala.Unit | String = js.native
  
  var inlist: scala.Unit | js.Any = js.native
  
  // Unknown
  var inputMode: scala.Unit | String = js.native
  
  var is: scala.Unit | String = js.native
  
  var itemID: scala.Unit | String = js.native
  
  var itemProp: scala.Unit | String = js.native
  
  var itemRef: scala.Unit | String = js.native
  
  var itemScope: scala.Unit | Boolean = js.native
  
  var itemType: scala.Unit | String = js.native
  
  var lang: scala.Unit | String = js.native
  
  var placeholder: scala.Unit | String = js.native
  
  var prefix: scala.Unit | String = js.native
  
  var property: scala.Unit | String = js.native
  
  var radioGroup: scala.Unit | String = js.native
  
  var resource: scala.Unit | String = js.native
  
  var results: scala.Unit | Double = js.native
  
   // <command>, <menuitem>
  // WAI-ARIA
  var role: scala.Unit | String = js.native
  
  var security: scala.Unit | String = js.native
  
  var slot: scala.Unit | String = js.native
  
  var spellCheck: scala.Unit | Boolean = js.native
  
  var style: scala.Unit | CSSProperties = js.native
  
  var suppressContentEditableWarning: scala.Unit | Boolean = js.native
  
  var suppressHydrationWarning: scala.Unit | Boolean = js.native
  
  var tabIndex: scala.Unit | Double = js.native
  
  var title: scala.Unit | String = js.native
  
  var typeof: scala.Unit | String = js.native
  
  var unselectable: scala.Unit | on | off = js.native
  
  var vocab: scala.Unit | String = js.native
}
object HTMLAttributes {
  
  @scala.inline
  def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
    
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
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", ())
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", ())
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", ())
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", ())
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", ())
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", ())
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", ())
    
    @scala.inline
    def setContentEditable(value: Boolean): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", ())
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", ())
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", ())
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", ())
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", ())
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", ())
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", ())
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", ())
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", ())
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", ())
    
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", ())
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", ())
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", ())
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", ())
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", ())
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", ())
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", ())
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", ())
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", ())
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", ())
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", ())
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", ())
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", ())
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", ())
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", ())
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", ())
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", ())
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", ())
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", ())
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", ())
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", ())
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", ())
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", ())
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", ())
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", ())
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", ())
  }
}
