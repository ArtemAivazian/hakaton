package com.example.hakaton.Objects;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "reservations")


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column (name = "date")
    private String date;
    @Column (name = "time")
    private String time;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "reservation_id")
//    private List<Service> service;

}
