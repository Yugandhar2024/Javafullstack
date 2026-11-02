// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Document</title>
// </head>
// <body>
//     <script src="./arrowFunction.js"></script>
//     <h2>Arrow Functions in js</h2>
// </body>
// </html>
//arrow function is to reduce the syntax

//Implicit arrow function is a function it returns automatically without using any return keyword

//no parameters
let x=_=>"hello"
console.log(x());

//single parameters
let y=a=>a+a
console.log(y(5));//10

//multiple parameters
let z=(a,b,c)=>a+b+c
console.log(z(6,6,6));//18

//Explicit arrow function is the function body is enclosed in curly braces "{ }" and a explicit return is mandatory used to return a value
let p = (a, b) => {
    return a + b;
   // a+b;//undefined
};
console.log(p(10, 6)); // 16

//Multiple statements
let calculate = (a, b) => {
    let sum = a + b;
    let diff = a - b;
    console.log("Sum:", sum);
    console.log("Difference:", diff);
    return sum * diff;
};
console.log(calculate(8, 3)); // Sum: 11, Difference: 5, then 55
//find the max of 2 numbers
let max = (a, b) => {
    if (a > b) {
        return a;
    } else {
        return b;
    }
};
console.log(max(15, 9)); // 15

