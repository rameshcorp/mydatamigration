package com.database.datamigration.service;


import org.springframework.stereotype.Service;

@Service
public interface DataTransferService {

    void insertEquipmentDetails();
    void insertroles();
    void insertdepart();
    void insertEquipmentTypes();
    void insertEquipmentdetails();
}