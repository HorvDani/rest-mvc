package com.example.restmvc.services;

import com.example.restmvc.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {

    Beer getBeerById(UUID id);
}
