package cn.xy.shop.weixin.dao;

import java.util.List;
import java.util.Map;

import cn.xy.shop.weixin.entity.AccessToken;

public interface AccessTokenMapper {
	
	int update(Map<String,Object> map);
	
	List<AccessToken> select(AccessToken accessToken); 
}
