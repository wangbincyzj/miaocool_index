package net.miaocool.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexConfig;
import net.miaocool.entity.Resp;
import net.miaocool.service.IndexConfigService;
import net.miaocool.service.impl.IndexConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexConfigController extends BaseController<IndexConfig> {

  public IndexConfigController(IndexConfigServiceImpl service) {
    super(service);
  }


  @Override
  @PutMapping("/configs")
  public Resp update(@RequestBody List<IndexConfig> t) {
    return super.update(t);
  }


  @Override
  @PutMapping("/config")
  public Resp update(@RequestBody IndexConfig indexConfig) {
    return super.update(indexConfig, "tag");
  }

  @Override
  @GetMapping("/config")
  public Resp getAll(HttpServletRequest request, IndexConfig indexConfig) {
    return super.getAll(request, indexConfig);
  }


}
