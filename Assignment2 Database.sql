CREATE TABLE `db1`.`student` (
  `id` INT NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `math_mark` int(3) NOT NULL,
  `science_mark` int(3) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `student` VALUES ('1111','Mohammed',100,88),('2222','Ali',95,78),('3333','Ahmed',62,45);