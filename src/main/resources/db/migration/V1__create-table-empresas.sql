create table empresas(
    id bigint not null primary key auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    endereco varchar(100) not null,
    fone varchar(20) not null,
    contato varchar(100) not null,
    fone_contato varchar(20) not null,
    observacao varchar(100) not null
);
