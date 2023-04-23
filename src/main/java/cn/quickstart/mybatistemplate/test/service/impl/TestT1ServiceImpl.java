package cn.quickstart.mybatistemplate.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.quickstart.mybatistemplate.test.dao.TestT1Dao;
import cn.quickstart.mybatistemplate.test.entity.TestT1;
import cn.quickstart.mybatistemplate.test.service.TestT1Service;
import org.springframework.stereotype.Service;

/**
 * ai入参(TestT1)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 09:34:39
 */
@Service("testT1Service")
public class TestT1ServiceImpl extends ServiceImpl<TestT1Dao, TestT1> implements TestT1Service {

}

