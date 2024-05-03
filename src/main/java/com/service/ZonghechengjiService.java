package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghechengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghechengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghechengjiView;


/**
 * 综合成绩
 *
 * @author 
 * @email 
 * @date 2022-04-16 16:14:23
 */
public interface ZonghechengjiService extends IService<ZonghechengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghechengjiVO> selectListVO(Wrapper<ZonghechengjiEntity> wrapper);
   	
   	ZonghechengjiVO selectVO(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
   	
   	List<ZonghechengjiView> selectListView(Wrapper<ZonghechengjiEntity> wrapper);
   	
   	ZonghechengjiView selectView(@Param("ew") Wrapper<ZonghechengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghechengjiEntity> wrapper);
   	

}

