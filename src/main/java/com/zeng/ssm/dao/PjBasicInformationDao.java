package com.zeng.ssm.dao;

import com.zeng.ssm.model.PjBasicInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PjBasicInformationDao {
    List<PjBasicInformation> selectByBasicId(Integer pk);


}
