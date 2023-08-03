// Step 1:
// Use the following Audio file below:

var audio = new Audio("raven.mp3");

//  Step 2: do the following between the --- comments below
//  after 5 seconds, execute the fiveSeconds function
//  after 10 seconds, execute the tenSeconds function
//  after 15 seconds, execute the timeUp function

// ---------------------
// CODE STEP TWO HERE
// ---------------------

// Step 3:
// Fill in the blanks to these functions.
var fiveSec = setTimeout(function fiveSeconds() {
  $("#time-left").html("<h2>About 10 seconds left!</h2>");
  console.log("10 seconds left");
  // in the element with an id of `time-left` add an h2 saying About 10 Seconds Left!
  // console log 10 seconds left
}, 5000);

var tenSec = setTimeout(function tenSeconds() {
  $("#time-left").html("<h2>About 5 seconds left!</h2>");
  console.log("5 seconds left");
  // in the element with an id of `time-left` add an h2 saying About 5 Seconds Left!
  // console log 5 seconds left
}, 10000);

var timesUp = setTimeout(function timeUp() {
  $("#time-left").html("<h2>Times Up!</h2>");
  console.log("Times Up");
  // in the element with an id of `time-left` add an h2 saying Time's Up!
  // console log done

  // The following line will play the audio file above
  audio.play();
}, 15000);
