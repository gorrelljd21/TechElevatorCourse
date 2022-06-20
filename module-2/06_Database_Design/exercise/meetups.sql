drop table if exists members, groups, members_groups, events, members_events cascade;

create table members(
	member_id serial primary key,
	last_name varchar(50) not null,
	first_name varchar(50) not null,
	email_address varchar(100) not null,
	phone_number varchar(10) null,
	birthday date NULL,
	email_reminder boolean not null
);

create table groups(
	group_id serial primary key,
	group_name varchar(50) not null,
	constraint UQ_group_name unique(group_name)
);

create table members_groups(
	member_id int not null,
	group_id int not null,
	constraint PK_members_groups primary key(member_id, group_id)
);

create table events(
	events_id serial primary key,
	events_name varchar(50) not null,
	description text not null,
	start_date date not null,
	start_time int not null,
	duration int not null,
	lead_group int not null,
	constraint CK_events_duration_min check (duration >= 30)
);

create table members_events(
	member_id int not null,
	events_id int not null,
	constraint PK_members_events primary key(member_id, events_id)
);

alter table members_groups add constraint FK_members_groups_members foreign key(member_id) references members(member_id);

alter table members_groups add constraint FK_members_groups_groups foreign key(group_id) references groups(group_id);

alter table members_events add constraint FK_members_events_members foreign key(member_id) references members(member_id);

alter table members_events add constraint FK_members_events_events foreign key(events_id) references events(events_id);

alter table events add constraint FK_events_lead_group foreign key(lead_group) references groups(group_id);






