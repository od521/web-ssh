package com.odw.itedu.web.action;

import com.odw.itedu.model.User;
import com.odw.itedu.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user = new User();

    //action中使用service注意
    // 1.不需要在spring配置文件中给action注入service；struts2框架使用的自动装配策略是name，
    //      也就是说框架会去Spring中寻找与action属性名字相同的bean userService

    private IUserService userService;
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }


    public String register() {
        //1.获取请求参数
        System.out.println(user);

        //2.调用Service
        userService.register(user);

        //3.返回结果
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
