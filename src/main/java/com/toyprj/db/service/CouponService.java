package com.toyprj.db.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.toyprj.db.dto.Coupon;

@Repository
public interface CouponService {
	
	  public List<Coupon> getAll() throws Exception;
	    
	    public int insertCoupon() throws Exception;
	/*
	 * private SqlSession session; private static String namespace =
	 * "com.toyprj.db.mapper.CouponMapper";
	 *
	*
	 * @Override public void insert(Coupon coupon) throws Exception{
	 * session.insert(namespace + ".insert",coupon); }
	 */
	

}
