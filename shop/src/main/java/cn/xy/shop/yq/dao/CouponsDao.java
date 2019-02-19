package cn.xy.shop.yq.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.yq.entity.Coupons;


public interface CouponsDao {
	
	public int insert(Map<String,Object> map);
	
	public int update(Map<String,Object> map);
	
	public int upstatus(Map<String, Object> map);
	
	public int delete(Map<String,Object> map);
	
	public List<Coupons> list(Coupons coupons); 
	
	public List<Coupons> listAll(Coupons coupons); 
	
	public int count(Coupons coupons); 
	
	public List<Coupons> listByCode(Coupons coupons);
	
	public List<Coupons> listById(Coupons coupons); 
}
