package typings.vueResource

import org.scalablytyped.runtime.StringDictionary
import typings.vueResource.vuejs.HttpHeaders
import typings.vueResource.vuejs.HttpOptions
import typings.vueResource.vuejs.HttpResponse
import typings.vueResource.vuejs.http
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends js.Object {
    
    def apply(options: HttpOptions): js.Thenable[HttpResponse] = js.native
    
    def delete(url: String): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def delete(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def delete(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("delete")
    var delete_Original: http = js.native
    
    def get(url: String): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def get(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def get(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("get")
    var get_Original: http = js.native
    
    def jsonp(url: String): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def jsonp(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("jsonp")
    var jsonp_Original: http = js.native
    
    def patch(url: String): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def patch(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def patch(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("patch")
    var patch_Original: http = js.native
    
    def post(url: String): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def post(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def post(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("post")
    var post_Original: http = js.native
    
    def put(url: String): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def put(url: String, data: Unit, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    def put(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
    @JSName("put")
    var put_Original: http = js.native
  }
  
  /* Inlined vue-resource.vuejs.HttpOptions & {  root :string} */
  @js.native
  trait HttpOptionsrootstring extends js.Object {
    
    var before: scala.Unit | (js.Function1[/* request */ js.Any, ?]) = js.native
    
    var body: scala.Unit | js.Any = js.native
    
    var credentials: scala.Unit | Boolean = js.native
    
    var emulateHTTP: scala.Unit | Boolean = js.native
    
    var emulateJSON: scala.Unit | Boolean = js.native
    
    var headers: scala.Unit | js.Any = js.native
    
    var method: scala.Unit | String = js.native
    
    var params: scala.Unit | js.Any = js.native
    
    var progress: scala.Unit | (js.Function1[/* event */ js.Any, ?]) = js.native
    
    var root: String = js.native
    
    var url: scala.Unit | String = js.native
  }
  object HttpOptionsrootstring {
    
    @scala.inline
    def apply(root: String): HttpOptionsrootstring = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOptionsrootstring]
    }
    
    @scala.inline
    implicit class HttpOptionsrootstringOps[Self <: HttpOptionsrootstring] (val x: Self) extends AnyVal {
      
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
      def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: /* request */ js.Any => ?): Self = this.set("before", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteBefore: Self = this.set("before", ())
      
      @scala.inline
      def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBody: Self = this.set("body", ())
      
      @scala.inline
      def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteCredentials: Self = this.set("credentials", ())
      
      @scala.inline
      def setEmulateHTTP(value: Boolean): Self = this.set("emulateHTTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteEmulateHTTP: Self = this.set("emulateHTTP", ())
      
      @scala.inline
      def setEmulateJSON(value: Boolean): Self = this.set("emulateJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteEmulateJSON: Self = this.set("emulateJSON", ())
      
      @scala.inline
      def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteHeaders: Self = this.set("headers", ())
      
      @scala.inline
      def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteMethod: Self = this.set("method", ())
      
      @scala.inline
      def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteParams: Self = this.set("params", ())
      
      @scala.inline
      def setProgress(value: /* event */ js.Any => ?): Self = this.set("progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteProgress: Self = this.set("progress", ())
      
      @scala.inline
      def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteUrl: Self = this.set("url", ())
    }
  }
  
  @js.native
  trait Method extends js.Object {
    
    var method: String = js.native
  }
  object Method {
    
    @scala.inline
    def apply(method: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
      
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
      def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  headers :vue-resource.vuejs.HttpHeaders | undefined, [key: string] : any} & vue-resource.vuejs.HttpOptions */
  @js.native
  trait headersHttpHeadersundefin
    extends /* key */ StringDictionary[js.Any] {
    
    var before: scala.Unit | (js.Function1[/* request */ js.Any, ?]) = js.native
    
    var body: scala.Unit | js.Any = js.native
    
    var credentials: scala.Unit | Boolean = js.native
    
    var emulateHTTP: scala.Unit | Boolean = js.native
    
    var emulateJSON: scala.Unit | Boolean = js.native
    
    var headers: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any) = js.native
    
    var method: scala.Unit | String = js.native
    
    var params: scala.Unit | js.Any = js.native
    
    var progress: scala.Unit | (js.Function1[/* event */ js.Any, ?]) = js.native
    
    var url: scala.Unit | String = js.native
  }
  object headersHttpHeadersundefin {
    
    @scala.inline
    def apply(headers: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any)): headersHttpHeadersundefin = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[headersHttpHeadersundefin]
    }
    
    @scala.inline
    implicit class headersHttpHeadersundefinOps[Self <: headersHttpHeadersundefin] (val x: Self) extends AnyVal {
      
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
      def setHeaders(value: (scala.Unit | HttpHeaders) & (scala.Unit | js.Any)): Self = this.set("headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: /* request */ js.Any => ?): Self = this.set("before", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteBefore: Self = this.set("before", ())
      
      @scala.inline
      def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteBody: Self = this.set("body", ())
      
      @scala.inline
      def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteCredentials: Self = this.set("credentials", ())
      
      @scala.inline
      def setEmulateHTTP(value: Boolean): Self = this.set("emulateHTTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteEmulateHTTP: Self = this.set("emulateHTTP", ())
      
      @scala.inline
      def setEmulateJSON(value: Boolean): Self = this.set("emulateJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteEmulateJSON: Self = this.set("emulateJSON", ())
      
      @scala.inline
      def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteMethod: Self = this.set("method", ())
      
      @scala.inline
      def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteParams: Self = this.set("params", ())
      
      @scala.inline
      def setProgress(value: /* event */ js.Any => ?): Self = this.set("progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def deleteProgress: Self = this.set("progress", ())
      
      @scala.inline
      def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteUrl: Self = this.set("url", ())
    }
  }
}
