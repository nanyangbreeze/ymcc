package cn.guoche.ymcc.service.impl;

import cn.guoche.ymcc.domain.Employee;
import cn.guoche.ymcc.mapper.EmployeeMapper;
import cn.guoche.ymcc.service.IEmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whale
 * @since 2026-01-08
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
