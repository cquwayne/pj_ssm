package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractModel;
import com.zeng.ssm.dao.PjBasicInformationDao;
import com.zeng.ssm.model.PjBasicInformation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/basic")
public class PjBasicInformationController {


    @Resource
    PjBasicInformationDao pjBasicInformationDao;


    @RequestMapping(value = "selectOne/{pk}",method = RequestMethod.GET)
    public AbstractModel selectByPrimaryKey(@PathVariable Integer pk){
        PjBasicInformation abs = (PjBasicInformation)this.pjBasicInformationDao.selectByPrimaryKey(pk);




        return abs;
    }

}
