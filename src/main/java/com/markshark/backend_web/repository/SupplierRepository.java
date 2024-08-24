package com.markshark.backend_web.repository;

import com.markshark.backend_web.model.*;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.util.List;
import com.markshark.backend_web.model.Supplier.ManufacturingProcess;
import com.markshark.backend_web.model.Supplier.NatureOfBusiness;






@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	  Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(String location, NatureOfBusiness natureOfBusiness, List<ManufacturingProcess> manufacturingProcesses, Pageable pageable);
}
