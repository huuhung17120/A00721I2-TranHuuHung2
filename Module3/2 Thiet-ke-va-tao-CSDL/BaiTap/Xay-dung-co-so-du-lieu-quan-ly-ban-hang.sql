Create database QuanLyBanHang;
Use QuanLyBanHang;

Create table `Customer` (
	cID int not null primary key auto_increment,
    `cName` nvarchar(45),
    cAge int
);

Create table `Product` (
	pID int not null primary key auto_increment,
    `pName` nvarchar(100),
    pPrice double
);

Create table `Order`(
	oID int not null primary key auto_increment,
    cID int not null,
    oDate date,
    oTotalPrice double
);

Create table `OrderDetail` (	
	oID int not null unique,
    pID int not null unique,
    odQTY int
);

ALTER TABLE `Order` ADD CONSTRAINT FK_cID FOREIGN KEY (cID) REFERENCES `Customer`(cID);
ALTER TABLE `OrderDetail` ADD CONSTRAINT FK_oID FOREIGN KEY (oID) REFERENCES `Order`(oID);
ALTER TABLE `OrderDetail` ADD CONSTRAINT FK_pID FOREIGN KEY (pID) REFERENCES `Product`(pID);
ALTER TABLE `OrderDetail` ADD CONSTRAINT FK_oID_pID PRIMARY KEY (oID,pID);



