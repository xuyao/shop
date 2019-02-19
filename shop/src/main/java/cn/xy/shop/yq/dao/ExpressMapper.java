package cn.xy.shop.yq.dao;

import java.util.List;

import cn.xy.shop.yq.entity.Express;

public interface ExpressMapper {
	
	
	int deleteByPrimaryKey(Integer express_id);

    int insert(Express record);

    List<Express> select(Express express);
    
    Express selectByPrimaryKey(Integer express_id);

    
    int updateByPrimaryKey(Express record);
}
