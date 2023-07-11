//create an array with words
//use math.random to generate random word
//use query selector to display length of selected word

var wordsArray = ["happy", "rice", "roy"];

const alpha = Array.from(Array(26)).map((e, i) => i + 65);
const alphabet = alpha.map(x => String.fromCharCode(x));
console.log(alphabet);

function onlyLettersAndNumbers(str) {
  return Boolean(str.match(/^[A-Za-z0-9]*$/));
}
console.log(onlyLettersAndNumbers(wordsArray[1]));

//Attempted to apply the above to an array
// for (i = 0; (i = wordsArray.length); i++) {
//   console.log(Boolean(wordsArray[i].match(/^[A-Za-z0-9]*$/)));
// }

const searchRegExp = /^[A-Za-z0-9]*$/gi;
const replaceWith = "_ ";

const result = wordsArray[0].replace(
  searchRegExp,
  replaceWith.repeat(wordsArray[0].length)
);
console.log(result);

var word = wordsArray[Math.floor(Math.random() * wordsArray.length)];
console.log(word);
var result1 = word.replace(searchRegExp, replaceWith.repeat(word.length));
console.log(result1);

//Attempt 1 it returns "_" when I want the outcome to be " - - - - -"
var getRandomWord = function() {
  for (i = 0; (i = word.length); i++) {
    var change = word.charAt(i).replaceAll(searchRegExp, replaceWith);
    return change;
  }
};

console.log(getRandomWord());
