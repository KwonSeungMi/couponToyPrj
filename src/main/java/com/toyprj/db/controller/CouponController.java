package com.toyprj.db.controller;
 
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.toyprj.db.dto.Coupon;
import com.toyprj.db.service.CouponServiceImpl;

@RestController
@RequestMapping("/api")
public class CouponController {
 
    @Autowired
    CouponServiceImpl couponServiceImpl;
    
	/*
	 * @RequestMapping("/getAll") public @ResponseBody List<Coupon> getAll() throws
	 * Exception{ List<Coupon> listCoupon = couponServiceImpl.getAll(); for(int
	 * i=0;i<listCoupon.size();i++) {
	 * System.out.println(listCoupon.get(i).getCoupon_id() + ", " +
	 * listCoupon.get(i).getCoupon_no() + ", " +listCoupon.get(i).getEmail()); }
	 * return listCoupon; }
	 */
    
    @PostMapping("/getAll")
    public @ResponseBody List<Coupon> getAll(HttpServletRequest request) throws Exception{
    	List<Coupon> listCoupon = couponServiceImpl.getAll();
    	for(int i=0;i<listCoupon.size();i++) {
    		System.out.println(listCoupon.get(i).getCoupon_id() + ", " + listCoupon.get(i).getCoupon_no() + ", " +listCoupon.get(i).getEmail());
    	}
       return listCoupon;
    }
    
    @PostMapping("/ip")
	public ResponseEntity<String> ip (HttpServletRequest request) {
		// 요청을 보낸 클라이언트의 IP주소를 반환합니다.
		System.out.println("프론트 요청");
		return ResponseEntity.ok("백엔드 응답");
	}



}
