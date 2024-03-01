package com.fashionsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionsuperior.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
