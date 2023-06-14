package com.elm.mapper;

import com.elm.pojo.FoodList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodListMapper {
    /**
     * 获取所有食物类型
     * @return
     */
    List<FoodList> getAllFood();
}




