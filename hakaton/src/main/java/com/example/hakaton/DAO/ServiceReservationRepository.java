package com.example.hakaton.DAO;

import com.example.hakaton.entity.ServiceReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ServiceReservationRepository extends JpaRepository<ServiceReservation, UUID> {
}
