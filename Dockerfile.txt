# Etapa de compilación
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
# Entramos a la carpeta Academico donde está el pom.xml y compilamos
RUN cd Academico && mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:17-jre
WORKDIR /app
# Copiamos el jar generado desde la etapa anterior
COPY --from=build /app/Academico/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]