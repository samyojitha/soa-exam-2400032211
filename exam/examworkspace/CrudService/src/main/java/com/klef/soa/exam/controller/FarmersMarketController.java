package com.klef.soa.exam.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.klef.soa.exam.entity.FarmersMarket;
import com.klef.soa.exam.service.FarmersMarketService;

@RestController
public class FarmersMarketController {
    private final FarmersMarketService service;

    public FarmersMarketController(FarmersMarketService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() 
    {
        return "CRUD Service is running";
    }

    @PostMapping("/Add")
    public FarmersMarket add(@RequestBody FarmersMarket market) 
    {
        return service.add(market);
    }

    @GetMapping("/DisplayAll")
    public List<FarmersMarket> displayAll()
    {
        return service.displayAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Long id) 
    {
        service.delete(id);
        return "Record deleted successfully";
    }
}