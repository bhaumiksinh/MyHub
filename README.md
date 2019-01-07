# Spring boot Hibernate JPA connection project 
# JSP Used for passing data in DAO
# Bootstrap used

data inserted using CrudRepository
number files required to add 
1) UserRespository -> interface created for save operation
2) UserServices.java -> for create DAO of save operation 
3) ViewController.java- > created for navigation 
4) User.java -> created for JPA 

=> plugins required 
1) mysql connection java
2) jstl
3) servlet
4) devtool for auto code refresh change 

Create table query user table ->

CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `firstname` varchar(200) DEFAULT NULL,
  `lastname` varchar(200) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

# Thank you :)
