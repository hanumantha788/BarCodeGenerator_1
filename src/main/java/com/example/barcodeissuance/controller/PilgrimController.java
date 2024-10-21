package com.example.barcodeissuance.controller;

import com.example.barcodeissuance.DTOs.Request;
import com.example.barcodeissuance.DTOs.Response;
import com.example.barcodeissuance.service.PilgrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PilgrimController {


    @Autowired
    private PilgrimService pilgrimService;

    @PostMapping("/save")

    public Response savePilgrim(@RequestBody Request request){

      return pilgrimService.save(request);





//        return (savePilgrim, HttpStatus.CREATED);
    }




}
