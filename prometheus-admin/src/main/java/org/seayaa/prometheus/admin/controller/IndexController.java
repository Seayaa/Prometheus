package org.seayaa.prometheus.admin.controller;

import org.seayaa.prometheus.common.feign.PrometheusUsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dongd
 * @date: 2022/12/16
 */
@RestController
public class IndexController {

    @Autowired
    private PrometheusUsmService prometheusUsmService;

    @GetMapping("/ping")
    public String ping() {
        return "ping admin success";
    }

    @GetMapping("/callUsm")
    public String callUsm() {
        return prometheusUsmService.ping();
    }
}
