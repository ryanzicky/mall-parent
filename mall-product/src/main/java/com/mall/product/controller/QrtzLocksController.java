package com.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.product.entity.QrtzLocksEntity;
import com.mall.product.service.QrtzLocksService;
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
@RequestMapping("product/qrtzlocks")
public class QrtzLocksController {
    @Autowired
    private QrtzLocksService qrtzLocksService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzLocksService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzLocksEntity qrtzLocks = qrtzLocksService.getById(schedName);

        return R.ok().put("qrtzLocks", qrtzLocks);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzLocksEntity qrtzLocks){
		qrtzLocksService.save(qrtzLocks);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzLocksEntity qrtzLocks){
		qrtzLocksService.updateById(qrtzLocks);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzLocksService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
