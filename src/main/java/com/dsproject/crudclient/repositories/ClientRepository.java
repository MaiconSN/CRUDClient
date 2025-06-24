package com.dsproject.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsproject.crudclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
