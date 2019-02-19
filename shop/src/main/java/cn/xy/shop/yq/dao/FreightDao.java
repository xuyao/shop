package cn.xy.shop.yq.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.yq.entity.Freight;



public interface FreightDao {
	
	public int insert(Map<String,Object> map);
	
	public int update(Map<String,Object> map);
	
	public List<Freight> list(Freight freight); 
	
}
