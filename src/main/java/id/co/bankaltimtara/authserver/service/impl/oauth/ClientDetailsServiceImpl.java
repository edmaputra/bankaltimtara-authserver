package id.co.bankaltimtara.authserver.service.impl.oauth;

import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.repository.oauth.ClientDetailsRepository;
import id.co.bankaltimtara.authserver.service.ClientDetailsService;
import id.co.bankaltimtara.authserver.service.impl.ABaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsServiceImpl extends ABaseServiceImpl<ClientDetails, Long> implements ClientDetailsService {


    @Override
    public ClientDetails findByName(String name) {
        return null;
    }

    @Autowired
    public ClientDetailsServiceImpl(ClientDetailsRepository repository) {
        super(repository);
    }
}
