package com.elm.mapper;

import com.elm.pojo.BusinessInfo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BusinessInfoMapper {
    /**
     * 增加商家
     * @param businessInfo
     */
    int addBusinessInfo(BusinessInfo businessInfo);

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
    int deleteBusiness(Integer businessId);
}




