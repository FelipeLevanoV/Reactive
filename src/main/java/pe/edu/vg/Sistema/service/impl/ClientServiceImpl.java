package pe.edu.vg.Sistema.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.vg.Sistema.model.Client;
import pe.edu.vg.Sistema.repository.ClientRepository;
import pe.edu.vg.Sistema.service.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Flux<Client> obtenertodos() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findById(Long id) {
        return null;
    }

    @Override
    public Mono<Client> findByDni(String dni) {
        return null;
    }

    @Override
    public Mono<Client> save(Client client) {
        return null;
    }
}
