
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="app">

  <head>
    <title>TodoPlay App</title>

    <base href="/">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <meta name="description" content="AngularJs Single Page App with Play Framework">
    <meta name="author" content="Bruce Shaw">

      <!-- css -->
    <link rel="stylesheet" href="assets/stylesheets/main.css" />

      <!-- favicons-->

      <!-- Javascripts libs -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

  </head>

  <body>
    <div>
      <div ui-view></div>
    </div>

      <!-- shared javascript -->

      <!-- angular libs -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.8/angular.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.8/angular-route.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.13/angular-ui-router.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.8/angular-resource.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

      <!-- shared app js -->
    <script src="assets/app/app.js"></script>
    <script src="assets/app/shared/js/config.js"></script>
    <script src="assets/app/shared/js/routing.js"></script>

      <!-- view controllers -->
    <script src="assets/app/views/home/home.js"></script>
    <script src="assets/app/views/about/about.js"></script>
    <script src="assets/app/views/item/item.js"></script>

  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jun 26 02:29:39 BRT 2017
                  SOURCE: /Users/estevamgarcia/Desktop/Mobi/TodoPlay/app/views/index.scala.html
                  HASH: 4cf66ae51ecd462876b9ea03c76da0562e96b337
                  MATRIX: 827->0
                  LINES: 32->1
                  -- GENERATED --
              */
          