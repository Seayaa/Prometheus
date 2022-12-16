package org.seayaa.prometheus.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dongd
 * @date: 2022/12/16
 */
@RestController
public class IndexController {

    @GetMapping("ping")
    public String ping() {
        return "success";
    }
}
