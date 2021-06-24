# Environment Settgins
## Create a database

docker run -td -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=MyRoot_123 -d mysql:5.7

create database eshop;

