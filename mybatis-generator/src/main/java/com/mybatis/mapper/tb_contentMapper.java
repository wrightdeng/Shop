package com.mybatis.mapper;

import com.transmateSchool.www.domain.tb_content;

public interface tb_contentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_content record);

    int insertSelective(tb_content record);

    tb_content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_content record);

    int updateByPrimaryKeyWithBLOBs(tb_content record);

    int updateByPrimaryKey(tb_content record);
}