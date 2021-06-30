// INTRO AND VARIABLES

// please note that JS will resolve from
// top left to bottom right

console.log("Hello world");
console.log("My name is Lionel");

// let is a keyword that tells JS we are setting up variable
// x is the "name" of the variable, sometimes referred to as a reference
// = is known as the assignment operator, and lets you set values
// 5 is the "literal" value, otherwise what the x literally represents
let x = 5;

// when you "set up" a variable, that's known as a declaration
let y;
console.log("At this moment, y is undefined: " + y)
// when you set a value that's known as initialization
y = 3;

let z = 6 + 7;

console.log("the value z is " + z);

// below is a template literal that shows the value of x
console.log(`the value of x is ${x}`)
// below is concatanation that does the same thing
console.log("the value of y is " + y)
console.log(y)

const MY_CONST = 7;

console.log(MY_CONST)

// the code below is not legal
// you cannot reassign const variables
// MY_CONST = 9;

// TYPES

// below we have a string
// this is a series of characters or numbers
// wrapped around quotes
let myString = "This is a string value";
console.log(myString);
// the line above is the same as below
// console.log("This is a string value");

// below we have a number
// numbers will generally respect arithmetic 
let myNumber = 100; 
let myDecimalValue = 0.45;

// below are boolean values
// they can be either true or false and nothing else
// they align neatly with the state of a bit
// which is either 0 or 1
let myBoolean = true;
let myOtherBoolean = false;




