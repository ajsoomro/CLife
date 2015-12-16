package com.rc.dto.wcs.v7.fep7;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;

public class PromotionCodeJSON extends BaseConverterDTO {

	private String resourceId;
	private String resourceName;
	
	
	public String getResourceId() {
		return resourceId;
	}
	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	@JsonProperty("resourceName")
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
}
