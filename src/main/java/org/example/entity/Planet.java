package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Planet")
public class Planet {
    @Id
    @Column (name = "id", length = 20, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column (name = "name", length = 500, nullable = false)
    private String name;
}
