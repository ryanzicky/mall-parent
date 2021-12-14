package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Blob;
import lombok.Data;

/**
 * 
 * 
 * @author zhourui
 * @email zhourui@gmail.com
 * @date 2021-12-14 10:16:16
 */
@Data
@TableName("QRTZ_CALENDARS")
public class QrtzCalendarsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String calendarName;
	/**
	 * 
	 */
	private Blob calendar;

}
