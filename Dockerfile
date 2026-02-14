FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . /app

# Construye el JAR
RUN ./mvnw -q -DskipTests package

# Ejecuta la aplicación
CMD ["java", "-cp", "target/classes:target/dependency/*", "com.example.websocket.WebSocketServer"]
