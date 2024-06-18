CREATE DATABASE agenda;

USE agenda;

CREATE TABLE contato(
	codigo INT auto_increment PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(150) NOT NULL
); 

SELECT * FROM contato;