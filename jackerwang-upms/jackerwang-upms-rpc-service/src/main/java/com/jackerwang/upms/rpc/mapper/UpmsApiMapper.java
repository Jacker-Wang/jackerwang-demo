package com.jackerwang.upms.rpc.mapper;

import java.util.List;

import com.jackerwang.upms.dao.model.UpmsPermission;
import com.jackerwang.upms.dao.model.UpmsRole;

/**
 * 用户VOMapper Created by shujackerwang on 2017/01/07.
 */
public interface UpmsApiMapper {

    // 根据用户id获取所拥有的权限
    List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);

    // 根据用户id获取所属的角色
    List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);

}