package com.example.hakaton.Repositories;

import com.example.hakaton.Objects.ItemsReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
import java.util.UUID;

@Repository
public interface ItemReservationRepository extends JpaRepository<ItemsReservation, UUID> {
     Optional<ItemsReservation> findById (UUID id);
}
