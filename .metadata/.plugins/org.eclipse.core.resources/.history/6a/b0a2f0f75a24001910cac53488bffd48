package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminItemDAO;
import com.internousdev.ecsite.dto.MCategoryDTO;
import com.internousdev.ecsite.dto.MPlaceDTO;
import com.internousdev.ecsite.dto.ProductInfoDTO;
import com.internousdev.ecsite.util.CommonUtility;
import com.internousdev.ecsite.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;

	public Map<String, Object> session;

	public String execute() throws Exception{
		CommonUtility.checkLoginAdmin(session);

		// 削除ボタンを押した商品のidをsessionに格納（削除確認画面で表示するため）
		AdminItemDAO dao = new AdminItemDAO();
		ProductInfoDTO dto = dao.selectById(id);
		session.put("deleteProductDTO", dto);

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);
		loader.executeAdmin(session);

		// カテゴリIDが一致しているものを探す
		MCategoryDTO category = null;
		@SuppressWarnings("unchecked")
		List<MCategoryDTO> categoryList = (List<MCategoryDTO>) session.get("mAdminCategoryDtoList");
		for (int i = 0; i < categoryList.size(); i++) {
			MCategoryDTO m = categoryList.get(i);
			if (dto.getCategoryId() == m.getCategoryId()) {
				category = m;
				break;
			}
		}
		session.put("deleteProductDTOCategory", category.getCategoryName());

		// 場所IDが一致しているものを探す
		MPlaceDTO place = null;
		@SuppressWarnings("unchecked")
		List<MPlaceDTO> placeList = (List<MPlaceDTO>) session.get("mAdminPlaceDtoList");
		for (int i = 0; i < placeList.size(); i++) {
			MPlaceDTO m = placeList.get(i);
			if (dto.getPlaceId() == m.getPlaceId()) {
				place = m;
				break;
			}
		}

		session.put("deleteProductDTOPlace", place.getPlaceName());

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}