package top.hugo.client.controller;


import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hugo.client.feign.TestFeign;
import top.hugo.common.core.domain.R;
import top.hugo.system.api.RemoteDataScopeService;

import javax.annotation.Resource;

@RestController
public class ClientController {

    @Resource
    private TestFeign testFeign;

    @DubboReference
    private RemoteDataScopeService remoteDataScopeService;

    @GetMapping("client")
    public R<String> test() throws InterruptedException {
        return testFeign.login();
    }

    @GetMapping("dubboTest")
    public String dubboTest() throws InterruptedException {
        return remoteDataScopeService.getDeptAndChild(111L);
    }
}
