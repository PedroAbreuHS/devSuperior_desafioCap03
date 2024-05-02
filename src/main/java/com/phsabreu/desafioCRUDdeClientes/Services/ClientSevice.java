package com.phsabreu.desafioCRUDdeClientes.Services;

import com.phsabreu.desafioCRUDdeClientes.Entities.Client;
import com.phsabreu.desafioCRUDdeClientes.Repositories.IClientRepository;
import com.phsabreu.desafioCRUDdeClientes.dtos.ClientDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientSevice {

    private final IClientRepository clientRepository;

    public ClientSevice(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {

        Optional<Client> result = clientRepository.findById(id);
        Client client = result.orElseThrow(
                () -> new RuntimeException("Recurso não encontrado"));
        ClientDTO dto = new ClientDTO(client);
        return dto;

    }
}
