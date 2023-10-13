package ie.atu.listeningmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
public class ListeningMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListeningMicroServiceApplication.class, args);
    }

}