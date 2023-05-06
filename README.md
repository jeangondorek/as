# Api para crud java

## Teclonolias usadas
- Java 19
- Spring Boot 2.6.2
- Maven 3.1.0
- Mongo Atlas
- Swagger

### Rodando o projeto
Necessário configurar a string de conexão do mongo atlas.

#### Clonar o projeto e acessar a pasta onde ele está

- Caso aberto pelo IntelliJ IDEA, só é necessário atualizar o maven e rodar o projeto.

- Comandos para rodar com maven:

```
mvn clean install -U
```

```
mvn package
```

Dentro da pasta target onde gerou o .jar

```
java -jar package.jar
```

- Ou baixar nas releases e rodar com:

```
java -jar package.jar
```

### Rotas

Rodando aplicação usando swagger no link http://localhost:8080/swagger-ui/index.html
Ou acessar o arquivo `swagger.yaml` copias as informações e colar em https://editor.swagger.io

As rotas da api são

- /users

Entidade
```
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "email": "mail@mail.com"
    }
```
- /products

Entidade
```
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "color": "COLOR",
        "preco": NUMBER
    }
```
- /cliente

Entidade
```
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "email": "mail@mail.com"
    }
```

*Os id são gerados pelo mongo
