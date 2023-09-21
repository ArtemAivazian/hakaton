package com.example.hakaton.Objects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table (name = "services")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private UUID id;
    @Column (name = "service_name")
    private String service_name;
    @Column (name = "price")
    private Integer price;

    @Column (name = "date")
    private Date date;

    @Column (name = "time")
    private String time;
}