<!-- <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Types of the functions and examples</h1>
    <script src="./function.js"></script>
</body>
</html> -->
//without parameters and without arguments
function demo(){
    console.log("hello");
}
demo()
//with parameters and with arguments
function demo1(a,b){
    console.log(a,b);
    console.log(a+b);
}
demo1(10,20)
//with less no. of arguments and more no.of parameters
function demo2(a,b,c,d){
    console.log(a,b);
    console.log(c,d);
    console.log(a+b);
    console.log(c+d);
}
demo2(30,40)
//with more no.of arguments and less no.of parameters
function demo3(a,b){
    console.log(a,b);
    console.log(a+b);
}
demo3(60,70,80,90,20)
//accessing arguments without parameters using arguments statement
function demo4(a,b){
    console.log(a,b);
    console.log(a+b);
    console.log(arguments[3]);
    console.log(arguments[4]);
}
demo4(22,33,44,50,66)
//no arguments but with the parameters
function sam(a,b){
    console.log(a,b);//undefined undefined
}
sam()
//with arguments but without parameters
function sam1(){
    console.log(arguments); //Arguments(2) [10, 20, callee: ƒ, Symbol(Symbol.iterator): ƒ]
    
}
sam1(10,20)
//functional hoisting
demo5()
function demo5(){
    console.log("hello");
}
demo5()
//using return keyword
function demo6(){
    console.log("Good Morning");
    // Good Afternoon
    return "Good Night"
}
demo6()
console.log(demo6());
console.log(demo6);
//using this keyword to access the current window object we can call by using window keyword also.
var x=10
function demo7(){
    var x=20
    console.log(x);
    console.log(this.x);
    console.log(window.x);  
}
demo7()
//prototype function can follow in 2 way
function demo8(){
    console.log("Hello");
    
}
demo8()
console.log("prototype" in demo8);
let s=new demo8()
console.log(Object.getPrototypeOf(s)==demo8.prototype);


