package com.example.hakaton.DataAccess;

import com.example.hakaton.Entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<Services, UUID> {
}
