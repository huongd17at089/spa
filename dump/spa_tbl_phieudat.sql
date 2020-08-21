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
-- Table structure for table `tbl_phieudat`
--

DROP TABLE IF EXISTS `tbl_phieudat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_phieudat` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `ngaydat` datetime NOT NULL,
  `khuyenmai` int DEFAULT NULL,
  `ngaythanhtoan` datetime DEFAULT NULL,
  `ghichu` varchar(100) DEFAULT NULL,
  `manvthanhtoan` int DEFAULT NULL,
  `manvdat` int NOT NULL,
  `makhach` int NOT NULL,
  PRIMARY KEY (`ma`),
  KEY `makhachhang_idx` (`makhach`),
  KEY `manvdat_idx` (`manvdat`),
  KEY `manvthanhtoan_idx` (`manvthanhtoan`),
  CONSTRAINT `mak` FOREIGN KEY (`makhach`) REFERENCES `tbl_khachhang` (`ma`),
  CONSTRAINT `manva` FOREIGN KEY (`manvdat`) REFERENCES `tbl_nguoidung` (`ma`),
  CONSTRAINT `manvb` FOREIGN KEY (`manvthanhtoan`) REFERENCES `tbl_nguoidung` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_phieudat`
--

LOCK TABLES `tbl_phieudat` WRITE;
/*!40000 ALTER TABLE `tbl_phieudat` DISABLE KEYS */;
INSERT INTO `tbl_phieudat` VALUES (1,'2020-06-01 11:00:00',10,'2020-07-10 10:25:27','Đã thanh toán',2,2,1),(3,'2020-07-10 10:18:59',0,NULL,'Chưa thanh toán',NULL,2,1),(4,'2020-07-10 14:09:23',0,'2020-07-10 14:19:52','Đã thanh toán',2,2,7),(5,'2020-07-10 14:10:08',0,'2020-07-10 14:20:19','Đã thanh toán',2,2,14),(6,'2020-07-10 14:11:08',0,'2020-07-10 14:20:08','Đã thanh toán',2,2,8),(7,'2020-07-10 14:24:58',0,'2020-07-10 15:16:33','Đã thanh toán',3,2,17),(8,'2020-07-10 14:28:50',0,'2020-07-10 15:16:14','Đã thanh toán',4,3,9);
/*!40000 ALTER TABLE `tbl_phieudat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:41
