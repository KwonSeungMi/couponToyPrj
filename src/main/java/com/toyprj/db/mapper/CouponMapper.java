package com.toyprj.db.mapper;
 
import java.util.List;
 
import com.toyprj.db.dto.Coupon;
 
public interface CouponMapper {
 
    public List<Coupon> getAll() throws Exception;
    
}
