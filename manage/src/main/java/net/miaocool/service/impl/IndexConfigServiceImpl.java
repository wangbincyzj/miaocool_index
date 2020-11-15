package net.miaocool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexConfig;
import net.miaocool.entity.IndexConfigEnum;
import net.miaocool.mapper.IndexConfigMapper;
import net.miaocool.service.IndexConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexConfigServiceImpl extends ServiceImpl<IndexConfigMapper, IndexConfig> implements IndexConfigService {

  @Autowired
  private IndexConfigMapper indexConfigMapper;



  @Override
  public Object getConfig(String tag) {
    IndexConfig indexConfig = new IndexConfig();
    indexConfig.setTag(tag);
    return indexConfigMapper.selectList(new QueryWrapper<IndexConfig>().eq("tag", indexConfig.getTag()));
  }

  public int addConfig(IndexConfig item) {
    return indexConfigMapper.insert(item);
  }

  @Override
  public int setConfig(IndexConfig item) {
    UpdateWrapper<IndexConfig> uw = new UpdateWrapper<>();
    uw.eq("tag", item.getTag());
    return indexConfigMapper.update(item, uw);
  }
}
