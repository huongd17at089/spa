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
-- Table structure for table `tbl_nguyenlieu`
--

DROP TABLE IF EXISTS `tbl_nguyenlieu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_nguyenlieu` (
  `ma` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) NOT NULL,
  `gianhap` float NOT NULL,
  `giaban` float NOT NULL,
  `donvi` varchar(45) DEFAULT NULL,
  `dungtich` int DEFAULT NULL,
  PRIMARY KEY (`ma`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_nguyenlieu`
--

LOCK TABLES `tbl_nguyenlieu` WRITE;
/*!40000 ALTER TABLE `tbl_nguyenlieu` DISABLE KEYS */;
INSERT INTO `tbl_nguyenlieu` VALUES (1,'Dầu gội bọt khí',500000,552000,'ml',270),(2,'Tinh dầu dưỡng',550000,589000,'ml',220),(3,'Kem xả',540000,567000,'ml',300),(4,'Sữa dưỡng tóc',550000,589000,'ml',220),(5,'Xả JM',400000,427000,'ml',280),(6,'Gội JM',320000,334000,'ml',300),(7,'Kem xả PLARMIA',400000,410000,'ml',300),(8,'Dầu gội PLARMIA',550000,567000,'ml',300),(9,'Xịt mọc tóc PLARMIA',600000,617000,'ml',200),(10,'Bộ 12 màu vẽ',330000,345000,'ml/lọ',150),(11,'Sơn gel',250000,273000,'ml',220),(12,'Đá làm móng',30000,35000,'cái',1),(13,'Keo gắn đá',25000,30000,'ml',85),(14,'Tinh dầu cam thảo',250000,260000,'ml',150),(15,'Tinh dầu oải hương',250000,255000,'ml',150),(16,'Chuối mật ong',550000,600000,'kg',5),(17,'Sữa rửa mặt',220000,230000,'ml',165),(18,'Sữa dưỡng thể',156000,180000,'ml',450),(19,'Mực xăm',23000,30000,'ml',220);
/*!40000 ALTER TABLE `tbl_nguyenlieu` ENABLE KEYS */;
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
