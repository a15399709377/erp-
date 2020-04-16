package com.lt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.mapper.tpMapper;
import com.lt.pojo.tp;
import com.lt.service.tpService;
@Service
public class tpServiceImpl implements tpService{

	@Autowired
	tpMapper mapper;
	@Override
	public List<tp> getAll() {
		// TODO Auto-generated method stub
		return  mapper.getAll();
	}

	@Override
	public int addTp(tp t) {
		// TODO Auto-generated method stub
		return mapper.addTp(t);
	}



}
