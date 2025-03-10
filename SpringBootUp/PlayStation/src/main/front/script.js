document.addEventListener("DOMContentLoaded", function () {
    getPlayStations();

    const cadastrarButton = document.getElementById("cadastrarButton");
    const procurarButton = document.getElementById("procurarButton");
    const filterInput = document.getElementById("filterInput");

    // Cadastra o playstation
    function cadastrarPlayStation(nome, preco) {
        fetch("http://localhost:8080/PlayStations", {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify({name: nome, preco: preco})
        })
            .then(response => response.json())
            .then(data => {
                console.log("PlayStation cadastrado:", data);
                getPlayStations(); // Recarregar a lista de PlayStations após cadastro
            })
            .catch(error => {
                console.error("Erro na requisição:", error);
            });
    }

    cadastrarButton.addEventListener("click", function (event) {
        event.preventDefault();
        const nome = prompt("Digite o nome do PlayStation:");
        const preco = prompt("Digite o preço (Use apenas números)");
        cadastrarPlayStation(nome, preco);
    });

    // Lista os playstations
    function getPlayStations(filterName = "") {
        fetch("http://localhost:8080/PlayStations", {
            method: "GET",
            headers: {
                "Content-Type": "application/json"
            },
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`Erro na requisição: ${response.status} ${response.statusText}`);
                }
                return response.json();
            })
            .then(data => {
                const playStationList = document.getElementById("playStationList");
                playStationList.innerHTML = ""; // Limpa a lista antes de repopular
                const filteredPlayStations = searchPlayStation(data, filterName);

                if (filteredPlayStations.length === 0) {
                    console.log("Nenhum PlayStation encontrado.");
                } else {
                    console.log("PlayStations encontrados:", data);
                }

                filteredPlayStations.forEach(playStation => {
                    const playStationContainer = document.createElement("div");
                    playStationContainer.classList.add("playstation-card");

                    playStationContainer.innerHTML = `
                    <div>
                        <h3>${playStation.name}</h3>
                        <img src="https://t2.tudocdn.net/664712?w=1920&h=1080">
                        <p>Preço: R$ ${playStation.preco}</p> 
                        <button class="deleteButton" data-id="${playStation.id}">Excluir</button>
                        <button class="editButton" data-id="${playStation.id}">Editar</button>
                    </div>
                    `;

                    // Atribui o evento de exclusão
                    const deleteButton = playStationContainer.querySelector(".deleteButton");
                    deleteButton.addEventListener("click", function (event) {
                        const playStationId = event.target.getAttribute("data-id");
                        deletPlayStation(playStationId, playStationContainer);
                    });

                    // Atribui o evento de edição
                    const editButton = playStationContainer.querySelector(".editButton");
                    editButton.addEventListener("click", async function (event) {
                        const playStationId = event.target.getAttribute("data-id");
                        const nome = prompt("Digite o nome do PlayStation:");
                        const preco = prompt("Digite o preço (Use apenas números)");
                        let updatedData = {name: nome, preco: preco}
                        await editPlayStation(playStationId, updatedData);
                        getPlayStations();
                    });


                    playStationList.appendChild(playStationContainer); // Adiciona o card ao DOM
                });
            })
            .catch(error => {
                console.error("Erro ao buscar PlayStations:", error);
            });
    }

    //Deleta o playstation e a div dele na tela
    function deletPlayStation(id, playStationElement) {
        fetch(`http://localhost:8080/PlayStations/${id}`, {
            method: "DELETE",
            headers: {
                "Content-Type": "application/json"
            },
        })
            .then(response => {
                if (response.ok) {
                    console.log("PlayStation excluído com sucesso");
                    playStationElement.remove();
                } else {
                    console.error("Erro ao excluir o PlayStation");
                }
            })
            .catch(error => {
                console.error("Erro ao fazer a requisição DELETE:", error);
            });
    }

    // Editar playstation
    async function editPlayStation(id, updatedData) {
        const response = await fetch(`http://localhost:8080/PlayStations/${id}`, {
            method: "PATCH",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(updatedData)
        });

        if (response.ok) {
            const updatedPlayStation = await response.json();
            console.log("PlayStation atualizado:", updatedPlayStation);
        } else {
            console.error("Erro ao editar PlayStation:", response.status);
        }

    }

    function searchPlayStation(playStations, filterName) {
        return playStations.filter(playStation => {
            const matchesName = playStation.name.toLowerCase().includes(filterName.toLowerCase());
            return matchesName;
        })
    }

    procurarButton.addEventListener("click", function () {
        const filterName = filterInput.value;
        getPlayStations(filterName);
    });

});
