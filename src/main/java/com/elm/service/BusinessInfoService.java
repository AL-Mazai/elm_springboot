package com.elm.service;


import com.elm.pojo.BusinessInfo;

import java.util.List;

public interface BusinessInfoService {
    /**
     * 增加商家
     * @param businessInfo
     * @return
     */
    boolean addBusinessInfo(BusinessInfo businessInfo);

    /**
     * 获取所有商家信息
     * @return
     */
    List<BusinessInfo> getAllBusinessInfo();

    /**
     * 删除商家
     * @param businessId
     * @return
     */
    boolean deleteBusiness(Integer businessId);
}
