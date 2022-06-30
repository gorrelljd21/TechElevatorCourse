create table kentucky_derby (
	team_number numeric(2,0) not null,
	horse varchar(50) not null,
	jockey varchar(50) not null,
	odds varchar(5) not null,
	constraint PK_team primary key(team_number),
	constraint UQ_horse unique(horse)
);

insert into kentucky_derby(team_number, horse, jockey, odds)
values
	(01, 'Mo Donegal', 'Irad Ortiz Jr.', '10:2'),
	(02, 'Happy Jack', 'Rafael Bejarano', '30:2'),
	(03, 'Epicenter', 'Joel Rosario', '7:2'),
	(04, 'Summer is Tomorrow', 'Mickael Barzalona', '30:2'),
	(05, 'Smile Happy', 'Corey Lanerie', '20:2'),
	(06, 'Messier', 'John Velazquez', '8:2'),
	(07, 'Crown Pride', 'Christohpe Lemaire', '20:2'),
	(08, 'Charge It', 'Luis Saez', '20:2'),
	(09, 'Tiz the Bomb', 'Brian Joseph Hernandez', '30:2'),
	(10, 'Zandon', 'Flavien Prat', '3:2'),
	(11, 'Pioneer of Medina', 'Joe Bravo', '30:2'),
	(12, 'Taiba', 'Mike Smith', '12:2'),
	(13, 'Simplification', 'Jose Ortiz', '20:2'),
	(14, 'Barber Road', 'Reylu Gutierrez', '30:2'),
	(15, 'White Abarrio', 'Tyler Gaffalione', '10:2'),
	(16, 'Cyberknife', 'Florent Geroux', '20:2'),
	(17, 'Classic Causeway', 'Julien Leparoux', '30:2'),
	(18, 'Tawny Port', 'Ricardo Santana Jr.', '30:2'),
	(19, 'Zozos', 'Manuel Franco', '20:2'),
	(20, 'Rich Strike', 'Soony Lean', '88:2');