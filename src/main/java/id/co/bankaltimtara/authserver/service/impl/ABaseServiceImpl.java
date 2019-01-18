package id.co.bankaltimtara.authserver.service.impl;

import id.co.bankaltimtara.authserver.exception.DataEmptyException;
import id.co.bankaltimtara.authserver.exception.DataNotFoundException;
import id.co.bankaltimtara.authserver.repository.ABaseRepository;
import id.co.bankaltimtara.authserver.service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class ABaseServiceImpl<T extends Serializable, ID> implements ABaseService<T, ID> {

    private ABaseRepository<T, ID> repository;

    @Autowired
    public ABaseServiceImpl(ABaseRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<T> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new DataEmptyException("Data Empty");
        }
    }

    @Override
    public T find(ID id) throws Exception {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            throw new DataNotFoundException(id + "Not Found");
        }
    }

    @Override
    public T add(T t) throws Exception {
        return null;
    }

    @Override
    public T update(T t) throws Exception {
        return null;
    }

    @Override
    public T delete(T t) throws Exception {
        return null;
    }

    @Override
    public T delete(ID id) throws Exception {
        return null;
    }
}
