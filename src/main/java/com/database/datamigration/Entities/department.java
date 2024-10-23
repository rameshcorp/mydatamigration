package com.database.datamigration.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class department {
    @Id
    @Column(name = "department_Id")
    private Long department_Id;

    @Column(name = "department_Name")
    private String department_Name;

    @Column(name = "active")
    private boolean active;

}
