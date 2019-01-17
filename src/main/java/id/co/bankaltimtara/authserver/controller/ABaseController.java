package id.co.bankaltimtara.authserver.controller;

import id.co.bankaltimtara.authserver.exception.DataNotFoundException;
import id.co.bankaltimtara.authserver.service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/base")
public class ABaseController<T extends Serializable, ID> {

    private ABaseService<T, ID> service;

    @Autowired
    public ABaseController(ABaseService service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<T> findAll() throws Exception{
        try {
            return service.findAll();
        } catch (Exception e) {
            throw new DataNotFoundException("Not Found");
        }
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public T find(@PathVariable ID id) throws Exception{
        try {
            return service.find(id);
        } catch (Exception e) {
            throw new DataNotFoundException("Not Found");
        }
    }

}
