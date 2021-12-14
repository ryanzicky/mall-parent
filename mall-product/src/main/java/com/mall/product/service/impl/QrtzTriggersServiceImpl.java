package com.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.QrtzTriggersDao;
import com.mall.product.entity.QrtzTriggersEntity;
import com.mall.product.service.QrtzTriggersService;


@Service("qrtzTriggersService")
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersDao, QrtzTriggersEntity> implements QrtzTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzTriggersEntity> page = this.page(
                new Query<QrtzTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzTriggersEntity>()
        );

        return new PageUtils(page);
    }

}