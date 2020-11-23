package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllHTMLAttributes[T] extends HTMLAttributes[T] {
  
  // Standard HTML Attributes
  var accept: scala.Unit | String = js.native
  
  var acceptCharset: scala.Unit | String = js.native
  
  var action: scala.Unit | String = js.native
  
  var allowFullScreen: scala.Unit | Boolean = js.native
  
  var allowTransparency: scala.Unit | Boolean = js.native
  
  var alt: scala.Unit | String = js.native
  
  var as: scala.Unit | String = js.native
  
  var async: scala.Unit | Boolean = js.native
  
  var autoComplete: scala.Unit | String = js.native
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var autoPlay: scala.Unit | Boolean = js.native
  
  var capture: scala.Unit | Boolean | String = js.native
  
  var cellPadding: scala.Unit | Double | String = js.native
  
  var cellSpacing: scala.Unit | Double | String = js.native
  
  var challenge: scala.Unit | String = js.native
  
  var charSet: scala.Unit | String = js.native
  
  var checked: scala.Unit | Boolean = js.native
  
  var cite: scala.Unit | String = js.native
  
  var classID: scala.Unit | String = js.native
  
  var colSpan: scala.Unit | Double = js.native
  
  var cols: scala.Unit | Double = js.native
  
  var content: scala.Unit | String = js.native
  
  var controls: scala.Unit | Boolean = js.native
  
  var coords: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var data: scala.Unit | String = js.native
  
  var dateTime: scala.Unit | String = js.native
  
  var default: scala.Unit | Boolean = js.native
  
  var defer: scala.Unit | Boolean = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var download: scala.Unit | js.Any = js.native
  
  var encType: scala.Unit | String = js.native
  
  var form: scala.Unit | String = js.native
  
  var formAction: scala.Unit | String = js.native
  
  var formEncType: scala.Unit | String = js.native
  
  var formMethod: scala.Unit | String = js.native
  
  var formNoValidate: scala.Unit | Boolean = js.native
  
  var formTarget: scala.Unit | String = js.native
  
  var frameBorder: scala.Unit | Double | String = js.native
  
  var headers: scala.Unit | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var high: scala.Unit | Double = js.native
  
  var href: scala.Unit | String = js.native
  
  var hrefLang: scala.Unit | String = js.native
  
  var htmlFor: scala.Unit | String = js.native
  
  var httpEquiv: scala.Unit | String = js.native
  
  var integrity: scala.Unit | String = js.native
  
  var keyParams: scala.Unit | String = js.native
  
  var keyType: scala.Unit | String = js.native
  
  var kind: scala.Unit | String = js.native
  
  var label: scala.Unit | String = js.native
  
  var list: scala.Unit | String = js.native
  
  var loop: scala.Unit | Boolean = js.native
  
  var low: scala.Unit | Double = js.native
  
  var manifest: scala.Unit | String = js.native
  
  var marginHeight: scala.Unit | Double = js.native
  
  var marginWidth: scala.Unit | Double = js.native
  
  var max: scala.Unit | Double | String = js.native
  
  var maxLength: scala.Unit | Double = js.native
  
  var media: scala.Unit | String = js.native
  
  var mediaGroup: scala.Unit | String = js.native
  
  var method: scala.Unit | String = js.native
  
  var min: scala.Unit | Double | String = js.native
  
  var minLength: scala.Unit | Double = js.native
  
  var multiple: scala.Unit | Boolean = js.native
  
  var muted: scala.Unit | Boolean = js.native
  
  var name: scala.Unit | String = js.native
  
  var noValidate: scala.Unit | Boolean = js.native
  
  var nonce: scala.Unit | String = js.native
  
  var open: scala.Unit | Boolean = js.native
  
  var optimum: scala.Unit | Double = js.native
  
  var pattern: scala.Unit | String = js.native
  
  var playsInline: scala.Unit | Boolean = js.native
  
  var poster: scala.Unit | String = js.native
  
  var preload: scala.Unit | String = js.native
  
  var readOnly: scala.Unit | Boolean = js.native
  
  var rel: scala.Unit | String = js.native
  
  var required: scala.Unit | Boolean = js.native
  
  var reversed: scala.Unit | Boolean = js.native
  
  var rowSpan: scala.Unit | Double = js.native
  
  var rows: scala.Unit | Double = js.native
  
  var sandbox: scala.Unit | String = js.native
  
  var scope: scala.Unit | String = js.native
  
  var scoped: scala.Unit | Boolean = js.native
  
  var scrolling: scala.Unit | String = js.native
  
  var seamless: scala.Unit | Boolean = js.native
  
  var selected: scala.Unit | Boolean = js.native
  
  var shape: scala.Unit | String = js.native
  
  var size: scala.Unit | Double = js.native
  
  var sizes: scala.Unit | String = js.native
  
  var span: scala.Unit | Double = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcDoc: scala.Unit | String = js.native
  
  var srcLang: scala.Unit | String = js.native
  
  var srcSet: scala.Unit | String = js.native
  
  var start: scala.Unit | Double = js.native
  
  var step: scala.Unit | Double | String = js.native
  
  var summary: scala.Unit | String = js.native
  
  var target: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
  
  var useMap: scala.Unit | String = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
  
  var width: scala.Unit | Double | String = js.native
  
  var wmode: scala.Unit | String = js.native
  
  var wrap: scala.Unit | String = js.native
}
object AllHTMLAttributes {
  
  @scala.inline
  def apply[T](): AllHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class AllHTMLAttributesOps[Self <: AllHTMLAttributes[?], T] (val x: Self & AllHTMLAttributes[T]) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", ())
    
    @scala.inline
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", ())
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", ())
    
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", ())
    
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", ())
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", ())
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", ())
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", ())
    
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", ())
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", ())
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", ())
    
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", ())
    
    @scala.inline
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", ())
    
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", ())
    
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", ())
    
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", ())
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", ())
    
    @scala.inline
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCite: Self = this.set("cite", ())
    
    @scala.inline
    def setClassID(value: String): Self = this.set("classID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassID: Self = this.set("classID", ())
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", ())
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", ())
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", ())
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", ())
    
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoords: Self = this.set("coords", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", ())
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", ())
    
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", ())
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", ())
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", ())
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", ())
    
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", ())
    
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncType: Self = this.set("encType", ())
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", ())
    
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", ())
    
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", ())
    
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", ())
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", ())
    
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", ())
    
    @scala.inline
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", ())
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", ())
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", ())
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", ())
    
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", ())
    
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", ())
    
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", ())
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", ())
    
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", ())
    
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", ())
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", ())
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", ())
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", ())
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", ())
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", ())
    
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", ())
    
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", ())
    
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", ())
    
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", ())
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", ())
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", ())
    
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", ())
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", ())
    
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", ())
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", ())
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", ())
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", ())
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", ())
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", ())
    
    @scala.inline
    def setOptimum(value: Double): Self = this.set("optimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", ())
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", ())
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", ())
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", ())
    
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", ())
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", ())
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", ())
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", ())
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", ())
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", ())
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", ())
    
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", ())
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", ())
    
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoped: Self = this.set("scoped", ())
    
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", ())
    
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", ())
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", ())
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", ())
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", ())
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", ())
    
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", ())
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", ())
    
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", ())
    
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", ())
    
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", ())
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", ())
    
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", ())
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", ())
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", ())
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
    
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", ())
    
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWmode: Self = this.set("wmode", ())
    
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", ())
  }
}
