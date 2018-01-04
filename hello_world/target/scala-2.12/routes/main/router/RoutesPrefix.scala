
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/play/projects/hello_world/hello_world/conf/routes
// @DATE:Thu Jan 04 13:28:58 CST 2018


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
