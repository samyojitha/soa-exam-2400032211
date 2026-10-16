package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.FarmersMarket;

public interface FarmersMarketRepository
        extends JpaRepository<FarmersMarket, Long> 
{
}