function fazGet(url){
    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    return request.responseText
}

function perid(){
    let algo = document.getElementById('id');
    let id = algo.value;
    let data = fazGet(`http://localhost:8080/users/${id}`);
    let bairro = JSON.parse(data);
    let tabela2 = document.getElementById("tabela2");
    let linha = document.createElement("tr")
    let tdId = document.createElement("td")
    let tdNd = document.createElement("td")
    let tdNdd = document.createElement("td")
    tdId.innerHTML = bairro.id
    tdNd.innerHTML = bairro.name
    tdNdd.innerHTML = bairro.email
    linha.appendChild(tdId)
    linha.appendChild(tdNd)
    tabela2.appendChild(linha);
}