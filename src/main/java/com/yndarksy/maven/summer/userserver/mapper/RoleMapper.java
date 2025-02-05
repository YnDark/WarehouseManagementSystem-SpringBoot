package com.yndarksy.maven.summer.userserver.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yndarksy.maven.summer.userserver.dto.RolePermTree;
import com.yndarksy.maven.summer.userserver.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YDX
 * @since 2024-07-24
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    List<RolePermTree> selectRolePermTree(Map<String,Object> param);
}
