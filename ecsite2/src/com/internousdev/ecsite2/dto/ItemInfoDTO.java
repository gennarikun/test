package com.internousdev.ecsite2.dto;

public class ItemInfoDTO {
	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String insert_date;
	
	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	
	public String getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice=totalPrice;
	}
	
	public String getTotalCount(){
		return this.totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount=totalCount;
	}
	
	
	public String getInsert_date(){
		return this.insert_date;
	}
	
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
