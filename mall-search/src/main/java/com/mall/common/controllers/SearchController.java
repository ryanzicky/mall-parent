package com.mall.common.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhourui
 * @Date 2021/12/13 22:42
 */
@RestController
@RequestMapping("/es")
public class SearchController {

    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
