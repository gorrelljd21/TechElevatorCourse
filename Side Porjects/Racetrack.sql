drop table if exists team;

create table team (
	team_number numeric(2,0) not null,
	horse varchar(50) not null,
	jockey varchar(50) not null,
	odds varchar(5) not null,
	constraint PK_team primary key(team_number),
	constraint UQ_horse unique(horse)
);