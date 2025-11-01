CREATE DATABASE CrudProduto;

use CrudProduto;

CREATE TABLE tbl_produto (
id INT (11) NOT NULL,
descricao VARCHAR(70) NOT NULL,
valor DOUBLE NOT NULL,
quantidade INT(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

ALTER TABLE tbl_produto 
	ADD PRIMARY KEY (id);
    
ALTER TABLE tbl_produto
	modify id INT NOT NULL auto_increment,
    auto_increment=2;
    
insert into tbl_produto (descricao, valor, quantidade)
values
('Arroz', 2.50, 4);

create table tbl_usuarios(
id int auto_increment primary key,
nome varchar(80) not null,
login varchar(50) not null,
senha varchar(255) not null,
tipo varchar(10) not null
);


