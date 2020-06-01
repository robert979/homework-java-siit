

-- Dumping database structure for ecommercedb
DROP DATABASE IF EXISTS `ecommercedb`;
CREATE DATABASE IF NOT EXISTS `ecommercedb` ;
USE `ecommercedb`;

-- Dumping structure for table ecommercedb.product
DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `image` blob NOT NULL,
  `stoc_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `stoc_fk` (`stoc_id`),
  CONSTRAINT `stoc_fk` FOREIGN KEY (`stoc_id`) REFERENCES `stoc` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ;

-- Dumping data for table ecommercedb.product: ~2 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `name`, `type`, `price`, `image`, `stoc_id`) VALUES
	(1, 'Samsung S10', 'electronics', 3000, _binary 0xFFD8FFE0, 1),
	(2, 'Lenovo T590', 'electronics', 10000, _binary 0xFFD8FFE0, 2);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table ecommercedb.stoc
DROP TABLE IF EXISTS `stoc`;
CREATE TABLE IF NOT EXISTS `stoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stoc` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ;

-- Dumping data for table ecommercedb.stoc: ~3 rows (approximately)
/*!40000 ALTER TABLE `stoc` DISABLE KEYS */;
INSERT INTO `stoc` (`id`, `stoc`) VALUES
	(1, 50),
	(2, 100),
	(3, 200);
/*!40000 ALTER TABLE `stoc` ENABLE KEYS */;

-- Dumping structure for table ecommercedb.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

-- Dumping data for table ecommercedb.user: ~4 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`) VALUES
	(1, 'michael', 'secretPassword'),
	(2, 'marius', 'mspassword'),
	(3, 'ana', 'sleepy'),
	(4, 'ciprian', 'no-password');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
