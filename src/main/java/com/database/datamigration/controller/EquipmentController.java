package com.database.datamigration.controller;

import com.database.datamigration.service.DataTransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipmentController {

    private final DataTransferService dataTransferService;

    public EquipmentController(DataTransferService dataTransferService) {
        this.dataTransferService = dataTransferService;
    }

    @PostMapping("/update-equipment-type-ids")
    public ResponseEntity<String> updateEquipmentTypeIds() {
        dataTransferService.insertEquipmentDetails();
        return ResponseEntity.ok("Equipment Type IDs updated successfully.");
    }

    @PostMapping("/insert-roles")
    public ResponseEntity<String> insertRoles() {
        dataTransferService.insertroles();
        return ResponseEntity.ok("Roles inserted successfully.");
    }

    @PostMapping("/insert-depart")
    public ResponseEntity<String> insertdepart() {
        dataTransferService.insertdepart();
        return ResponseEntity.ok("Roles inserted successfully.");
    }

    @PostMapping("/insert-types")
    public ResponseEntity<String> insertEquipmentTypes() {
        dataTransferService.insertEquipmentTypes();
        return ResponseEntity.ok("Roles inserted successfully.");
    }
}
