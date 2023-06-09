//create an array with words
//use math.random to generate random word
//use query selector to display length of selected word

var wordsArray = ["happy", "bunny", "cheese"];

const alpha = Array.from(Array(26)).map((e, i) => i + 65);
const alphabet = alpha.map(x => String.fromCharCode(x));
console.log(alphabet);

function onlyLettersAndNumbers(str) {
  return Boolean(str.match(/^[A-Za-z0-9]*$/));
}
console.log(onlyLettersAndNumbers(wordsArray[0]));

function replaceAll(string, search, replace) {
  return string.split(search).join(replace);
}

console.log(replaceAll(wordsArray[0], alphabet, "_ "));

const searchRegExp = /^[A-Za-z0-9]*$/gi;
const replaceWith = "_";

const result = wordsArray[0].replace(searchRegExp, replaceWith);
console.log(result);

//Attempt 1 it returns "_" when I want the outcome to be " - - - - -"
var getRandomWord = function() {
  var word = wordsArray[Math.floor(Math.random() * wordsArray.length)];
  console.log(word);
  for (i = 0; (i = word.length); i++) {
    var change = word.charAt(i).replaceAll(searchRegExp, replaceWith);
    return change;
  }
};

console.log(getRandomWord());
