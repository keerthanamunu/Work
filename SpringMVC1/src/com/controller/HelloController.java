package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Book;
import com.serviceBo.BookBO;

@Controller
public class HelloController 
{
	@Autowired
	BookBO bookBo;
	
	/*@RequestMapping("/greeting")
	public ModelAndView sayHello(){
		
		System.out.println("inside controller");
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("greet");
		obj.addObject("msg", "hi from spring controller");
		
		return obj;
		
	}*/
	
	@RequestMapping("/greeting")
	public ModelAndView BookList()
	{
		System.out.println("inside controller");
		
		ModelAndView obj = new ModelAndView();
		List<Book> lb= bookBo.getBookDetails();
		obj.setViewName("greet");
		obj.addObject("list", lb);
				
		return obj;
	
	}
}
