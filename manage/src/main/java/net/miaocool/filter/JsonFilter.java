package net.miaocool.filter;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class JsonFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
    String contentType = httpServletRequest.getHeader("Content-Type");
    if(!"application/json".equals(contentType)){
      filterChain.doFilter(httpServletRequest, httpServletResponse);
    }else{
      Map<String, String> o = JSON.parseObject(httpServletRequest.getInputStream(), Map.class);
      o.keySet().forEach(key->{
        httpServletRequest.setAttribute(key, o.get(key));
      });
      filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
  }
}
