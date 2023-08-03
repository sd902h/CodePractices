//when user hits start load page with first question
//launches timer
//displays question
//allows user answer options

// Question set
var questions = [
  {
    question: "What was the first full length CGI movie?",
    answers: ["A Bug's Life", "Monsters Inc.", "Toy Story", "The Lion King"],
    correctAnswer: "Toy Story",
    image: "assets/images/toystory.gif"
  },
  {
    question: "Which of these is NOT a name of one of the Spice Girls?",
    answers: ["Sporty Spice", "Fred Spice", "Scary Spice", "Posh Spice"],
    correctAnswer: "Fred Spice",
    image: "assets/images/spicegirls.gif"
  },
  {
    question: "Which NBA team won the most titles in the 90s?",
    answers: [
      "New York Knicks",
      "Portland Trailblazers",
      "Los Angeles Lakers",
      "Chicago Bulls"
    ],
    correctAnswer: "Chicago Bulls",
    image: "assets/images/bulls.gif"
  },
  {
    question: "Which group released the hit song, 'Smells Like Teen Spirit'?",
    answers: ["Nirvana", "Backstreet Boys", "The Offspring", "No Doubt"],
    correctAnswer: "Nirvana",
    image: "assets/images/nirvanabark.gif"
  },
  {
    question: 'Which popular Disney movie featured the song, "Circle of Life"?',
    answers: ["Aladdin", "Hercules", "Mulan", "The Lion King"],
    correctAnswer: "The Lion King",
    image: "assets/images/lionking.gif"
  },
  {
    question:
      'Finish this line from the Fresh Prince of Bel-Air theme song: "I whistled for a cab and when it came near, the license plate said..."',
    answers: ["Dice", "Mirror", "Fresh", "Cab"],
    correctAnswer: "Fresh",
    image: "assets/images/fresh.gif"
  },
  {
    question: "What was Doug's best friend's name?",
    answers: ["Skeeter", "Mark", "Zach", "Cody"],
    correctAnswer: "Skeeter",
    image: "assets/images/skeeter.gif"
  },
  {
    question:
      "What was the name of the principal at Bayside High in Saved By The Bell?",
    answers: ["Mr.Zhou", "Mr.Driggers", "Mr.Belding", "Mr.Page"],
    correctAnswer: "Mr.Belding",
    image: "assets/images/belding.gif"
  }
];

// $("#start").click(function(event) {

// });

var questionIndex = 0;
var number = 10;
var intervalId;
var wins = 0;
var loss = 0;

function displayOptions() {
  var question = questions[questionIndex].question;
  run();
  $("#question").html(question);
  for (i = 0; i < questions[questionIndex].answers.length; i++) {
    //Adding strings together to display answers from questions array
    $("#options").append(
      "<li>" + questions[questionIndex].answers[i] + "</li>"
    );
  }
  $("#options li").click(function(event) {
    if (
      questions[questionIndex].correctAnswer == $(this).text() &&
      number > 0
    ) {
      stop();
      wins++;
      console.log("Number of wins " + wins);
    } else if (
      questions[questionIndex].correctAnswer != $(this).text() ||
      number == 0
    ) {
      stop();
      loss++;
      console.log("Number of losses: " + loss);
    }
    $("ul").empty();
    questionIndex++;
    run();
    displayOptions();
  });
}

displayOptions();

function run() {
  if (questionIndex > 0) {
    clearInterval(intervalId);
    intervalId = setInterval(decrement, 1000);
  } else {
    stop();
  }
}
//  The decrement function.
function decrement() {
  //  Decrease number by one.
  number--;

  //  Show the number in the #show-number tag.
  $("#time").html("<h2>" + number + "</h2>");

  //  Once number hits zero...
  if (number === 0) {
    //  ...run the stop function.
    stop();

    //  Alert the user that time is up.
    alert("Time Up!");
  }
}

//  The stop function
function stop() {
  //  Clears our intervalId
  //  We just pass the name of the interval
  //  to the clearInterval function.
  clearInterval(intervalId);
}
