CREATE DATABASE masp;
use masp;





CREATE TABLE empresa(

cnpj varchar(12) not null,
nome varchar(100) not null,
logradouro varchar(80) not null,
numero int not null,
complemento varchar(50) not null,
municipio varchar(100) not null,
estado varchar(30) not null,
cep int DEFAULT NULL,
pais varchar(100) not null
);

-- check not(cnpj = '111111111111' or cnpj = '222222222222' or cnpj = '333333333333' or
 -- cnpj = '444444444444' or cnpj = '555555555555' or cnpj = '666666666666' or cnpj = '777777777777' or
 -- cnpj = '888888888888' or cnpj = '999999999999' or cnpj = '000000000000'),

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

-- Dados do autor
CREATE TABLE autor(

codAutor int not null,
nome varchar(100) not null,
dataNasc datetime,
nacionalidade varchar(50),
obito datetime,
-- movimento varchar(40),
descricao varchar(100)
)

update autor set nome = ?, dataNasc = ?, nacionalidade = ?, obito = ?, descricao = ? where codAutor = ?

--Dados de uma obra
CREATE TABLE obra(

id int,
autor int not null,
titulo varchar(100) not null,
categoria varchar(20),
tipo varchar(50),
tecnica varchar(50),
daaObra datetime,
altura decimal (3,2),
largura decimal (3,2),
profundidade int,
dadosBiograficos varchar(MAX),
subtitulo varchar(100),
edicao varchar(10),
editor varchar(100),
ano varchar(4) not null , 
isbn varchar(13),

);

--Dados da pessoa 
CREATE TABLE visitante(

nome varchar(100) not null,
dataNasc datetime,
nivelAcad varchar(50) not null,
sexo varchar(15) not null check( sexo = 'masculino' or
  sexo = 'feminino' or sexo = 'outro'),
naturalidade varchar (50) not null,
nacionalidade varchar (50) not null,
rg varchar (9),
cpf varchar (11),
passaporte varchar(15)
)




