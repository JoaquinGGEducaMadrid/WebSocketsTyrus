FROM eclipse-temurin:17-jdk

# Instalar Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /app

# Copiar el proyecto
COPY . .

# Construir el JAR
RUN mvn -q -DskipTests package

# Ejecutar la aplicación
CMD ["java", "-cp", "target/classes:target/dependency/*", "com.example.websocket.WebSocketServer"]


