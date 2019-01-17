package id.co.bankaltimtara.authserver.controller;

import id.co.bankaltimtara.authserver.service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ABaseController<T, ID> {

    private ABaseService service;

    @Autowired
    public ABaseController(ABaseService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<T> findAll() throws Exception {
        return service.findAll();
    }
}
