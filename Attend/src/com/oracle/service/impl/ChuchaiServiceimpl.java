package com.oracle.service.impl;

import java.util.List;
import java.util.Vector;

import com.oracle.dao.ChuchaiDao;
import com.oracle.dao.impl.ChuchaiDaoimpl;
import com.oracle.model.Chuchai;
import com.oracle.service.ChuchaiService;

public class ChuchaiServiceimpl implements ChuchaiService {
	ChuchaiDao dao=new ChuchaiDaoimpl();

	@Override
	public List<Vector> selectAllChuchai(Chuchai chuc, int ID) {
		// TODO Auto-generated method stub
		return dao.selectAllChuchai(chuc,ID);
	}

	@Override
	public List<Vector> selectAllChuchais(Chuchai chuc) {
		// TODO Auto-generated method stub
		return dao.selectAllChuchais(chuc);
	}

	@Override
	public int deleteChuchai(String cd) {
		// TODO Auto-generated method stub
		return dao.deleteChuchai(cd);
	}

	@Override
	public int updataChuchai(Chuchai chuc) {
		// TODO Auto-generated method stub
		return dao.updataChuchai(chuc);
	}

	@Override
	public int adddate(Chuchai chuchai) {
		// TODO Auto-generated method stub
		return dao.adddate(chuchai);
	}

}
