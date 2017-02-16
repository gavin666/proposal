/**
 * Created by Gavin on 2017/2/9.
 */
'use strict';

angular.module('myApp').config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/login');
    $stateProvider.state('login', {
        url : '/login',
        data : {
            authorities : [],
            title : '登录',
        },
        views : {
            'main@' : {
                templateUrl : 'views/login.html',
                controller : 'LoginCtrl',
            }
        }
    })
        .state('index', {
            url: '/index',
            views : {
                'main@' : {
                    templateUrl : 'views/dashboard.html',
                    controller : 'DashboardCtrl',
                }
            }
        });
});