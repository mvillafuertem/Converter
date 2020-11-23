package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.`after-edge`
import typingsJapgolly.react.reactStrings.`before-edge`
import typingsJapgolly.react.reactStrings.`text-after-edge`
import typingsJapgolly.react.reactStrings.`text-before-edge`
import typingsJapgolly.react.reactStrings.alphabetic
import typingsJapgolly.react.reactStrings.auto
import typingsJapgolly.react.reactStrings.baseline
import typingsJapgolly.react.reactStrings.bevel
import typingsJapgolly.react.reactStrings.butt
import typingsJapgolly.react.reactStrings.central
import typingsJapgolly.react.reactStrings.evenodd
import typingsJapgolly.react.reactStrings.hanging
import typingsJapgolly.react.reactStrings.ideographic
import typingsJapgolly.react.reactStrings.inherit
import typingsJapgolly.react.reactStrings.initial
import typingsJapgolly.react.reactStrings.isolated
import typingsJapgolly.react.reactStrings.linearRGB
import typingsJapgolly.react.reactStrings.mathematical
import typingsJapgolly.react.reactStrings.medial
import typingsJapgolly.react.reactStrings.middle
import typingsJapgolly.react.reactStrings.miter
import typingsJapgolly.react.reactStrings.no
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.nonzero
import typingsJapgolly.react.reactStrings.replace
import typingsJapgolly.react.reactStrings.round
import typingsJapgolly.react.reactStrings.sRGB
import typingsJapgolly.react.reactStrings.square
import typingsJapgolly.react.reactStrings.sum
import typingsJapgolly.react.reactStrings.terminal
import typingsJapgolly.react.reactStrings.yes
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
@js.native
trait SVGAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  
  // SVG Specific attributes
  var accentHeight: scala.Unit | Double | String = js.native
  
  var accumulate: scala.Unit | none | sum = js.native
  
  var additive: scala.Unit | replace | sum = js.native
  
  var alignmentBaseline: scala.Unit | auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = js.native
  
  var allowReorder: scala.Unit | no | yes = js.native
  
  var alphabetic: scala.Unit | Double | String = js.native
  
  var amplitude: scala.Unit | Double | String = js.native
  
  var arabicForm: scala.Unit | initial | medial | terminal | isolated = js.native
  
  var ascent: scala.Unit | Double | String = js.native
  
  var attributeName: scala.Unit | String = js.native
  
  var attributeType: scala.Unit | String = js.native
  
  var autoReverse: scala.Unit | Double | String = js.native
  
  var azimuth: scala.Unit | Double | String = js.native
  
  var baseFrequency: scala.Unit | Double | String = js.native
  
  var baseProfile: scala.Unit | Double | String = js.native
  
  var baselineShift: scala.Unit | Double | String = js.native
  
  var bbox: scala.Unit | Double | String = js.native
  
  var begin: scala.Unit | Double | String = js.native
  
  var bias: scala.Unit | Double | String = js.native
  
  var by: scala.Unit | Double | String = js.native
  
  var calcMode: scala.Unit | Double | String = js.native
  
  var capHeight: scala.Unit | Double | String = js.native
  
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: scala.Unit | String = js.native
  
  var clip: scala.Unit | Double | String = js.native
  
  var clipPath: scala.Unit | String = js.native
  
  var clipPathUnits: scala.Unit | Double | String = js.native
  
  var clipRule: scala.Unit | Double | String = js.native
  
  var color: scala.Unit | String = js.native
  
  var colorInterpolation: scala.Unit | Double | String = js.native
  
  var colorInterpolationFilters: scala.Unit | auto | sRGB | linearRGB | inherit = js.native
  
  var colorProfile: scala.Unit | Double | String = js.native
  
  var colorRendering: scala.Unit | Double | String = js.native
  
  var contentScriptType: scala.Unit | Double | String = js.native
  
  var contentStyleType: scala.Unit | Double | String = js.native
  
  var cursor: scala.Unit | Double | String = js.native
  
  var cx: scala.Unit | Double | String = js.native
  
  var cy: scala.Unit | Double | String = js.native
  
  var d: scala.Unit | String = js.native
  
  var decelerate: scala.Unit | Double | String = js.native
  
  var descent: scala.Unit | Double | String = js.native
  
  var diffuseConstant: scala.Unit | Double | String = js.native
  
  var direction: scala.Unit | Double | String = js.native
  
  var display: scala.Unit | Double | String = js.native
  
  var divisor: scala.Unit | Double | String = js.native
  
  var dominantBaseline: scala.Unit | Double | String = js.native
  
  var dur: scala.Unit | Double | String = js.native
  
  var dx: scala.Unit | Double | String = js.native
  
  var dy: scala.Unit | Double | String = js.native
  
  var edgeMode: scala.Unit | Double | String = js.native
  
  var elevation: scala.Unit | Double | String = js.native
  
  var enableBackground: scala.Unit | Double | String = js.native
  
  var end: scala.Unit | Double | String = js.native
  
  var exponent: scala.Unit | Double | String = js.native
  
  var externalResourcesRequired: scala.Unit | Double | String = js.native
  
  var fill: scala.Unit | String = js.native
  
  var fillOpacity: scala.Unit | Double | String = js.native
  
  var fillRule: scala.Unit | nonzero | evenodd | inherit = js.native
  
  var filter: scala.Unit | String = js.native
  
  var filterRes: scala.Unit | Double | String = js.native
  
  var filterUnits: scala.Unit | Double | String = js.native
  
  var floodColor: scala.Unit | Double | String = js.native
  
  var floodOpacity: scala.Unit | Double | String = js.native
  
  var focusable: scala.Unit | Double | String = js.native
  
  var fontFamily: scala.Unit | String = js.native
  
  var fontSize: scala.Unit | Double | String = js.native
  
  var fontSizeAdjust: scala.Unit | Double | String = js.native
  
  var fontStretch: scala.Unit | Double | String = js.native
  
  var fontStyle: scala.Unit | Double | String = js.native
  
  var fontVariant: scala.Unit | Double | String = js.native
  
  var fontWeight: scala.Unit | Double | String = js.native
  
  var format: scala.Unit | Double | String = js.native
  
  var from: scala.Unit | Double | String = js.native
  
  var fx: scala.Unit | Double | String = js.native
  
  var fy: scala.Unit | Double | String = js.native
  
  var g1: scala.Unit | Double | String = js.native
  
  var g2: scala.Unit | Double | String = js.native
  
  var glyphName: scala.Unit | Double | String = js.native
  
  var glyphOrientationHorizontal: scala.Unit | Double | String = js.native
  
  var glyphOrientationVertical: scala.Unit | Double | String = js.native
  
  var glyphRef: scala.Unit | Double | String = js.native
  
  var gradientTransform: scala.Unit | String = js.native
  
  var gradientUnits: scala.Unit | String = js.native
  
  var hanging: scala.Unit | Double | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var horizAdvX: scala.Unit | Double | String = js.native
  
  var horizOriginX: scala.Unit | Double | String = js.native
  
  var href: scala.Unit | String = js.native
  
  var id: scala.Unit | String = js.native
  
  var ideographic: scala.Unit | Double | String = js.native
  
  var imageRendering: scala.Unit | Double | String = js.native
  
  var in: scala.Unit | String = js.native
  
  var in2: scala.Unit | Double | String = js.native
  
  var intercept: scala.Unit | Double | String = js.native
  
  var k: scala.Unit | Double | String = js.native
  
  var k1: scala.Unit | Double | String = js.native
  
  var k2: scala.Unit | Double | String = js.native
  
  var k3: scala.Unit | Double | String = js.native
  
  var k4: scala.Unit | Double | String = js.native
  
  var kernelMatrix: scala.Unit | Double | String = js.native
  
  var kernelUnitLength: scala.Unit | Double | String = js.native
  
  var kerning: scala.Unit | Double | String = js.native
  
  var keyPoints: scala.Unit | Double | String = js.native
  
  var keySplines: scala.Unit | Double | String = js.native
  
  var keyTimes: scala.Unit | Double | String = js.native
  
  var lang: scala.Unit | String = js.native
  
  var lengthAdjust: scala.Unit | Double | String = js.native
  
  var letterSpacing: scala.Unit | Double | String = js.native
  
  var lightingColor: scala.Unit | Double | String = js.native
  
  var limitingConeAngle: scala.Unit | Double | String = js.native
  
  var local: scala.Unit | Double | String = js.native
  
  var markerEnd: scala.Unit | String = js.native
  
  var markerHeight: scala.Unit | Double | String = js.native
  
  var markerMid: scala.Unit | String = js.native
  
  var markerStart: scala.Unit | String = js.native
  
  var markerUnits: scala.Unit | Double | String = js.native
  
  var markerWidth: scala.Unit | Double | String = js.native
  
  var mask: scala.Unit | String = js.native
  
  var maskContentUnits: scala.Unit | Double | String = js.native
  
  var maskUnits: scala.Unit | Double | String = js.native
  
  var mathematical: scala.Unit | Double | String = js.native
  
  var max: scala.Unit | Double | String = js.native
  
  var media: scala.Unit | String = js.native
  
  var method: scala.Unit | String = js.native
  
  var min: scala.Unit | Double | String = js.native
  
  var mode: scala.Unit | Double | String = js.native
  
  var name: scala.Unit | String = js.native
  
  var numOctaves: scala.Unit | Double | String = js.native
  
  var offset: scala.Unit | Double | String = js.native
  
  var opacity: scala.Unit | Double | String = js.native
  
  var operator: scala.Unit | Double | String = js.native
  
  var order: scala.Unit | Double | String = js.native
  
  var orient: scala.Unit | Double | String = js.native
  
  var orientation: scala.Unit | Double | String = js.native
  
  var origin: scala.Unit | Double | String = js.native
  
  var overflow: scala.Unit | Double | String = js.native
  
  var overlinePosition: scala.Unit | Double | String = js.native
  
  var overlineThickness: scala.Unit | Double | String = js.native
  
  var paintOrder: scala.Unit | Double | String = js.native
  
  var panose1: scala.Unit | Double | String = js.native
  
  var pathLength: scala.Unit | Double | String = js.native
  
  var patternContentUnits: scala.Unit | String = js.native
  
  var patternTransform: scala.Unit | Double | String = js.native
  
  var patternUnits: scala.Unit | String = js.native
  
  var pointerEvents: scala.Unit | Double | String = js.native
  
  var points: scala.Unit | String = js.native
  
  var pointsAtX: scala.Unit | Double | String = js.native
  
  var pointsAtY: scala.Unit | Double | String = js.native
  
  var pointsAtZ: scala.Unit | Double | String = js.native
  
  var preserveAlpha: scala.Unit | Double | String = js.native
  
  var preserveAspectRatio: scala.Unit | String = js.native
  
  var primitiveUnits: scala.Unit | Double | String = js.native
  
  var r: scala.Unit | Double | String = js.native
  
  var radius: scala.Unit | Double | String = js.native
  
  var refX: scala.Unit | Double | String = js.native
  
  var refY: scala.Unit | Double | String = js.native
  
  var renderingIntent: scala.Unit | Double | String = js.native
  
  var repeatCount: scala.Unit | Double | String = js.native
  
  var repeatDur: scala.Unit | Double | String = js.native
  
  var requiredExtensions: scala.Unit | Double | String = js.native
  
  var requiredFeatures: scala.Unit | Double | String = js.native
  
  var restart: scala.Unit | Double | String = js.native
  
  var result: scala.Unit | String = js.native
  
  // Other HTML properties supported by SVG elements in browsers
  var role: scala.Unit | String = js.native
  
  var rotate: scala.Unit | Double | String = js.native
  
  var rx: scala.Unit | Double | String = js.native
  
  var ry: scala.Unit | Double | String = js.native
  
  var scale: scala.Unit | Double | String = js.native
  
  var seed: scala.Unit | Double | String = js.native
  
  var shapeRendering: scala.Unit | Double | String = js.native
  
  var slope: scala.Unit | Double | String = js.native
  
  var spacing: scala.Unit | Double | String = js.native
  
  var specularConstant: scala.Unit | Double | String = js.native
  
  var specularExponent: scala.Unit | Double | String = js.native
  
  var speed: scala.Unit | Double | String = js.native
  
  var spreadMethod: scala.Unit | String = js.native
  
  var startOffset: scala.Unit | Double | String = js.native
  
  var stdDeviation: scala.Unit | Double | String = js.native
  
  var stemh: scala.Unit | Double | String = js.native
  
  var stemv: scala.Unit | Double | String = js.native
  
  var stitchTiles: scala.Unit | Double | String = js.native
  
  var stopColor: scala.Unit | String = js.native
  
  var stopOpacity: scala.Unit | Double | String = js.native
  
  var strikethroughPosition: scala.Unit | Double | String = js.native
  
  var strikethroughThickness: scala.Unit | Double | String = js.native
  
  var string: scala.Unit | Double | String = js.native
  
  var stroke: scala.Unit | String = js.native
  
  var strokeDasharray: scala.Unit | String | Double = js.native
  
  var strokeDashoffset: scala.Unit | String | Double = js.native
  
  var strokeLinecap: scala.Unit | butt | round | square | inherit = js.native
  
  var strokeLinejoin: scala.Unit | miter | round | bevel | inherit = js.native
  
  var strokeMiterlimit: scala.Unit | Double | String = js.native
  
  var strokeOpacity: scala.Unit | Double | String = js.native
  
  var strokeWidth: scala.Unit | Double | String = js.native
  
  var style: scala.Unit | CSSProperties = js.native
  
  var surfaceScale: scala.Unit | Double | String = js.native
  
  var systemLanguage: scala.Unit | Double | String = js.native
  
  var tabIndex: scala.Unit | Double = js.native
  
  var tableValues: scala.Unit | Double | String = js.native
  
  var target: scala.Unit | String = js.native
  
  var targetX: scala.Unit | Double | String = js.native
  
  var targetY: scala.Unit | Double | String = js.native
  
  var textAnchor: scala.Unit | String = js.native
  
  var textDecoration: scala.Unit | Double | String = js.native
  
  var textLength: scala.Unit | Double | String = js.native
  
  var textRendering: scala.Unit | Double | String = js.native
  
  var to: scala.Unit | Double | String = js.native
  
  var transform: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
  
  var u1: scala.Unit | Double | String = js.native
  
  var u2: scala.Unit | Double | String = js.native
  
  var underlinePosition: scala.Unit | Double | String = js.native
  
  var underlineThickness: scala.Unit | Double | String = js.native
  
  var unicode: scala.Unit | Double | String = js.native
  
  var unicodeBidi: scala.Unit | Double | String = js.native
  
  var unicodeRange: scala.Unit | Double | String = js.native
  
  var unitsPerEm: scala.Unit | Double | String = js.native
  
  var vAlphabetic: scala.Unit | Double | String = js.native
  
  var vHanging: scala.Unit | Double | String = js.native
  
  var vIdeographic: scala.Unit | Double | String = js.native
  
  var vMathematical: scala.Unit | Double | String = js.native
  
  var values: scala.Unit | String = js.native
  
  var vectorEffect: scala.Unit | Double | String = js.native
  
  var version: scala.Unit | String = js.native
  
  var vertAdvY: scala.Unit | Double | String = js.native
  
  var vertOriginX: scala.Unit | Double | String = js.native
  
  var vertOriginY: scala.Unit | Double | String = js.native
  
  var viewBox: scala.Unit | String = js.native
  
  var viewTarget: scala.Unit | Double | String = js.native
  
  var visibility: scala.Unit | Double | String = js.native
  
  var width: scala.Unit | Double | String = js.native
  
  var widths: scala.Unit | Double | String = js.native
  
  var wordSpacing: scala.Unit | Double | String = js.native
  
  var writingMode: scala.Unit | Double | String = js.native
  
  var x: scala.Unit | Double | String = js.native
  
  var x1: scala.Unit | Double | String = js.native
  
  var x2: scala.Unit | Double | String = js.native
  
  var xChannelSelector: scala.Unit | String = js.native
  
  var xHeight: scala.Unit | Double | String = js.native
  
  var xlinkActuate: scala.Unit | String = js.native
  
  var xlinkArcrole: scala.Unit | String = js.native
  
  var xlinkHref: scala.Unit | String = js.native
  
  var xlinkRole: scala.Unit | String = js.native
  
  var xlinkShow: scala.Unit | String = js.native
  
  var xlinkTitle: scala.Unit | String = js.native
  
  var xlinkType: scala.Unit | String = js.native
  
  var xmlBase: scala.Unit | String = js.native
  
  var xmlLang: scala.Unit | String = js.native
  
  var xmlSpace: scala.Unit | String = js.native
  
  var xmlns: scala.Unit | String = js.native
  
  var xmlnsXlink: scala.Unit | String = js.native
  
  var y: scala.Unit | Double | String = js.native
  
  var y1: scala.Unit | Double | String = js.native
  
  var y2: scala.Unit | Double | String = js.native
  
  var yChannelSelector: scala.Unit | String = js.native
  
  var z: scala.Unit | Double | String = js.native
  
  var zoomAndPan: scala.Unit | String = js.native
}
object SVGAttributes {
  
