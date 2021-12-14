package com.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.product.entity.QrtzTriggersEntity;
import com.mall.product.service.QrtzTriggersService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 
 *
 * @author zhourui
 * @email zhourui@gmail.com
 * @date 2021-12-14 10:38:20
 */
@RestController
@RequestMapping("product/qrtztriggers")
public class QrtzTriggersController {
    @Autowired
    private QrtzTriggersService qrtzTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzTriggersEntity qrtzTriggers = qrtzTriggersService.getById(schedName);

        return R.ok().put("qrtzTriggers", qrtzTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.save(qrtzTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.updateById(qrtzTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
