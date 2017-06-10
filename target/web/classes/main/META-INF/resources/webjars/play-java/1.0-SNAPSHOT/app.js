var app = angular.module('App', []);
app.controller('padrao', function ($scope, $http) {
    $scope.nome = '';
    $scope.lista = [
        {
            descricao: 'Carregando',
            pronto: false
        }
    ];

    this.$onInit = function () {
        $http.get('/api/itens').then(function (response) {
           $scope.lista = response.data;
        });
    };
    $scope.adicionar = function () {
        $scope.lista.push({"descricao":$scope.nome});
    };
    $scope.remover = function (index) {
        $scope.lista.splice(index,1);
    };
    $scope.editar = function (item) {

    };


});