package com.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.QrtzFiredTriggersDao;
import com.mall.product.entity.QrtzFiredTriggersEntity;
import com.mall.product.service.QrtzFiredTriggersService;


@Service("qrtzFiredTriggersService")
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersDao, QrtzFiredTriggersEntity> implements QrtzFiredTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzFiredTriggersEntity> page = this.page(
                new Query<QrtzFiredTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzFiredTriggersEntity>()
        );

        return new PageUtils(page);
    }

}