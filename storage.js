/*//html for storage concept employee details
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="">
        Name: <input type="text" id="inp1"><br><br>
        id: <input type="text" id="inp2"><br><br>
        phone: <input type="text" id="inp3"><br><br>
        <button>Submit</button><br><br>
    </form>
     <table border="2px solid">
        <tr>
            <th>Name</th>
            <th>id</th>
            <th>phone</th>
            <th>modify</th>
            <th>trash</th>
        </tr>
    </table>
    <script src="./storage.js"></script>
</body>
</html>
*/
//js for concept concept not completed
let form=document.querySelector("form")
let inp1=document.querySelector("#inp1")
let inp2=document.querySelector("#inp2")
let inp3=document.querySelector("#inp3")
let table=document.querySelector("table")
let arr=JSON.parse(localStorage.getItem("arrObjects")) || [];
console.log(arr);
for(let i of arr){
    console.log(i);

table.innerHTML+=`<tr>
                    <td>${i.name}</td>
                    <td>${i.id}</td>
                    <td>${i.phone}</td>
                    <td><button>Edit</button></td>
                    <td><button>Delet</button></td>
</tr>`
}
form.addEventListener("click",(e)=>{
   // e.preventDefault()
    if(e.target.innerText=="Submit"){
        console.log(inp1.value);
        console.log(inp2.value);
        console.log(inp3.value);
        let obj={
            name:inp1.value,
            id:inp2.value,
            phone:inp3.value
        }
        console.log(obj);
        arr.push(obj);
        console.log(arr);
        window.localStorage.setItem("arrObjects",JSON.stringify(arr))
       // let q=window.localStorage.getItem("arrObjects")
       // console.log(q);
       // inp1.value=""
       // inp2.value=""
       // inp3.value=""

    }
})
// window.localStorage.clear();
