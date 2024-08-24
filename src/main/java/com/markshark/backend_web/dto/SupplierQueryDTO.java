package com.markshark.backend_web.dto;

import com.markshark.backend_web.model.Supplier.ManufacturingProcess;
import com.markshark.backend_web.model.Supplier.NatureOfBusiness;

import java.util.List;

public class SupplierQueryDTO {
    private String location;
    private NatureOfBusiness natureOfBusiness;
    private ManufacturingProcess manufacturingProcesses;
    private int page;
    private int size;

    // Getters and Setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public ManufacturingProcess getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(ManufacturingProcess manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
