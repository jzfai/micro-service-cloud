package top.hugo.test.dubbo;


import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import top.hugo.system.api.RemoteDataScopeService;

@RequiredArgsConstructor
@Service
@DubboService
public class RemoteTestService implements RemoteDataScopeService {

    @Override
    public String getRoleCustom(Long roleId) {
        return "i am Dubbo getRoleCustom";
    }

    @Override
    public String getDeptAndChild(Long deptId) {
        return "i am Dubbo getDeptAndChild";
    }
}
