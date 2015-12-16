package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface PromotionBasedRESTfulServices extends RESTfulBaseService{
	
	@GET
	@Path(Constants.ASSIGN_PROMO_CODE+"/@self/assigned_promotion_code")
	@Produces(MediaType.APPLICATION_JSON)
	public String assignPromoCode();
}
