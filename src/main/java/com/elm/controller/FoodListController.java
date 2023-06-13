package com.elm.controller;

import com.elm.pojo.BusinessInfo;
import com.elm.pojo.FoodList;
import com.elm.service.FoodListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodList")
public class FoodListController {
    @Autowired
    FoodListService foodListService;

    @GetMapping("/getAllFood")
    @ResponseBody
    public List<FoodList> getAllFood(){
        System.out.println("正在获取...");
        return foodListService.getAllFood();
    }
}
