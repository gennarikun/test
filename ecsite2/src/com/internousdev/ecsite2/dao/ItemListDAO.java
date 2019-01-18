package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class ItemListDAO {

	
		public ItemInfoDTO getItemListUserInfo(String item_info_transaction,String login_user_transaction) throws SQLException{
			DBConnector dbConnector=new DBConnector();
			Connection connection=dbConnector.getConnection();
			ItemInfoDTO itemInfoDTO=new ItemInfoDTO();
			String sql="SELECT iit.item_name,ubit.total_price,ubit.total_count,ubit.insert_date, FROM user_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_info_transaction=iit.id WHERE ubit.item_info_transaction=? AND ubit.login_user_transaction=? ORDER BY ubit.insert_date DESC";
			try{
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				
				preparedStatement.setString(1,item_info_transaction);
				preparedStatement.setString(2,login_user_transaction);
				ResultSet resultSet=preparedStatement.executeQuery();
				
				if(resultSet.next()){
					itemInfoDTO.setItemName(resultSet.getString("item_name"));
					itemInfoDTO.setTotalPrice(resultSet.getString("total_price"));
					itemInfoDTO.setTotalCount(resultSet.getString("total_count"));
					itemInfoDTO.setInsert_date(resultSet.getString("insert_date"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemInfoDTO;
		}
		public int buyItemHistoryDelete(String item_info_transaction,String login_user_transaction) throws SQLException{
			DBConnector dbConnector=new DBConnector();
			Connection connection=dbConnector.getConnection();
			
			String sql="DELETE FROM user_item_transaction WHERE item_info_transaction=? AND login_user_transaction=?";
			PreparedStatement preparedStatement;
			int result=0;
			try{
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1,item_info_transaction);
				preparedStatement.setString(2,login_user_transaction);
				
				result=preparedStatement.executeUpdate();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return result;
		}
}
