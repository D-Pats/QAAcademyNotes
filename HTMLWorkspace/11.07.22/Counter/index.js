"use strict"

const numbOutput = document.querySelector("#numbOutput");
numbOutput.value = 0;
const output = document.querySelector("#output");

const removeFive = () => {
    const numb = parseFloat(numbOutput.value);
    numbOutput.value = numb - 5;
    const newHistory = document.createElement("p");
    newHistory.innerText = numb + " - 5 = " + String(numbOutput.value);
    output.appendChild(newHistory);
}

const removeOne = () => {
    const numb = parseFloat(numbOutput.value);
    numbOutput.value = numb - 1;
    const newHistory = document.createElement("p");
    newHistory.innerText = numb + " - 1 = " + String(numbOutput.value);
    output.appendChild(newHistory);
}

const resetNumb = () => {
    numbOutput.value = 0;
    const newHistory = document.createElement("p");
    newHistory.innerText = "Reset to 0";
    output.appendChild(newHistory);
}

const addOne = () => {
    const numb = parseFloat(numbOutput.value);
    numbOutput.value = numb + 1;
    const newHistory = document.createElement("p");
    newHistory.innerText = numb + " + 1 = " + String(numbOutput.value);
    output.appendChild(newHistory);
}

const addFive = () => {
    const numb = parseFloat(numbOutput.value);
    numbOutput.value = numb + 5;
    const newHistory = document.createElement("p");
    newHistory.innerText = numb + " + 5 = " + String(numbOutput.value);
    output.appendChild(newHistory);
}