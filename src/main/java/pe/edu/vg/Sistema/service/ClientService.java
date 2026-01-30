package pe.edu.vg.Sistema.service;

import pe.edu.vg.Sistema.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    // Listar todos los clientes
    Flux<Client> obtenertodos();

    // Buscar cliente por ID
    Mono<Client> findById(Long id);

    // Buscar cliente por DNI
    Mono<Client> findByDni(String dni);

    // Guardar/crear cliente
    Mono<Client> save(Client client);

}
