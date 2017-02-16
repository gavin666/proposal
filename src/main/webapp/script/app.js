/**
 * Created by Gavin on 2017/2/9.
 */
'use strict';

angular
    .module('myApp', [
        'ngAnimate',
        'ngCookies',
        'ngResource',
        'ngRoute',
        'ngMessages',
        'ngSanitize',
        'ngAria',
        'ngMaterial',
        'md.data.table',
        'ui.router',
        'ui.validate',
        'ui.codemirror',
        'angularMoment',
        'chart.js',
        'once',
        'angular-loading-bar',
        'angular.filter',
        'LocalStorageModule'
    ])
    .run(function($rootScope, $state, $stateParams, $window, $http, $mdDialog) {
        $rootScope.$state = $state;
        $rootScope.$stateParams = $stateParams;
    });