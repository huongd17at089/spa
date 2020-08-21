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
-- Table structure for table `tbl_khachhang`
--

DROP TABLE IF EXISTS `tbl_khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_khachhang` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) NOT NULL,
  `diachi` varchar(45) NOT NULL,
  `sodienthoai` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `ghichu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_khachhang`
--

LOCK TABLES `tbl_khachhang` WRITE;
/*!40000 ALTER TABLE `tbl_khachhang` DISABLE KEYS */;
INSERT INTO `tbl_khachhang` VALUES (1,'Anh','Hoàn Kiếm',12345123,'ta@gmail.com',NULL),(2,'Nghĩa','Đống Đa',10391828,'bn@gmail.com',NULL),(3,'Quân','Tây Hồ',19283713,'aq@gmail.com',NULL),(4,'Tú','Cầu Giấy',11093918,'at@gmail.com',NULL),(5,'Vượng','Sơn Tây',19383001,'tv@gmail.com',NULL),(6,'Dũng','Hai Bà Trưng',1092938,'td@gmail.com',NULL),(7,'Long','Long Biên',1992947,'dl@gmail.com',NULL),(8,'Quang','Hà Đông',97172739,'mq@gmail.com',NULL),(9,'Thắng','Nam Từ Liêm',18391828,'dt1@gmail.com',NULL),(10,'Thiện','Cầu Giấy',93182716,'qt@gmail.com',NULL),(11,'Đông','Đống Đa',3182178,'vd@gmail.com',NULL),(12,'Huy','Hòa Bình',38192989,'vh@gmail.com',NULL),(13,'Giang','Sơn La',48192920,'hg1@gmail.com',NULL),(14,'Minh','Hải Phòng',23819832,'tm@gmail.com',NULL),(15,'Linh','An Giang',71626381,'nl@gmail.com',NULL),(16,'Thắng','Cần Thơ',38319209,'dt2@gmail.com',NULL),(17,'Tiến','Long An',37162841,'mt@gmail.com',NULL),(18,'Tùng','Bến Tre',19284011,'vt@gmail.com',NULL),(19,'Tùng','Đà Nẵng',18301092,'dt3@gmail.com',NULL),(20,'Giang','Đà Nẵng',12919248,'hg2@gmail.com',NULL),(21,'Quang','Đà Nẵng',30293218,'mq@gmail.com',NULL),(22,'Tuấn','Đà Nẵng',12910241,'at@gmail.com',NULL);
/*!40000 ALTER TABLE `tbl_khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:43
