FROM maven:3.6.3-jdk-11

COPY . .

RUN mvn clean package && rm -rf /root/.m2/repository/ && rm -rf target/libs && rm -rf target/site

ENTRYPOINT ["java", "-cp", "target/matsim-0.0.1-jar-with-dependencies.jar"]
