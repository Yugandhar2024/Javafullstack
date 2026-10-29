// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Document</title>
// </head>
// <body>
//     <h1>Looping Statements</h1>
//     <script src="./looping.js"></script>
    
// </body>
// </html>
//Using for-loop for printing various patterns 
for(let i=1;i<=5;i++){
    console.log("hai");
    
}
console.log("-------------------");

let str=""
for(let i=1;i<=5;i++){
    str+="hai\n"
}
console.log(str);
 //while-loop
 console.log("-------------------");
// let i=1
// while(i<=5){
//     console.log("hai");
    
// }
 let j=1,str1=""
     while(j<=5){
         str1+="hello\n"
          j++
    }     console.log(str1);
 //do-while loop
let k=1
do{
    console.log("happy");
    k++
    
}while(k<=5)
console.log("-----------------------");
    
let str5=""
for(let i=1;i<=6;i++){
    for(let j=1;j<=5;j++){
        str5+="* "
    }
    str5+="\n"
}
console.log(str5);
console.log("=======================\n");

let str6=""
for(let i=5;i>=1;i--){
    for(let j=1;j<=i;j++){
        str6+="* "
    }
    str6+="\n"
}
console.log(str6);
console.log("=======================\n");
let str7=""
for(let i=1;i<=5;i++){
    for(let j=1;j<6;j++){
        str7+="* "
    }
    str7+="\n"
}
console.log(str7);

let str8=""
for(let k=1;k<=5;k++){
    for(let i=1;i<=5-k;i++){
        str8+="  "
    }
    for(let j=1;j<=k;j++){
        str8+="* "
    }
    str8+="\n"
}
console.log(str8);

let str9=""
for(let i=1;i<=5;i++){
    for(let j=1;j<=5;j++){
        if(i==1 || i==5 || j==1 || j==5){
            str9+="* "
        }
        else{
            str9+="  "
        }
    }
    str9+="\n"
}
console.log(str9);

let str10="",n=5
for(let i=1;i<=n;i++){
    for(let j=1;j<=n;j++){
        if(i==(n+1)/2 || j==(n+1)/2){
            str10+="* "
        }
        else{
            str10+="  "
        }
    }
    str10+="\n"
}
console.log(str10);

let str11="",n1=5
for(let i=1;i<=n1;i++){
    for(let j=1;j<=n1;j++){
        if(i==1 || i==n1 ||j==(n1+1)/2){
            str11+="* "
        }
        else{
            str11+="  "
        }
    }
    str11+="\n"
}
console.log(str11);

let str12="",m=5
for(let i=1;i<=m;i++){
    for(let j=1;j<=m;j++){
        if(j==1 || j==n1 || i==(m+1)/2){
            str12+="* "
        }
        else{
            str12+="  "
        }
    }
    str12+="\n"
}
console.log(str12);

let str13="",x=5
for(let i=1;i<=x;i++){
    for(let j=1;j<=x;j++){
        if(i==j ||i+j==(x+1)){
            str13+="* "
        }
        else{
            str13+="  "
        }
    }
    str13+="\n"
}
console.log(str13);

let str14="",x1=5
for(let i=1;i<=x1;i++){
    for(let j=1;j<=x1;j++){
        if(i==j ||i+j==(x1+1) || i==1 || i==x1 || j==1 || j==x1){
            str14+="* "
        }
        else{
            str14+="  "
        }
    }
    str14+="\n"
}
console.log(str14);

let y=5,s=0,str15=""
for(let i=1;i<=y;i++){
    s++
    for(let j=1;j<=s;j++){
        str15+="* "
    }
    str15+="\n"
}
console.log(str15);

let str16="",s1=5
for(let i=1;i<=s1;i++){
    for(let j=1;j<=s1;j++){
        if(j==1 || j==s1 || i==(s1+1)/2 || i==1){
            str16+="* "
        }
        else{
            str16+="  "
        }
    }
    str16+="\n"
}
console.log(str16);

let y1=5,s2=y1+1,str17=""
for(let i=1;i<=y1;i++){
    s2--
    for(let j=1;j<=s2;j++){
        str17+="* "
    }
    str17+="\n"
}
console.log(str17);

let str18 = "";
for (let i = 1; i <= 5; i++) {
    for (let j = 1; j <= 5; j++) {
        str18 += j + " ";
    }
    str18 += "\n";
}
console.log(str18);

let str19 = "";
for (let i = 1; i <= 5; i++) {
    for (let j = 1; j <= 5; j++) {
        str19 += i + " ";
    }
    str19 += "\n";
}
console.log(str19);
 
let str20 = "";
for (let i = 1; i <= 5; i++) {
    for (let j = 1; j <= i; j++) {
        str20 += j+" ";
    }
    str20 += "\n";
}
console.log(str20);
