package com.elm.service.impl;

import com.elm.mapper.FoodListMapper;
import com.elm.pojo.FoodList;
import com.elm.service.FoodListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodListServiceImpl implements FoodListService {

    @Autowired
    FoodListMapper foodListMapper;
    @Override
    public List<FoodList> getAllFood() {
        return foodListMapper.getAllFood();
    }
}




