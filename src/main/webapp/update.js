function fazPut(url, data){
    let request = new XMLHttpRequest()
    request.open("PUT", url, false)
    request.setRequestHeader('Content-type', 'application/json');
    request.send(JSON.stringify(data))
    return request.responseText
}

function update(){
    let id = document.getElementById('id2').value;
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let data = { name: name, email: email };
    let result = fazPut(`http://localhost:8080/users/${id}`, data);
    // aqui você pode tratar o resultado da requisição
}
