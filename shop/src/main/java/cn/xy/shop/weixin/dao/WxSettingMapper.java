package cn.xy.shop.weixin.dao;

import cn.xy.shop.weixin.entity.WxSetting;

public interface WxSettingMapper {
	public  int deleteByPrimaryKey(Integer id);

	public  int insert(WxSetting record);

	public  int insertSelective(WxSetting record);

	public   WxSetting selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(WxSetting record);

	public  int updateByPrimaryKey(WxSetting record);
}