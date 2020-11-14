package net.miaocool.filter;


import com.alibaba.fastjson.JSON;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

public class JsonFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
    RequestWrapper requestWrapper = new RequestWrapper(httpServletRequest);
    String contentType = requestWrapper.getHeader("Content-Type");
    if ("application/json".equals(contentType)) {
      Map<String, String> o = JSON.parseObject(requestWrapper.getInputStream(), Map.class);
      o.keySet().forEach(key -> {
        httpServletRequest.setAttribute(key, o.get(key));
      });
    }
    filterChain.doFilter(requestWrapper, httpServletResponse);
  }

  public static class RequestWrapper extends HttpServletRequestWrapper{
    private byte[] requestBody;

    public RequestWrapper(HttpServletRequest request) throws IOException {
      super(request);
      requestBody = StreamUtils.copyToByteArray(request.getInputStream());
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
      if (requestBody == null) {
        requestBody = new byte[0];
      }
      ByteArrayInputStream stream = new ByteArrayInputStream(requestBody);
      return new ServletInputStream() {
        @Override
        public boolean isFinished() {
          return false;
        }

        @Override
        public boolean isReady() {
          return false;
        }

        @Override
        public void setReadListener(ReadListener readListener) {

        }

        @Override
        public int read() throws IOException {
          return stream.read();
        }
      };
    }
  }

}

