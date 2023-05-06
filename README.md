# Api para crud java

## Teclonolias usadas
- Java 19
- Spring Boot 2.6.2
- Maven 3.1.0
- Mongo Atlas
- Swagger

### Rotas

Rodando aplicação usando swagger no link http://localhost:8080/swagger-ui/index.html

As rotas da api são

- /users
Entidade
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "email": "mail@mail.com"
    }
- /products
Entidade
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "color": "COLOR",
        "preco": NUMBER
    }
- /cliente
Entidade
    {
        "id": "6456838ab562f760e44cc348",
        "name": "NOME",
        "email": "mail@mail.com"
    }

*Os id são gerados pelo mongo
