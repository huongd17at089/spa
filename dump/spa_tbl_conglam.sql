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
-- Table structure for table `tbl_conglam`
--

DROP TABLE IF EXISTS `tbl_conglam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_conglam` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `manv` int NOT NULL,
  `madvd` int NOT NULL,
  `ngaygio` datetime NOT NULL,
  PRIMARY KEY (`ma`),
  KEY `manvl_idx` (`manv`),
  KEY `madvd_idx` (`madvd`),
  CONSTRAINT `madvd` FOREIGN KEY (`madvd`) REFERENCES `tbl_dichvudung` (`ma`),
  CONSTRAINT `manvl` FOREIGN KEY (`manv`) REFERENCES `tbl_nvdichvu` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_conglam`
--

LOCK TABLES `tbl_conglam` WRITE;
/*!40000 ALTER TABLE `tbl_conglam` DISABLE KEYS */;
INSERT INTO `tbl_conglam` VALUES (1,1,1,'2020-06-02 12:00:00'),(4,8,4,'2020-07-11 11:00:00'),(5,38,5,'2020-07-15 14:00:00'),(6,38,6,'2020-07-15 14:00:00'),(7,37,7,'2020-07-11 11:00:00'),(8,40,8,'2020-07-22 15:00:00'),(9,3,9,'2020-07-23 15:00:00'),(10,40,10,'2020-07-21 14:00:00'),(11,32,11,'2020-07-21 14:00:00'),(12,25,12,'2020-07-21 14:00:00');
/*!40000 ALTER TABLE `tbl_conglam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:39
