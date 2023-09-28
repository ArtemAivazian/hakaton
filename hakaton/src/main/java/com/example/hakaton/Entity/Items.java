package com.example.hakaton.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table (name = "items")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private UUID id;
    @Column (name = "item_name")
    private String item_name;
    @Column (name = "price")
    private Integer price;
}
