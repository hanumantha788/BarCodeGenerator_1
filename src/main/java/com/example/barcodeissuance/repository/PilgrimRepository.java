package com.example.barcodeissuance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.barcodeissuance.Entity.Pilgrim;

import java.util.UUID;

@Repository
public interface PilgrimRepository extends JpaRepository<Pilgrim, UUID> {

}
