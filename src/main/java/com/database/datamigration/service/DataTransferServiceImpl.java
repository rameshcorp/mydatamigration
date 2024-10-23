package com.database.datamigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataTransferServiceImpl implements DataTransferService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertEquipmentDetails() {
        try {
            String sql = "INSERT INTO equipments1 (equipment_id, equipment_type_id, department_id, created_date, active) " +
                    "SELECT equipmentID, eqid, departmentid, CreatedDate, IsActive FROM vms_equipment";

            int rowsAffected = jdbcTemplate.update(sql);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertroles() {
        try {
            String sql = "INSERT INTO roles (role_id, role_name, is_active) " +
                    "SELECT RoleId, RoleName, IsActive FROM vms_roles";

            int rowsAffected = jdbcTemplate.update(sql);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertdepart() {
        try {
            String sql = "INSERT INTO departments (department_Id, department_Name, active) " +
                    "SELECT SubId, SubDepartment, IsActive FROM vms_sub_department";

            int rowsAffected = jdbcTemplate.update(sql);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insertEquipmentTypes() {
        try {
            String sql = "INSERT INTO equipment_types (equipment_type_id, equipment_type_name, active) " +
                    "SELECT eqid, equipmentname, IsActive FROM vms_equipment";

            int rowsAffected = jdbcTemplate.update(sql);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insertEquipmentdetails() {
        try {
            String sql = "INSERT INTO equipment_details (description, calibration_method, calibration_period, " +
                    "allowable_error, equipment_range, active, model, created_by) " +
                    "SELECT description, calibration_method, calibration_period, allowable_error, " +
                    "equipment_range, IsActive, model, created_by FROM vms_equipment";

            int rowsAffected = jdbcTemplate.update(sql);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
