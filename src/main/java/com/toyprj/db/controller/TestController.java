package com.toyprj.db.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.toyprj.db.dto.Test;
import com.toyprj.db.service.TestService;
 
@Controller
public class TestController {
 
    @Autowired
    TestService testService;
    
    @RequestMapping("/query")
    public @ResponseBody List<Test> query() throws Exception{
    	List<Test> listCoupon = testService.getAll();
    	for(int i=0;i<listCoupon.size();i++) {
    		System.out.println(listCoupon.get(i).getCoupon_id() + ", " + listCoupon.get(i).getCoupon_no() + ", " +listCoupon.get(i).getEmail());
    	}
       return listCoupon;
    }
 
}
