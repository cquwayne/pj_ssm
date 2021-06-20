package com.zeng.ssm.controller;

import com.zeng.ssm.dao.BasicInformationDao;
import com.zeng.ssm.model.BasicInformation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/basic")
public class BasicInformationController {

    @Resource
    BasicInformationDao basicInformationDao;

    @RequestMapping(value = "selectOne/{pk}",method = RequestMethod.GET)
    public List<BasicInformation> selectByBasicId(@PathVariable Integer pk){
        return this.basicInformationDao.selectByBasicId(pk);
    }

}
