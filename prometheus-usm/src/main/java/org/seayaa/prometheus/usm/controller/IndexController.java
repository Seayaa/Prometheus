package org.seayaa.prometheus.usm.controller;

import org.seayaa.prometheus.common.feign.PrometheusAdminService;
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
    private PrometheusAdminService prometheusAdminService;

    @GetMapping("/ping")
    public String ping() {
        return "ping usm success";
    }

    @GetMapping("/callAdmin")
    public String callAdmin() {
        return prometheusAdminService.ping();
    }
}
