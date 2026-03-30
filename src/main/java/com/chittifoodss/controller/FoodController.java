package com.chittifoodss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.chittifoodss.model.Food;
import com.chittifoodss.service.FoodService;

@RestController
@CrossOrigin
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getFoods(){
        return foodService.getAllFoods();
    }
}