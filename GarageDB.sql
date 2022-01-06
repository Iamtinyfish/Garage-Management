CREATE DATABASE  IF NOT EXISTS `garagedb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `garagedb`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: garagedb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accessory`
--

DROP TABLE IF EXISTS `accessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accessory` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `stock` INT NOT NULL,
  `receivedCost` DECIMAL(17,2),
  `price` DECIMAL(17,2),
  `unit` VARCHAR(25),
  `status` VARCHAR(25) NOT NULL,
  `description` VARCHAR(255),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accessory`
--

LOCK TABLES `accessory` WRITE;
/*!40000 ALTER TABLE `accessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `accessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `accessoryreceiptnote`
--

DROP TABLE IF EXISTS `accessoryreceiptnote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accessoryreceiptnote` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `totalCost` DECIMAL(17,2) NOT NULL,
  `receivedDay` date NOT NULL,
  `note` VARCHAR(255),
  `EmployeeID` INT NOT NULL,
  `ProviderID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAccesso441502` (`EmployeeID`),
  KEY `FKAccesso408635` (`ProviderID`),
  CONSTRAINT `FKAccesso408635` FOREIGN KEY (`ProviderID`) REFERENCES `provider` (`ID`),
  CONSTRAINT `FKAccesso441502` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accessoryreceiptnote`
--

LOCK TABLES `accessoryreceiptnote` WRITE;
/*!40000 ALTER TABLE `accessoryreceiptnote` DISABLE KEYS */;
/*!40000 ALTER TABLE `accessoryreceiptnote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` CHAR(32) NOT NULL,
  `salt` CHAR(8) NOT NULL,
  `position` VARCHAR(25) NOT NULL,
  `status` VARCHAR(25) NOT NULL,
  `EmployeeID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAccount698846` (`EmployeeID`),
  CONSTRAINT `FKAccount698846` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `totalPrice` DECIMAL(17,2) NOT NULL,
  `status` VARCHAR(25) NOT NULL,
  `startDay` date NOT NULL,
  `latestEditDay` date NOT NULL,
  `paymentDay` date,
  `note` VARCHAR(255),
  `CarID` INT NOT NULL,
  `EmployeeID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKBill897505` (`CarID`),
  KEY `FKBill666739` (`EmployeeID`),
  CONSTRAINT `FKBill666739` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`ID`),
  CONSTRAINT `FKBill897505` FOREIGN KEY (`CarID`) REFERENCES `car` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `licensePlate` VARCHAR(25) NOT NULL,
  `type` VARCHAR(255),
  `status` VARCHAR(25) NOT NULL,
  `note` VARCHAR(255),
  `CustomerID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCar882719` (`CustomerID`),
  CONSTRAINT `FKCar882719` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `birthday` date NOT NULL,
  `gender` VARCHAR(25) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `idCard` VARCHAR(25) NOT NULL,
  `level` INT NOT NULL,
  `note` VARCHAR(255),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `birthday` date NOT NULL,
  `gender` VARCHAR(25) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `idCard` VARCHAR(25) NOT NULL,
  `position` VARCHAR(25) NOT NULL,
  `status` VARCHAR(25) NOT NULL,
  `note` VARCHAR(255),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provider` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `note` VARCHAR(255),
  `status` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receivedaccessory`
--

DROP TABLE IF EXISTS `receivedaccessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receivedaccessory` (
  `amount` INT NOT NULL,
  `receivedCost` DECIMAL(17,2) NOT NULL,
  `note` VARCHAR(255),
  `AccessoryID` INT NOT NULL,
  `AccessoryReceiptNoteID` INT NOT NULL,
  PRIMARY KEY(AccessoryReceiptNoteID, AccessoryID),
  KEY `FKReceive424448` (`AccessoryID`),
  KEY `FKReceive409811` (`AccessoryReceiptNoteID`),
  CONSTRAINT `FKReceive409811` FOREIGN KEY (`AccessoryReceiptNoteID`) REFERENCES `accessoryreceiptnote` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `FKReceive424448` FOREIGN KEY (`AccessoryID`) REFERENCES `accessory` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receivedaccessory`
--

LOCK TABLES `receivedaccessory` WRITE;
/*!40000 ALTER TABLE `receivedaccessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `receivedaccessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `customerName` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(255),
  `scheduleDay` date NOT NULL,
  `note` VARCHAR(255),
  `status` VARCHAR(25) NOT NULL,
  `EmployeeID` INT,
  -- `CustomerID` INT,
  PRIMARY KEY (`ID`),
  KEY `FKSchedul624963` (`EmployeeID`),
  -- KEY `FKSchedul831874` (`CustomerID`),
  CONSTRAINT `FKSchedul624963` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`ID`) ON DELETE SET NULL
  -- CONSTRAINT `FKSchedul831874` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`ID`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `price` DECIMAL(17,2) NOT NULL,
  `status` VARCHAR(25) NOT NULL,
  `description` VARCHAR(255),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `technicianassignment`
--

DROP TABLE IF EXISTS `technicianassignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `technicianassignment` (
  `EmployeeID` INT NOT NULL,
  `BillID` INT NOT NULL,
  KEY `FKTechnic438284` (`EmployeeID`),
  KEY `FKTechnic866956` (`BillID`),
  CONSTRAINT `FKTechnic438284` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `FKTechnic866956` FOREIGN KEY (`BillID`) REFERENCES `bill` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `technicianassignment`
--

LOCK TABLES `technicianassignment` WRITE;
/*!40000 ALTER TABLE `technicianassignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `technicianassignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usedaccessory`
--

DROP TABLE IF EXISTS `usedaccessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usedaccessory` (
  `amount` INT NOT NULL,
  `price` DECIMAL(17,2) NOT NULL,
  `note` VARCHAR(255),
  `BillID` INT NOT NULL,
  `AccessoryID` INT NOT NULL,
  PRIMARY KEY(BillID, AccessoryID),
  KEY `FKUsedAcc254481` (`BillID`),
  KEY `FKUsedAcc949143` (`AccessoryID`),
  CONSTRAINT `FKUsedAcc254481` FOREIGN KEY (`BillID`) REFERENCES `bill` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `FKUsedAcc949143` FOREIGN KEY (`AccessoryID`) REFERENCES `accessory` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usedaccessory`
--

LOCK TABLES `usedaccessory` WRITE;
/*!40000 ALTER TABLE `usedaccessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `usedaccessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usedservice`
--

DROP TABLE IF EXISTS `usedservice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usedservice` (
  `amount` INT NOT NULL,
  `price` DECIMAL(17,2) NOT NULL,
  `note` VARCHAR(255),
  `BillID` INT NOT NULL,
  `ServiceID` INT NOT NULL,
  PRIMARY KEY(BillID, ServiceID),
  KEY `FKUsedSer780828` (`BillID`),
  KEY `FKUsedSer198188` (`ServiceID`),
  CONSTRAINT `FKUsedSer198188` FOREIGN KEY (`ServiceID`) REFERENCES `service` (`ID`),
  CONSTRAINT `FKUsedSer780828` FOREIGN KEY (`BillID`) REFERENCES `bill` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usedservice`
--

LOCK TABLES `usedservice` WRITE;
/*!40000 ALTER TABLE `usedservice` DISABLE KEYS */;
/*!40000 ALTER TABLE `usedservice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2522-01-05 23:30:00
