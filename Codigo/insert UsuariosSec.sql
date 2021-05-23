DELETE FROM `usuariosdbsec`.`Matriculas`;
ALTER TABLE `usuariosdbsec`.`Matriculas` AUTO_INCREMENT = 1 ;

DELETE FROM `usuariosdbsec`.`users_has_authorities`;
DELETE FROM `usuariosdbsec`.`Authorities`;
ALTER TABLE `usuariosdbsec`.`Authorities` AUTO_INCREMENT = 1 ;

DELETE FROM `usuariosdbsec`.`Users`;
ALTER TABLE `usuariosdbsec`.`Users` AUTO_INCREMENT = 1 ;

INSERT INTO `usuariosdbsec`.`Users` VALUES (1, 'Admin uno', 'admin1', 'admin.uno@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (2, 'Profesor Uno', 'uno', 'profesor.uno@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (3, 'Profesor Dos', 'dos', 'profesor.dos@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (4, 'Profesor Tres', 'tres', 'profesor.tres@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (5, 'Profesor Cuatro', 'cuatro', 'profesor.cuatro@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (6, 'Alumno Uno', 'uno', 'alumno.uno@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (7, 'Alumno Dos', 'dos', 'alumno.dos@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (8, 'Alumno Tres', 'tres', 'alumno.tres@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (9, 'Alumno Cuatro', 'cuatro', 'alumno.cuatro@uah.es', 1);
INSERT INTO `usuariosdbsec`.`Users` VALUES (10, 'Alumno Cinco', 'cinco', 'alumno.cinco@uah.es', 1);

INSERT INTO `usuariosdbsec`.`Authorities` VALUES (1, 'ROLE_ADMIN');
INSERT INTO `usuariosdbsec`.`Authorities` VALUES (2, 'ROLE_USER');
INSERT INTO `usuariosdbsec`.`Authorities` VALUES (3, 'ROLE_TEACHER');

INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (1, 1);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (2, 3);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (3, 3);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (4, 3);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (5, 3);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (6, 2);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (7, 2);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (8, 2);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (9, 2);
INSERT INTO `usuariosdbsec`.`users_has_authorities` VALUES (10, 2);

INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (1, 1, 40, '2019-01-10', 6);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (2, 2, 10, '2019-01-11', 7);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (3, 3, 25, '2020-01-14', 7);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (4, 3, 15, '2020-05-25', 8);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (5, 4, 20, '2020-06-05', 9);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (6, 5, 20, '2020-07-25', 9);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (7, 5, 20, '2020-09-10', 10);
INSERT INTO `usuariosdbsec`.`Matriculas` VALUES (8, 6, 20, '2020-10-02', 10);