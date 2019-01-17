package id.co.bankaltimtara.authserver.service;

import id.co.bankaltimtara.authserver.entity.BaseEntity;

import java.io.Serializable;

public interface ABaseService<T extends Serializable, ID> {

    Iterable<T> findAll() throws Exception;

    T find(ID id) throws Exception;

    T add(T t) throws Exception;

    T update(T t) throws Exception;

    T delete(T t) throws Exception;

    T delete(ID id) throws Exception;

}
