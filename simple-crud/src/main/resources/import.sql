create table students (
       id bigint auto_increment,
       first_name varchar(255),
       last_name varchar(255),
       primary key (id)
    );

INSERT INTO students (first_name, last_name) VALUES ('first', 'person');
INSERT INTO students (first_name, last_name) VALUES ('second', 'person');
INSERT INTO students (first_name, last_name) VALUES ('third', 'person');