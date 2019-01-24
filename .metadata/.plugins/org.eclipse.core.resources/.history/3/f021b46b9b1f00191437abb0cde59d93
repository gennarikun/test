package com.internousdev.ecsite2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class ItemCreateCompleteDAO {
	private DateUtil dateUtil=new DateUtil();
	
	private String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock,insert_date)VALUES(?,?,?,?)";
		
	public void createItem(String a,String b,String c) throws SQLException{
		
		DBConnector dbConnector=new DBConnector();
		
		Connection connection=dbConnector.getConnection();
		
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, a);
			preparedStatement.setString(2, b);
			preparedStatement.setString(3, c);
			preparedStatement.setString(4, dateUtil.getDate());
			
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
