// Objects Arrays JSON
// Exercise 1
// const darthVader = {allegiance: "Empire", weapon: "lightsabre", sith: true};

// Exercise 2
// console.log("Darth Vader's allegiance is to the", darthVader.allegiance);
// console.log("Darth Vader's weapon of choice", darthVader.weapon);
// console.log("Darth Vader is a sith?", darthVader.sith);
// console.log("Darth Vader is a jedi?", !darthVader.sith);
// console.log("Darth Vader is a jedi?", darthVader.sith ? "false" : "true");

//Exercise 3
// const myname = ["hello","everyone"];
// console.log(myname.length);
// myname.push("addedelement1");
// myname.push("addedelement2");
// myname.push("addedelement3");
// console.log(myname.length);
// myname.shift();
// for (let a of myname) {
//     console.log(a);
// }

// Functions, funtion expressions and arrow functions
// Exercise 1
// function ex1(num1, num2) {
//     return num1 - num2; 
// }

// Exercise 2
// function welcome(name, age, gender) {
//     return console.log(`My name is ${name}, I am ${age} and of gender ${gender}`)
// }
// welcome("Devin", 25, "Male")

// Exercise 3
// const powerUp = (n1, n2) => n1 ** n2;
// powerUp(3,3);

//Higher Order Fucntions
// Exercise 1
// let grades = [
//     {name: 'John', grade: 8, sex: 'M'},
//     {name: 'Sarah', grade: 12, sex: 'F'},
//     {name: 'Bob', grade: 16, sex: 'M'},
//     {name: 'Johnny', grade: 2, sex: 'M'},
//     {name: 'Cyrus', grade: 4, sex: 'M'},
//     {name: 'Paula', grade: 18, sex: 'F'},
//     {name: 'Jeff', grade: 5, sex: 'M'},
//     {name: 'Jennifer', grade: 13, sex: 'F'},
//     {name: 'Courtney', grade: 15, sex: 'F'},
//     {name: 'Jane', grade: 9, sex: 'F'}
// ]
// let isBoy = student => student.sex === "M";
// let isGirl = student => student.sex === "F";

// let getBoys = grades => (grades.filter(isBoy));
// let getGirls = grades => (grades.filter(isGirl));

// let average = grades => (grades.reduce((acc,curr) => (acc + curr.grade), 0) / grades.length);

// let maxGrade = grades => (Math.max(...grades.map(student => student.grade)));
// let minGrade = grades => (Math.min(...grades.map(student => student.grade)));

// let highestGrade = maxGrade(grades);
// let lowestGrade = minGrade(grades);
// let highestGradeBoys = maxGrade(getBoys(grades));
// let lowestGradeBoys = minGrade(getBoys(grades));
// let highestGradeGirls = maxGrade(getGirls(grades));
// let lowestGradeGirls = minGrade(getGirls(grades));

const output = document.querySelector("div#output");

const ele = document.childElement("p");

document.querySelector("div#output").appendChild(ele);
​
ele.innerText = "Hello, World!";