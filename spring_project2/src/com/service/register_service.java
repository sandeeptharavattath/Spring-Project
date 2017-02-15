package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbconnection.dbconnect;

import Registerbean.registerbean;

public class register_service extends dbconnect {
public int insertdata(registerbean reg)
{
	try
	{
		PreparedStatement ps=super.getconnections().prepareStatement("insert into tbl_reg(fname,lname,gender,dob,email,uname,password,file) values (?,?,?,?,?,?,?,?)");
	    ps.setString(1, reg.getFname());
	    ps.setString(2, reg.getLname());
	    ps.setString(3, reg.getGen());
	    ps.setString(4, reg.getDob());
	    ps.setString(5, reg.getEmail());
	    ps.setString(6, reg.getUname());
	    ps.setString(7, reg.getPswd());
	    ps.setString(8, reg.getFile());
	    boolean i=ps.execute();
	    if(i==true)
	    {
	    	return 1;
	    }
	    else {
			return 0;
		}
	}
	catch (SQLException e)
	{
		e.printStackTrace(); 
	}
	
	return 0;
	
}

}
