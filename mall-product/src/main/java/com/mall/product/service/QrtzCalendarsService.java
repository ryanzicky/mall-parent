package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.QrtzCalendarsEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhourui
 * @email zhourui@gmail.com
 * @date 2021-12-14 10:16:16
 */
public interface QrtzCalendarsService extends IService<QrtzCalendarsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

