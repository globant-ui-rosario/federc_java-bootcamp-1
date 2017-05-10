# SQL Manager 2005 Lite for MySQL 3.7.0.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : high-school


SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS `high-school`;

CREATE DATABASE `high-school`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `high-school`;

#
# Structure for the `persons` table : 
#

DROP TABLE IF EXISTS `persons`;

CREATE TABLE `persons` (
  `dni` int(8) unsigned NOT NULL,
  `firstName` varchar(25) default NULL,
  `lastName` varchar(25) default NULL,
  `dateOfBirth` date default NULL,
  `registrationNumber` int(11) default NULL,
  `type` varchar(20) default NULL,
  PRIMARY KEY  (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `courses` table : 
#

DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `idCourse` int(11) unsigned NOT NULL auto_increment,
  `name` varchar(25) default NULL,
  `hoursByWeek` int(11) unsigned default NULL,
  `teacherDni` int(8) unsigned NOT NULL,
  PRIMARY KEY  (`idCourse`),
  KEY `courses_fk` (`teacherDni`),
  CONSTRAINT `courses_fk` FOREIGN KEY (`teacherDni`) REFERENCES `persons` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `days` table : 
#

DROP TABLE IF EXISTS `days`;

CREATE TABLE `days` (
  `idDay` int(1) unsigned NOT NULL auto_increment,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY  (`idDay`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `exams` table : 
#

DROP TABLE IF EXISTS `exams`;

CREATE TABLE `exams` (
  `idExam` int(11) unsigned NOT NULL auto_increment,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY  (`idExam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `students_courses` table : 
#

DROP TABLE IF EXISTS `students_courses`;

CREATE TABLE `students_courses` (
  `dni` int(8) unsigned NOT NULL,
  `idCourse` int(11) unsigned NOT NULL,
  `year` int(11) unsigned NOT NULL,
  PRIMARY KEY  (`dni`,`idCourse`,`year`),
  KEY `dni` (`dni`),
  KEY `idCourse` (`idCourse`),
  CONSTRAINT `students_courses_fk1` FOREIGN KEY (`idCourse`) REFERENCES `courses` (`idCourse`),
  CONSTRAINT `students_courses_fk` FOREIGN KEY (`dni`) REFERENCES `persons` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `exams_students_courses` table : 
#

DROP TABLE IF EXISTS `exams_students_courses`;

CREATE TABLE `exams_students_courses` (
  `idExamn` int(11) unsigned NOT NULL,
  `dni` int(8) unsigned NOT NULL,
  `idCourse` int(11) unsigned NOT NULL,
  `year` int(11) unsigned NOT NULL,
  `date` varchar(20) default NULL,
  `grade` double(15,2) default NULL,
  PRIMARY KEY  (`idExamn`,`dni`,`idCourse`,`year`),
  KEY `idExamn` (`idExamn`),
  KEY `dni` (`dni`,`idCourse`,`year`),
  CONSTRAINT `exams_students_courses_fk1` FOREIGN KEY (`dni`, `idCourse`, `year`) REFERENCES `students_courses` (`dni`, `idCourse`, `year`),
  CONSTRAINT `exams_students_courses_fk` FOREIGN KEY (`idExamn`) REFERENCES `exams` (`idExam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `schedule_time` table : 
#

DROP TABLE IF EXISTS `schedule_time`;

CREATE TABLE `schedule_time` (
  `idCourse` int(11) unsigned NOT NULL auto_increment,
  `idDay` int(1) unsigned NOT NULL,
  `hoursByDay` int(11) default NULL,
  `from` int(11) default NULL,
  `upTo` int(11) default NULL,
  PRIMARY KEY  (`idCourse`,`idDay`),
  KEY `idCourse` (`idCourse`),
  KEY `idDay` (`idDay`),
  CONSTRAINT `schedule_time_fk1` FOREIGN KEY (`idDay`) REFERENCES `days` (`idDay`),
  CONSTRAINT `schedule_time_fk` FOREIGN KEY (`idCourse`) REFERENCES `courses` (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

