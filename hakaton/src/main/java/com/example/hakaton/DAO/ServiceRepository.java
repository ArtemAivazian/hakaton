package com.example.hakaton.DAO;

import com.example.hakaton.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<Services, UUID> {
    @Query("SELECT s FROM Services s WHERE s.date = :date AND s.time = :time")
    Optional<Services> findByDateAndTime(Date date, String time);
}
