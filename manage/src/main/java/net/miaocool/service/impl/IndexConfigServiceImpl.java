package net.miaocool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import net.miaocool.entity.IndexConfig;
import net.miaocool.entity.IndexConfigEnum;
import net.miaocool.mapper.IndexConfigMapper;
import net.miaocool.service.IndexConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexConfigServiceImpl implements IndexConfigService {

  @Autowired
  private IndexConfigMapper indexConfigMapper;

  @Override
  public void setHeaderBanner(String url) {
    updateConfig(IndexConfigEnum.CHAT_BANNER.getTag(), url);
  }

  @Override
  public void setServiceBanner(String url) {

  }

  @Override
  public void setChatBanner(String url) {

  }

  @Override
  public void updateHighLights(Object obj) {

  }

  private int updateConfig(String tag, String value) {
    IndexConfig indexConfig = new IndexConfig();
    indexConfig.setTag(tag);
    indexConfig.setValue(value);
    return indexConfigMapper.update(indexConfig, new UpdateWrapper<IndexConfig>().eq("tag", indexConfig.getTag()));
  }
}
