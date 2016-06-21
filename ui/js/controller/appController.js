angular.module("app").controller("appController", function ($rootScope, $scope, $http, $cookies, loginService) {

    $scope.user = {};

    loginService.userLogged().then(function (result) {
        $scope.user = result.data;
    });

    $scope.logout = function () {
        loginService.logout();
    }

});
