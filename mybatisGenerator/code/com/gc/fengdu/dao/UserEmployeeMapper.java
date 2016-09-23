package com.gc.fengdu.dao;

import com.gc.fengdu.dao.model.UserEmployee;
import com.gc.fengdu.dao.model.UserEmployeeCriteria;
import com.gc.frame.core.base.CoreDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEmployeeMapper extends CoreDao {
    int countByExample(UserEmployeeCriteria example);

    int deleteByExample(UserEmployeeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserEmployee record);

    int insertSelective(UserEmployee record);

    List<UserEmployee> selectByExample(UserEmployeeCriteria example);

    UserEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserEmployee record, @Param("example") UserEmployeeCriteria example);

    int updateByExample(@Param("record") UserEmployee record, @Param("example") UserEmployeeCriteria example);

    int updateByPrimaryKeySelective(UserEmployee record);

    int updateByPrimaryKey(UserEmployee record);
}