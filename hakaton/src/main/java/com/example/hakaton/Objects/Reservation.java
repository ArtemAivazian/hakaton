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

    @Column(name = "comment")
    private String comment;

    @ElementCollection
    @CollectionTable(name ="reservation_services", joinColumns = @JoinColumn(name ="reservation_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "service_type")
    private List<Service> service;

}
