**Apache Kafka Implementation with Spring Boot**

Configure Spring Boot application
   - Create a Rest Api End point (client sends message thru this api to the producer)
   - Create a producer class which uses kafka template and sends the message to kafka topic.
   - Create a Consumer class which receives message from the kafka topic. In order to make Consumer java class a kafka consumer we annotate the class with @KafkaListener annotation. The annotation also takes in two
     parametes - 1. Topics : String array indicates all the topics names to which consumer listens. 2. Group id : Used for load balancing with topic partioning in picture.
   - Configure kafka properties in application.properties file.
   - Once you run the Spring Boot application, make sure to run the Zookeeper and Kafka server using the following commands:
       .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
       .\bin\windows\kafka-server-start.bat .\config\server.properties

After Successful Implementation, Once we hit the url: http://localhost:8080/rest/api/producerMsg?message="KafkaImpl"
the message "KafkaImpl" is sent from the client to producer and the producer sends thru kafka to consumer.
