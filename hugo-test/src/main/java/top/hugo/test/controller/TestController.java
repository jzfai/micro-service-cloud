package top.hugo.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hugo.common.core.domain.R;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录相关
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 登录方法
     */
    @GetMapping("test")
    public R<String> login() throws InterruptedException {
        Thread.sleep(10000);
        return  R.ok("test");
    }

}