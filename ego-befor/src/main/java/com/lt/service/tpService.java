package com.lt.service;

import java.util.List;

import com.lt.pojo.tp;

public interface tpService {
	//��ȡ���е�ͼƬ
	public List<tp> getAll();
	
	//���ͼƬ
	public int addTp(tp t);
}
