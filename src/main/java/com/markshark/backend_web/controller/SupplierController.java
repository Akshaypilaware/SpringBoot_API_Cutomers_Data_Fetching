package com.markshark.backend_web.controller;

import com.markshark.backend_web.dto.SupplierQueryDTO;
import com.markshark.backend_web.model.Supplier;
import com.markshark.backend_web.service.SupplierService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    
    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(@RequestBody SupplierQueryDTO queryDTO) {

       
        PageRequest pageRequest = PageRequest.of(queryDTO.getPage(), queryDTO.getSize());

        List<Supplier.ManufacturingProcess> manufacturingProcesses = Arrays.asList(queryDTO.getManufacturingProcesses());

       
        Page<Supplier> suppliers = supplierService.findSuppliers(
            queryDTO.getLocation(),
            queryDTO.getNatureOfBusiness(),
            manufacturingProcesses,
            pageRequest
        );

        return ResponseEntity.ok(suppliers);
    }
}
