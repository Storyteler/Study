-- MySQL Script generated by MySQL Workbench
-- 10/31/17 15:45:48
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8 ;
USE `test` ;

-- -----------------------------------------------------
-- Table `test`.`dept`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`dept` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dept_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `test`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `emp_name` VARCHAR(45) NULL,
  `dept_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_employee_dept_idx` (`dept_id` ASC),
  CONSTRAINT `fk_employee_dept`
    FOREIGN KEY (`dept_id`)
    REFERENCES `test`.`dept` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
