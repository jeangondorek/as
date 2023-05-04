function insereUsuario() {
  let nome = document.getElementById("nome2").value;
  let email = document.getElementById("email2").value;

  let data = {
    "name2": nome,
    "email2": email
  };

  let request = new XMLHttpRequest();
  request.open('POST', 'http://localhost:8080/users', true);
  request.setRequestHeader('Content-Type', 'application/json');

  request.onreadystatechange = function() {
    if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
      let usuario = JSON.parse(this.responseText);
      let linha = criaLinha(usuario);
      let tabela = document.getElementById("tabela");
      tabela.appendChild(linha);
    }
  };

  request.send(JSON.stringify(data));
}
