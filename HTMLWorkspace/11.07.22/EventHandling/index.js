"use strict"

// alert("yo");

const myInput = document.querySelector("input#myInput");
const output = document.querySelector("#output");

const writeInput = () => {
    const newInput = document.createElement("p");
    newInput.innerText = myInput.value; // inputs use .value instead of .innerText
    output.appendChild(newInput)

    myInput.value = "";
    myInput.focus();
}


const milesInput = document.querySelector("#milesInput");
const kmsInput = document.querySelector("#kmsInput");

const convertToKMs = () => {
    const miles = parseFloat(milesInput.value);
    const kms = miles * 1.6;
    kmsInput.value = kms;
}

const convertToMiles = () => {
    const kms = parseFloat(kmsInput.value);
    const miles = kms / 1.6;
    milesInput.value = miles;
}