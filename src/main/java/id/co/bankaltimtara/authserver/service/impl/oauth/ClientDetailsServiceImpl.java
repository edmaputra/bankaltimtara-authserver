package id.co.bankaltimtara.authserver.service.impl.oauth;

import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.repository.oauth.ClientDetailsRepository;
import id.co.bankaltimtara.authserver.service.ClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

    private ClientDetailsRepository repository;

    @Autowired
    public ClientDetailsServiceImpl(ClientDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<ClientDetails> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new Exception("Not Found");
        }

    }

    @Override
    public ClientDetails find(Long aLong) throws Exception {
        return null;
    }

    @Override
    public ClientDetails add(ClientDetails clientDetails) throws Exception {
        return null;
    }

    @Override
    public ClientDetails update(ClientDetails clientDetails) throws Exception {
        return null;
    }

    @Override
    public ClientDetails delete(ClientDetails clientDetails) throws Exception {
        return null;
    }

    @Override
    public ClientDetails delete(Long aLong) throws Exception {
        return null;
    }
}
