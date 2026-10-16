
package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.FarmersMarket;
import com.klef.soa.exam.repository.FarmersMarketRepository;

@Service
public class FarmersMarketServiceImpl implements FarmersMarketService {

    private final FarmersMarketRepository repository;

    public FarmersMarketServiceImpl(FarmersMarketRepository repository) {
        this.repository = repository;
    }

    @Override
    public FarmersMarket add(FarmersMarket market) {
        return repository.save(market);
    }

    @Override
    public List<FarmersMarket> displayAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
