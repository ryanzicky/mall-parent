package com.mall.mallproduct;

import com.mall.product.entity.QrtzLocksEntity;
import com.mall.product.service.QrtzLocksService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    QrtzLocksService qrtzLocksService;

    @Test
    void contextLoads() {
        QrtzLocksEntity qrtzLocksEntity = new QrtzLocksEntity();
        qrtzLocksEntity.setLockName("lockName");
        boolean save = qrtzLocksService.save(qrtzLocksEntity);
        log.info("save = {}", save);
        Assert.assertFalse(save);
    }

}
