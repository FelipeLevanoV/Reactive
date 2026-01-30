package pe.edu.vg.Sistema.repository;


import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vg.Sistema.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@Repository
public interface ClientRepository extends R2dbcRepository<Client, Long> {

    
    Flux<Client> findByStatus(String status);

    Mono<Client> findByDni(String dni);


}
