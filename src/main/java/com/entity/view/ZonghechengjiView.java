package com.entity.view;

import com.entity.ZonghechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 16:14:23
 */
@TableName("zonghechengji")
public class ZonghechengjiView  extends ZonghechengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghechengjiView(){
	}
 
 	public ZonghechengjiView(ZonghechengjiEntity zonghechengjiEntity){
 	try {
			BeanUtils.copyProperties(this, zonghechengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
