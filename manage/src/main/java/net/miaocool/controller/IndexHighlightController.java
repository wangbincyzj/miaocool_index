package net.miaocool.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexHighlight;
import net.miaocool.entity.Resp;
import net.miaocool.service.IndexHighLightService;
import net.miaocool.utils.PagerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexHighlightController extends BaseController<IndexHighlight> {

  public IndexHighlightController(ServiceImpl<? extends BaseMapper<IndexHighlight>, IndexHighlight> service) {
    super(service);
  }

  @Override
  @GetMapping("/highlight")
  public Resp getAll(HttpServletRequest request, IndexHighlight indexHighlight) {
    return super.getAll(request, indexHighlight);
  }

  @Override
  @GetMapping("/highlight/{id}")
  public Resp getOne(@PathVariable int id) {
    return super.getOne(id);
  }

  @Override
  @PostMapping("/highlight")
  public Resp insert(@RequestBody IndexHighlight indexHighlight) {
    return super.insert(indexHighlight);
  }

  @Override
  @PutMapping("/highlight")
  public Resp update(@RequestBody IndexHighlight indexHighlight) {
    return super.update(indexHighlight);
  }

  @Override
  @DeleteMapping("/highlight")
  public Resp delete(HttpServletRequest req) {
    return super.delete(req);
  }
}
