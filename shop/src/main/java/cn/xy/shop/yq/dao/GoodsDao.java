package cn.xy.shop.yq.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.yq.entity.Goods;


public interface GoodsDao {
	public int insert(Map<String,Object> map);
	
	public int update(Map<String,Object> map);
	
	public int upstatus(Map<String,Object> map);
	
	public int upisrec(Map<String,Object> map);
	
	public List<Goods> list(Goods goods); 
	
	public int count(Goods goods); 
	
	public List<Goods> listById(Goods goods); 
}
