package com.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.product.entity.QrtzSimpropTriggersEntity;
import com.mall.product.service.QrtzSimpropTriggersService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 
 *
 * @author zhourui
 * @email zhourui@gmail.com
 * @date 2021-12-14 10:38:21
 */
@RestController
@RequestMapping("product/qrtzsimproptriggers")
public class QrtzSimpropTriggersController {
    @Autowired
    private QrtzSimpropTriggersService qrtzSimpropTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzSimpropTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzSimpropTriggersEntity qrtzSimpropTriggers = qrtzSimpropTriggersService.getById(schedName);

        return R.ok().put("qrtzSimpropTriggers", qrtzSimpropTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzSimpropTriggersEntity qrtzSimpropTriggers){
		qrtzSimpropTriggersService.save(qrtzSimpropTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzSimpropTriggersEntity qrtzSimpropTriggers){
		qrtzSimpropTriggersService.updateById(qrtzSimpropTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzSimpropTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
