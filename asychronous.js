/*
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1></h1>
    <button id="stp">stop</button>
    <button id="str">start</button>
    <script src="./asychronous.js"></script>
</body>
</html>
*/
//Asynchronous Function : one fuction will give a way for another function to get executed.
function demo(a,b){
    setTimeout(()=>{
        for(let i=a;i<=b;i++){
        console.log(i);
    }
    },3000)
}
demo(10,15)
function demo1(){
    console.log("Hello demo1 function");
}
demo1()
function demo2(){
    setTimeout(()=>{
        console.log("Hello demo2 function");
    },4000)
}
demo2()

//to print the time and date on the web page
let date=new Date()
console.log(date);
console.log(date.getDate());
console.log(date.getDay());
console.log(date.getFullYear());
console.log(date.getHours());
console.log(date.getMonth());
console.log(date.getMinutes());
console.log(date.getMilliseconds());
console.log(date.getSeconds());
console.log(date.getTime());
console.log(date.toLocaleTimeString());
console.log(date.toLocaleDateString());
console.log(date.toLocaleString());

let h1=document.querySelector("h1")
function Timer(){
    let date1=new Date()
    h1.innerText=date1.toLocaleTimeString()
}
// Timer()
let x=setInterval(Timer,1000)
let stp=document.querySelector("#stp")
stp.onclick=()=>{
    clearInterval(x)
}
let str=document.querySelector("#str")
str.onclick=()=>{
    x=setInterval(Timer,1000)
}
