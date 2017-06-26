/**
 * Created by estevamgarcia on 6/25/17.
 */

angular.module('app')
.controller('ItemController', function($scope, $http){

    $scope.descricao = "";
    $scope.pronto = "";
    $scope.id = "";
    $scope.index = 0;
    $scope.editMode = false;

    var itens_data = $http.get('http://localhost:9000/api/itens');
    itens_data.then(function (result) {
        $scope.itens = result.data;
    });

    $scope.addItem = function(){
        $http({
            method: 'POST',
            url: 'http://localhost:9000/api/itens',
            data: { descricao: $scope.descricao, pronto: $scope.pronto },
            headers: {'Content-Type': 'application/json'}
        });

        $scope.itens.push({descricao: $scope.descricao, pronto: $scope.pronto});
    };

    $scope.updateMode = function (item, index) {
        $scope.descricao = item.descricao;
        $scope.pronto = item.pronto;
        $scope.id = item.id;
        $scope.index = index;
        $scope.editMode = true;
    }

    $scope.updateItem = function(){
        $http({
            method: 'PUT',
            url: 'http://localhost:9000/api/itens',
            data: { descricao: $scope.descricao, pronto: $scope.pronto, id: $scope.id },
            headers: {'Content-Type': 'application/json'}
        })

        $scope.itens[$scope.index] = { descricao: $scope.descricao, pronto: $scope.pronto, id: $scope.id }

        $scope.descricao = "";
        $scope.pronto = "";
        $scope.id = "";
        $scope.editMode = false;
    }

    $scope.deleteItem = function(item){
        $http({
            method: 'POST',
            url: 'http://localhost:9000/api/itens/delete',
            data: { id: item.id },
            headers: {'Content-Type': 'application/json'}
        });

        var index = $scope.itens.indexOf(item);
        $scope.itens.splice(index, 1);
    }
});
