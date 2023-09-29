package com.example.hakaton.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "item_reservations")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemsReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column (name = "item_name")
    private String item_name;
    @Column (name = "price")
    private Integer price;
    @Column(name = "delivery_point")
    private String delivery_point;
    @Column(name = "email")
    private String email;
}
