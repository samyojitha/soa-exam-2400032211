package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.FarmersMarket;

public interface FarmersMarketService {
    FarmersMarket add(FarmersMarket market);
    List<FarmersMarket> displayAll();
    void delete(Long id);
}