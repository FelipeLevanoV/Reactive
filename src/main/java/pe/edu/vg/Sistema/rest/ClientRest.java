package pe.edu.vg.Sistema.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vg.Sistema.model.Client;
import pe.edu.vg.Sistema.service.ClientService;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientRest {

    private final ClientService clientService;

    @GetMapping
    public Flux<Client> listartodos(){
        return clientService.obtenertodos();
    }
}
