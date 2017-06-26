
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/estevamgarcia/Desktop/Mobi/TodoPlay/conf/routes
// @DATE:Mon Jun 26 02:29:39 BRT 2017


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
