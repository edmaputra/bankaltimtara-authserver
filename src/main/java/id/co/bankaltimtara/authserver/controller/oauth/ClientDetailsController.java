package id.co.bankaltimtara.authserver.controller.oauth;

import id.co.bankaltimtara.authserver.controller.ABaseController;
import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.service.ClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/client")
public class ClientDetailsController extends ABaseController<ClientDetails, Long> {

    @Autowired
    public ClientDetailsController(ClientDetailsService service) {
        super(service);
    }


}
