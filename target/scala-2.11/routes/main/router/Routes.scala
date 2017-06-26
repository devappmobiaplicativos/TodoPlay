
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/estevamgarcia/Desktop/Mobi/TodoPlay/conf/routes
// @DATE:Mon Jun 26 02:29:39 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:13
  Itens_2: controllers.Itens,
  // @LINE:19
  Assets_1: controllers.Assets,
  // @LINE:22
  Application_0: javax.inject.Provider[controllers.Application],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:13
    Itens_2: controllers.Itens,
    // @LINE:19
    Assets_1: controllers.Assets,
    // @LINE:22
    Application_0: javax.inject.Provider[controllers.Application]
  ) = this(errorHandler, Itens_2, Assets_1, Application_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Itens_2, Assets_1, Application_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.insert()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens/delete""", """controllers.Itens.delete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """path<.*>""", """@controllers.Application@.index(path:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:13
  private[this] lazy val controllers_Itens_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_index0_invoker = createInvoker(
    Itens_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """api/itens"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Itens_insert1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_insert1_invoker = createInvoker(
    Itens_2.insert(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "insert",
      Nil,
      "POST",
      """""",
      this.prefix + """api/itens"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Itens_edit2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_edit2_invoker = createInvoker(
    Itens_2.edit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "edit",
      Nil,
      "PUT",
      """""",
      this.prefix + """api/itens"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Itens_delete3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens/delete")))
  )
  private[this] lazy val controllers_Itens_delete3_invoker = createInvoker(
    Itens_2.delete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "delete",
      Nil,
      "POST",
      """""",
      this.prefix + """api/itens/delete"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.*""",false)))
  )
  private[this] lazy val controllers_Application_index5_invoker = createInvoker(
    Application_0.get.index(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Seq(classOf[String]),
      "GET",
      """ forwards all non-asset requests to index page""",
      this.prefix + """""" + "$" + """path<.*>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:13
    case controllers_Itens_index0_route(params) =>
      call { 
        controllers_Itens_index0_invoker.call(Itens_2.index())
      }
  
    // @LINE:14
    case controllers_Itens_insert1_route(params) =>
      call { 
        controllers_Itens_insert1_invoker.call(Itens_2.insert())
      }
  
    // @LINE:15
    case controllers_Itens_edit2_route(params) =>
      call { 
        controllers_Itens_edit2_invoker.call(Itens_2.edit())
      }
  
    // @LINE:16
    case controllers_Itens_delete3_route(params) =>
      call { 
        controllers_Itens_delete3_invoker.call(Itens_2.delete())
      }
  
    // @LINE:19
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:22
    case controllers_Application_index5_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_index5_invoker.call(Application_0.get.index(path))
      }
  }
}
