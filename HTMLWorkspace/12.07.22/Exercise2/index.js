"use strict"

const output = document.querySelector("div#output");
const houseInput = document.querySelector("#houseInput");

function getInfo() {
    axios.get("https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/kings.json")
        .then(response => {
            console.log("RES:", response);

            for (let i = 0; i < (response.data).length; i++) {
                if (response.data[i].hse == houseInput.value) {
                    const rulerName = document.createElement("p");
                    rulerName.innerText = response.data[i].nm;
                    output.appendChild(rulerName);

                    const city = document.createElement("p");
                    city.innerText = response.data[i].cty;
                    output.appendChild(city);

                    const houseName = document.createElement("p");
                    houseName.innerText = response.data[i].hse;
                    output.appendChild(houseName);

                    const yearsRuling = document.createElement("p");
                    yearsRuling.innerText = response.data[i].yrs;
                    output.appendChild(yearsRuling);
                } else {
                    const errorOccured = document.createElement("p");
                    errorOccured.innerText = "Error Occurred";
                }
            }

        })
        .catch(error => console.log(error));
}