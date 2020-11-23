package typingsSlinky.react.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P] extends js.Object {
  
  def apply(props: PropsWithChildren[P]): slinky.core.facade.ReactElement | Null = js.native
  def apply(props: PropsWithChildren[P], context: js.Any): slinky.core.facade.ReactElement | Null = js.native
  
  var contextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var defaultProps: scala.Unit | Partial[P] = js.native
  
  var displayName: scala.Unit | String = js.native
  
  var propTypes: scala.Unit | WeakValidationMap[P] = js.native
}
