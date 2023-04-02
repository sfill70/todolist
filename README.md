
Run project
1.Make sure you have installed docker and ports 8080, 3306 are free
2.Open a command line in the location where the application is installed and run the command:
```
docker compose up
```
3.The application will download all dependencies and create a docker container. Docker container will be launched automatically
4.After the successful completion of the previous point, the application will be available at the link:
```
http://localhost:8080/todolist/tasks
```

image: mysql:8.0.32


Technologies used
- Spring (Core, Data, MVC)
- Thymeleaf
- Liquibase
- Lombok
- Mapstruct
- Hibernate validator
- Logger (Log4j2, Slf4)
- Docker
- Tomcat
- MySQL

start page

![Image alt](https://github.com/sfill70/todolist/blob/master/src/main/webapp/img/run_start_tl.png)

running container

![Image alt](https://github.com/sfill70/todolist/blob/master/src/main/webapp/img/run_conainer_tl.png)


