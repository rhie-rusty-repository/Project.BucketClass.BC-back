package com.pap.bucketclass.support;

import java.util.Set;

import com.pap.bucketclass.entity.Role;

public class Utils {
	public static Boolean containRoleByName(Set<Role> roles, String name) {
        return null != roles.stream().filter(role -> name.equals(role.getRoleName())).findAny().orElse(null);
    }
	
	public static Role findByRoleByName(Set<Role> roles, String name) {
		return roles.stream().filter(role -> name.equals(role.getRoleName())).findAny().orElse(null);
	}
}