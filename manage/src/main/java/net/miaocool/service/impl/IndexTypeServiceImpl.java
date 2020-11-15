package net.miaocool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexType;
import net.miaocool.mapper.IndexTypeMapper;
import net.miaocool.service.IndexTypeService;
import org.springframework.stereotype.Service;

@Service
public class IndexTypeServiceImpl extends ServiceImpl<IndexTypeMapper, IndexType> implements IndexTypeService {
}
