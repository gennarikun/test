package com.internousdev.ecsite2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	private String itemName2;
	private String itemName3;
	private String itemName;
	public Map<String,Object> session;
	private String errorMessage;
	
	public String execute(){
		String result=SUCCESS;
		if(!(itemName2.equals(""))
			&& !(itemName3.equals(""))
			&& !(itemName.equals(""))){
				session.put("itemName2",itemName2);
				session.put("itemName3",itemName3);
				session.put("itemName",itemName);
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	
	public String getLoginPassword(){
		return loginPassword;
	}
	
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String getErrorMessege(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
}
