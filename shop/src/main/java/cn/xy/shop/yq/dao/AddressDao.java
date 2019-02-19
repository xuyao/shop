package cn.xy.shop.yq.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.yq.entity.Address;


public interface AddressDao {

	public int insert(Map<String, Object> map);

	public int update(Map<String, Object> map);
	
	public int delete(Map<String, Object> map);
	
	public int sort(Map<String, Object> map);

	public List<Address> list(Address address);

	public List<Address> listById(Address address);
	
	public int count(Address address);

}
