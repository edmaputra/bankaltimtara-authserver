package id.co.bankaltimtara.authserver.controller.oauth;

import id.co.bankaltimtara.authserver.controller.ABaseController;
import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.service.ClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/client")
public class ClientDetailsControllerV1 extends ABaseController<ClientDetails, Long> {

    @Autowired
    public ClientDetailsControllerV1(ClientDetailsService service) {
        super(service);
    }

    @Override
    @GetMapping("/all")
    public Iterable<ClientDetails> findAll() throws Exception {
        return super.findAll();
    }
}
