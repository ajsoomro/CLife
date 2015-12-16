package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;


public interface CheckoutBasedRESTfulServices extends RESTfulBaseService {
	
	@GET
	@Path(Constants.GET_CHECKOUT_PROFILE+"/@self/checkoutProfile")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCheckoutProfile();

}
