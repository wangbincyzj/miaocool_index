package net.miaocool.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexType;
import net.miaocool.entity.Resp;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/index")
public class IndexTypeController extends BaseController<IndexType> {

  public IndexTypeController(ServiceImpl<? extends BaseMapper<IndexType>, IndexType> service) {
    super(service);
  }

  @Override
  @GetMapping("/type")
  public Resp getAll(HttpServletRequest request, IndexType indexType) {
    return super.getAll(request, indexType);
  }

  @Override
  @PostMapping("/type")
  public Resp insert(@RequestBody IndexType indexType) {
    return super.insert(indexType);
  }

  @Override
  @PutMapping("/type")
  public Resp update(@RequestBody IndexType indexType) {
    return super.update(indexType);
  }

  @Override
  @DeleteMapping("/type")
  public Resp delete(HttpServletRequest req) {
    return super.delete(req);
  }
}
