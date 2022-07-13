"use strict"

document.querySelector("body > form").addEventListener("submit", function (event) {
    event.preventDefault();

    console.log("THIS: ", this);

    const data = {
        riderName: this.riderName.value,
        teamName: this.teamName.value,
        sponsorName: this.sponsorName.value
    }

    console.log("DATA:", data);

    axios.post("http://localhost:8080/createRiders", data)
        .then(res => {
            console.log("RES:", res);
            this.reset();
            this.riderName.focus;
            renderRiders();
        }).catch(err => console.error(err));

})

const output = document.querySelector("#output");

function renderRiders() {
    axios.get("http://localhost:8080/getRiders")
        .then(res => {
            console.log("Riders: ", res.data);
            output.innerHTML = "";
            for (let rider of res.data) {
                const riderCol = document.createElement("div");
                riderCol.className = "col";

                const riderCard = document.createElement("div");
                riderCard.className = "card";
                riderCol.appendChild(riderCard);

                const riderDiv = document.createElement("div");
                riderDiv.className = "card-body";
                riderCard.appendChild(riderDiv);

                const riderRiderName = document.createElement("h2");
                riderRiderName.innerText = rider.riderName;
                riderDiv.appendChild(riderRiderName);

                const teamName = document.createElement("p");
                teamName.innerText = "Team: " + rider.teamName;
                riderDiv.appendChild(teamName);

                const sponsorName = document.createElement("p");
                sponsorName.innerText = rider.sponsorName;
                riderDiv.appendChild(sponsorName);

                const riderDelete = document.createElement('button');
                riderDelete.innerText = "DELETE";
                riderDelete.addEventListener("click", () => {
                    console.log("DINO: ", rider);
                    deleteRiders(rider.id);
                });
                riderDiv.appendChild(riderDelete);

                output.appendChild(riderCol);
            }
        })
        .catch(err => console.error(err));
}

const deleteRiders = (id) => {
    axios.delete("http://localhost:8080/removeRiders/" + id)
        .then(res => {
            console.log("Delete successful");
            renderRiders();
        }).catch(err => console.error(err));
}

renderRiders();