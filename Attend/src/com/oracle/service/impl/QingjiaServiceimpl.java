package com.oracle.service.impl;

import java.util.List;
import java.util.Vector;

import com.oracle.dao.QingjiaDao;
import com.oracle.dao.impl.QingjiaDaoimpl;
import com.oracle.model.Qingjia;
import com.oracle.service.QingjiaService;

public class QingjiaServiceimpl implements QingjiaService {
	QingjiaDao dao=new QingjiaDaoimpl();
	@Override
	public List<Vector> selectAllQingjia(Qingjia qingj, int ID) {
		// TODO Auto-generated method stub
		return dao.selectAllQingjia(qingj,ID);
	}
	@Override
	public List<Vector> selectAllQingjias(Qingjia qingj) {
		// TODO Auto-generated method stub
		return dao.selectAllQingjias(qingj);
	}
	@Override
	public int deleteQingjia(String qd) {
		// TODO Auto-generated method stub
		return dao.deleteQingjia(qd);
	}
	@Override
	public int updataChuchai(Qingjia qingj) {
		// TODO Auto-generated method stub
		return dao.updataChuchai(qingj);
	}
	@Override
	public int adddate(Qingjia qingjia) {
		// TODO Auto-generated method stub
		return dao.adddate(qingjia);
	}

}
