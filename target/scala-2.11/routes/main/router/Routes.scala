
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/Documents/GitHub/TodoPlay/conf/routes
// @DATE:Wed Jun 21 14:56:50 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_0: controllers.Assets,
  // @LINE:13
  Itens_1: controllers.Itens,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_0: controllers.Assets,
    // @LINE:13
    Itens_1: controllers.Itens
  ) = this(errorHandler, Assets_0, Itens_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, Itens_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public", file:String = "/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.insert()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens""", """controllers.Itens.edit()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens/""" + "$" + """id<[^/]+>""", """controllers.Itens.delete(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/itens/concluir/""" + "$" + """id<[^/]+>/""" + "$" + """pronto<[^/]+>""", """controllers.Itens.concluir(id:String, pronto:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_at0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Itens_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_index1_invoker = createInvoker(
    Itens_1.index(),
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
  private[this] lazy val controllers_Itens_insert2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_insert2_invoker = createInvoker(
    Itens_1.insert(),
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
  private[this] lazy val controllers_Itens_edit3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens")))
  )
  private[this] lazy val controllers_Itens_edit3_invoker = createInvoker(
    Itens_1.edit(),
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
  private[this] lazy val controllers_Itens_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Itens_delete4_invoker = createInvoker(
    Itens_1.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """api/itens/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Itens_concluir5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/itens/concluir/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("pronto", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Itens_concluir5_invoker = createInvoker(
    Itens_1.concluir(fakeValue[String], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Itens",
      "concluir",
      Seq(classOf[String], classOf[Boolean]),
      "PUT",
      """""",
      this.prefix + """api/itens/concluir/""" + "$" + """id<[^/]+>/""" + "$" + """pronto<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("/index.html"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:13
    case controllers_Itens_index1_route(params) =>
      call { 
        controllers_Itens_index1_invoker.call(Itens_1.index())
      }
  
    // @LINE:14
    case controllers_Itens_insert2_route(params) =>
      call { 
        controllers_Itens_insert2_invoker.call(Itens_1.insert())
      }
  
    // @LINE:15
    case controllers_Itens_edit3_route(params) =>
      call { 
        controllers_Itens_edit3_invoker.call(Itens_1.edit())
      }
  
    // @LINE:16
    case controllers_Itens_delete4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Itens_delete4_invoker.call(Itens_1.delete(id))
      }
  
    // @LINE:18
    case controllers_Itens_concluir5_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[Boolean]("pronto", None)) { (id, pronto) =>
        controllers_Itens_concluir5_invoker.call(Itens_1.concluir(id, pronto))
      }
  
    // @LINE:22
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
