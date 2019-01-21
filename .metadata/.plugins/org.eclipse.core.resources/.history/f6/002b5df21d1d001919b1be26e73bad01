package com.internousdev.ecsite2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class ItemCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	
	private String sql="INSERT INTO item_info_transaction(item_name2,item_name3,item_name,insert_date)VALUES(?,?,?,?)";
	
	public void createItem(String itemName2,String itemName3,String itemName) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName2);
			preparedStatement.setString(2, itemName3);
			preparedStatement.setString(3, itemName);
			preparedStatement.setString(4, dateUtil.getDate());
			
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
