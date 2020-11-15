package net.miaocool.service;


import com.baomidou.mybatisplus.extension.service.IService;
import net.miaocool.entity.IndexConfig;

public interface IndexConfigService extends IService<IndexConfig> {
  int setConfig(IndexConfig config);

  Object getConfig(String tag);
}
