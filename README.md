# Api para crud java
![MIT](https://img.shields.io/github/license/jeangondorek/api-rest-nodejs?style=for-the-badge)

## Tecnologias usadas
  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
  ![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
  ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)

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
Ou acessar o arquivo `swagger.yaml` copias as informações e colar em https://editor.swagger.io, lembrando que será somente a visualização sem interação nesse caso.


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
