#school goods selling Demo
###运行前安装：
1. tomcat 7  
安装并配置好。别的版本不知道会有什么不兼容
2. mysql  
项目数据库的设置在/src/rescources/jdbc.properties里
run这个Demo前，在数据库中新建名为demo的数据库；数据库里新建表： 
 > create table test_user(  
 u_id INT NOT NULL AUTO_INCREMENT,  
 nickname VARCHAR(36) NOT NULL,  
 password VARCHAR(36) NOT NULL,  
 email VARCHAR(36) NOT NULL,  
 PRIMARY KEY(u_id));
 
