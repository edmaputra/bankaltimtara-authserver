package id.co.bankaltimtara.authserver.service.impl;

import id.co.bankaltimtara.authserver.repository.ABaseRepository;
import id.co.bankaltimtara.authserver.service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

//@Service
public class ABaseServiceIimpl implements ABaseService {

    private ABaseRepository repository;

    @Autowired
    public ABaseServiceIimpl(ABaseRepository repository) {
        this.repository = repository;
    }


    @Override
    public Iterable findAll() throws Exception {
        return null;
    }

    @Override
    public Object find(Serializable serializable) throws Exception {
        return null;
    }

    @Override
    public Object add(Object o) throws Exception {
        return null;
    }

    @Override
    public Object update(Object o) throws Exception {
        return null;
    }

    @Override
    public Object delete(Object o) throws Exception {
        return null;
    }

    @Override
    public Object delete(Serializable serializable) throws Exception {
        return null;
    }
}
