'use strict';

/* Controllers */

angular.module('foosboard.controllers', [])
  .controller('MyCtrl1', ['$scope', function($scope) {
    $scope.greeting = "Hello world"
  }])
  .controller('MyCtrl2', ['$scope', function($scope) {

  }]);
