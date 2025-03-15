# Usando a imagem do OpenJDK
FROM openjdk:17-jdk-slim

# Definindo diretório de trabalho
WORKDIR /app

# Copiando o JAR gerado pelo Maven/Gradle para
