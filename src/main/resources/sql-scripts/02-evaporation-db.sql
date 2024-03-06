CREATE DATABASE  IF NOT EXISTS `evaporation_db`;
USE `evaporation_db`;

-- Table structure for table `evaporation_data` --

DROP TABLE IF EXISTS `evaporator_data`;

CREATE TABLE `evaporation_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created` DATE DEFAULT NULL,
  `feed_origin` varchar(45) DEFAULT NULL,
  `feed_pH` DOUBLE PRECISION DEFAULT NULL,
  `feed_temp` DOUBLE PRECISION DEFAULT NULL,
  `feed_container_level` int DEFAULT NULL,
  `feed_solids` DOUBLE PRECISION DEFAULT NULL,
  `hot_water_temp` int DEFAULT NULL,
  `pasteurization_temp` DOUBLE PRECISION DEFAULT NULL,
  `flow_rate` int DEFAULT NULL,
   `effect-one_temp` int DEFAULT NULL,
  `effect-two_temp` int DEFAULT NULL,
  `effect-three_temp` int DEFAULT NULL,
  `boiler_steam_pressure` DOUBLE PRECISION DEFAULT NULL,
  `evaporator_steam_pressure` DOUBLE PRECISION DEFAULT NULL,
  `cooling-tower_temp_in` int DEFAULT NULL,
  `cooling-tower_temp_out` int DEFAULT NULL,
  `flash_temp` int DEFAULT NULL,
  `vacuum_pressure` int DEFAULT NULL,
  `product_output` varchar(45) DEFAULT NULL,
  `product_solids` DOUBLE PRECISION DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;