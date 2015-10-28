CREATE DATABASE masp;
use masp;


--tipo de pessoa
CREATE TABLE tipo(
id int identity not null,
descricao varchar(50) not null
primary key(id)) 

--EXECUTAR ANTES DE RODAR O PROJETO
INSERT INTO tipo (descricao) VALUES 
('Visitante'),      --1
('Autor'),          --2
('Editor'),         --3
('Representante');  --4

--Impossibilita a edição do tipo
CREATE TRIGGER t_tipo
ON tipo
instead of INSERT, UPDATE, DELETE 
AS
begin
	raiserror('Não é possível realizar essa operação',16,1)
END;

--enable 
enable trigger t_tipo on tipo;

--pessoa para as demais
create table pessoa(
idPessoa int identity not null,
idTipo int not null
primary key(idPessoa),
foreign key(idTipo) references tipo(id))


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

--Dados da pessoa @@@@@@@@@@@22editar
CREATE TABLE visitante(

nome varchar(100) not null,
dataNasc datetime,
nivelAcad varchar(50) not null,
genero varchar(15) not null check( genero = 'masculino' or
  genero = 'feminino' or genero = 'outro'),
naturalidade varchar (50),
nacionalidade 
)




