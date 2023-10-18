package ie.atu.listeningmicroservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="confirmation-service", url = "http://localhost:8082")
public interface ConfirmationServiceClient {
    @PostMapping("/confirmationMessage")
    String confirmMessage(@RequestBody UserDetails userDetails);
}