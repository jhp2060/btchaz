create table booking
(
    id        bigint not null auto_increment,
    date_time datetime(6),
    is_open   bit    not null,
    theme_id  bigint,
    primary key (id)
) engine=InnoDB;

create table region
(
    id   bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine=InnoDB;

create table store
(
    id        bigint not null auto_increment,
    name      varchar(255),
    siteuri   varchar(255),
    region_id bigint,
    primary key (id)
) engine=InnoDB;

create table theme
(
    id       bigint not null auto_increment,
    genre    integer,
    name     varchar(255),
    store_id bigint,
    primary key (id)
) engine=InnoDB;

alter table booking
    add constraint FKk359qjvxgjipum19kwobo4vyl foreign key (theme_id) references theme (id);
alter table store
    add constraint FKiecbc1b9m21semcf714lasyi5 foreign key (region_id) references region (id);
alter table theme
    add constraint FKcrj39cbn6jldet3ekokpnb31 foreign key (store_id) references store (id);