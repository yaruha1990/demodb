insert into hibernate_sequence
values (1);

insert into university (id, name)
values (1, 'NAU');

insert into student (id, name, university_id)
values (1, 'Vasya', 1),
       (2, 'Petya', 1),
       (3, 'Sergiy', 1);