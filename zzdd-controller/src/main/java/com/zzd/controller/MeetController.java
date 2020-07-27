package com.zzd.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzd.bean.Meet;
import com.zzd.service.MeetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class MeetController {
    @Resource
    private MeetService meetService;
    @RequestMapping("list")
    public String list(Model model, @RequestParam(value = "cpage",defaultValue = "1")Integer cpage){

        PageHelper.startPage(cpage,3);
        List list = meetService.list();
        PageInfo pi = new PageInfo(list);
        model.addAttribute("list",list);
        model.addAttribute("pi",pi);
        return "list";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("add")
    public String add(Meet meet){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:mm");
        String format = dateFormat.format(date);
        meet.setCreate_time(format);
        meetService.add(meet);
        return "redirect:list";
    }
    @RequestMapping("selectType")
    @ResponseBody
    public Object selectType(){
        List list = meetService.selectType();
        return list;
    }
    @RequestMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id){
        Map map = meetService.selectOne(id);
        return map;
    }
    @RequestMapping("toupd")
    public String toupd(){
        return "update";
    }
    @RequestMapping("update")
    public String update(Meet meet){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:mm");
        String format = dateFormat.format(date);
        meet.setCreate_time(format);
        meetService.update(meet);
        return "redirect:list";
    }
}
