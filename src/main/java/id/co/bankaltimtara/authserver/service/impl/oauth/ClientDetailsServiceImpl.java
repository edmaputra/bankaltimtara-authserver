package id.co.bankaltimtara.authserver.service.impl.oauth;

import id.co.bankaltimtara.authserver.entity.oauth.ClientDetails;
import id.co.bankaltimtara.authserver.repository.oauth.ClientDetailsRepository;
import id.co.bankaltimtara.authserver.service.ClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

    private ClientDetailsRepository repository;

    @Autowired
    public ClientDetailsServiceImpl(ClientDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ClientDetails> findAll() throws Exception {
        return repository.findAll();
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
