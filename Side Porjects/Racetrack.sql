
-- create table kentucky_derby (
-- 	team_number serial,
-- 	horse varchar(50) not null,
-- 	jockey varchar(50) not null,
-- 	odds int not null,
-- 	constraint PK_team primary key(team_number),
-- 	constraint UQ_horse unique(horse)
-- );

insert into kentucky_derby(team_number, horse, jockey, odds)
values
	(01, 'Mo Donegal', 'Irad Ortiz Jr.', '10'),
	(02, 'Happy Jack', 'Rafael Bejarano', '30'),
	(03, 'Epicenter', 'Joel Rosario', '7'),
	(04, 'Summer is Tomorrow', 'Mickael Barzalona', '30'),
	(05, 'Smile Happy', 'Corey Lanerie', '20'),
	(06, 'Messier', 'John Velazquez', '8'),
	(07, 'Crown Pride', 'Christohpe Lemaire', '20'),
	(08, 'Charge It', 'Luis Saez', '20'),
	(09, 'Tiz the Bomb', 'Brian Joseph Hernandez', '30'),
	(10, 'Zandon', 'Flavien Prat', '3'),
	(11, 'Pioneer of Medina', 'Joe Bravo', '30'),
	(12, 'Taiba', 'Mike Smith', '12'),
	(13, 'Simplification', 'Jose Ortiz', '20'),
	(14, 'Barber Road', 'Reylu Gutierrez', '30'),
	(15, 'White Abarrio', 'Tyler Gaffalione', '10'),
	(16, 'Cyberknife', 'Florent Geroux', '20'),
	(17, 'Classic Causeway', 'Julien Leparoux', '30'),
	(18, 'Tawny Port', 'Ricardo Santana Jr.', '30'),
	(19, 'Zozos', 'Manuel Franco', '20'),
	(20, 'Rich Strike', 'Soony Lean', '88');