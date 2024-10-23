package com.database.datamigration.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vms_roles")
public class vms_roles {
@Id
    @Column(name = "RoleId")
    private Long equipmentTypeID;

    @Column(name = "RoleName")
    private String departmentId;

    @Column(name = "IsActive")
    private boolean createdBy;

}
