package com.markshark.backend_web.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.markshark.backend_web.model.Supplier;
import com.markshark.backend_web.model.Supplier.NatureOfBusiness;
import com.markshark.backend_web.model.Supplier.ManufacturingProcess;
import com.markshark.backend_web.repository.SupplierRepository;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    

    		public Page<Supplier> findSuppliers(String location, NatureOfBusiness natureOfBusiness, List<ManufacturingProcess> manufacturingProcesses, Pageable pageable) {
    	 
    	        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, manufacturingProcesses, pageable);
    	    }
    	}

    	

