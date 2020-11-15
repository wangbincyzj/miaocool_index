package net.miaocool.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.Resp;
import net.miaocool.utils.PagerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@RestController
public abstract class BaseController<T> {
  public ServiceImpl<?extends BaseMapper<T>, T> service;

  public BaseController(ServiceImpl<? extends BaseMapper<T>, T> service) {
    this.service = service;
  }

  /**
   * 查询所有
   * 分页参数 page和size
   * @param t 查询实体类
   */
  public Resp getAll(HttpServletRequest request, T t) {
    return Resp.ok(getAllOrPage(request, t));
  }

  /**
   * 查询单个
   * 需要在继承类手动添加@PathVarible
   * @param id 路径参数
   */
  public Resp getOne(int id){
    return Resp.ok(service.getById(id));
  }


  /**
   * 增加
   * 需要在继承类手动添加@RequestBody
   * @param t vo
   */
  public Resp insert(T t){
    return Resp.ok(service.save(t));
  }


  /**
   * 更新
   * 需要在继承类手动添加@RequestBody
   * @param t 实体类,需要有id
   */
  public Resp update(T t) {
    return update(t, "id");
  }


  /**
   * 更新
   * 需要在继承类手动添加@RequestBody
   * @param uniKey 通过uniKey判断
   * @param t 实体类,需要有id
   */
   public Resp update(T t, String uniKey) {
    try {
      uniKey = uniKey.substring(0, 1).toUpperCase() + uniKey.substring(1);
      Method getKey = t.getClass().getMethod("get" + uniKey);
      Object col = getKey.invoke(t);
      if(null==col){
        return Resp.err(uniKey + "不能为空");
      }
      UpdateWrapper<T> uw = new UpdateWrapper<>();
      uw.eq(uniKey, col.toString());
      return Resp.ok(service.update(t, uw));
    }  catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      return Resp.err(e);
    }
  }

  /**
   * 更新多个
   * 该方法必须使用id
   */
  public Resp update(List<T> t) {
    return Resp.ok(service.updateBatchById(t));
  }


  /**
   * 删除单个
   * 路径id
   */
  public Resp delete(HttpServletRequest req){
    Object id = req.getAttribute("id");
    return Resp.ok(service.removeById(id.toString()));
  }




  private Object getAllOrPage(HttpServletRequest req, T t){
    QueryWrapper<T> qw = new QueryWrapper<>();
    qw.setEntity(t);
    IPage<T> iPage = (IPage<T>) PagerUtil.parse(req, t.getClass());
    if (iPage != null) {
      return service.page(iPage, qw);
    }else{
      return service.list(qw);
    }
  }
}
