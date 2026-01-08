package cn.guoche.ymcc.service.impl;

import cn.guoche.ymcc.domain.Config;
import cn.guoche.ymcc.mapper.ConfigMapper;
import cn.guoche.ymcc.service.IConfigService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 参数配置表 服务实现类
 * </p>
 *
 * @author whale
 * @since 2026-01-08
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
