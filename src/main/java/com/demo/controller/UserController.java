package com.demo.controller;

import com.demo.server.UserService;
import org.bson.types.ObjectId;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.demo.mapper.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yl1346 on 2016/12/23.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    @Resource
    private UserService udao;
    @RequestMapping(value="/test.form")
    public ModelAndView test() throws Exception{
      ModelAndView mv=new ModelAndView();
        mv.setViewName("user");
        List<User> total=udao.query();
        mv.addObject("total",total);
        return mv;
    }
    @RequestMapping(value="/{objid}.form")
    public ModelAndView del(@PathVariable String objid){
        udao.delete(new ObjectId(objid));
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user");
        List<User> total=udao.query();
        mv.addObject("total",total);
        return mv;
    }
    @RequestMapping(value="/add.form")
    public ModelAndView add(HttpServletRequest re){
        ModelAndView mv=new ModelAndView();
      String name=re.getParameter("name");
        String password=re.getParameter("password");
        int age=Integer.parseInt(re.getParameter("age"));
        User u=new User();
        u.setAge(age);
        u.setName(name);
        u.setPassword(password);
        udao.insert(u);
        mv.setViewName("user");
        List<User> total=udao.query();
        mv.addObject("total",total);
        return mv;
    }


}
