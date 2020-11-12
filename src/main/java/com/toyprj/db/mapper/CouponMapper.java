package com.toyprj.db.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toyprj.db.dto.Coupon;

@Mapper
public interface CouponMapper {
 
    public List<Coupon> getAll() throws Exception;
    
    public int insertCoupon() throws Exception; 
    
	/* public int insert() throws Exception; */
    
}
