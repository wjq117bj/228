/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.ljbd.tour.maldives.model;
import com.ljbd.common.support.BaseEntity;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;



import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.ljbd.tour.maldives.model.*;
import com.ljbd.tour.maldives.dao.*;
import com.ljbd.tour.maldives.service.*;
import com.ljbd.tour.maldives.model.query.*;


public class TourScenic extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourScenic";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_SCENIC_NAME = "景点名称";
	public static final String ALIAS_SCENIC_NAME_EN = "英文名称";
	public static final String ALIAS_ADDRESS = "详细地址";
	public static final String ALIAS_SERVICES_ITEMS = "服务项目";
	public static final String ALIAS_TOUR_HOTEL_ID = "酒店编号";
	public static final String ALIAS_HOTEL_NAME = "酒店名称";
	public static final String ALIAS_CREATE_DATE = "创建时间";
	public static final String ALIAS_CREATE_NAME = "创建人";
	public static final String ALIAS_UPDATE_DATE = "更改时间";
	public static final String ALIAS_UPDATE_NAME = "更改人";
	public static final String ALIAS_SYS_VERSION = "版本号";
	public static final String ALIAS_YN = "删除标识";
	
	//date formats
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_UPDATE_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 编号       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 景点名称       db_column: scenic_name 
     */	
	@Length(max=0)
	private java.lang.String scenicName;
    /**
     * 英文名称       db_column: scenic_name_en 
     */	
	@Length(max=0)
	private java.lang.String scenicNameEn;
    /**
     * 详细地址       db_column: address 
     */	
	@Length(max=0)
	private java.lang.String address;
    /**
     * 服务项目       db_column: services_items 
     */	
	@Length(max=0)
	private java.lang.String servicesItems;
    /**
     * 酒店编号       db_column: tour_hotel_id 
     */	
	
	private java.lang.Integer tourHotelId;
    /**
     * 酒店名称       db_column: hotel_name 
     */	
	@Length(max=0)
	private java.lang.String hotelName;
    /**
     * 创建时间       db_column: create_date 
     */	
	
	private java.util.Date createDate;
    /**
     * 创建人       db_column: create_name 
     */	
	@Length(max=0)
	private java.lang.String createName;
    /**
     * 更改时间       db_column: update_date 
     */	
	
	private java.util.Date updateDate;
    /**
     * 更改人       db_column: update_name 
     */	
	@Length(max=0)
	private java.lang.String updateName;
    /**
     * 版本号       db_column: sys_version 
     */	
	
	private java.lang.Integer sysVersion;
    /**
     * 删除标识       db_column: yn 
     */	
	@Max(127)
	private Integer yn;
	//columns END

	public TourScenic(){
	}

	public TourScenic(
		java.lang.Integer id
	){
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setScenicName(java.lang.String value) {
		this.scenicName = value;
	}
	
	public java.lang.String getScenicName() {
		return this.scenicName;
	}
	public void setScenicNameEn(java.lang.String value) {
		this.scenicNameEn = value;
	}
	
	public java.lang.String getScenicNameEn() {
		return this.scenicNameEn;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setServicesItems(java.lang.String value) {
		this.servicesItems = value;
	}
	
	public java.lang.String getServicesItems() {
		return this.servicesItems;
	}
	public void setTourHotelId(java.lang.Integer value) {
		this.tourHotelId = value;
	}
	
	public java.lang.Integer getTourHotelId() {
		return this.tourHotelId;
	}
	public void setHotelName(java.lang.String value) {
		this.hotelName = value;
	}
	
	public java.lang.String getHotelName() {
		return this.hotelName;
	}
	public String getCreateDateString() {
		return DateConvertUtils.format(getCreateDate(), FORMAT_CREATE_DATE);
	}
	public void setCreateDateString(String value) {
		setCreateDate(DateConvertUtils.parse(value, FORMAT_CREATE_DATE,java.util.Date.class));
	}
	
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateName(java.lang.String value) {
		this.createName = value;
	}
	
	public java.lang.String getCreateName() {
		return this.createName;
	}
	public String getUpdateDateString() {
		return DateConvertUtils.format(getUpdateDate(), FORMAT_UPDATE_DATE);
	}
	public void setUpdateDateString(String value) {
		setUpdateDate(DateConvertUtils.parse(value, FORMAT_UPDATE_DATE,java.util.Date.class));
	}
	
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateName(java.lang.String value) {
		this.updateName = value;
	}
	
	public java.lang.String getUpdateName() {
		return this.updateName;
	}
	public void setSysVersion(java.lang.Integer value) {
		this.sysVersion = value;
	}
	
	public java.lang.Integer getSysVersion() {
		return this.sysVersion;
	}
	public void setYn(Integer value) {
		this.yn = value;
	}
	
	public Integer getYn() {
		return this.yn;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ScenicName",getScenicName())
			.append("ScenicNameEn",getScenicNameEn())
			.append("Address",getAddress())
			.append("ServicesItems",getServicesItems())
			.append("TourHotelId",getTourHotelId())
			.append("HotelName",getHotelName())
			.append("CreateDate",getCreateDate())
			.append("CreateName",getCreateName())
			.append("UpdateDate",getUpdateDate())
			.append("UpdateName",getUpdateName())
			.append("SysVersion",getSysVersion())
			.append("Yn",getYn())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TourScenic == false) return false;
		if(this == obj) return true;
		TourScenic other = (TourScenic)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

