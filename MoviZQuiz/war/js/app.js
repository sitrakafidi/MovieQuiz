(function(){

	var app = angular.module('MovieStore', []);
	
	app.controller('MovieController', function() {
		this.game = game;
	
		this.play = function() {
			if (game.question < 1 && game.turn < 10) {
				game.question++;
			} else {
				game.question = 0;
				game.turn++;
			}
			
		};
		
		this.restart= function() {
		  game.question=0;
		  game.turn=0;
		  game.score=0;
		};
	});
	
	var game = {
		question: 0,
		turn: 0,
		score: 0
	};
})();

function printDiv(divName) {
     var printContents = document.getElementById(divName).innerHTML;
     var originalContents = document.body.innerHTML;

     document.body.innerHTML = printContents;

     window.print();

     document.body.innerHTML = originalContents;
}

// closure
(function() {
	var app = angular.module('question', []);
	app.controller('QuestionController', function() {
		this.game = game;

		this.play = function() {
			if (game.question < 2) {
				game.question++;
			}
		};
		
		this.restart= function() {
		  game.question=0;
		  game.score=0;
		};

	});

	var game = {
		question: 0,
		score: 0,
	};
})();
