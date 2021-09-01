package com.simplilearn.FoodBox.service;

import java.util.List;

import com.simplilearn.FoodBox.model.Comment;
import com.simplilearn.FoodBox.model.Dish;
import com.simplilearn.FoodBox.model.Restaurant;
import com.simplilearn.FoodBox.model.RestaurantInfo;

public interface RestaurantService {

  int addDish(String id, Dish dish);

  int removeDish(String id, Dish dish);

  List<Dish> getAllDishes(String id);

  RestaurantInfo getInformation(String id);

  int updateInfo(String id, RestaurantInfo info);
}
