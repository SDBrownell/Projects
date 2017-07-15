drop table positions; 
create table positions(
positionID int primary key,
positionName varchar(200),
positionCompany varchar(200),
positionIndustry varchar(200),
positionWebsite varchar(300),
positionLocation varchar(200));

drop table skills; 
create table skills(
skillID int primary key,
skillName varchar(100),
skillDescription varchar(200));

drop table skillTypes; 
create table skillTypes(
skillTypeID int primary key,
skillID int);

drop table positionSkills; 
create table positionSkills(
positionSkillID int auto_increment primary key,
positionID int,
skillID int);

drop table positionFunctions; 
create table positionFunctions(
positionFunctionID int primary key,
positionID int,
positionFunction varchar(100));


alter table skillTypes add
  foreign key (skillID) references
    skills(skillID);

alter table positionSkills add
  foreign key (positionID) references
    positions(positionID);

alter table positionSkills add
  foreign key (skillID) references
    skills(skillID);

alter table positionFunctions add
  foreign key (positionID) references
    positions(positionID);



