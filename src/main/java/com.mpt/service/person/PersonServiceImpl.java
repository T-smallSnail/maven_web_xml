package com.mpt.service.person;

import com.mpt.dao.person.PersonDao;
import com.mpt.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：pancho
 * @date ：Created in 2019/7/4 16:37
 * @description :
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonDao personDao;

    @Transactional(readOnly = false)
    @Override
    public void getPerson() {

        Person personById = personDao.findPersonById(1);

        personById.setAddress("信阳市");
        System.out.println(personById.getAddress());

//        personDao.insertPerson();

//        personDao.savePerson();

    }
}
