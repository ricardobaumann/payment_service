package payment_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by ricardobaumann on 08/01/17.
 */
@RestController
@RequestMapping(path = "/payments/users/{username}")
public class PaymentController {


    @RequestMapping(path = "/status",method = RequestMethod.GET)
    public StatusDTO getStatus(@PathVariable("username") String username, Principal user) {
        return new StatusDTO(Status.OK);
    }

}
