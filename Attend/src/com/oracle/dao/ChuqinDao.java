package com.oracle.dao;

import java.util.List;
import java.util.Vector;

import com.oracle.model.Chuqin;

public interface ChuqinDao {

	List<Vector> selectAllChuqin(Chuqin chuq,int ID);

	List<Vector> selectAllQueqin(Chuqin chuq,int ID);

	List<Vector> selectAllChuqins(Chuqin chuq);

	int deleteChuqin(String wd);

	int updataChuqin(Chuqin chuq);

	int adddate(Chuqin chuqin);

	List<Vector> selectAllQueqins(Chuqin chuq);

}
