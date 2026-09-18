function saveItem(){

    fetch('/items',{
        method:'POST',
        headers:{
            'Content-Type':'application/json'
        },
        body:JSON.stringify({

            name: document.getElementById("itemName").value,

            price: Number(document.getElementById("itemPrice").value),

            quantity: Number(document.getElementById("itemQuantity").value)

        })

    })
    .then(res=>res.json())
    .then(data=>{

        document.getElementById("result").innerHTML =
        JSON.stringify(data);

    });

}




function updateItem(){

    let id = document.getElementById("itemId").value;


    fetch('/items/' + id,{
        method:'PUT',
        headers:{
            'Content-Type':'application/json'
        },

        body:JSON.stringify({

            name: document.getElementById("itemName").value,

            price: Number(document.getElementById("itemPrice").value),

            quantity: Number(document.getElementById("itemQuantity").value)

        })

    })
    .then(res=>res.json())
    .then(data=>{

        document.getElementById("result").innerHTML =
        JSON.stringify(data);

    });

}





function getItem(){

    let id = document.getElementById("itemId").value;


    fetch('/items/' + id)

    .then(res=>res.json())

    .then(data=>{


        document.getElementById("itemName").value = data.name;

        document.getElementById("itemPrice").value = data.price;

        document.getElementById("itemQuantity").value = data.quantity;


        document.getElementById("result").innerHTML =
        JSON.stringify(data);


    });

}





function getAllItems(){


    fetch('/items')

    .then(res=>res.json())

    .then(data=>{


        document.getElementById("result").innerHTML =
        JSON.stringify(data);


    });


}






function deleteItem(){

    let id = document.getElementById("itemId").value;


    fetch('/items/' + id,{
        method:'DELETE'
    })

    .then(res=>res.text())

    .then(data=>{


        document.getElementById("result").innerHTML =
        data;


    });


}