function fazGet(url){
    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    return request.responseText
}

function criaLinha(bairro){
    let linha = document.createElement("tr")
    let tdId = document.createElement("td")
    let tdNd = document.createElement("td")
    let tdNdd = document.createElement("td")
    tdId.innerHTML = bairro.id
    tdNd.innerHTML = bairro.name
    tdNdd.innerHTML = bairro.email
    linha.appendChild(tdId)
    linha.appendChild(tdNd)

    return linha
}

function main(){
    let data = fazGet("http://localhost:8080/users");
    let bairro = JSON.parse(data);
    let tabela = document.getElementById("tabela");
    bairro.forEach(element => {
        let linha = criaLinha(element);
        tabela.appendChild(linha);
    });
}



main();