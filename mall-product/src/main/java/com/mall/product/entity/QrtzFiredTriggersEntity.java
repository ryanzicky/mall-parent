package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhourui
 * @email zhourui@gmail.com
 * @date 2021-12-14 10:16:16
 */
@Data
@TableName("QRTZ_FIRED_TRIGGERS")
public class QrtzFiredTriggersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String entryId;
	/**
	 * 
	 */
	private String triggerName;
	/**
	 * 
	 */
	private String triggerGroup;
	/**
	 * 
	 */
	private String instanceName;
	/**
	 * 
	 */
	private Long firedTime;
	/**
	 * 
	 */
	private Long schedTime;
	/**
	 * 
	 */
	private Integer priority;
	/**
	 * 
	 */
	private String state;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 
	 */
	private String jobGroup;
	/**
	 * 
	 */
	private String isNonconcurrent;
	/**
	 * 
	 */
	private String requestsRecovery;

}
