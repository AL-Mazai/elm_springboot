package com.elm.service;


import com.elm.pojo.BusinessInfo;
import com.elm.pojo.FoodList;

import java.util.List;

public interface FoodListService {
    /**
     * 获取所有食物类型
     * @return
     */
    List<FoodList> getAllFood();
}
