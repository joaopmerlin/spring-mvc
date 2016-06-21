angular.module("app").controller("homeController", function ($scope, loginService) {

    $scope.user = {};

    loginService.userLogged().then(function (result) {
        $scope.user = result.data;
    });

});
