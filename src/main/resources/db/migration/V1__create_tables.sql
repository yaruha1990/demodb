create table hibernate_sequence
(
    next_val bigint
) engine = InnoDB;

create table student
(
    id            bigint not null,
    name          varchar(255),
    university_id bigint,
    primary key (id)
) engine = InnoDB;

create table university
(
    id   bigint not null,
    name varchar(255),
    primary key (id)
) engine = InnoDB;

alter table student
    add constraint FK157t7rer269uuhfphq1mcd7y9
        foreign key (university_id)
            references university (id)