package com.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.QrtzLocksDao;
import com.mall.product.entity.QrtzLocksEntity;
import com.mall.product.service.QrtzLocksService;


@Service("qrtzLocksService")
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksDao, QrtzLocksEntity> implements QrtzLocksService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzLocksEntity> page = this.page(
                new Query<QrtzLocksEntity>().getPage(params),
                new QueryWrapper<QrtzLocksEntity>()
        );

        return new PageUtils(page);
    }

}