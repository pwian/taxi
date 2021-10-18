create table Driver
(
    id_license varchar(256) not null primary key,
    name varchar(256) not null,
    price_per_km decimal not null,
    is_available boolean not null
);