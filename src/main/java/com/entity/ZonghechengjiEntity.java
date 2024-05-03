package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 综合成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 16:14:23
 */
@TableName("zonghechengji")
public class ZonghechengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghechengjiEntity() {
		
	}
	
	public ZonghechengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 学业成绩
	 */
					
	private Float xueyechengji;
	
	/**
	 * 德育成绩
	 */
					
	private Float deyuchengji;
	
	/**
	 * 体育素质
	 */
					
	private Float tiyusuzhi;
	
	/**
	 * 智育素质
	 */
					
	private Float zhiyusuzhi;
	
	/**
	 * 总分
	 */
					
	private Float zongfen;
	
	/**
	 * 学年
	 */
					
	private String xuenian;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：学业成绩
	 */
	public void setXueyechengji(Float xueyechengji) {
		this.xueyechengji = xueyechengji;
	}
	/**
	 * 获取：学业成绩
	 */
	public Float getXueyechengji() {
		return xueyechengji;
	}
	/**
	 * 设置：德育成绩
	 */
	public void setDeyuchengji(Float deyuchengji) {
		this.deyuchengji = deyuchengji;
	}
	/**
	 * 获取：德育成绩
	 */
	public Float getDeyuchengji() {
		return deyuchengji;
	}
	/**
	 * 设置：体育素质
	 */
	public void setTiyusuzhi(Float tiyusuzhi) {
		this.tiyusuzhi = tiyusuzhi;
	}
	/**
	 * 获取：体育素质
	 */
	public Float getTiyusuzhi() {
		return tiyusuzhi;
	}
	/**
	 * 设置：智育素质
	 */
	public void setZhiyusuzhi(Float zhiyusuzhi) {
		this.zhiyusuzhi = zhiyusuzhi;
	}
	/**
	 * 获取：智育素质
	 */
	public Float getZhiyusuzhi() {
		return zhiyusuzhi;
	}
	/**
	 * 设置：总分
	 */
	public void setZongfen(Float zongfen) {
		this.zongfen = zongfen;
	}
	/**
	 * 获取：总分
	 */
	public Float getZongfen() {
		return zongfen;
	}
	/**
	 * 设置：学年
	 */
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
