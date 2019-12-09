package com.neuedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.bean.Items;

@Controller
public class ItemController {

	@RequestMapping("finditems.do")
	public ModelAndView findItems(){
		ModelAndView mv = new ModelAndView();
		List<Items> list = new ArrayList<Items>();
		list.add(new Items("娃哈哈",12,"真好","2018"));
		list.add(new Items("laj",12,"真好","2018"));
		list.add(new Items("sd",12,"真好","2018"));
		//将数据封装到mv对象中
		mv.addObject("itemslist",list);
		//设置视图名 show.jsp
		mv.setViewName("show.jsp");
		
		return mv;
	}
	
}
