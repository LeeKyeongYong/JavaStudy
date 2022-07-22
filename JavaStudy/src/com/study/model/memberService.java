package com.study.model;

public abstract class memberService implements memberServiceImpl{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
}

interface memberServiceImpl{
	public void add();
	public void selectList();
	public void delete();
	public void update();
}
