/*package com.time;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="su",eager = true)
public class Takeinput {
	String sub1;
	String fac1;
	String sub2;
	String fac2;
	String sub3;
	String fac3;
	String sub4;
	String fac4;
	Connection connection;
	public String getSub1() {
		return sub1;
	}
	public String getFac1() {
		return fac1;
	}
	public String getSub2() {
		return sub2;
	}
	public String getFac2() {
		return fac2;
	}
	public String getSub3() {
		return sub3;
	}
	public String getFac3() {
		return fac3;
	}
	public String getSub4() {
		return sub4;
	}
	public String getFac4() {
		return fac4;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public void setFac1(String fac1) {
		this.fac1 = fac1;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public void setFac2(String fac2) {
		this.fac2 = fac2;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	public void setFac3(String fac3) {
		this.fac3 = fac3;
	}
	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}
	public void setFac4(String fac4) {
		this.fac4 = fac4;
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
	
	
	public String save() {
		int result = 0;
		try {
			connection = getConnection();
			PreparedStatement stmt = connection.prepareStatement("insert into users(name,email,password,gender,address) values(?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, password);
			stmt.setString(4, gender);
			stmt.setString(5, address);
			result = stmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (result != 0)
			return "index.xhtml?faces-redirect=true";
		else
			return "create.xhtml?faces-redirect=true";
	}
	

}
*/
