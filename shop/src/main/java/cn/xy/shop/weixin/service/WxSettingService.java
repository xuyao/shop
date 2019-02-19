package cn.xy.shop.weixin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import cn.xy.shop.weixin.dao.WxSettingMapper;
import cn.xy.shop.weixin.entity.WxSetting;
@Service
@Transactional
public class WxSettingService {
	@Autowired
	private WxSettingMapper wxSettingMapper ;

	public  WxSetting selectByPrimaryKey(Integer id){
		return wxSettingMapper.selectByPrimaryKey(id);
	}

	public    int updateByPrimaryKeySelective(WxSetting record){
		int rs = 0;
		try {
			rs = wxSettingMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			rs = -1;
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return rs;
	}
	
	
}
