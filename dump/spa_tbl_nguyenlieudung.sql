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
-- Table structure for table `tbl_nguyenlieudung`
--

DROP TABLE IF EXISTS `tbl_nguyenlieudung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_nguyenlieudung` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `manl` int NOT NULL,
  `gia` float NOT NULL,
  `maslotdat` int NOT NULL,
  `soluong` int NOT NULL,
  `khuyenmai` int NOT NULL,
  PRIMARY KEY (`ma`),
  KEY `maslotdat_idx` (`maslotdat`),
  KEY `manguyenlieu_idx` (`manl`),
  CONSTRAINT `manguyenlieu` FOREIGN KEY (`manl`) REFERENCES `tbl_nguyenlieu` (`ma`),
  CONSTRAINT `maslotdat` FOREIGN KEY (`maslotdat`) REFERENCES `tbl_slotdat` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_nguyenlieudung`
--

LOCK TABLES `tbl_nguyenlieudung` WRITE;
/*!40000 ALTER TABLE `tbl_nguyenlieudung` DISABLE KEYS */;
INSERT INTO `tbl_nguyenlieudung` VALUES (1,1,552000,1,2,4),(4,4,589000,3,1,0),(5,2,589000,5,1,0),(6,2,589000,5,1,0),(7,9,617000,4,1,0),(8,9,617000,6,1,0),(9,13,30000,7,2,0),(10,7,410000,8,1,0),(11,5,427000,10,1,0),(12,8,567000,9,1,0),(13,2,589000,7,1,0);
/*!40000 ALTER TABLE `tbl_nguyenlieudung` ENABLE KEYS */;
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
