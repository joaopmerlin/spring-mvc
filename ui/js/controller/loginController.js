angular.module("app").controller("loginController", function ($rootScope, $scope, loginService) {

    $scope.auth = function (login) {
        loginService.auth(login).then(function (result) {
            loginService.saveToken(result.data.token);
            location.hash = "/";
        });
    };

});
