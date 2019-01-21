package com.internousdev.ecsite2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	private String a;
	private String b;
	private String c;
	public Map<String,Object> session;
	private String errorMessage;
	
	public String execute(){
		String result=SUCCESS;
		if(!(a.equals(""))
			&& !(b.equals(""))
			&& !(c.equals(""))){
				session.put("a",a);
				session.put("b",b);
				session.put("c",c);
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
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
	public String getErrorMessege(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
}
