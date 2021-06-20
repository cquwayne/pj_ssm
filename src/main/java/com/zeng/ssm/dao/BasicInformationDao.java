package com.zeng.ssm.dao;

import com.zeng.ssm.model.BasicInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasicInformationDao {
    List<BasicInformation> selectByBasicId(Integer pk);
}
