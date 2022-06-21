package com.oracle.service;

import java.util.List;
import java.util.Vector;

import com.oracle.model.Chuchai;

public interface ChuchaiService {

	List<Vector> selectAllChuchai(Chuchai chuc, int ID);

	List<Vector> selectAllChuchais(Chuchai chuc);

	int deleteChuchai(String cd);

	int updataChuchai(Chuchai chuc);

	int adddate(Chuchai chuchai);

}
