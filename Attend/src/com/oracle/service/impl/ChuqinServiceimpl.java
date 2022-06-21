package com.oracle.service.impl;

import java.util.List;
import java.util.Vector;

import com.oracle.dao.ChuqinDao;
import com.oracle.dao.impl.ChuqinDaoimpl;
import com.oracle.model.Chuqin;
import com.oracle.service.ChuqinService;

public class ChuqinServiceimpl implements ChuqinService {
	ChuqinDao dao =new ChuqinDaoimpl();
	@Override
	public List<Vector> selectAllChuqin(Chuqin chuq,int ID) {
		// TODO Auto-generated method stub
		return dao.selectAllChuqin(chuq,ID);
	}
	@Override
	public List<Vector> selectAllQueqin(Chuqin chuq, int ID) {
		// TODO Auto-generated method stub
		return dao.selectAllQueqin(chuq,ID);
	}
	@Override
	public List<Vector> selectAllChuqins(Chuqin chuq) {
		// TODO Auto-generated method stub
		return dao.selectAllChuqins(chuq);
	}
	@Override
	public int deleteChuqin(String wd) {
		// TODO Auto-generated method stub
		return dao.deleteChuqin(wd);
	}
	@Override
	public int updataChuqin(Chuqin chuq) {
		// TODO Auto-generated method stub
		return dao.updataChuqin(chuq);
	}
	@Override
	public int adddate(Chuqin chuqin) {
		// TODO Auto-generated method stub
		return dao.adddate(chuqin);
	}
	@Override
	public List<Vector> selectAllQueqins(Chuqin chuq) {
		// TODO Auto-generated method stub
		return dao.selectAllQueqins(chuq);
	}

}
