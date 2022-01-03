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

CREATE DATABASE  IF NOT EXISTS `garagedb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `garagedb`;

--
-- Table structure for table `tblaccessory`
--

DROP TABLE IF EXISTS `tblaccessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblaccessory` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `stock` int NOT NULL,
  `receivedPrice` decimal(17,2) NOT NULL,
  `price` decimal(17,2) NOT NULL,
  `unit` varchar(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblaccessory`
--

LOCK TABLES `tblaccessory` WRITE;
/*!40000 ALTER TABLE `tblaccessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblaccessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblaccessoryreceiptnote`
--

DROP TABLE IF EXISTS `tblaccessoryreceiptnote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblaccessoryreceiptnote` (
  `ID` int NOT NULL,
  `totalCost` decimal(17,2) NOT NULL,
  `receivedDay` date NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `tblEmployeeID` int NOT NULL,
  `tblProviderID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblaccessoryreceiptnote`
--

LOCK TABLES `tblaccessoryreceiptnote` WRITE;
/*!40000 ALTER TABLE `tblaccessoryreceiptnote` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblaccessoryreceiptnote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblaccount`
--

DROP TABLE IF EXISTS `tblaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblaccount` (
  `ID` int NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` varchar(8) NOT NULL,
  `position` varchar(20) NOT NULL,
  `tblEmployeeID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblaccount`
--

LOCK TABLES `tblaccount` WRITE;
/*!40000 ALTER TABLE `tblaccount` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblbill`
--

DROP TABLE IF EXISTS `tblbill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblbill` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `totalPrice` decimal(17,2) NOT NULL,
  `status` varchar(20) NOT NULL,
  `startDay` date NOT NULL,
  `latestEditDay` date NOT NULL,
  `paymentDay` date DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `tblCarID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblbill`
--

LOCK TABLES `tblbill` WRITE;
/*!40000 ALTER TABLE `tblbill` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblbill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcar`
--

DROP TABLE IF EXISTS `tblcar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblcar` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `licensePlate` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `tblCustomerID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKtblCar882719` (`tblCustomerID`),
  CONSTRAINT `FKtblCar882719` FOREIGN KEY (`tblCustomerID`) REFERENCES `tblcustomer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcar`
--

LOCK TABLES `tblcar` WRITE;
/*!40000 ALTER TABLE `tblcar` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcustomer`
--

DROP TABLE IF EXISTS `tblcustomer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblcustomer` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `idCard` varchar(20) NOT NULL,
  `level` int NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcustomer`
--

LOCK TABLES `tblcustomer` WRITE;
/*!40000 ALTER TABLE `tblcustomer` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcustomer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblemployee`
--

DROP TABLE IF EXISTS `tblemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblemployee` (
  `ID` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `gender` binary(1) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `idCard` varchar(20) NOT NULL,
  `position` varchar(20) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblemployee`
--

LOCK TABLES `tblemployee` WRITE;
/*!40000 ALTER TABLE `tblemployee` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblemployee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblprovider`
--

DROP TABLE IF EXISTS `tblprovider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblprovider` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblprovider`
--

LOCK TABLES `tblprovider` WRITE;
/*!40000 ALTER TABLE `tblprovider` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblprovider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblreceivedaccessory`
--

DROP TABLE IF EXISTS `tblreceivedaccessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblreceivedaccessory` (
  `amount` int NOT NULL,
  `receivedPrice` decimal(17,2) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `tblAccessoryID` int NOT NULL,
  `tblAccessoryReceiptNoteID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblreceivedaccessory`
--

LOCK TABLES `tblreceivedaccessory` WRITE;
/*!40000 ALTER TABLE `tblreceivedaccessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblreceivedaccessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblschedule`
--

DROP TABLE IF EXISTS `tblschedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblschedule` (
  `ID` int NOT NULL,
  `customerName` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `scheduleDay` date NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  `tblEmployeeID` int NOT NULL,
  `tblCustomerID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblschedule`
--

LOCK TABLES `tblschedule` WRITE;
/*!40000 ALTER TABLE `tblschedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblschedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblservice`
--

DROP TABLE IF EXISTS `tblservice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblservice` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` decimal(17,2) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblservice`
--

LOCK TABLES `tblservice` WRITE;
/*!40000 ALTER TABLE `tblservice` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblservice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltechnicianassignment`
--

DROP TABLE IF EXISTS `tbltechnicianassignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbltechnicianassignment` (
  `tblEmployeeID` int NOT NULL,
  `tblBillID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltechnicianassignment`
--

LOCK TABLES `tbltechnicianassignment` WRITE;
/*!40000 ALTER TABLE `tbltechnicianassignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbltechnicianassignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusedaccessory`
--

DROP TABLE IF EXISTS `tblusedaccessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblusedaccessory` (
  `amount` int NOT NULL,
  `price` decimal(17,2) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `tblBillID` int NOT NULL,
  `tblAccessoryID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusedaccessory`
--

LOCK TABLES `tblusedaccessory` WRITE;
/*!40000 ALTER TABLE `tblusedaccessory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblusedaccessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusedservice`
--

DROP TABLE IF EXISTS `tblusedservice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblusedservice` (
  `amount` int NOT NULL,
  `price` decimal(17,2) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `tblBillID` int NOT NULL,
  `tblServiceID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusedservice`
--

LOCK TABLES `tblusedservice` WRITE;
/*!40000 ALTER TABLE `tblusedservice` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblusedservice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-02 22:14:24
