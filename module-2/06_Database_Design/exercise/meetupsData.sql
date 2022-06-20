select * from groups;

insert into groups(group_name)
values ('Durmstrang'), ('Beauxbatons'), ('Hogwarts');

select * from events;

insert into events(events_name, description, start_date, start_time, duration, lead_group)
values ('First Task: Obtain the Golden Egg', ' Retrieve a golden egg that is being guarded by a dragon — the egg will be located within a clutch of real dragon eggs.',
		'1994-11-24', 0900, 60, 3), 
	('Yule Ball', 'A Chistmas Ball held for students of the wizarding schools and those who are participating in the Triwizard Tournament', '1994-12-25', 1900, 120, 3), 
	('Task Two: Retreive What Was Stolen', 'The Champions will need to swim into the Black Lake to retrieve something that had been stolen from each of them', '1995-02-24', 1200, 60, 1),
	('Task Three: The Maze', 'Navagate the maze and be the first to touch the Triwizard Cup in the center of the maze', '1995-06-25', 0900, 120, 2);
	
select * from members;
	
insert into members(last_name, first_name, email_address, phone_number, birthday, email_reminder)
values ('Karkaroff', 'Igor', 'igor.karkaroff@durmstrang.wzd', 1234567890, '1954-04-03', false),
	('Krum', 'Viktor', 'viktor.krum@durmstrang.wzd', 5673829876, '1976-08-01', true),
	('Maxime', 'Olympe', 'olympe.maxime@beauxbatons.wch', 2156782345,'1960-01-01', true),
	('Delacour', 'Fleur', 'fleaur.delacour@beauxbatons.wch', 0981237583, '1977-02-01', true),
	('Dumbledore', 'Albus', 'albus.dumbledor@hogwarts.wzd', 3457861234, '1881-07-13', true),
	('Diggory', 'Cedric', 'cedric.diggory@hogwarts.wzd', 6759823465, '1977-10-01', false),
	('Potter', 'Harry', 'harry.potter@hogwarts.wzd', 0981236475, '1980-07-31', true),
	('Hagrid', 'Rubeus', 'rubeus.hagrid@hogwarts.wzd', 9871225364, '1928-12-06', false);
	
select * from members_events;

insert into members_events(member_id, events_id)
values ((select member_id from members where last_name = 'Krum'), (select events_id from events where events_name = 'First Task: Obtain the Golden Egg')),
 ((select member_id from members where last_name = 'Potter'), (select events_id from events where events_name = 'Yule Ball')),
 ((select member_id from members where last_name = 'Diggory'), (select events_id from events where events_name = 'Task Two: Retreive What Was Stolen')),
((select member_id from members where last_name = 'Delacour'), (select events_id from events where events_name = 'Task Three: The Maze'));
	
select * from members_groups;

insert into members_groups(member_id, group_id)
values ((select member_id from members where last_name = 'Karkaroff'), (select group_id from groups where group_name = 'Durmstrang')),
((select member_id from members where last_name = 'Krum'), (select group_id from groups where group_name = 'Durmstrang')),
((select member_id from members where last_name = 'Maxime'), (select group_id from groups where group_name = 'Beauxbatons')),
((select member_id from members where last_name = 'Delacour'), (select group_id from groups where group_name = 'Beauxbatons')),
((select member_id from members where last_name = 'Dumbledore'), (select group_id from groups where group_name = 'Hogwarts')),
((select member_id from members where last_name = 'Diggory'), (select group_id from groups where group_name = 'Hogwarts')),
((select member_id from members where last_name = 'Potter'), (select group_id from groups where group_name = 'Hogwarts')),
((select member_id from members where last_name = 'Hagrid'), (select group_id from groups where group_name = 'Hogwarts'));








