/*

let a = 5;
let b = 6;
console.log("Orginal a = ", a);
console.log("Orginal b = ", b);
a **= 4; // expontential
console.log("a **= ", a); //625
b += 5;
console.log("b += ", b); // 11
b -= 5;
console.log("b -= ", b); // 11-5=6
b *= 5;
console.log("b *= ", b); // 6*5=30
b /= 5;
console.log("b /= ", b); //30/5=6
b %= 5;
console.log("b %= ", b); // 6%5=1
 
*/

let a = 5;
let b = 6;
console.log("Orginal a = ", a);
console.log("Orginal b = ", b);
console.log("Is a>b -->", a > b);
console.log("Is a<b -->", a < b);
console.log("Is a>=b -->", a >= b);
console.log("Is a<=b -->", a <= b);

console.log("Equal to a == b -->", a == b);
console.log("Not Equal to a != b -->", a != b);
console.log("5-b -->", "5" - b); // String converted to number so we need type also
console.log("Equal to and type a === b -->", a === b);
console.log("Not Equal to and type a !== b -->", a !== b);

// Type Coercion

console.log("5" - 2); // 3 (string "5" is coerced to number)
console.log("5" + 2); // "52" (number 2 is coerced to string)

// Strict vs Loose Equality
console.log(0 == false); // true (type coercion)
console.log(0 === false); // false (strict equality)

// Floating Point Arithmetic
console.log(0.1 + 0.2 === 0.3); // false (precision issue)

// Falsy and Truthy Values
console.log(Boolean(0)); // false
console.log(Boolean("Hello")); // true

// Object Comparison (Reference vs Value)
let obj1 = { a: 1 },
  obj2 = { a: 1 };
console.log(obj1 == obj2); // false (different references)
console.log(obj1 === obj2); // false

// NaN Comparison
console.log(NaN === NaN); // false
console.log(Number.isNaN(NaN)); // true

// Automatic Semicolon Insertion (ASI)
function example() {
  return;
  {
    key: "value";
  }
}
console.log(example()); // undefined (due to ASI)

// Null and Undefined
let x;
console.log(x); // undefined
console.log(typeof x); // "undefined"
console.log(null == undefined); // true (loose equality)
console.log(null === undefined); // false (strict equality)

// 'this' Context
function showThis() {
  console.log(this);
}
showThis(); // In non-strict mode: Window or global object

// setTimeout and Event Loop
console.log("Start");
setTimeout(() => console.log("Timeout"), 0);
console.log("End");
// Output: Start, End, Timeout

// Mutability vs Immutability
let arr = [1, 2, 3];
let newArr = arr;
newArr.push(4);
console.log(arr); // [1, 2, 3, 4] (same reference)

// Understanding the Event Loop
console.log("Before delay");
setTimeout(() => console.log("After delay"), 0);
console.log("End of script");
