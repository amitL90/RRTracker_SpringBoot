package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.DeliveryManager;
@Repository
public interface DeliveryManagerRepository extends JpaRepository<DeliveryManager, Integer> {

}
