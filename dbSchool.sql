-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: dbschool
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `tblfather`
--

DROP TABLE IF EXISTS `tblfather`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblfather` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `home_add` varchar(200) NOT NULL,
  `work_add` varchar(200) DEFAULT NULL,
  `email_add` varchar(24) DEFAULT NULL,
  `occupation` varchar(24) DEFAULT NULL,
  `home_telnum` varchar(24) DEFAULT NULL,
  `work_telnum` varchar(24) DEFAULT NULL,
  `mobile_num` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfather`
--

LOCK TABLES `tblfather` WRITE;
/*!40000 ALTER TABLE `tblfather` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblfather` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblguardian`
--

DROP TABLE IF EXISTS `tblguardian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblguardian` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `home_add` varchar(200) NOT NULL,
  `work_add` varchar(200) DEFAULT NULL,
  `email_add` varchar(24) DEFAULT NULL,
  `occupation` varchar(24) DEFAULT NULL,
  `home_telnum` varchar(24) DEFAULT NULL,
  `work_telnum` varchar(24) DEFAULT NULL,
  `mobile_num` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblguardian`
--

LOCK TABLES `tblguardian` WRITE;
/*!40000 ALTER TABLE `tblguardian` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblguardian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblmother`
--

DROP TABLE IF EXISTS `tblmother`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblmother` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `home_add` varchar(200) NOT NULL,
  `work_add` varchar(200) DEFAULT NULL,
  `email_add` varchar(24) DEFAULT NULL,
  `occupation` varchar(24) DEFAULT NULL,
  `home_telnum` varchar(24) DEFAULT NULL,
  `work_telnum` varchar(24) DEFAULT NULL,
  `mobile_num` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblmother`
--

LOCK TABLES `tblmother` WRITE;
/*!40000 ALTER TABLE `tblmother` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblmother` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblotherrep`
--

DROP TABLE IF EXISTS `tblotherrep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblotherrep` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `affiliation` varchar(24) DEFAULT NULL,
  `mobile_num` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblotherrep`
--

LOCK TABLES `tblotherrep` WRITE;
/*!40000 ALTER TABLE `tblotherrep` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblotherrep` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpwd`
--

DROP TABLE IF EXISTS `tblpwd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblpwd` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `disease` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpwd`
--

LOCK TABLES `tblpwd` WRITE;
/*!40000 ALTER TABLE `tblpwd` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpwd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsattended`
--

DROP TABLE IF EXISTS `tblsattended`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsattended` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `grade_level` varchar(8) DEFAULT NULL,
  `school_name` varchar(32) DEFAULT NULL,
  `period_covered` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsattended`
--

LOCK TABLES `tblsattended` WRITE;
/*!40000 ALTER TABLE `tblsattended` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsattended` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsiblings`
--

DROP TABLE IF EXISTS `tblsiblings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsiblings` (
  `doc_id` int NOT NULL,
  `stud_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `grade_level` int NOT NULL,
  `ordinal_position` int NOT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsiblings`
--

LOCK TABLES `tblsiblings` WRITE;
/*!40000 ALTER TABLE `tblsiblings` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsiblings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstaff`
--

DROP TABLE IF EXISTS `tblstaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblstaff` (
  `staff_id` int NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) NOT NULL,
  `position` varchar(24) NOT NULL,
  `still_employed` tinyint(1) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstaff`
--

LOCK TABLES `tblstaff` WRITE;
/*!40000 ALTER TABLE `tblstaff` DISABLE KEYS */;
INSERT INTO `tblstaff` VALUES (1,'Apulog','John Philip','N/A','Teacher II',1),(2,'Yin','Akuma','N/A','Teacher I',1),(3,'Salinas','Galilea','De Jesus','Cashier',0),(4,'Dalisay','Cardo','Panday','Guidance Counselor',1),(5,'Apulog','JP','Mungcawi','Teacher I',1),(6,'Apz','Philip','Mongcawe','Master Teacher I',1);
/*!40000 ALTER TABLE `tblstaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstudent`
--

DROP TABLE IF EXISTS `tblstudent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblstudent` (
  `stud_id` int unsigned NOT NULL AUTO_INCREMENT,
  `doc_id` int unsigned NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) DEFAULT NULL,
  `nick_name` varchar(24) DEFAULT NULL,
  `birth_day` date NOT NULL,
  `birth_place` varchar(200) NOT NULL,
  `stud_age` int NOT NULL,
  `religion` varchar(24) NOT NULL,
  `nationality` varchar(24) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `mobile_num` varchar(13) DEFAULT NULL,
  `address` varchar(200) NOT NULL,
  `postal` varchar(4) DEFAULT NULL,
  `school_status` varchar(24) NOT NULL,
  `pwd` tinyint(1) DEFAULT NULL,
  `siblings_enrolled` int DEFAULT NULL,
  PRIMARY KEY (`stud_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstudent`
--

LOCK TABLES `tblstudent` WRITE;
/*!40000 ALTER TABLE `tblstudent` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblstudent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbluser`
--

DROP TABLE IF EXISTS `tbluser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbluser` (
  `user_id` int unsigned NOT NULL AUTO_INCREMENT,
  `staff_id` int unsigned NOT NULL,
  `last_name` varchar(24) NOT NULL,
  `first_name` varchar(24) NOT NULL,
  `middle_name` varchar(24) DEFAULT NULL,
  `user_name` varchar(24) NOT NULL,
  `user_pass` varchar(24) NOT NULL,
  `designation` varchar(24) NOT NULL,
  `still_employed` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbluser`
--

LOCK TABLES `tbluser` WRITE;
/*!40000 ALTER TABLE `tbluser` DISABLE KEYS */;
INSERT INTO `tbluser` VALUES (1,3,'Salinas','Galilea','De Jesus','kosaki','iloveyou','Administrator',1);
/*!40000 ALTER TABLE `tbluser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbschool'
--

--
-- Dumping routines for database 'dbschool'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 17:37:29
