create database if not exists ECommDb;

use ECommDb;

create table if not exists user(
	userid int primary key auto_increment,
	firstname varchar(20) not null,
	middlename varchar(20),
	lastname varchar(20) not null,
	username varchar(10) not null unique,
	pwd varchar(12) not null unique,
	email varchar(30) not null unique,
	dateofbirth date not null,
	sex varchar(10) not null,
	phonenumber int not null,
	displaypicture varchar(50),
	addressid int not null,
	active varchar(5) not null default "true",
	foreign key (addressid) references address(addressid),
	foreign key (orderid) references productorder(orderid)
);

create table if not exists address(
	addressid int primary key auto_increment,
	address1 varchar(30) not null,
	address2 varchar(30),
	pincodeid int not null,
	active varchar(5) not null default "true",
	foreign key (pincodeid) references pincode(pincodeid)
);

create table if not exists pincode(
	pincodeid int primary key,
	country varchar(20) not null,
	state varchar(20) not null,
	district varchar(20) not null,
	city varchar(20) not null,
	active varchar(5) not null default "true"
);

create table if not exists productorder(
	orderid int primary key auto_increment,
	orderdate date not null,
	quantity int not null,
	bill double not null,
	orderstatus varchar(20) not null,
	productid int not null,
	userid int,
	active varchar(5) not null default "true",
	foreign key (productid) references product(productid),
	foreign key (userid) references user(userid)
);

create table if not exists product(
	productid int primary key auto_increment,
	productname varchar(20) not null,
	productprice double not null,
	producttype varchar(20) not null,
	productimage varchar(50),
	active varchar(5) not null default "true"
);


Insert into product (productname, productprice, producttype, productimage) values("Spinner",125.00,"Toy","fidget.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Shirt",1200.00,"Clothes","Shirt.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Jeans",2100.00,"Clothes","Jeans.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Airgun",205.00,"Toy","Airgun.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Watch",5000.00,"Watch","Watch.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Iphone",44000.00,"Phone","Iphone.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Macbook",1250000.00,"Computer","Mac.jpg");
Insert into product (productname, productprice, producttype, productimage) values("Notebook",70000.00,"Computer","Dell.jpg");

insert into pincode(pincodeid, country, state, district, city) values(411028,"India","Maharashtra","Pune","Magarpatta");
insert into pincode(pincodeid, country, state, district, city) values(799005,"India","Tripura","Agartala","Kumaritilla");
insert into pincode(pincodeid, country, state, district, city) values(799001,"India","Tripura","Agartala","P.O.");
insert into pincode(pincodeid, country, state, district, city) values(424007,"India","MadhyaPradesh","Gwalior","Panchsheel");
insert into pincode(pincodeid, country, state, district, city) values(560008,"India","Karnataka","Bangaluru","Marathahalli");
insert into pincode(pincodeid, country, state, district, city) values(560004,"India","Karnataka","Bangaluru","Brindavana");


insert into address (address1, address2, pincodeid) values("Cosmos L 501","Magarpatta City, Hadapsar", 411028);
insert into address (address1, address2, pincodeid) values("Cosmos Prime 503","Magarpatta City, Hadapsar", 411028);
insert into address (address1, address2, pincodeid) values("Cosmos 0 903","Magarpatta City, Hadapsar", 411028);
insert into address (address1, address2, pincodeid) values("Kumaritilla","Abhoynagar Post Office", 799005);
insert into address (address1, address2, pincodeid) values("B2, Tower 8","Magarpatta City, Hadapsar", 411028);
insert into address (address1, address2, pincodeid) values("Heloconia, South Gate","Magarpatta City, Hadapsar", 411028);
insert into address (address1, address2, pincodeid) values("Cosmos L 901","Magarpatta City, Hadapsar", 411028);


Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2017-11-11",2,4410.00,"delivered",2,3);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2017-03-15",1,131.25,"delivered",2,1);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2016-12-25",3,393.75,"delivered",3,1);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2017-06-21",1,1260.00,"delivered",1,2);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2017-11-11",1,131250.00,"delivered",2,7);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2017-10-01",1,5250.00,"delivered",3,5);
Insert into productorder(orderdate, quantity, bill, orderstatus, userid, productid) values("2012-07-12",2,147000.00,"delivered",3,8);

Insert into user(firstname, middlename, lastname, username, pwd, email, dateofbirth, sex, phonenumber, displaypicture, addressid) values("Devina","","Prasad","dev","prasad","devina@tset.com","1994-02-10","Female","9114612715","",9);
Insert into user(firstname, middlename, lastname, username, pwd, email, dateofbirth, sex, phonenumber, displaypicture, addressid) values("Sujata","","Laskar","shonu","babu","shonu@test.com","1995-10-06","Female","9774056002","",4);
Insert into user(firstname, middlename, lastname, username, pwd, email, dateofbirth, sex, phonenumber, displaypicture, addressid) values("Ranit","Singha","Roy","ranit@Vit","Singha","rsr@tset.com","1994-06-22","Male","8014612723","",4);
Insert into user(firstname, middlename, lastname, username, pwd, email, dateofbirth, sex, phonenumber, displaypicture, addressid) values("Shravan","Kumar","Etikapalli","bhukamp","test","s.etikapalli@tset.com","1993-03-11","Male","9114612715","",5);
Insert into user(firstname, middlename, lastname, username, pwd, email, dateofbirth, sex, phonenumber, displaypicture, addressid) values("Mohpreet","Singh","Dhillon","MSD","JavaTest","msd@tset.com","1986-03-12","Male","8408612715","",1);