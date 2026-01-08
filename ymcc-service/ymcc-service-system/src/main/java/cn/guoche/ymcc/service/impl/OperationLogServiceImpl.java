package cn.guoche.ymcc.service.impl;

import cn.guoche.ymcc.domain.OperationLog;
import cn.guoche.ymcc.mapper.OperationLogMapper;
import cn.guoche.ymcc.service.IOperationLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author whale
 * @since 2026-01-08
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
