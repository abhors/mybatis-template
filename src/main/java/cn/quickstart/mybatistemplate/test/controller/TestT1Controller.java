package cn.quickstart.mybatistemplate.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.quickstart.mybatistemplate.test.entity.TestT1;
import cn.quickstart.mybatistemplate.test.service.TestT1Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * ai入参(TestT1)表控制层
 *
 * @author makejava
 * @since 2023-04-23 09:34:39
 */
@RestController
@RequestMapping("testT1")
public class TestT1Controller extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TestT1Service testT1Service;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param testT1 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TestT1> page, TestT1 testT1) {
        return success(this.testT1Service.page(page, new QueryWrapper<>(testT1)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.testT1Service.getById(id));
    }

    /**
     * 新增数据
     *
     * @param testT1 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TestT1 testT1) {
        return success(this.testT1Service.save(testT1));
    }

    /**
     * 修改数据
     *
     * @param testT1 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TestT1 testT1) {
        return success(this.testT1Service.updateById(testT1));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.testT1Service.removeByIds(idList));
    }
}

