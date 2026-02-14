FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiamos todo el proyecto, incluido el JAR
COPY . .

# Ejecutamos el JAR exportado desde Eclipse
CMD ["java", "-jar", "target/websocketstyrus.jar"]





