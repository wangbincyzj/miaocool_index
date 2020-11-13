package net.miaocool.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.miaocool.entity.Resp;
import net.miaocool.service.IndexConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/indexConfig")
public class IndexConfigController {
  @Autowired
  private IndexConfigService service;

  @PostMapping("/setHeaderBanner")
  public Resp setIndexBanner(HttpServletRequest req) throws IOException {
    Object url = req.getAttribute("url");
    service.setHeaderBanner(url.toString());
    return Resp.ok();
  }

  @PostMapping("/setServiceBanner")
  public Resp setServiceBanner(HttpServletRequest req) throws IOException {
    Object url = req.getAttribute("url");
    service.setServiceBanner(url.toString());
    return Resp.ok();
  }

  @PostMapping("/setChatBanner")
  public Resp setChatBanner(HttpServletRequest req) throws IOException {
    Object url = req.getAttribute("url");
    service.setChatBanner(url.toString());
    return Resp.ok();
  }

}
