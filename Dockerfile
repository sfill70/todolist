FROM maven:amazoncorretto AS build

# Copy pom.xml to the image
COPY pom.xml /home/app/pom.xml
RUN mvn -f /home/app/pom.xml verify clean --fail-never

# Copy the source code
COPY src /home/app/src
RUN mvn -f /home/app/pom.xml package

# Install Tomcat    & jdk 11
FROM tomcat:9.0.73-jre11-temurin

# Copy source files to tomcat folder structure
COPY --from=build /home/app/target/todolist.war /usr/local/tomcat/webapps/todolist.war

EXPOSE 8080

CMD ["catalina.sh", "run"]