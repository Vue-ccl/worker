package com.oracle.service.impl;

import java.util.List;
import java.util.Vector;

import com.oracle.dao.JiabanDao;
import com.oracle.dao.impl.JiabanDaoimpl;
import com.oracle.model.Jiaban;
import com.oracle.service.JiabanService;

public class JiabanServiceimpl implements JiabanService {
	JiabanDao dao=new JiabanDaoimpl();
	@Override
	public List<Vector> selectAllJiaban(Jiaban jiab, int ID) {
		// TODO Auto-generated method stub
		return dao.selectAllJiaban(jiab,ID);
	}
	@Override
	public List<Vector> selectAllJiabans(Jiaban jiab) {
		// TODO Auto-generated method stub
		return dao.selectAllJiabans(jiab);
	}
	@Override
	public int deleteJiaban(String jd) {
		// TODO Auto-generated method stub
		return dao.deleteJiaban(jd);
	}
	@Override
	public int updataJiaban(Jiaban jiab) {
		// TODO Auto-generated method stub
		return dao.updataJiaban(jiab);
	}
	@Override
	public int adddate(Jiaban jiaban) {
		// TODO Auto-generated method stub
		return dao.adddate(jiaban);
	}

}
