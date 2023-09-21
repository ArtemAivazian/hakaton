package com.example.hakaton.Repositories;

import com.example.hakaton.Objects.ServiceReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ReservationRepository extends JpaRepository<ServiceReservation, UUID> {
}
