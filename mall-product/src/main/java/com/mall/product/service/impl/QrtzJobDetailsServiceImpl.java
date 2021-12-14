package com.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.QrtzJobDetailsDao;
import com.mall.product.entity.QrtzJobDetailsEntity;
import com.mall.product.service.QrtzJobDetailsService;


@Service("qrtzJobDetailsService")
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsDao, QrtzJobDetailsEntity> implements QrtzJobDetailsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzJobDetailsEntity> page = this.page(
                new Query<QrtzJobDetailsEntity>().getPage(params),
                new QueryWrapper<QrtzJobDetailsEntity>()
        );

        return new PageUtils(page);
    }

}