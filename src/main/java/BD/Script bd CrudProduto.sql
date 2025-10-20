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
