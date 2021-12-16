document.addEventListener("DOMContentLoaded", init);
let productId = 0;
function createNewProduct() {
    let dynamic = document.getElementsByClassName("form__dynamic")[0]
    let productDiv = document.createElement("div");
    productDiv.className = "form__product";

    let divName = document.createElement("div");
    let labelName = document.createElement("label");
    let inputName = document.createElement("input");
    inputName.setAttribute("name", "name");

    let divType = document.createElement("div");
    let labelType = document.createElement("label");
    let inputType = document.createElement("input");
    inputType.setAttribute("name", "type");

    let divPrice = document.createElement("div");
    let labelPrice = document.createElement("label");
    let inputPrice = document.createElement("input");
    inputPrice.setAttribute("name", "price");

    let divQty = document.createElement("div");
    let labelQty = document.createElement("label");
    let inputQty = document.createElement("input");
    inputQty.setAttribute("name", "qty");


    labelName.textContent = "add product";
    labelPrice.textContent = "price";
    labelQty.textContent = "quantity";
    labelType.textContent = "type";


    let divProps = {
        className: "form__group"
    }

    let labelProps = {
        for: `product${productId++}`,
        className: "form__label",
    }

    let inputProps = {
        "id": `product${productId++}`,
        className: "form__input"
    }

    Object.assign(labelName, labelProps);
    Object.assign(labelType, labelProps);
    Object.assign(labelPrice, labelProps);
    Object.assign(labelQty, labelProps);

    Object.assign(inputName, inputProps);
    Object.assign(inputType, inputProps);
    Object.assign(inputPrice, inputProps);
    Object.assign(inputQty, inputProps);


    Object.assign(divName, divProps);
    Object.assign(divType, divProps);
    Object.assign(divPrice, divProps);
    Object.assign(divQty, divProps);



    divName.appendChild(labelName);
    divName.appendChild(inputName);

    divType.appendChild(labelType);
    divType.appendChild(inputType);

    divPrice.appendChild(labelPrice);
    divPrice.appendChild(inputPrice);

    divQty.appendChild(labelQty);
    divQty.appendChild(inputQty);


    productDiv.appendChild(divName);
    productDiv.appendChild(divType);
    productDiv.appendChild(divPrice);
    productDiv.appendChild(divQty);

    dynamic.appendChild(productDiv);

}

function init() {
    let btnAddProduct = document.getElementById("btn-add_product");
    btnAddProduct.addEventListener("click", createNewProduct);
}