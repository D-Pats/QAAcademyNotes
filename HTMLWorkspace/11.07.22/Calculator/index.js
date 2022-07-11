"use strict"

const resultOutput = document.querySelector("#resultOutput");
resultOutput.value = "";
var firstNum = 0;
var secondNum = 0;
var fullEq = "";
var operator = "";

const select0 = () => {
    const fullEq = resultOutput.value + "0";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select1 = () => {
    const fullEq = resultOutput.value + "1";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select2 = () => {
    const fullEq = resultOutput.value + "2";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select3 = () => {
    const fullEq = resultOutput.value + "3";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select4 = () => {
    const fullEq = resultOutput.value + "4";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select5 = () => {
    const fullEq = resultOutput.value + "5";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select6 = () => {
    const fullEq = resultOutput.value + "6";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select7 = () => {
    const fullEq = resultOutput.value + "7";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select8 = () => {
    const fullEq = resultOutput.value + "8";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const select9 = () => {
    const fullEq = resultOutput.value + "9";
    resultOutput.value = "";
    resultOutput.value = resultOutput.value + fullEq;
}

const selectAdd = () => {
    firstNum = parseFloat(resultOutput.value);
    resultOutput.value = "";
    fullEq = "";
    operator = "+";
}

const selectSuctract = () => {
    firstNum = parseFloat(resultOutput.value);
    resultOutput.value = "";
    fullEq = "";
    operator = "-";
}

const selectMultiply = () => {
    firstNum = parseFloat(resultOutput.value);
    resultOutput.value = "";
    fullEq = "";
    operator = "*";
}

const selectDivide = () => {
    firstNum = parseFloat(resultOutput.value);
    resultOutput.value = "";
    fullEq = "";
    operator = "/";
}

const selectClear = () => {
    resultOutput.value = "";
    fullEq = "";
    operator = "";
}

const selectEquals = () => {
    secondNum = parseFloat(resultOutput.value);
    if (operator == "+") {
        resultOutput.value = String(firstNum + secondNum);
    } else if (operator == "-") {
        resultOutput.value = String(firstNum - secondNum);
    } else if (operator == "*") {
        resultOutput.value = String(firstNum * secondNum);
    } else if (operator == "/") {
        resultOutput.value = String(firstNum / secondNum);
    }

}





