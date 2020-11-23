package typings.ndarray

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T]): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double]): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double]): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double], offset: Double): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: Unit, offset: Double): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: Unit, stride: js.Array[Double]): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: Unit, stride: js.Array[Double], offset: Double): typings.ndarray.mod.ndarray[T] = js.native
  @JSImport("ndarray", JSImport.Namespace)
  @js.native
  def apply[T](data: Data[T], shape: Unit, stride: Unit, offset: Double): typings.ndarray.mod.ndarray[T] = js.native
  
  @js.native
  trait ndarray[T] extends js.Object {
    
    var T: typings.ndarray.mod.ndarray[T] = js.native
    
    var data: Data[T] = js.native
  }
  object ndarray {
    
    @scala.inline
    def apply[T](T: typings.ndarray.mod.ndarray[T], data: Data[T]): ndarray[T] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ndarray[T]]
    }
    
    @scala.inline
    implicit class ndarrayOps[Self <: typings.ndarray.mod.ndarray[?], T] (val x: Self & typings.ndarray.mod.ndarray[T]) extends AnyVal {
      
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
      def setT(value: typings.ndarray.mod.ndarray[T]): Self = this.set("T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Data[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    }
  }
  
  type Data[T] = js.Array[T]
  
  type DataType = String
}
