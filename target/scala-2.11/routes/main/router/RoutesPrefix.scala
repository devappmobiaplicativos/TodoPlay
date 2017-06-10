
// @GENERATOR:play-routes-compiler
// @SOURCE:/opt/lampp/htdocs/teste/backend/conf/routes
// @DATE:Sat Jun 10 07:48:36 BRT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
