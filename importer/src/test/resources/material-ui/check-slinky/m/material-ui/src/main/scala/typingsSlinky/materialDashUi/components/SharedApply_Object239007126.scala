package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Object239007126[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = js.Object
}
