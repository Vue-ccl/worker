package com.oracle.service.impl;

import java.util.List;
import java.util.Vector;

import com.oracle.dao.adminuserDao;
import com.oracle.dao.impl.adminuserDaoimpl;
import com.oracle.model.adminuser;
import com.oracle.service.adminuserService;

public class adminuserServiceimpl implements adminuserService {

	adminuserDao dao=new adminuserDaoimpl();
	@Override
	public adminuser login(String username) {
		// TODO Auto-generated method stub
		return dao.login(username);
	}
	@Override
	public boolean validateUserName(String username) {
		// TODO Auto-generated method stub
		return dao.validateUserName(username);
	}
	@Override
	public int register(adminuser admins) {
		// TODO Auto-generated method stub
		return dao.register(admins);
	}
	@Override
	public List<Vector> selectAlladminuser(adminuser admin) {
		// TODO Auto-generated method stub
		return dao.selectAlladminuser(admin);
	}
	@Override
	public int deleteWorkers(String id) {
		// TODO Auto-generated method stub
		return dao.deleteWorkers(id);
	}
	@Override
	public int updataWorkers(adminuser adminuser) {
		// TODO Auto-generated method stub
		return dao.updataWorkers(adminuser);
	}
	@Override
	public int updatePwd(String password, String user_name) {
		// TODO Auto-generated method stub
		return dao.updatePwd(password,user_name);
	}

}
