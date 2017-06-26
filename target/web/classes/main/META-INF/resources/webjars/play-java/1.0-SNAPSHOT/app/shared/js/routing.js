(function() {
   'use strict';
   angular.module('app').config(routeConfig);
   routeConfig.$inject = ['$urlRouterProvider', '$stateProvider'];
   function routeConfig($urlRouterProvider, $stateProvider) {
      $urlRouterProvider.otherwise('/');

      $stateProvider
         // base template for content
         .state('index', {
            abstract: true,
            templateUrl: 'assets/app/shared/templates/index.html',
         })
         .state('index.item', {
              url: '/',
              views: {
                  "@index": {
                      templateUrl: 'assets/app/views/item/item.html',
                      controller: "ItemController as vm"
                  }
              }
          });
   }
})();
