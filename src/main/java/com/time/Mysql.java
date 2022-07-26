package com.time;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Mysql {
	
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user="root";
	String pwd="1234";
	
	Connection con = null;
	PreparedStatement ps = null;
	public List<Table> readdata() throws Exception{
	    con = DriverManager.getConnection(url,user,pwd);
	    ps =con.prepareStatement("select * from time");
        ResultSet rs =ps.executeQuery();
        List<Table> L = new ArrayList<Table>();
	while(rs.next()) {
		Table t = new Table();
		t.setFir(rs.getString(1));
		t.setSec(rs.getString(2));
		t.setThi(rs.getString(3));
		t.setFou(rs.getString(4));
		t.setFiv(rs.getString(5));
		t.setDay(rs.getString(6));
		L.add(t);
	}
	
	con.close();
	return L;

}
	
}