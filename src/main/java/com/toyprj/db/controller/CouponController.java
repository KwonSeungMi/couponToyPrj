package com.toyprj.db.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.toyprj.db.dto.Coupon;
import com.toyprj.db.service.CouponService;
 
@Controller
public class CouponController {
 
    @Autowired
    CouponService couponService;
    
    @RequestMapping("/query")
    public @ResponseBody List<Coupon> query() throws Exception{
    	List<Coupon> listCoupon = couponService.getAll();
    	for(int i=0;i<listCoupon.size();i++) {
    		System.out.println(listCoupon.get(i).getCoupon_id() + ", " + listCoupon.get(i).getCoupon_no() + ", " +listCoupon.get(i).getEmail());
    	}
       return listCoupon;
    }
 
}
