
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/Documents/GitHub/TodoPlay/conf/routes
// @DATE:Wed Jun 21 14:56:50 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseItens Itens = new controllers.ReverseItens(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseItens Itens = new controllers.javascript.ReverseItens(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
