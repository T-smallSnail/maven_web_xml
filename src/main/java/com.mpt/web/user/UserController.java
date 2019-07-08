package com.mpt.web.user;

import com.mpt.component.SystemLogAspect;
import com.mpt.service.person.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mpt.web.annotion.Log;

@Controller
@RequestMapping("userController")
public class UserController {

	private  static  final Logger log = LoggerFactory.getLogger(SystemLogAspect. class);

	@Autowired
    PersonService personService;

    @RequestMapping("testAOP")
    @Log(operationType="add操作:",operationName="添加用户")  
    public String testAOP(String userName,String password){        
    	log.info("============添加用户操作，用户名:{}，密码{}",userName,password);
    	return "添加用户成功！";

    }


    @RequestMapping("/hello.htm")
    public String hello(String userName,String password){

        personService.getPerson();
        return "hello";

    }

}