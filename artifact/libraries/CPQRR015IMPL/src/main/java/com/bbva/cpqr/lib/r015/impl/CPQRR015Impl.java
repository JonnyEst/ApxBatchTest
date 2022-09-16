package com.bbva.cpqr.lib.r015.impl;

import com.bbva.apx.exception.business.BusinessException;
import com.bbva.cpqr.dto.datos.Banks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;

/**
 * The CPQRR015Impl class...
 */
public class CPQRR015Impl extends CPQRR015Abstract {

	private static final String LINK = "http://banks/v0/banks/{usersId}/listBanks";

	private static final Logger LOGGER = LoggerFactory.getLogger(CPQRR015Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public Banks execute(String cliente) {

		Banks banks = new Banks();

		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> headers = new HttpEntity<>(httpHeader);

		HashMap<String, Object> queryParams = new HashMap<>();
		queryParams.put("usersId", cliente);

		try {
			ResponseEntity<Banks> responseService =
					this.internalApiConnector.exchange(
							LINK,
							HttpMethod.GET,
							headers,
							Banks.class,
							queryParams);

			if (responseService != null) {
				//LOGGER.debug(LOGGER_STATUS_CODE, responseService.getStatusCode());
				LOGGER.debug("LOGGER_BODY_RESPONSE", responseService.getBody());
				banks = responseService.getBody();
			}
		} catch(RestClientException ex) {
			LOGGER.info("LOGGER_REST_CLIENT_EXCEPTION", ex.getMessage());
		} catch(BusinessException ex) {
			LOGGER.info("LOGGER_BUSINESS_EXCEPTION", ex.getMessage());
		}
		return  banks;
	}

}