  @scala.inline
  def apply[T](): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  
  @scala.inline
  implicit class SVGAttributesOps[Self <: SVGAttributes[?], T] (val x: Self & SVGAttributes[T]) extends AnyVal {
    
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
    def setAccentHeight(value: Double | String): Self = this.set("accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentHeight: Self = this.set("accentHeight", ())
    
    @scala.inline
    def setAccumulate(value: none | sum): Self = this.set("accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccumulate: Self = this.set("accumulate", ())
    
    @scala.inline
    def setAdditive(value: replace | sum): Self = this.set("additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditive: Self = this.set("additive", ())
    
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", ())
    
    @scala.inline
    def setAllowReorder(value: no | yes): Self = this.set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReorder: Self = this.set("allowReorder", ())
    
    @scala.inline
    def setAlphabetic(value: Double | String): Self = this.set("alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphabetic: Self = this.set("alphabetic", ())
    
    @scala.inline
    def setAmplitude(value: Double | String): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("amplitude", ())
    
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = this.set("arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArabicForm: Self = this.set("arabicForm", ())
    
    @scala.inline
    def setAscent(value: Double | String): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscent: Self = this.set("ascent", ())
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", ())
    
    @scala.inline
    def setAttributeType(value: String): Self = this.set("attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("attributeType", ())
    
    @scala.inline
    def setAutoReverse(value: Double | String): Self = this.set("autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReverse: Self = this.set("autoReverse", ())
    
    @scala.inline
    def setAzimuth(value: Double | String): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzimuth: Self = this.set("azimuth", ())
    
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = this.set("baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFrequency: Self = this.set("baseFrequency", ())
    
    @scala.inline
    def setBaseProfile(value: Double | String): Self = this.set("baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseProfile: Self = this.set("baseProfile", ())
    
    @scala.inline
    def setBaselineShift(value: Double | String): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", ())
    
    @scala.inline
    def setBbox(value: Double | String): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", ())
    
    @scala.inline
    def setBegin(value: Double | String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", ())
    
    @scala.inline
    def setBias(value: Double | String): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", ())
    
    @scala.inline
    def setBy(value: Double | String): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", ())
    
    @scala.inline
    def setCalcMode(value: Double | String): Self = this.set("calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalcMode: Self = this.set("calcMode", ())
    
    @scala.inline
    def setCapHeight(value: Double | String): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", ())
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", ())
    
    @scala.inline
    def setClip(value: Double | String): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", ())
    
    @scala.inline
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", ())
    
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = this.set("clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPathUnits: Self = this.set("clipPathUnits", ())
    
    @scala.inline
    def setClipRule(value: Double | String): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", ())
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", ())
    
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", ())
    
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = this.set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolationFilters: Self = this.set("colorInterpolationFilters", ())
    
    @scala.inline
    def setColorProfile(value: Double | String): Self = this.set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorProfile: Self = this.set("colorProfile", ())
    
    @scala.inline
    def setColorRendering(value: Double | String): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", ())
    
    @scala.inline
    def setContentScriptType(value: Double | String): Self = this.set("contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptType: Self = this.set("contentScriptType", ())
    
    @scala.inline
    def setContentStyleType(value: Double | String): Self = this.set("contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyleType: Self = this.set("contentStyleType", ())
    
    @scala.inline
    def setCursor(value: Double | String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", ())
    
    @scala.inline
    def setCx(value: Double | String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", ())
    
    @scala.inline
    def setCy(value: Double | String): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", ())
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", ())
    
    @scala.inline
    def setDecelerate(value: Double | String): Self = this.set("decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecelerate: Self = this.set("decelerate", ())
    
    @scala.inline
    def setDescent(value: Double | String): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescent: Self = this.set("descent", ())
    
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = this.set("diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffuseConstant: Self = this.set("diffuseConstant", ())
    
    @scala.inline
    def setDirection(value: Double | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", ())
    
    @scala.inline
    def setDisplay(value: Double | String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", ())
    
    @scala.inline
    def setDivisor(value: Double | String): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", ())
    
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", ())
    
    @scala.inline
    def setDur(value: Double | String): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDur: Self = this.set("dur", ())
    
    @scala.inline
    def setDx(value: Double | String): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", ())
    
    @scala.inline
    def setDy(value: Double | String): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", ())
    
    @scala.inline
    def setEdgeMode(value: Double | String): Self = this.set("edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeMode: Self = this.set("edgeMode", ())
    
    @scala.inline
    def setElevation(value: Double | String): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", ())
    
    @scala.inline
    def setEnableBackground(value: Double | String): Self = this.set("enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBackground: Self = this.set("enableBackground", ())
    
    @scala.inline
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", ())
    
    @scala.inline
    def setExponent(value: Double | String): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponent: Self = this.set("exponent", ())
    
    @scala.inline
    def setExternalResourcesRequired(value: Double | String): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalResourcesRequired: Self = this.set("externalResourcesRequired", ())
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", ())
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", ())
    
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", ())
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", ())
    
    @scala.inline
    def setFilterRes(value: Double | String): Self = this.set("filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRes: Self = this.set("filterRes", ())
    
    @scala.inline
    def setFilterUnits(value: Double | String): Self = this.set("filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterUnits: Self = this.set("filterUnits", ())
    
    @scala.inline
    def setFloodColor(value: Double | String): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", ())
    
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", ())
    
    @scala.inline
    def setFocusable(value: Double | String): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", ())
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", ())
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", ())
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", ())
    
    @scala.inline
    def setFontStretch(value: Double | String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", ())
    
    @scala.inline
    def setFontStyle(value: Double | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", ())
    
    @scala.inline
    def setFontVariant(value: Double | String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", ())
    
    @scala.inline
    def setFontWeight(value: Double | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", ())
    
    @scala.inline
    def setFormat(value: Double | String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", ())
    
    @scala.inline
    def setFrom(value: Double | String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", ())
    
    @scala.inline
    def setFx(value: Double | String): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", ())
    
    @scala.inline
    def setFy(value: Double | String): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFy: Self = this.set("fy", ())
    
    @scala.inline
    def setG1(value: Double | String): Self = this.set("g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG1: Self = this.set("g1", ())
    
    @scala.inline
    def setG2(value: Double | String): Self = this.set("g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG2: Self = this.set("g2", ())
    
    @scala.inline
    def setGlyphName(value: Double | String): Self = this.set("glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphName: Self = this.set("glyphName", ())
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = this.set("glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationHorizontal: Self = this.set("glyphOrientationHorizontal", ())
    
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", ())
    
    @scala.inline
    def setGlyphRef(value: Double | String): Self = this.set("glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphRef: Self = this.set("glyphRef", ())
    
    @scala.inline
    def setGradientTransform(value: String): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", ())
    
    @scala.inline
    def setGradientUnits(value: String): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", ())
    
    @scala.inline
    def setHanging(value: Double | String): Self = this.set("hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHanging: Self = this.set("hanging", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", ())
    
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = this.set("horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizAdvX: Self = this.set("horizAdvX", ())
    
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = this.set("horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizOriginX: Self = this.set("horizOriginX", ())
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", ())
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", ())
    
    @scala.inline
    def setIdeographic(value: Double | String): Self = this.set("ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeographic: Self = this.set("ideographic", ())
    
    @scala.inline
    def setImageRendering(value: Double | String): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", ())
    
    @scala.inline
    def setIn(value: String): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", ())
    
    @scala.inline
    def setIn2(value: Double | String): Self = this.set("in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn2: Self = this.set("in2", ())
    
    @scala.inline
    def setIntercept(value: Double | String): Self = this.set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", ())
    
    @scala.inline
    def setK(value: Double | String): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK: Self = this.set("k", ())
    
    @scala.inline
    def setK1(value: Double | String): Self = this.set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK1: Self = this.set("k1", ())
    
    @scala.inline
    def setK2(value: Double | String): Self = this.set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK2: Self = this.set("k2", ())
    
    @scala.inline
    def setK3(value: Double | String): Self = this.set("k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK3: Self = this.set("k3", ())
    
    @scala.inline
    def setK4(value: Double | String): Self = this.set("k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK4: Self = this.set("k4", ())
    
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = this.set("kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelMatrix: Self = this.set("kernelMatrix", ())
    
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = this.set("kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelUnitLength: Self = this.set("kernelUnitLength", ())
    
    @scala.inline
    def setKerning(value: Double | String): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", ())
    
    @scala.inline
    def setKeyPoints(value: Double | String): Self = this.set("keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPoints: Self = this.set("keyPoints", ())
    
    @scala.inline
    def setKeySplines(value: Double | String): Self = this.set("keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySplines: Self = this.set("keySplines", ())
    
    @scala.inline
    def setKeyTimes(value: Double | String): Self = this.set("keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTimes: Self = this.set("keyTimes", ())
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", ())
    
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", ())
    
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", ())
    
    @scala.inline
    def setLightingColor(value: Double | String): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", ())
    
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = this.set("limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitingConeAngle: Self = this.set("limitingConeAngle", ())
    
    @scala.inline
    def setLocal(value: Double | String): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", ())
    
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", ())
    
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", ())
    
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", ())
    
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", ())
    
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerUnits: Self = this.set("markerUnits", ())
    
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", ())
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", ())
    
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = this.set("maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskContentUnits: Self = this.set("maskContentUnits", ())
    
    @scala.inline
    def setMaskUnits(value: Double | String): Self = this.set("maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskUnits: Self = this.set("maskUnits", ())
    
    @scala.inline
    def setMathematical(value: Double | String): Self = this.set("mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathematical: Self = this.set("mathematical", ())
    
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", ())
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", ())
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", ())
    
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", ())
    
    @scala.inline
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
    
    @scala.inline
    def setNumOctaves(value: Double | String): Self = this.set("numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumOctaves: Self = this.set("numOctaves", ())
    
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", ())
    
    @scala.inline
    def setOpacity(value: Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", ())
    
    @scala.inline
    def setOperator(value: Double | String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", ())
    
    @scala.inline
    def setOrder(value: Double | String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", ())
    
    @scala.inline
    def setOrient(value: Double | String): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", ())
    
    @scala.inline
    def setOrientation(value: Double | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", ())
    
    @scala.inline
    def setOrigin(value: Double | String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", ())
    
    @scala.inline
    def setOverflow(value: Double | String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", ())
    
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = this.set("overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlinePosition: Self = this.set("overlinePosition", ())
    
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = this.set("overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlineThickness: Self = this.set("overlineThickness", ())
    
    @scala.inline
    def setPaintOrder(value: Double | String): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", ())
    
    @scala.inline
    def setPanose1(value: Double | String): Self = this.set("panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanose1: Self = this.set("panose1", ())
    
    @scala.inline
    def setPathLength(value: Double | String): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathLength: Self = this.set("pathLength", ())
    
    @scala.inline
    def setPatternContentUnits(value: String): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", ())
    
    @scala.inline
    def setPatternTransform(value: Double | String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", ())
    
    @scala.inline
    def setPatternUnits(value: String): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", ())
    
    @scala.inline
    def setPointerEvents(value: Double | String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", ())
    
    @scala.inline
    def setPoints(value: String): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", ())
    
    @scala.inline
    def setPointsAtX(value: Double | String): Self = this.set("pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtX: Self = this.set("pointsAtX", ())
    
    @scala.inline
    def setPointsAtY(value: Double | String): Self = this.set("pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtY: Self = this.set("pointsAtY", ())
    
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = this.set("pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtZ: Self = this.set("pointsAtZ", ())
    
    @scala.inline
    def setPreserveAlpha(value: Double | String): Self = this.set("preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAlpha: Self = this.set("preserveAlpha", ())
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", ())
    
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = this.set("primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveUnits: Self = this.set("primitiveUnits", ())
    
    @scala.inline
    def setR(value: Double | String): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", ())
    
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", ())
    
    @scala.inline
    def setRefX(value: Double | String): Self = this.set("refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefX: Self = this.set("refX", ())
    
    @scala.inline
    def setRefY(value: Double | String): Self = this.set("refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefY: Self = this.set("refY", ())
    
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = this.set("renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingIntent: Self = this.set("renderingIntent", ())
    
    @scala.inline
    def setRepeatCount(value: Double | String): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatCount: Self = this.set("repeatCount", ())
    
    @scala.inline
    def setRepeatDur(value: Double | String): Self = this.set("repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDur: Self = this.set("repeatDur", ())
    
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredExtensions: Self = this.set("requiredExtensions", ())
    
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", ())
    
    @scala.inline
    def setRestart(value: Double | String): Self = this.set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", ())
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", ())
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", ())
    
    @scala.inline
    def setRotate(value: Double | String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", ())
    
    @scala.inline
    def setRx(value: Double | String): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", ())
    
    @scala.inline
    def setRy(value: Double | String): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", ())
    
    @scala.inline
    def setScale(value: Double | String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", ())
    
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", ())
    
    @scala.inline
    def setShapeRendering(value: Double | String): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", ())
    
    @scala.inline
    def setSlope(value: Double | String): Self = this.set("slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlope: Self = this.set("slope", ())
    
    @scala.inline
    def setSpacing(value: Double | String): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", ())
    
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = this.set("specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularConstant: Self = this.set("specularConstant", ())
    
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = this.set("specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularExponent: Self = this.set("specularExponent", ())
    
    @scala.inline
    def setSpeed(value: Double | String): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", ())
    
    @scala.inline
    def setSpreadMethod(value: String): Self = this.set("spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadMethod: Self = this.set("spreadMethod", ())
    
    @scala.inline
    def setStartOffset(value: Double | String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", ())
    
    @scala.inline
    def setStdDeviation(value: Double | String): Self = this.set("stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdDeviation: Self = this.set("stdDeviation", ())
    
    @scala.inline
    def setStemh(value: Double | String): Self = this.set("stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemh: Self = this.set("stemh", ())
    
    @scala.inline
    def setStemv(value: Double | String): Self = this.set("stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemv: Self = this.set("stemv", ())
    
    @scala.inline
    def setStitchTiles(value: Double | String): Self = this.set("stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStitchTiles: Self = this.set("stitchTiles", ())
    
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", ())
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", ())
    
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = this.set("strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughPosition: Self = this.set("strikethroughPosition", ())
    
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = this.set("strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughThickness: Self = this.set("strikethroughThickness", ())
    
    @scala.inline
    def setString(value: Double | String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", ())
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", ())
    
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", ())
    
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", ())
    
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", ())
    
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", ())
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", ())
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", ())
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", ())
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", ())
    
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = this.set("surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurfaceScale: Self = this.set("surfaceScale", ())
    
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLanguage: Self = this.set("systemLanguage", ())
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", ())
    
    @scala.inline
    def setTableValues(value: Double | String): Self = this.set("tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableValues: Self = this.set("tableValues", ())
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", ())
    
    @scala.inline
    def setTargetX(value: Double | String): Self = this.set("targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetX: Self = this.set("targetX", ())
    
    @scala.inline
    def setTargetY(value: Double | String): Self = this.set("targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetY: Self = this.set("targetY", ())
    
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", ())
    
    @scala.inline
    def setTextDecoration(value: Double | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", ())
    
    @scala.inline
    def setTextLength(value: Double | String): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", ())
    
    @scala.inline
    def setTextRendering(value: Double | String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", ())
    
    @scala.inline
    def setTo(value: Double | String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", ())
    
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", ())
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
    
    @scala.inline
    def setU1(value: Double | String): Self = this.set("u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU1: Self = this.set("u1", ())
    
    @scala.inline
    def setU2(value: Double | String): Self = this.set("u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU2: Self = this.set("u2", ())
    
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlinePosition: Self = this.set("underlinePosition", ())
    
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineThickness: Self = this.set("underlineThickness", ())
    
    @scala.inline
    def setUnicode(value: Double | String): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", ())
    
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", ())
    
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", ())
    
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsPerEm: Self = this.set("unitsPerEm", ())
    
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = this.set("vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAlphabetic: Self = this.set("vAlphabetic", ())
    
    @scala.inline
    def setVHanging(value: Double | String): Self = this.set("vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVHanging: Self = this.set("vHanging", ())
    
    @scala.inline
    def setVIdeographic(value: Double | String): Self = this.set("vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVIdeographic: Self = this.set("vIdeographic", ())
    
    @scala.inline
    def setVMathematical(value: Double | String): Self = this.set("vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVMathematical: Self = this.set("vMathematical", ())
    
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", ())
    
    @scala.inline
    def setVectorEffect(value: Double | String): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", ())
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", ())
    
    @scala.inline
    def setVertAdvY(value: Double | String): Self = this.set("vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAdvY: Self = this.set("vertAdvY", ())
    
    @scala.inline
    def setVertOriginX(value: Double | String): Self = this.set("vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginX: Self = this.set("vertOriginX", ())
    
    @scala.inline
    def setVertOriginY(value: Double | String): Self = this.set("vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginY: Self = this.set("vertOriginY", ())
    
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", ())
    
    @scala.inline
    def setViewTarget(value: Double | String): Self = this.set("viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTarget: Self = this.set("viewTarget", ())
    
    @scala.inline
    def setVisibility(value: Double | String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", ())
    
    @scala.inline
    def setWidths(value: Double | String): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", ())
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", ())
    
    @scala.inline
    def setWritingMode(value: Double | String): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", ())
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", ())
    
    @scala.inline
    def setX1(value: Double | String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", ())
    
    @scala.inline
    def setX2(value: Double | String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", ())
    
    @scala.inline
    def setXChannelSelector(value: String): Self = this.set("xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXChannelSelector: Self = this.set("xChannelSelector", ())
    
    @scala.inline
    def setXHeight(value: Double | String): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXHeight: Self = this.set("xHeight", ())
    
    @scala.inline
    def setXlinkActuate(value: String): Self = this.set("xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkActuate: Self = this.set("xlinkActuate", ())
    
    @scala.inline
    def setXlinkArcrole(value: String): Self = this.set("xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkArcrole: Self = this.set("xlinkArcrole", ())
    
    @scala.inline
    def setXlinkHref(value: String): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", ())
    
    @scala.inline
    def setXlinkRole(value: String): Self = this.set("xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkRole: Self = this.set("xlinkRole", ())
    
    @scala.inline
    def setXlinkShow(value: String): Self = this.set("xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkShow: Self = this.set("xlinkShow", ())
    
    @scala.inline
    def setXlinkTitle(value: String): Self = this.set("xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkTitle: Self = this.set("xlinkTitle", ())
    
    @scala.inline
    def setXlinkType(value: String): Self = this.set("xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkType: Self = this.set("xlinkType", ())
    
    @scala.inline
    def setXmlBase(value: String): Self = this.set("xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlBase: Self = this.set("xmlBase", ())
    
    @scala.inline
    def setXmlLang(value: String): Self = this.set("xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlLang: Self = this.set("xmlLang", ())
    
    @scala.inline
    def setXmlSpace(value: String): Self = this.set("xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlSpace: Self = this.set("xmlSpace", ())
    
    @scala.inline
    def setXmlns(value: String): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", ())
    
    @scala.inline
    def setXmlnsXlink(value: String): Self = this.set("xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlnsXlink: Self = this.set("xmlnsXlink", ())
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", ())
    
    @scala.inline
    def setY1(value: Double | String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", ())
    
    @scala.inline
    def setY2(value: Double | String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", ())
    
    @scala.inline
    def setYChannelSelector(value: String): Self = this.set("yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYChannelSelector: Self = this.set("yChannelSelector", ())
    
    @scala.inline
    def setZ(value: Double | String): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", ())
    
    @scala.inline
    def setZoomAndPan(value: String): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAndPan: Self = this.set("zoomAndPan", ())
  }
}
