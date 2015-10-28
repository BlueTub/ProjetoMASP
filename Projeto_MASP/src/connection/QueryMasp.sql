CREATE DATABASE masp;
use masp;


--Dados da empresa
CREATE TABLE empresa(

nome varchar(100),
cnpj varchar(12) not null check not(cnpj = '111111111111' or cnpj = '222222222222' or cnpj = '333333333333' or
  cnpj = '444444444444' or cnpj = '555555555555' or cnpj = '666666666666' or cnpj = '777777777777' or
  cnpj = '888888888888' or cnpj = '999999999999' or cnpj = '000000000000')
logradouro varchar(80) not null,
numero int not null,
complemento varchar(50),
municipio varchar(100) not null,
estado varchar(30) not null,
cep int,
pais varchar(100)
primary key(cnpj)
);

--Dados dos representantes da empresa
CREATE TABLE representante(

cnpj varchar(12) not null,
nome varchar(100) not null,
cpf varchar(11) not null,
rg varchar(9),
tel varchar(11),
primary key (rg)
foreign key ( cnpj ) references empresa(cnpj)
);

--Dados do autor
CREATE TABLE autor(

codAutor int,
nome varchar(100) not null,
dataNasc datetime,
nacionalidade varchar(50),
primary key (codAutor)
)


--Dados de uma obra
CREATE TABLE obra(

autor int not null,
titulo varchar(100) not null,
subtitulo varchar(100),
edicao varchar(10),
editor varchar(100),
ano varchar(4) not null , 
isbn varchar(13),
primary key (autor, titulo)
foreign key ( autor ) references autor(codAutor)
);

CREATE TABLE pessoa(
nome varchar(100) not null,
dataNasc datetime,
nivelAcad varchar(50) not null
)


