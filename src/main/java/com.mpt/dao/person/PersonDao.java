package com.mpt.dao.person;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.mpt.dao.annotation.MyBatisDao;
import com.mpt.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

@MyBatisDao
public interface PersonDao extends BaseMapper<Person> {

    public Person findPersonById(Integer id);

    public void insertPerson();



    @Insert("insert into person values (5,'pancho11111','tian','tianjing','china')")
    public void savePerson();
}
