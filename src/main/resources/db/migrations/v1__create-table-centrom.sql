CREATE TABLE medicos
(
    id BIGINT not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null,
    cedula varchar(12) not null,
    especialidad varchar(100) not null,
    calle  varchar(100) not null,
    corregimineto varchar(100) not null,
    provincia varchar(100) not null,
    distrito varchar(100) not null,

    primary key (cedula)

)