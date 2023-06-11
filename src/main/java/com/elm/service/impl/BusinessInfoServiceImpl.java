package com.elm.service.impl;


import com.elm.mapper.BusinessInfoMapper;
import com.elm.pojo.BusinessInfo;
import com.elm.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessInfoServiceImpl implements BusinessInfoService {

    @Autowired
    BusinessInfoMapper businessInfoMapper;

    @Override
    public boolean addBusinessInfo(BusinessInfo businessInfo) {
        if(businessInfoMapper.addBusinessInfo(businessInfo) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<BusinessInfo> getAllBusinessInfo() {
        return businessInfoMapper.getAllBusinessInfo();
    }

    @Override
    public boolean deleteBusiness(Integer businessId) {
        int isDelete = businessInfoMapper.deleteBusiness(businessId);
        if(isDelete > 0){
            return true;
        }
        return false;
    }
}




