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
-- Table structure for table `tbl_nvdichvu`
--

DROP TABLE IF EXISTS `tbl_nvdichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_nvdichvu` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) NOT NULL,
  `calam` varchar(45) NOT NULL,
  PRIMARY KEY (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_nvdichvu`
--

LOCK TABLES `tbl_nvdichvu` WRITE;
/*!40000 ALTER TABLE `tbl_nvdichvu` DISABLE KEYS */;
INSERT INTO `tbl_nvdichvu` VALUES (1,'Anh Đức','Sáng'),(2,'Thị Hoa','Sáng'),(3,'Văn Hiếu','Sáng'),(4,'Hoàng Duy','Sáng'),(5,'Minh Trang','Sáng'),(6,'Minh Anh','Sáng'),(7,'Gia Bảo','Sáng'),(8,'Ngọc Linh','Sáng'),(9,'Anh Thư','Sáng'),(10,'Văn Cường','Sáng'),(11,'Minh Nhật','Sáng'),(12,'Ngọc Hân','Sáng'),(13,'Đức Anh','Sáng'),(14,'Hồng Nhung','Sáng'),(15,'Ngọc Diệu','Sáng'),(16,'Thị Yến','Sáng'),(17,'Quang Huy','Sáng'),(18,'Thị Linh','Sáng'),(19,'Ngọc Thủy','Sáng'),(20,'Thị Liên','Sáng'),(21,'Nguyễn Ngọc','Sáng'),(22,'Hoàng Lan','Sáng'),(23,'Minh Tân','Sáng'),(24,'Mai Hương','Chiều'),(25,'Ngọc Thủy','Chiều'),(26,'Thu Trà','Chiều'),(27,'Mai Anh','Chiều'),(28,'Thị Mai','Chiều'),(29,'Văn Kỳ','Chiều'),(30,'Hoàng','Chiều'),(31,'Xuân Lâm','Chiều'),(32,'Minh Như','Chiều'),(33,'Bích Liên','Chiều'),(34,'Quốc Cường','Chiều'),(35,'Quang Lâm','Chiều'),(36,'Minh Kỳ','Chiều'),(37,'Gia Kỳ','Chiều'),(38,'Ngọc Thúy','Chiều'),(39,'Anh Kỳ','Chiều'),(40,'Văn Pháp','Chiều'),(41,'Minh Lan','Chiều'),(42,'Ngọc Thái','Chiều'),(43,'Đức Dũng','Chiều'),(44,'Hồng Lam','Chiều'),(45,'Ngọc Ninh','Chiều'),(46,'Lâm Anh','Chiều');
/*!40000 ALTER TABLE `tbl_nvdichvu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-21 21:57:42
