package com.phsabreu.desafioCRUDdeClientes.Repositories;

import com.phsabreu.desafioCRUDdeClientes.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
