create table item_reservations (
    id uuid not null,
    delivery_point varchar(255),
    email varchar(255),
    item_name varchar(255),
    price integer,
    primary key (id)
);

create table items (
    id uuid not null,
    item_name varchar(255),
    price integer,
    primary key (id)
);
create table service_reservations (
    id uuid not null,
    car_num varchar(255),
    comment varchar(255),
    date date, email varchar(255),
    service_name varchar(255),
    time varchar(255),
    vin varchar(255),
    primary key (id)
);
create table services (
    id uuid not null,
    date date,
    price integer,
    service_name varchar(255),
    time varchar(255),
    primary key (id)
);
