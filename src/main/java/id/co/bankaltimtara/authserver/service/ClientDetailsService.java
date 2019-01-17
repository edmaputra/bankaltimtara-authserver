package id.co.bankaltimtara.authserver.service;

import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import org.springframework.stereotype.Service;

@Service
public interface ClientDetailsService extends ABaseService<ClientDetails, Long>{
}
