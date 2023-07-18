FROM openjdk:17
LABEL maintainer="com.csi"
ADD target/dockerex-0.0.1-SNAPSHOT.jar dockerex.jar
ENTRYPOINT ["java", "-jar", "dockerex.jar"]