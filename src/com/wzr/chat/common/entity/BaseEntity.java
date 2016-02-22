package com.wzr.chat.common.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;

public class BaseEntity {
	
	 private static final long serialVersionUID = 1L;

	    /** id */
	    private Long id;


	    @JSONField (format="yyyyMMddHHmmss")
	    private Date create_time;

	    @JSONField (format="yyyyMMddHHmmss")
	    private Date last_modify_time;


	    public Date getLast_modify_time() {
	        return last_modify_time;
	    }

	    public void setLast_modify_time(Date last_modify_time) {
	        this.last_modify_time = last_modify_time;
	    }

	    public BaseDomain(){
	        super();
	        this.create_time = new Date();

	        this.last_modify_time = this.create_time;

	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    
	    public Date getCreate_time() {
	        return create_time;
	    }
	    
	    public void setCreate_time(Date create_time) {
	        this.create_time = create_time;
	    }

	    @Override
	    public String toString() {
	        return ToStringBuilder.reflectionToString(this);
	    }

}
