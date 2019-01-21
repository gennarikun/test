package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemListDAO;
import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		ItemListDAO itemListDAO=new ItemListDAO();
		ItemInfoDTO itemInfoList=new ItemInfoDTO();
		
		
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();
			ItemInfoDTO itemInfoDTO = itemListDAO.getItemListUserInfo(item_transaction_id,user_master_id);
			
			session.put("buyItem_name",itemInfoDTO.getItemName());
			session.put("total_price",itemInfoDTO.getTotalPrice());
			session.put("total_count",itemInfoDTO.getTotalStock());
			session.put("total_payment",itemInfoDTO.getPayment());
			session.put("message","");
			
		}else if(deleteFlg.equals("1")){
				delete();
			}
		result=SUCCESS;
		return result;
	}
	public void delete() throws SQLException{
		
		ItemListDAO itemListDAO = new ItemListDAO();
		
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();
		
		int res=itemListDAO.buyItemHistoryDelete(item_transaction_id,user_master_id);
		if(res>0){
			session.put("message","商品情報を正しく削除しました。");
		}else if(res==0){
			session.put("message","商品情報の削除に失敗しました。");
		}
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}