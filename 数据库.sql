CREATE TABLE `borrow_detail` (
  `borrow_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bname` VARCHAR(45) COLLATE utf8_unicode_ci NOT NULL,
  `user_name` VARCHAR(45) COLLATE utf8_unicode_ci NOT NULL,
  `btime` DATETIME NOT NULL,
  `deadline` DATETIME NOT NULL,
  `rtime` DATETIME DEFAULT NULL,
  PRIMARY KEY (`borrow_id`),
  UNIQUE KEY `BWID_UNIQUE` (`borrow_id`)`borrow_detail`
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `reservation_detail` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `bname` VARCHAR(45) COLLATE utf8_unicode_ci NOT NULL,
  `user_name` VARCHAR(45) COLLATE utf8_unicode_ci NOT NULL,
  `deadline` datetime DEFAULT NULL,
  PRIMARY KEY (`reservation_id`)  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;