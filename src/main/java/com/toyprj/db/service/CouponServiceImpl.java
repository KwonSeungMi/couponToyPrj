package com.toyprj.db.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.toyprj.db.dto.Coupon;
import com.toyprj.db.mapper.CouponMapper;
 
@Service
public class CouponServiceImpl {
 
    @Autowired
    CouponMapper couponMapper;
    
    public List<Coupon> getAll() throws Exception{
        return couponMapper.getAll();
    }
    
    public int insertCoupon() throws Exception{
    	return couponMapper.insertCoupon();
    }
    

}

