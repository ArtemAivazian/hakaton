package com.example.hakaton.DataAccess;

import com.example.hakaton.Entity.ServiceReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ServiceReservationRepository extends JpaRepository<ServiceReservation, UUID> {
}
