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
-- Table structure for table `tbl_dichvudung`
--

DROP TABLE IF EXISTS `tbl_dichvudung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dichvudung` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `maslotdat` int NOT NULL,
  `madichvu` int NOT NULL,
  `gia` float NOT NULL,
  `khuyenmai` int NOT NULL,
  PRIMARY KEY (`ma`),
  KEY `madichvuct_idx` (`madichvu`),
  KEY `maslotdatd_idx` (`maslotdat`),
  CONSTRAINT `madichvuct` FOREIGN KEY (`madichvu`) REFERENCES `tbl_dichvuchitiet` (`ma`),
  CONSTRAINT `maslotdatd` FOREIGN KEY (`maslotdat`) REFERENCES `tbl_slotdat` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dichvudung`
--

LOCK TABLES `tbl_dichvudung` WRITE;
/*!40000 ALTER TABLE `tbl_dichvudung` DISABLE KEYS */;
INSERT INTO `tbl_dichvudung` VALUES (1,1,1,450000,3),(4,3,11,550000,0),(5,5,15,230000,0),(6,5,15,230000,0),(7,4,13,230000,0),(8,6,18,700000,0),(9,7,3,240000,0),(10,8,18,700000,0),(11,10,10,600000,0),(12,9,2,640000,0);
/*!40000 ALTER TABLE `tbl_dichvudung` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:40
