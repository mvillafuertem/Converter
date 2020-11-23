package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// All the WAI-ARIA 1.1 attributes from https://www.w3.org/TR/wai-aria-1.1/
@js.native
trait AriaAttributes extends js.Object {
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: scala.Unit | String = js.native
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: scala.Unit | Boolean = js.native
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: scala.Unit | none | `inline` | list | both = js.native
  
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: scala.Unit | Boolean = js.native
  
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: scala.Unit | Boolean | mixed = js.native
  
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: scala.Unit | Double = js.native
  
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: scala.Unit | Double = js.native
  
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: scala.Unit | Double = js.native
  
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: scala.Unit | String = js.native
  
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: scala.Unit | Boolean | page | step | location | date | time = js.native
  
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: scala.Unit | String = js.native
  
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: scala.Unit | String = js.native
  
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: scala.Unit | Boolean = js.native
  
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: scala.Unit | none | copy | execute | link | move | popup = js.native
  
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: scala.Unit | String = js.native
  
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: scala.Unit | Boolean = js.native
  
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: scala.Unit | String = js.native
  
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: scala.Unit | Boolean = js.native
  
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: scala.Unit | Boolean | menu | listbox | tree | grid | dialog = js.native
  
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: scala.Unit | Boolean = js.native
  
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: scala.Unit | Boolean | grammar | spelling = js.native
  
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: scala.Unit | String = js.native
  
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: scala.Unit | String = js.native
  
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: scala.Unit | String = js.native
  
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: scala.Unit | Double = js.native
  
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: scala.Unit | off | assertive | polite = js.native
  
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: scala.Unit | Boolean = js.native
  
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: scala.Unit | Boolean = js.native
  
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: scala.Unit | Boolean = js.native
  
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: scala.Unit | horizontal | vertical = js.native
  
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: scala.Unit | String = js.native
  
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: scala.Unit | String = js.native
  
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: scala.Unit | Double = js.native
  
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: scala.Unit | Boolean | mixed = js.native
  
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: scala.Unit | Boolean = js.native
  
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: scala.Unit | additions | (`additions text`) | all | removals | text = js.native
  
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: scala.Unit | Boolean = js.native
  
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: scala.Unit | String = js.native
  
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: scala.Unit | Double = js.native
  
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: scala.Unit | Double = js.native
  
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: scala.Unit | Double = js.native
  
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: scala.Unit | Boolean = js.native
  
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: scala.Unit | Double = js.native
  
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: scala.Unit | none | ascending | descending | other = js.native
  
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: scala.Unit | Double = js.native
  
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: scala.Unit | Double = js.native
  
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: scala.Unit | Double = js.native
  
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: scala.Unit | String = js.native
}
object AriaAttributes {
  
  @scala.inline
  def apply(): AriaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaAttributes]
  }
  
  @scala.inline
  implicit class AriaAttributesOps[Self <: AriaAttributes] (val x: Self) extends AnyVal {
    
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
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", ())
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", ())
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", ())
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", ())
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", ())
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", ())
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", ())
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", ())
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", ())
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", ())
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", ())
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", ())
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", ())
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", ())
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", ())
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", ())
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", ())
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", ())
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", ())
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", ())
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", ())
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", ())
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", ())
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", ())
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", ())
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", ())
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", ())
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", ())
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", ())
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", ())
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", ())
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", ())
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", ())
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", ())
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", ())
    
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", ())
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", ())
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", ())
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", ())
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", ())
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", ())
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", ())
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", ())
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", ())
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", ())
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", ())
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", ())
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", ())
  }
}
