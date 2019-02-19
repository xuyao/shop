package cn.xy.shop.yq.dao;

import java.util.Map;

import cn.xy.shop.yq.entity.Admin;

public interface AdminDao {
	
	public Admin isExist(Map<String, Object> map);
	
	public int update(Map<String, Object> map);
	
	public String listById(Map<String, Object> map);
}
