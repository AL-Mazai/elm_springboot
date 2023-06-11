package com.elm.controller;

import com.elm.pojo.BusinessInfo;
import com.elm.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/businessInfo")
public class BusinessInfoController {
    @Autowired
    BusinessInfoService businessInfoService;

    @PostMapping("/addBusinessInfo")
    @ResponseBody
    public ResponseEntity<Object> addBusinessInfo(@RequestBody BusinessInfo businessInfo){
        boolean isSuccess = businessInfoService.addBusinessInfo(businessInfo);
        if(isSuccess){
            return new ResponseEntity<>("添加成功", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("添加失败", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAllBusinessInfo")
    @ResponseBody
    public List<BusinessInfo> getAllBusinessInfo(){
        return businessInfoService.getAllBusinessInfo();
    }

    @DeleteMapping("/deleteBusiness")
    @ResponseBody
    public ResponseEntity<Object> deleteBusiness(@RequestParam("businessId") Integer businessId){
        boolean isSuccess = businessInfoService.deleteBusiness(businessId);
        if(isSuccess){
            return new ResponseEntity<>("删除成功", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("删除失败", HttpStatus.BAD_REQUEST);
        }
    }

}
