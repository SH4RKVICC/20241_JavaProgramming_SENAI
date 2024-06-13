--- Criando Database banco;
CREATE DATABASE banco;
USE banco;

--- Criando tabela filmes;
CREATE TABLE filmes(
	codigo VARCHAR(5) PRIMARY KEY,
	titulo VARCHAR(30) NOT NULL,
	genero VARCHAR(30) NOT NULL,
	produtora VARCHAR(30) NOT NULL,
	dataCompra date NOT NULL
);