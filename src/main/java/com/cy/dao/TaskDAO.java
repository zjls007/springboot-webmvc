package com.cy.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author zxj
 * @date 2018/3/1 13:54
 */
@Mapper
public interface TaskDAO {

    String getNum(Long id);

}
