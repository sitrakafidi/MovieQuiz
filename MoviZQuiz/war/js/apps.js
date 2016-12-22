var app=angular.module('highscore',[]).controller('HsController', ['$scope','$window',
                                                                   function function($scope) {
	  $scope.insertScoreEntity= function() {
	    score = {
	      "name" : $scope.name,
	      "score" : $scope.score};
    
    
    // little hack to be sure that apis.google.com/js/client.js is loaded
    // before calling
    // onload -> init() -> window.init() -> then here
    $window.init = function() {
      console.log("windowinit called");
      var rootApi = 'https://1-dot-movizquiz.appspot.com/_ah/api/';
      gapi.client.load('scoreentityendpoint', 'v1', function() {
        console.log("score api loaded");
        gapi.client.scoreentityendpoint.insertScoreEntity(score).execute(rootApi);
    }
  }
]);


