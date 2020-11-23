package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.anon.Html
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMAttributes[T] extends js.Object {
  
  var children: scala.Unit | Node = js.native
  
  var dangerouslySetInnerHTML: scala.Unit | Html = js.native
  
  // Media Events
  var onAbort: scala.Unit | ReactEventHandler[T] = js.native
  
  var onAnimationEnd: scala.Unit | AnimationEventHandler[T] = js.native
  
  var onAnimationIteration: scala.Unit | AnimationEventHandler[T] = js.native
  
  // Animation Events
  var onAnimationStart: scala.Unit | AnimationEventHandler[T] = js.native
  
  // MouseEvents
  var onAuxClick: scala.Unit | MouseEventHandler[T] = js.native
  
  var onBeforeInput: scala.Unit | FormEventHandler[T] = js.native
  
  var onBlur: scala.Unit | FocusEventHandler[T] = js.native
  
  var onCanPlay: scala.Unit | ReactEventHandler[T] = js.native
  
  var onCanPlayThrough: scala.Unit | ReactEventHandler[T] = js.native
  
  // Form Events
  var onChange: scala.Unit | FormEventHandler[T] = js.native
  
  var onClick: scala.Unit | MouseEventHandler[T] = js.native
  
  // Composition Events
  var onCompositionEnd: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onCompositionStart: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onCompositionUpdate: scala.Unit | CompositionEventHandler[T] = js.native
  
  var onContextMenu: scala.Unit | MouseEventHandler[T] = js.native
  
  // Clipboard Events
  var onCopy: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onCut: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onDoubleClick: scala.Unit | MouseEventHandler[T] = js.native
  
  var onDrag: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragEnd: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragEnter: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragExit: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragLeave: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragOver: scala.Unit | DragEventHandler[T] = js.native
  
  var onDragStart: scala.Unit | DragEventHandler[T] = js.native
  
  var onDrop: scala.Unit | DragEventHandler[T] = js.native
  
  var onDurationChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEmptied: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEncrypted: scala.Unit | ReactEventHandler[T] = js.native
  
  var onEnded: scala.Unit | ReactEventHandler[T] = js.native
  
  var onError: scala.Unit | ReactEventHandler[T] = js.native
  
  // Focus Events
  var onFocus: scala.Unit | FocusEventHandler[T] = js.native
  
  var onInput: scala.Unit | FormEventHandler[T] = js.native
  
  var onInvalid: scala.Unit | FormEventHandler[T] = js.native
  
   // also a Media Event
  // Keyboard Events
  var onKeyDown: scala.Unit | KeyboardEventHandler[T] = js.native
  
  var onKeyPress: scala.Unit | KeyboardEventHandler[T] = js.native
  
  var onKeyUp: scala.Unit | KeyboardEventHandler[T] = js.native
  
  // Image Events
  var onLoad: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadStart: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadedData: scala.Unit | ReactEventHandler[T] = js.native
  
  var onLoadedMetadata: scala.Unit | ReactEventHandler[T] = js.native
  
  var onMouseDown: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseEnter: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseLeave: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseMove: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseOut: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseOver: scala.Unit | MouseEventHandler[T] = js.native
  
  var onMouseUp: scala.Unit | MouseEventHandler[T] = js.native
  
  var onPaste: scala.Unit | ClipboardEventHandler[T] = js.native
  
  var onPause: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPlay: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPlaying: scala.Unit | ReactEventHandler[T] = js.native
  
  var onPointerCancel: scala.Unit | PointerEventHandler[T] = js.native
  
  // Pointer Events
  var onPointerDown: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerEnter: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerLeave: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerMove: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerOut: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerOver: scala.Unit | PointerEventHandler[T] = js.native
  
  var onPointerUp: scala.Unit | PointerEventHandler[T] = js.native
  
  var onProgress: scala.Unit | ReactEventHandler[T] = js.native
  
  var onRateChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onReset: scala.Unit | FormEventHandler[T] = js.native
  
  // UI Events
  var onScroll: scala.Unit | UIEventHandler[T] = js.native
  
  var onSeeked: scala.Unit | ReactEventHandler[T] = js.native
  
  var onSeeking: scala.Unit | ReactEventHandler[T] = js.native
  
  // Selection Events
  var onSelect: scala.Unit | ReactEventHandler[T] = js.native
  
  var onStalled: scala.Unit | ReactEventHandler[T] = js.native
  
  var onSubmit: scala.Unit | FormEventHandler[T] = js.native
  
  var onSuspend: scala.Unit | ReactEventHandler[T] = js.native
  
  var onTimeUpdate: scala.Unit | ReactEventHandler[T] = js.native
  
  // Touch Events
  var onTouchCancel: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchEnd: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchMove: scala.Unit | TouchEventHandler[T] = js.native
  
  var onTouchStart: scala.Unit | TouchEventHandler[T] = js.native
  
  // Transition Events
  var onTransitionEnd: scala.Unit | TransitionEventHandler[T] = js.native
  
  var onVolumeChange: scala.Unit | ReactEventHandler[T] = js.native
  
  var onWaiting: scala.Unit | ReactEventHandler[T] = js.native
  
  // Wheel Events
  var onWheel: scala.Unit | WheelEventHandler[T] = js.native
}
object DOMAttributes {
  
