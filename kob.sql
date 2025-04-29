/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.36 : Database - kob
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kob` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `kob`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `rating` int DEFAULT '1500',
  `photo` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`rating`,`photo`) values (1,'wzq','$2a$10$GutqIB8FCG/ROJsK6kCfJucKQ.aWIsPVIrry89cY1RlWSiOL8MFqy',1500,'https://cdn.acwing.com/media/user/profile/photo/251762_lg_98211af608.png'),(2,'yxj','$2a$10$r2gLpAqEndBLYP88vM7xvuVzogVLoBV9b5E80jV2PXQ5gWGSIIqOq',1500,'https://cdn.acwing.com/media/user/profile/photo/251762_lg_98211af608.png'),(3,'ydm','$2a$10$ZCRFBICXD0CZPYoMHqkGSOe6Gt.fGeCArWi1LhpI8LobG5JPyw1vW',1500,'https://cdn.acwing.com/media/user/profile/photo/251762_lg_98211af608.png'),(10,'xt','$2a$10$Dzax4tuBZtT.nWumQoyK/uj8aYXLCscNMozJ5E4XO1zjD1KL8MXza',1500,'https://cdn.acwing.com/media/user/profile/photo/251762_lg_98211af608.png');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
