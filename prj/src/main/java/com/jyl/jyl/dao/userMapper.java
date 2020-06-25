package com.jyl.jyl.dao;
import org.apache.ibatis.annotations.Param;

import com.jyl.jyl.domain.User;

public interface userMapper {
	public User fun(@Param("id")int id) throws Exception;
}
