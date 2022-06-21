package com.oracle.service;

import java.util.List;
import java.util.Vector;

import com.oracle.model.adminuser;

public interface adminuserService {
	adminuser login(String username);

	boolean validateUserName(String username);

	int register(adminuser admin);

	List<Vector> selectAlladminuser(adminuser admin);

	int deleteWorkers(String id);

	int updataWorkers(adminuser adminuser);

	int updatePwd(String password, String user_name);
}
