package id.co.bankaltimtara.authserver.repository.oauth;

import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.repository.ABaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDetailsRepository extends ABaseRepository<ClientDetails, Long> {

}
