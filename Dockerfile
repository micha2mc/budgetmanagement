FROM openjdk:21-slim
EXPOSE 9002
ADD target/budgetmanagement-0.0.1.jar budget-service.jar
ENTRYPOINT ["java","-jar","/budget-service.jar"]