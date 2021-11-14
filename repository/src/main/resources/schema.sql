drop table if exists Person;
drop table if exists Car;

create table Person (
  id int primary key,
  name varchar not null,
  surname varchar not null
);

create table Car(
    id int primary key,
    model varchar not null,
    color varchar not null,
    owner int references Person(id),
    licensePlate varchar(7) not null
);