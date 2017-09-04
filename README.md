# javaee

To create new docker container with empty MySQL databese:

`docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=MyData -e MYSQL_USER=user -e MYSQL_PASSWORD=Qwer12#$ mysql`

To deploy application with Maven WildFly plugin: `mvn wildfly:run@startApp`

The application is then available on `http://localhost:8080/JpaEEzCDI`
