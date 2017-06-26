var app = angular.module('App', []);
app.controller('padrao', function ($scope, $http) {
    $scope.nome = '';
    $scope.lista = [];

    this.$onInit = function () {
        $http.get('/api/itens').then(function (response) {
            response.data.forEach(function(el, i) {
                response.data[i].pronto = el.pronto == 'true' ? true : false;
            });
            $scope.lista = response.data;
        });
    };
    $scope.adicionar = function () {
        $http.post('/api/itens', {
            descricao: $scope.nome,
            pronto: false
        }).then(function(data) {
            $scope.lista.push({id: data.data, "descricao": $scope.nome});
        });
    };
    $scope.remover = function (id) {
        $http.delete('/api/itens/'+id).then(function() {
            $scope.lista.forEach(function(el, i) {
                if(el.id == id) {
                    $scope.lista.splice(i, 1);
                }
            });
        });
    };
    $scope.editar = function (item) {
        $http.put('/api/itens', {
            id: item.id,
            descricao: item.descricao,
            pronto: item.pronto
        });
    };

    $scope.concluirTarefa = function(id, concluido) {
        $http.put('/api/itens/concluir/'+id+'/'+concluido).then(function() {});
    }


});