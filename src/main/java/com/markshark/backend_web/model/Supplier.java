package com.markshark.backend_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    private String website;
    private String location;

    private NatureOfBusiness natureOfBusiness;
    private List<ManufacturingProcess> manufacturingProcesses;

    public Supplier(Long supplierId, String companyName, String website, String location,
                    NatureOfBusiness natureOfBusiness, List<ManufacturingProcess> manufacturingProcesses) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.website = website;
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.manufacturingProcesses = manufacturingProcesses;
    }

    public enum NatureOfBusiness {
        SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE
    }

    public enum ManufacturingProcess {
        MOULDING, THREE_D_PRINTING, CASTING, COATING
    }

}

