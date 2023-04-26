INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');

INSERT INTO tb_products(name, color, preco) VALUES ('Boneca', 'azul', 12);
INSERT INTO tb_products(name, color, preco) VALUES ('cavalo', 'azul', 15);
INSERT INTO tb_products(name, color, preco) VALUES ('carro', 'preto', 7);