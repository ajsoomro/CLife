package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckoutViewJSON extends BaseConverterDTO{
		
	private String userId;
	private String resourceId;
	private String resourceName;
	
	
	public String getUserId() {
		return userId;
	}
	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}
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