  @scala.inline
  def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  
  @scala.inline
  implicit class DOMAttributesOps[Self <: DOMAttributes[?], T] (val x: Self & DOMAttributes[T]) extends AnyVal {
    
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
    def setChildrenVdomElement(value: VdomElement): Self = this.set("children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: VdomNode): Self = this.set("children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", ())
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", ())
    
    @scala.inline
    def setOnAbort(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", ())
    
    @scala.inline
    def setOnAnimationEnd(value: ReactAnimationEventFrom[T & Element] => Callback): Self = this.set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", ())
    
    @scala.inline
    def setOnAnimationIteration(value: ReactAnimationEventFrom[T & Element] => Callback): Self = this.set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", ())
    
    @scala.inline
    def setOnAnimationStart(value: ReactAnimationEventFrom[T & Element] => Callback): Self = this.set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", ())
    
    @scala.inline
    def setOnAuxClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", ())
    
    @scala.inline
    def setOnBeforeInput(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", ())
    
    @scala.inline
    def setOnBlur(value: ReactFocusEventFrom[T & Element] => Callback): Self = this.set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", ())
    
    @scala.inline
    def setOnCanPlay(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", ())
    
    @scala.inline
    def setOnCanPlayThrough(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", ())
    
    @scala.inline
    def setOnChange(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", ())
    
    @scala.inline
    def setOnClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", ())
    
    @scala.inline
    def setOnCompositionEnd(value: ReactCompositionEventFrom[T & Element] => Callback): Self = this.set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", ())
    
    @scala.inline
    def setOnCompositionStart(value: ReactCompositionEventFrom[T & Element] => Callback): Self = this.set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", ())
    
    @scala.inline
    def setOnCompositionUpdate(value: ReactCompositionEventFrom[T & Element] => Callback): Self = this.set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", ())
    
    @scala.inline
    def setOnContextMenu(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", ())
    
    @scala.inline
    def setOnCopy(value: ReactClipboardEventFrom[T & Element] => Callback): Self = this.set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", ())
    
    @scala.inline
    def setOnCut(value: ReactClipboardEventFrom[T & Element] => Callback): Self = this.set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", ())
    
    @scala.inline
    def setOnDoubleClick(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", ())
    
    @scala.inline
    def setOnDrag(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", ())
    
    @scala.inline
    def setOnDragEnd(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", ())
    
    @scala.inline
    def setOnDragEnter(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", ())
    
    @scala.inline
    def setOnDragExit(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", ())
    
    @scala.inline
    def setOnDragLeave(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", ())
    
    @scala.inline
    def setOnDragOver(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", ())
    
    @scala.inline
    def setOnDragStart(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", ())
    
    @scala.inline
    def setOnDrop(value: ReactDragEventFrom[T & Element] => Callback): Self = this.set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", ())
    
    @scala.inline
    def setOnDurationChange(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", ())
    
    @scala.inline
    def setOnEmptied(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", ())
    
    @scala.inline
    def setOnEncrypted(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", ())
    
    @scala.inline
    def setOnEnded(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", ())
    
    @scala.inline
    def setOnError(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onError", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", ())
    
    @scala.inline
    def setOnFocus(value: ReactFocusEventFrom[T & Element] => Callback): Self = this.set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", ())
    
    @scala.inline
    def setOnInput(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", ())
    
    @scala.inline
    def setOnInvalid(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", ())
    
    @scala.inline
    def setOnKeyDown(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = this.set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", ())
    
    @scala.inline
    def setOnKeyPress(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = this.set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", ())
    
    @scala.inline
    def setOnKeyUp(value: ReactKeyboardEventFrom[T & Element] => Callback): Self = this.set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", ())
    
    @scala.inline
    def setOnLoad(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", ())
    
    @scala.inline
    def setOnLoadStart(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", ())
    
    @scala.inline
    def setOnLoadedData(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", ())
    
    @scala.inline
    def setOnLoadedMetadata(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", ())
    
    @scala.inline
    def setOnMouseDown(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", ())
    
    @scala.inline
    def setOnMouseEnter(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", ())
    
    @scala.inline
    def setOnMouseLeave(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", ())
    
    @scala.inline
    def setOnMouseMove(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", ())
    
    @scala.inline
    def setOnMouseOut(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", ())
    
    @scala.inline
    def setOnMouseOver(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", ())
    
    @scala.inline
    def setOnMouseUp(value: ReactMouseEventFrom[T & Element] => Callback): Self = this.set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", ())
    
    @scala.inline
    def setOnPaste(value: ReactClipboardEventFrom[T & Element] => Callback): Self = this.set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", ())
    
    @scala.inline
    def setOnPause(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", ())
    
    @scala.inline
    def setOnPlay(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", ())
    
    @scala.inline
    def setOnPlaying(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", ())
    
    @scala.inline
    def setOnPointerCancel(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", ())
    
    @scala.inline
    def setOnPointerDown(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", ())
    
    @scala.inline
    def setOnPointerEnter(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", ())
    
    @scala.inline
    def setOnPointerLeave(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", ())
    
    @scala.inline
    def setOnPointerMove(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", ())
    
    @scala.inline
    def setOnPointerOut(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", ())
    
    @scala.inline
    def setOnPointerOver(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", ())
    
    @scala.inline
    def setOnPointerUp(value: ReactPointerEventFrom[T & Element] => Callback): Self = this.set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", ())
    
    @scala.inline
    def setOnProgress(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", ())
    
    @scala.inline
    def setOnRateChange(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", ())
    
    @scala.inline
    def setOnReset(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", ())
    
    @scala.inline
    def setOnScroll(value: ReactUIEventFrom[T & Element] => Callback): Self = this.set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", ())
    
    @scala.inline
    def setOnSeeked(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", ())
    
    @scala.inline
    def setOnSeeking(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", ())
    
    @scala.inline
    def setOnSelect(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", ())
    
    @scala.inline
    def setOnStalled(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", ())
    
    @scala.inline
    def setOnSubmit(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", ())
    
    @scala.inline
    def setOnSuspend(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", ())
    
    @scala.inline
    def setOnTimeUpdate(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", ())
    
    @scala.inline
    def setOnTouchCancel(value: ReactTouchEventFrom[T & Element] => Callback): Self = this.set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", ())
    
    @scala.inline
    def setOnTouchEnd(value: ReactTouchEventFrom[T & Element] => Callback): Self = this.set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", ())
    
    @scala.inline
    def setOnTouchMove(value: ReactTouchEventFrom[T & Element] => Callback): Self = this.set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", ())
    
    @scala.inline
    def setOnTouchStart(value: ReactTouchEventFrom[T & Element] => Callback): Self = this.set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", ())
    
    @scala.inline
    def setOnTransitionEnd(value: ReactTransitionEventFrom[T & Element] => Callback): Self = this.set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", ())
    
    @scala.inline
    def setOnVolumeChange(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", ())
    
    @scala.inline
    def setOnWaiting(value: ReactEventFrom[T & Element] => Callback): Self = this.set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", ())
    
    @scala.inline
    def setOnWheel(value: ReactWheelEventFrom[T & Element] => Callback): Self = this.set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[T & Element]) => value(t0).runNow()))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", ())
  }
}
