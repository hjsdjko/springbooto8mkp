package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZonghechengjiDao;
import com.entity.ZonghechengjiEntity;
import com.service.ZonghechengjiService;
import com.entity.vo.ZonghechengjiVO;
import com.entity.view.ZonghechengjiView;

@Service("zonghechengjiService")
public class ZonghechengjiServiceImpl extends ServiceImpl<ZonghechengjiDao, ZonghechengjiEntity> implements ZonghechengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghechengjiEntity> page = this.selectPage(
                new Query<ZonghechengjiEntity>(params).getPage(),
                new EntityWrapper<ZonghechengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghechengjiEntity> wrapper) {
		  Page<ZonghechengjiView> page =new Query<ZonghechengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghechengjiVO> selectListVO(Wrapper<ZonghechengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghechengjiVO selectVO(Wrapper<ZonghechengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghechengjiView> selectListView(Wrapper<ZonghechengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghechengjiView selectView(Wrapper<ZonghechengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
