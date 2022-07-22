var wins = 0;
var losses = 0;
var guessNum = 9;
var userGuess = [];
var compGuess = null;

// Function that updates the wins...
function updateWins() {
  document.querySelector("#wins").innerHTML = "Wins: " + wins;
}
// Function that updates the losses...
function updateLosses() {
  document.querySelector("#losses").innerHTML = "Losses: " + losses;
}
function updateUserGuess() {
  userGuess = [];
  document.querySelector("#guesses-made").innerHTML =
    "Guesses Made: " + userGuess;
}
function updateCompGuess() {
  var alpha = Array.from(Array(26)).map((e, i) => i + 65);
  var alphabet = alpha.map(x => String.fromCharCode(x));
  compGuess = alphabet[
    Math.floor(Math.random() * alphabet.length)
  ].toLowerCase();
}

function renderGame() {
  // If there are still more guesses left, render the next one.
  if (guessNum != 0) {
    document.querySelector("#guesses-num").innerHTML =
      "Guesses Left: " + guessNum;
    document.querySelector("#guesses-made").innerHTML =
      "Guesses Made: " + userGuess;
  }
}
// MAIN PROCESS
// ==============================================================================

// Calling functions to start the game.
renderGame();
updateWins();
updateLosses();
updateUserGuess();
updateCompGuess();

document.onkeyup = function(event) {
  var userInput = event.key.toLowerCase();
  userGuess.push(userInput);

  console.log("compGuess is: " + compGuess);

  if (userInput === compGuess) {
    alert("Correct!");
    wins++;
    guessNum = 9;
    updateWins();
    updateUserGuess();
    updateCompGuess();
  } else {
    guessNum -= 1;
  }
  if (guessNum === 0) {
    alert("You lose");
    losses++;
    guessNum = 9;
    updateWins();
    updateLosses();
    updateUserGuess();
    updateCompGuess();
  }

  renderGame();
};
