package com.oracle.service;

import java.util.List;
import java.util.Vector;

import com.oracle.model.Qingjia;

public interface QingjiaService {

	List<Vector> selectAllQingjia(Qingjia qingj, int ID);

	List<Vector> selectAllQingjias(Qingjia qingj);

	int deleteQingjia(String qd);

	int updataChuchai(Qingjia qingj);

	int adddate(Qingjia qingjia);

}
