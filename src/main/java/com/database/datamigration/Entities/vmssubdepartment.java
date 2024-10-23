package com.database.datamigration.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vms_sub_department")
public class vmssubdepartment {
    @Id
    @Column(name = "SubId")
    private Long SubId;

    @Column(name = "SubDepartment")
    private String SubDepartment;

    @Column(name = "IsActive")
    private boolean IsActive;

}
