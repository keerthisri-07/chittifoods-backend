package com.chittifoodss.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

import com.chittifoodss.model.Food;
import com.chittifoodss.repository.FoodRepository;

@Component
public class MenuData {

    @Autowired
    private FoodRepository foodRepository;

    @PostConstruct
    public void loadMenuData() {

        // Veg Items
        foodRepository.save(new Food("Veg Biryani",150,"Veg"));
        foodRepository.save(new Food("Paneer Butter Masala",180,"Veg"));
        foodRepository.save(new Food("Masala Dosa",80,"Veg"));
        foodRepository.save(new Food("Idli",40,"Veg"));
        foodRepository.save(new Food("Veg Fried Rice",120,"Veg"));
        foodRepository.save(new Food("Paneer Tikka",200,"Veg"));
        foodRepository.save(new Food("Veg Noodles",110,"Veg"));
        foodRepository.save(new Food("Dal Tadka",130,"Veg"));
        foodRepository.save(new Food("Chole Bhature",100,"Veg"));
        foodRepository.save(new Food("Aloo Paratha",70,"Veg"));

        // Non Veg Items
        foodRepository.save(new Food("Chicken Biryani",220,"NonVeg"));
        foodRepository.save(new Food("Butter Chicken",250,"NonVeg"));
        foodRepository.save(new Food("Chicken Fry",200,"NonVeg"));
        foodRepository.save(new Food("Chicken Curry",210,"NonVeg"));
        foodRepository.save(new Food("Egg Biryani",160,"NonVeg"));
        foodRepository.save(new Food("Chicken Noodles",170,"NonVeg"));
        foodRepository.save(new Food("Fish Fry",240,"NonVeg"));
        foodRepository.save(new Food("Mutton Biryani",300,"NonVeg"));
        foodRepository.save(new Food("Chicken Tikka",230,"NonVeg"));
        foodRepository.save(new Food("Chicken 65",210,"NonVeg"));

        // Drinks
        foodRepository.save(new Food("Water Bottle",20,"Drink"));
        foodRepository.save(new Food("Coke",40,"Drink"));
        foodRepository.save(new Food("Sprite",40,"Drink"));
        foodRepository.save(new Food("Fresh Lime Soda",50,"Drink"));
        foodRepository.save(new Food("Mango Juice",60,"Drink"));
        foodRepository.save(new Food("Lassi",70,"Drink"));
        foodRepository.save(new Food("Butter Milk",30,"Drink"));

        // Desserts
        foodRepository.save(new Food("Gulab Jamun",60,"Dessert"));
        foodRepository.save(new Food("Ice Cream",80,"Dessert"));
        foodRepository.save(new Food("Rasmalai",90,"Dessert"));
        foodRepository.save(new Food("Chocolate Cake",120,"Dessert"));
    }
}