package com.database.datamigration.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "equipment_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class eqipmentdetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_details_id")
    private Long equipmentDetailsId;

    @Column(name = "description")
    private String description;

    @Column(name = "calibration_method")
    private String calibrationMethod;

    @Column(name = "calibration_period")
    private String calibrationPeriod;

    @Column(name = "allowable_error")
    private String allowableError;

    @Column(name = "equipment_range")
    private String equipmentRange;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "model")
    private String model;

    @Column(name = "created_by")
    private String createdBy;
}
