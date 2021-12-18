document.addEventListener("DOMContentLoaded", init);
let productId = 0;
function createNewProduct(e) {
    e.preventDefault();
    console.log("createNewProduct");
    let form = document.getElementById("form-add_product");
    console.log(form);
    let formData = new FormData(form);
    let product = {};
    // formData.forEach((value, key) => {
    //     product[key] = value;
    // }
    // );

    // create new xhr
    let xhr = new XMLHttpRequest();
    xhr.open("POST", "http:localhost:8080/supplier/add");
    // xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onload = function () {
        if (xhr.status === 201) {
            let product = JSON.parse(xhr.responseText);
            let productElement = createProductElement(product);
            document.getElementById("products").appendChild(productElement);
        }
    }
    xhr.send(formData);
}

function init() {
    let btnAddProduct = document.getElementById("btn-add_product");
    btnAddProduct.addEventListener("click", createNewProduct);
}