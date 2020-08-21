-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: spa
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_slotdat`
--

DROP TABLE IF EXISTS `tbl_slotdat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_slotdat` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `maslot` int NOT NULL,
  `maphieu` int NOT NULL,
  `ngaygio` datetime NOT NULL,
  `danhan` varchar(45) NOT NULL,
  PRIMARY KEY (`ma`),
  KEY `mas_idx` (`maslot`),
  KEY `map_idx` (`maphieu`),
  CONSTRAINT `map` FOREIGN KEY (`maphieu`) REFERENCES `tbl_phieudat` (`ma`),
  CONSTRAINT `mas` FOREIGN KEY (`maslot`) REFERENCES `tbl_slot` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_slotdat`
--

LOCK TABLES `tbl_slotdat` WRITE;
/*!40000 ALTER TABLE `tbl_slotdat` DISABLE KEYS */;
INSERT INTO `tbl_slotdat` VALUES (1,1,1,'2020-06-02 12:00:00','Đã nhận'),(3,2,3,'2020-07-11 11:00:00','Đã nhận'),(4,3,4,'2020-07-11 11:00:00','da nhan'),(5,4,5,'2020-07-15 14:00:00','da nhan'),(6,5,6,'2020-07-22 15:00:00','da nhan'),(7,1,7,'2020-07-23 15:00:00','da nhan'),(8,5,8,'2020-07-21 14:00:00','da nhan'),(9,1,8,'2020-07-21 14:00:00','da nhan'),(10,2,8,'2020-07-21 14:00:00','da nhan');
/*!40000 ALTER TABLE `tbl_slotdat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:44
