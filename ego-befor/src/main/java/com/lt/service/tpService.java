package com.lt.service;

import java.util.List;

import com.lt.pojo.tp;

public interface tpService {
	//获取所有的图片
	public List<tp> getAll();
	
	//添加图片
	public int addTp(tp t);
}
