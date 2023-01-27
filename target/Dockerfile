FROM openjdk:17
LABEL developer="Samra Almas"
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
ADD ./candidateprofile-0.0.1-SNAPSHOT.jar user-profile-docker.jar
ENTRYPOINT ["java","-jar","user-profile-docker.jar"]