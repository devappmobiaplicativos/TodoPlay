
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/Documents/GitHub/TodoPlay/conf/routes
// @DATE:Wed Jun 21 14:56:50 BRT 2017


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
