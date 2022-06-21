package com.oracle.service;

import java.util.List;
import java.util.Vector;

import com.oracle.model.Jiaban;

public interface JiabanService {

	List<Vector> selectAllJiaban(Jiaban jiab, int ID);

	List<Vector> selectAllJiabans(Jiaban jiab);

	int deleteJiaban(String jd);

	int updataJiaban(Jiaban jiab);

	int adddate(Jiaban jiaban);

}
