package com.internousdev.ecsite2.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String a;
	private String b;
	private String c;
	private Map<String,Object> session;
	
	public String execute() throws SQLException{
		ItemCreateCompleteDAO itemCreateCompleteDAO=new ItemCreateCompleteDAO();
		itemCreateCompleteDAO.createItem(session.get("a").toString(),
				session.get("b").toString(),
				session.get("c").toString());
		String result=SUCCESS;
		
		return result;
	}
	
	public String getA(){
		return a;
	}
	
	public void setA(String a){
		this.a=a;
	}
	
	public String getB(){
		return b;
	}
	
	public void setB(String b){
		this.b=b;
	}
	
	public String getC(){
		return c;
	}
	
	public void setC(String c){
		this.c=c;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
