package com.database.datamigration.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class roles {
    @Id
    @Column(name = "role_id")
    private Long role_id;

    @Column(name = "role_name")
    private String role_name;

    @Column(name = "is_active")
    private boolean is_active;
}
