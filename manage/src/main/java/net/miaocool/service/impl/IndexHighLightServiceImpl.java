package net.miaocool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexHighlight;
import net.miaocool.mapper.IndexHighlightMapper;
import net.miaocool.service.IndexHighLightService;
import org.springframework.stereotype.Service;

@Service
public class IndexHighLightServiceImpl extends ServiceImpl<IndexHighlightMapper, IndexHighlight> implements IndexHighLightService {
}
