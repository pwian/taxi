create table Driver
(
    idLicense varchar(256) not null primary key,
    name varchar(256) not null,
    pricePerKm decimal not null,
    isAvailable boolean not null
);