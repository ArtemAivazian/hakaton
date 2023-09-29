package com.example.hakaton.DataAccess;

import com.example.hakaton.Entity.ItemsReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ItemReservationRepository extends JpaRepository<ItemsReservation, UUID> {
//     Optional<ItemsReservation> findById (UUID id);
}
