package net.miaocool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.miaocool.entity.IndexCase;
import net.miaocool.mapper.IndexCaseMapper;
import net.miaocool.service.IndexCaseService;
import org.springframework.stereotype.Service;

@Service
public class IndexCaseServiceImpl extends ServiceImpl<IndexCaseMapper, IndexCase> implements IndexCaseService {
}
