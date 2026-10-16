package com.klef.soa.exam.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.klef.soa.exam.entity.FarmersMarket;
import com.klef.soa.exam.repository.FarmersMarketRepository;

@Service
public class FarmersMarketService {
    private final FarmersMarketRepository repo;

    public FarmersMarketService(FarmersMarketRepository repo) {
        this.repo = repo;
    }

    public FarmersMarket add(FarmersMarket market) {
        return repo.save(market);
    }

    public List<FarmersMarket> displayAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}