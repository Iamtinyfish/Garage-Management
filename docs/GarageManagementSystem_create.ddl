CREATE TABLE tblTechnicianAssignment (
  ID            int(10) NOT NULL AUTO_INCREMENT, 
  tblEmployeeID int(10) NOT NULL, 
  tblBillID     int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblEmployee (
  ID       int(10) NOT NULL, 
  name     varchar(255) NOT NULL, 
  birthday date NOT NULL, 
  gender   binary(1) NOT NULL, 
  address  varchar(255) NOT NULL, 
  phone    varchar(20) NOT NULL, 
  email    varchar(255) NOT NULL, 
  idCard   varchar(20) NOT NULL, 
  position varchar(20) NOT NULL, 
  note     varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblAccount (
  ID            int(10) NOT NULL, 
  username      varchar(255) NOT NULL, 
  password      varchar(32) NOT NULL, 
  salt          varchar(8) NOT NULL, 
  position      varchar(20) NOT NULL, 
  tblEmployeeID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblSchedule (
  ID            int(10) NOT NULL, 
  customerName  varchar(255) NOT NULL, 
  phone         varchar(20) NOT NULL, 
  email         varchar(255) NOT NULL, 
  scheduleDay   date NOT NULL, 
  note          varchar(255), 
  status        varchar(20) NOT NULL, 
  tblEmployeeID int(10) NOT NULL, 
  tblCustomerID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblCar (
  ID            int(10) NOT NULL AUTO_INCREMENT, 
  licensePlate  varchar(20) NOT NULL, 
  type          varchar(20) NOT NULL, 
  tblCustomerID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblAccessoryReceiptNote (
  ID            int(10) NOT NULL, 
  totalCost     decimal(17, 2) NOT NULL, 
  receivedDay   date NOT NULL, 
  note          varchar(255), 
  tblEmployeeID int(10) NOT NULL, 
  tblProviderID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblReceivedAccessory (
  ID                        int(11) NOT NULL AUTO_INCREMENT, 
  amount                    int(10) NOT NULL, 
  receivedPrice             decimal(17, 2) NOT NULL, 
  note                      varchar(255), 
  tblAccessoryID            int(10) NOT NULL, 
  tblAccessoryReceiptNoteID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblBill (
  ID            int(10) NOT NULL AUTO_INCREMENT, 
  totalPrice    decimal(17, 2) NOT NULL, 
  status        varchar(20) NOT NULL, 
  startDay      date NOT NULL, 
  latestEditDay date NOT NULL, 
  paymentDay    date, 
  note          varchar(255), 
  tblCarID      int(10) NOT NULL, 
  tblEmployeeID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblAccessory (
  ID           int(10) NOT NULL AUTO_INCREMENT, 
  name         varchar(255) NOT NULL, 
  stock        int(10) NOT NULL, 
  receivedCost decimal(17, 2) NOT NULL, 
  price        decimal(17, 2) NOT NULL, 
  unit         varchar(20) NOT NULL, 
  description  varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblService (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  name        varchar(255) NOT NULL, 
  price       decimal(17, 2) NOT NULL, 
  description varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblCustomer (
  ID       int(10) NOT NULL AUTO_INCREMENT, 
  name     varchar(255) NOT NULL, 
  birthday date NOT NULL, 
  gender   varchar(20) NOT NULL, 
  address  varchar(255) NOT NULL, 
  phone    varchar(20) NOT NULL, 
  email    varchar(255) NOT NULL, 
  idCard   varchar(20) NOT NULL, 
  level    int(10) NOT NULL, 
  note     varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblUsedService (
  ID           int(10) NOT NULL AUTO_INCREMENT, 
  amount       int(10) NOT NULL, 
  price        decimal(17, 2) NOT NULL, 
  note         varchar(255), 
  tblBillID    int(10) NOT NULL, 
  tblServiceID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblUsedAccessory (
  ID             int(11) NOT NULL AUTO_INCREMENT, 
  amount         int(10) NOT NULL, 
  price          decimal(17, 2) NOT NULL, 
  note           varchar(255), 
  tblBillID      int(10) NOT NULL, 
  tblAccessoryID int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE tblProvider (
  ID      int(10) NOT NULL AUTO_INCREMENT, 
  name    varchar(255) NOT NULL, 
  address varchar(255) NOT NULL, 
  phone   varchar(20) NOT NULL, 
  email   varchar(255) NOT NULL, 
  note    varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
ALTER TABLE tblCar ADD CONSTRAINT FKtblCar882719 FOREIGN KEY (tblCustomerID) REFERENCES tblCustomer (ID);
ALTER TABLE tblBill ADD CONSTRAINT FKtblBill666739 FOREIGN KEY (tblEmployeeID) REFERENCES tblEmployee (ID);
