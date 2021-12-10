use `student-management`;

create table class (
	id int primary key auto_increment,
    `name` nvarchar (45)
);

create table teacher (
	id int primary key auto_increment,
    `name` nvarchar (45),
	age int,
	`country` nvarchar (45)
);
