/*
 function generateMultiplicationTable(number) {
  for (let i = 1; i <= 10; i++) {
    console.log(`${number} x ${i} = ${number * i}`);
  }
}

// Example usage
generateMultiplicationTable(5);
 */

/* 
let str = "Tony Stark";
for (let val of str) {
  console.log(val);
}
console.log(str.length);
 */

/* 
// for in loop
let obj = { name: "Tony Stark", age: 45, isAvenger: true };
for (let key in obj) {
  console.log(key, obj[key]);
}
*/

/* 
// print all the even numbers between 0 to 100
for (let i = 0; i <= 100; i += 2) {
  console.log(i);
}
 */

// guess number game
let secretNumber = 5;
let guess;
do {
  guess = parseInt(prompt("Guess a number between 1 to 10"));
  if (guess < secretNumber) {
    console.log("Too low");
  } else if (guess > secretNumber) {
    console.log("Too high");
  }
} while (guess !== secretNumber);
console.log("You guessed it correctly!");
