package cn.xy.shop.yq.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xy.shop.yq.dao.GoodsDao;
import cn.xy.shop.yq.entity.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	
	public int insert(Map<String,Object> map ){
		return goodsDao.insert(map);
	}
	
	public int update(Map<String,Object> map ){
		return goodsDao.update(map);
	}
	
	public int upstatus(Map<String,Object> map){
		return goodsDao.upstatus(map);
	}

	public int upisrec(Map<String,Object> map){
		return goodsDao.upisrec(map);
	}
	
	public List<Goods> list(Goods goods){
		return goodsDao.list(goods);
	}
	public int count(Goods goods){
		return goodsDao.count(goods);
	}
	
	public List<Goods> listById(Goods goods){
		return goodsDao.listById(goods);
	}
}
