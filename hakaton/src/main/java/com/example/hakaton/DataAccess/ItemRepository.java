package com.example.hakaton.DataAccess;


import com.example.hakaton.Entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Items, UUID> {

}
