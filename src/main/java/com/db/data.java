package com.db;

import java.util.List; 

import javax.faces.bean.ManagedBean;

import com.time.Mysql;
import com.time.Table;

@ManagedBean(name="data",eager=true)
public class data {
	List<Table> list;
	
	public List<Table> getList(){
		try {
			  Mysql m = new Mysql();
			  list=m.readdata();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public void setList(List<Table> list) {
		this.list=list;
	}

}
