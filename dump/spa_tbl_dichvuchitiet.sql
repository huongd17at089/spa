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
-- Table structure for table `tbl_dichvuchitiet`
--

DROP TABLE IF EXISTS `tbl_dichvuchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dichvuchitiet` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `madichvu` int NOT NULL,
  `gia` float NOT NULL,
  `ten` varchar(45) NOT NULL,
  `mota` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ma`),
  KEY `madichvu_idx` (`madichvu`),
  CONSTRAINT `madichvu` FOREIGN KEY (`madichvu`) REFERENCES `tbl_dichvu` (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dichvuchitiet`
--

LOCK TABLES `tbl_dichvuchitiet` WRITE;
/*!40000 ALTER TABLE `tbl_dichvuchitiet` DISABLE KEYS */;
INSERT INTO `tbl_dichvuchitiet` VALUES (1,1,450000,'Làm phồng chân tóc','Tư vấn, làm phồng, hướng dẫn chăm sóc'),(2,1,640000,'Phục hồi chuyên sâu','Tư vấn dịch vụ dưỡng tóc phù hợp'),(3,1,240000,'Hair cut','Tư vấn, cắt, dưỡng, tạo kiểu'),(4,1,130000,'Gội đầu ','Tư vấn dầu gội, dưỡng, sấy'),(5,1,70000,'Tạo kiểu','Sấy tạo kiểu, tạo kiểu'),(6,1,680000,'Nhuộm','Tư ván, cắt, nhuộm, dưỡng'),(7,1,680000,'Uốn','Uốn lạnh hoặc uốn nóng'),(8,1,760000,'Duỗi','Tư vấn, duỗi, dưỡng'),(9,2,500000,'Tắm cam thảo','Da trắng sáng, mịn'),(10,2,600000,'Tắm chuối mật ong','Dưỡng ẩm, mềm da, trắng sáng'),(11,2,550000,'Xông đá muối','Tẩy da chết, mềm da'),(12,2,450000,'Xông tinh dầu','Thư dãn, tẩy da chết'),(13,3,230000,'Massage mặt','Căng da, tẩy da chết'),(14,3,700000,'Massage body','Thư dãn, giảm béo'),(15,4,230000,'In móng 3D','In hình theo yêu cầu'),(16,4,320000,'Vẽ móng','Vẽ theo mẫu yêu cầu'),(17,4,100000,'Tỉa móng','Tỉa theo hình dáng'),(18,5,700000,'Phun xăm lông mày','Phun tạo kiểu'),(19,5,2500000,'Us Fusion','Hút mỡ bụng');
/*!40000 ALTER TABLE `tbl_dichvuchitiet` ENABLE KEYS */;
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
