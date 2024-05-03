package com.dao;

import com.entity.ZonghechengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghechengjiVO;
import com.entity.view.ZonghechengjiView;


/**
 * 综合成绩
 * 
 * @author 
 * @email 
 * @date 2022-04-16 16:14:23
 */
public interface ZonghechengjiDao extends BaseMapper<ZonghechengjiEntity> {
	
	List<ZonghechengjiVO> selectListVO(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
	
	ZonghechengjiVO selectVO(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
	
	List<ZonghechengjiView> selectListView(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);

	List<ZonghechengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
	
	ZonghechengjiView selectView(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
	

}
