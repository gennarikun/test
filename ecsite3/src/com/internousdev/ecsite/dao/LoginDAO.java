package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId,String loginpassword){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO dto=new LoginDTO();
		String sql="SELECT*FROM login_user_transaction where login_id=? AND login_pass=?";
		try{
			PreparedStatement ps=con.preparedStatement(sql);
		}
	}
}
