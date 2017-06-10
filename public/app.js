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
        $scope.lista.push({"descricao": $scope.nome});
        $http.post('/api/itens', {
            descricao: $scope.nome,
            pronto: 'true'
        });
    };
    $scope.remover = function (index) {
        $scope.lista.splice(index, 1);
    };
    $scope.editar = function (index, item) {
        $scope.lista.push({"descricao": $scope.nome});
        $http.post('/api/itens/edit', {
            id: index,
            descricao: item.descricao,
            pronto: 'true'
        });
    };


});