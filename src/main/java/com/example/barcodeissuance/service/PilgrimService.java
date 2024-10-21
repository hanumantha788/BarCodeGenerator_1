package com.example.barcodeissuance.service;

import com.example.barcodeissuance.DTOs.Request;
import com.example.barcodeissuance.DTOs.Response;
import com.example.barcodeissuance.Entity.Pilgrim;
import com.example.barcodeissuance.repository.PilgrimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Service
public class PilgrimService {

    @Autowired
    private PilgrimRepository pilgrimRepository;

    public Response save(Request pilgrim) {
        Pilgrim pilgrim1 = new Pilgrim();

        pilgrim1.setUuid(UUID.randomUUID());
        pilgrim1.setName(pilgrim.getName());
       //    pilgrim1.setCreatedDate(pilgrim.getCreatedDate());
        //pilgrim1.setCreatedDate(Current);
        pilgrim1.setAge(pilgrim.getAge());
        pilgrim1.setGender(pilgrim.getGender());
        pilgrim1.setAdhaarNo(pilgrim.getAdhaarNo());
        pilgrim1.setCreatedDate(LocalDateTime.now());
        pilgrimRepository.save(pilgrim1);
        Response response = new Response();

        response.setUuid(pilgrim1.getUuid());
        response.setCreatedDate(pilgrim1.getCreatedDate());

         // pilgrimRepository.save(pilgrim1);
          return response;
    }

}
