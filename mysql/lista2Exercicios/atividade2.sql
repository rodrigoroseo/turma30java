CREATE DATABASE DB_PIZZARIA_LEGAL;
USE DB_PIZZARIA_LEGAL;

CREATE TABLE TB_CATEGORIA(
	ID INT(11) AUTO_INCREMENT, PRIMARY KEY(ID),
    NOME VARCHAR(30) NOT NULL,
    FATIAS INT
) ENGINE=INNODB;

CREATE TABLE TB_PIZZA(
	ID INT(11) AUTO_INCREMENT, PRIMARY KEY(ID),
    NOME VARCHAR(30) NOT NULL,
    INGREDIENTES VARCHAR(30),
    PRECO DECIMAL(8,2) NOT NULL,
	BORDA VARCHAR(30),
    CATEGORIA INT NOT NULL REFERENCES TB_CATEGORIA(ID)
) ENGINE=INNODB;

INSERT INTO TB_CATEGORIA(NOME,FATIAS) VALUES
("Mini",1),
("Brotinho",4),
("Doce",6),
("Grande",8),
("Mega",12);

INSERT INTO TB_PIZZA(NOME,PRECO,CATEGORIA) VALUES
("Mussarela",6,1),
("Calabresa",20,2),
("Atum",42,4),
("Do chefe",60,5),
("Brigadeiro",35,3),
("Banana com canela",35,3),
("Frango c/ catupiry",42,4),
("Poruguesa",40,4);

SELECT * FROM TB_PIZZA WHERE PRECO > 45;

SELECT * FROM TB_PIZZA WHERE PRECO >= 29 AND PRECO <= 60;

SELECT * FROM TB_PIZZA WHERE NOME LIKE "%C%";

SELECT TB_PIZZA.NOME, TB_PIZZA.PRECO, TB_CATEGORIA.NOME, TB_CATEGORIA.FATIAS
FROM TB_PIZZA
INNER JOIN TB_CATEGORIA ON TB_CATEGORIA.ID = TB_PIZZA.CATEGORIA
WHERE TB_CATEGORIA.NOME = "Doce";