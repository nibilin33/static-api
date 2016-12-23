package com.demo.controller;

import com.demo.server.UserService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.demo.mapper.*;

import javax.annotation.Resource;
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


}
