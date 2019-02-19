package cn.xy.shop.yq.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xy.shop.yq.dao.FreightDao;
import cn.xy.shop.yq.entity.Freight;


@Service
public class FreightService {
@Autowired
FreightDao freightDao ;
	public int insert(Map<String,Object> map){
		return freightDao.insert(map);
	}
	
	public int update(Map<String,Object> map){
		return freightDao.update(map);
	}
	
	public List<Freight> list(Freight freight){
		return freightDao.list(freight);
	}
	
}
