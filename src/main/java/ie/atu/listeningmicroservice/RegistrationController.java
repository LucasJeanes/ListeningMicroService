package ie.atu.listeningmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private ConfirmationServiceClient confirmationServiceClient;

    @Autowired
    public RegistrationController(ConfirmationServiceClient confirmationServiceClient) {
        this.confirmationServiceClient = confirmationServiceClient;
    }

    @PostMapping("/confirm")
    //@ResponseStatus(HttpStatus.CREATED)
    public String registrationRequest(@RequestBody UserDetails userDetails) {
        String confirmationMessage = confirmationServiceClient.confirmMessage(userDetails);
        return confirmationMessage;
    }
}