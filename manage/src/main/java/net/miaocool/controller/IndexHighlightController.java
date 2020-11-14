package net.miaocool.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
public class IndexHighlightController {
  @Autowired
  private IndexHighLightService service;

  @GetMapping("/highLight")
  public Resp getAll(HttpServletRequest req, IndexHighlight indexHighlight) {
    IPage<IndexHighlight> page = PagerUtil.parse(req, IndexHighlight.class);
    QueryWrapper<IndexHighlight> qw = new QueryWrapper<>();
    qw.orderByAsc("sort");
    qw.setEntity(indexHighlight);
    Object ret;
    if(null == page){
      ret = service.list(qw);
    }else{
      ret = service.page(page, qw);
    }
    return Resp.ok(ret);
  }

  @GetMapping("/highLight/{id}")
  public Resp getOne(@PathVariable("id") int id) {
    IndexHighlight one = service.getById(id);
    return Resp.ok(one);
  }

  @PostMapping("/highLight")
  public Resp add(@RequestBody IndexHighlight highlight) {
    boolean save = service.save(highlight);
    return Resp.ok(save);
  }

  @PutMapping("/highLight")
  public Resp update(@RequestBody IndexHighlight highlight) {
    UpdateWrapper<IndexHighlight> uw = new UpdateWrapper<>();
    service.updateById(highlight);
    return Resp.ok();
  }

  @DeleteMapping("/highLight")
  public Resp delete(HttpServletRequest req) {
    Object id = req.getAttribute("id");
    return Resp.ok();
  }
}
