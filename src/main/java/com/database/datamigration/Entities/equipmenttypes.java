package com.database.datamigration.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "equipment_types")
@Getter
@Setter
@NoArgsConstructor

public class equipmenttypes {

    @Column(name = "equipment_type_id")
    private Long equipmentTypeId;

    @Column(name = "equipment_type_name", nullable = false)
    private String equipmentTypeName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_details_id")
    private Long equipmentDetailsId;

    @Column(name = "calibration_task_setting_id")
    private Long calibrationTaskSettingId;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;
}
