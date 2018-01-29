package cn.com.yeqiuchang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	private int id;
	
	@RequestMapping(value="/api/test")
	public ModelAndView send(ModelAndView mv) throws IOException{
		System.out.println("≤‚ ‘≥…π¶");
		mv.setViewName("test");
		mv.addObject("message","TEST IS OK");
		return mv;
	}
}
