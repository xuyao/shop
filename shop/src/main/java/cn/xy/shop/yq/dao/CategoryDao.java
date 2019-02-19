package cn.xy.shop.yq.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.yq.entity.Category;


public interface CategoryDao {
	public int insert(Map<String,Object> map);
	
	public int update(Map<String,Object> map);
	
	public int upstatus(Map<String,Object> map);
	
	public int sort(Map<String,Object> map);
	
	public List<Category> list(Category category); 
	
	public List<Category> listById(Category category); 
}
