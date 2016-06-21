angular.module("app").config(['$routeProvider', function (routeProvider) {

    routeProvider
        .when('/home', {
            templateUrl: 'view/home.html',
            controller: 'homeController'
        })
        .when('/login', {
            templateUrl: 'view/login.html',
            controller: 'loginController'
        })
        .otherwise({
            redirectTo: '/home'
        });

}])
