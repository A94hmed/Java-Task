function saveEmployee(){


fetch('/employees',{
method:'POST',

headers:{
'Content-Type':'application/json'
},

body:JSON.stringify({

name:document.getElementById("name").value,

age:Number(document.getElementById("age").value),

phoneNumber:document.getElementById("phoneNumber").value

})

})
.then(r=>r.json())
.then(data=>show(data));

}



function getAll(){

fetch('/employees')
.then(r=>r.json())
.then(data=>show(data));

}




function getEmployee(){

let id=document.getElementById("id").value;


fetch('/employees/'+id)
.then(r=>r.json())
.then(data=>{


document.getElementById("name").value=data.name;
document.getElementById("age").value=data.age;
document.getElementById("phoneNumber").value=data.phoneNumber;


show(data);

});


}





function updateEmployee(){

let id=document.getElementById("id").value;


fetch('/employees/'+id,{

method:'PUT',

headers:{
'Content-Type':'application/json'
},

body:JSON.stringify({

name:document.getElementById("name").value,

age:Number(document.getElementById("age").value),

phoneNumber:document.getElementById("phoneNumber").value

})


})
.then(r=>r.json())
.then(data=>show(data));


}




function deleteEmployee(){

let id=document.getElementById("id").value;


fetch('/employees/'+id,{

method:'DELETE'

})
.then(r=>r.text())
.then(data=>show(data));


}





function show(data){

document.getElementById("result").innerHTML =
JSON.stringify(data);

}