package com.chittifoodss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.chittifoodss.model.Food;
import com.chittifoodss.repository.FoodRepository;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }
}