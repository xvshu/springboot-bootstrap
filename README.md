# springboot-bootstrap
使用springboot构建一个后台，前台开发模板

# 引入步骤
-初始化数据库

```
CREATE DATABASE xs_db_tem;
use xs_db_tem;
CREATE TABLE t_tem_user(
  user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(100) NOT NULL ,
  password VARCHAR(100) NOT NULL ,
  phone VARCHAR(50) NOT NULL ,
  tem VARCHAR(10) NOT NULL ,
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	update_time timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=INNODB DEFAULT CHARSET=utf8;

```

-idea 引入项目

-springboot 启动项目

# 主要页面

## GateWay
<img src="https://github.com/xvshu/springboot-bootstrap/blob/master/doc/imgs/gateway.png">

## Index
<img src="https://github.com/xvshu/springboot-bootstrap/blob/master/doc/imgs/temindex.png">

## Login
<img src="https://github.com/xvshu/springboot-bootstrap/blob/master/doc/imgs/login.png">


