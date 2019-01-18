package com.internousdev.ecsite2.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String itemName2;
	private String itemName3;
	private String itemName;
	private Map<String,Object> session;
	
	public String execute() throws SQLException{
		UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();
		userCreateCompleteDAO.createUser(session.get("itemName2").toString(),
				session.get("itemName3").toString(),
				session.get("itemName").toString());
		String result=SUCCESS;
		
		return result;
	}
	
	public String getItemName2(){
		return itemName2;
	}
	
	public void setItemName2(String itemName2){
		this.itemName2=itemName2;
	}
	
	public String getItemName3(){
		return itemName3;
	}
	
	public void setItemName3(String itemName3){
		this.itemName3=itemName3;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setitemName(String itemName){
		this.itemName=itemName;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
