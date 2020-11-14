package net.miaocool.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexCase;
import net.miaocool.entity.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/index")
public class IndexCaseController extends BaseController<IndexCase> {

  @Autowired
  public IndexCaseController(ServiceImpl<? extends BaseMapper<IndexCase>, IndexCase> service) {
    super(service);
  }

  @Override
  @GetMapping("/case")
  public Resp getAll(HttpServletRequest request, IndexCase indexCase) {
    return super.getAll(request, indexCase);
  }

  @Override
  @GetMapping("/case/{id}")
  public Resp getOne(@PathVariable int id) {
    return super.getOne(id);
  }

  @Override
  @PutMapping("/case")
  public Resp update(@RequestBody IndexCase indexCase) {
    return super.update(indexCase);
  }

  @Override
  @DeleteMapping("/case")
  public Resp delete(HttpServletRequest req) {
    return super.delete(req);
  }
}
