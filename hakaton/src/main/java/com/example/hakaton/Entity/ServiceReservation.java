package com.example.hakaton.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "service_reservations")


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column (name = "service_name")
    private String service_name;

    @Column (name = "date")
    private Date date;
    @Column (name = "time")
    private String time;

    @Column(name = "comment")
    private String comment;

    @Column(name = "email")
    private String email;

    @Column(name = "vin")
    private String vin;

    @Column(name = "car_num")
    private String car_num;

}
