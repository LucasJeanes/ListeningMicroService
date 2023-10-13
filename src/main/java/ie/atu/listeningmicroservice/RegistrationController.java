package ie.atu.listeningmicroservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    public String registrationRequest(@RequestBody UserDetails userDetails) {
        String confirmationMessage = String.format("Received details for %s with email: %s",
                userDetails.getName(), userDetails.getEmail());
        return confirmationMessage;
    }
}