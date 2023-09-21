package com.example.hakaton.Repositories;

import com.example.hakaton.Objects.Items;
import com.example.hakaton.Objects.Service;
import com.example.hakaton.Objects.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<Services, UUID> {
}
