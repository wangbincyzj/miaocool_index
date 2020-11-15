package net.miaocool.controller;


import net.miaocool.entity.IndexCase;
import net.miaocool.entity.Resp;
import net.miaocool.service.impl.IndexCaseServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/index")
public class IndexCaseController extends BaseController<IndexCase> {

  public IndexCaseController(IndexCaseServiceImpl service) {
    super(service);
  }

  @Override
  @GetMapping("/case")
  public Resp getAll(HttpServletRequest request, IndexCase indexCase) {
    return super.getAll(request, indexCase);
  }

  @Override
  @PostMapping("/case")
  public Resp insert(@RequestBody IndexCase indexCase) {
    return super.insert(indexCase);
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
