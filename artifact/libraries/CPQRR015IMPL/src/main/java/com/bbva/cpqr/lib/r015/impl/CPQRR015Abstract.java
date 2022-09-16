package com.bbva.cpqr.lib.r015.impl;

import com.bbva.cpqr.lib.r015.CPQRR015;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.elara.utility.api.connector.APIConnector;
import com.bbva.elara.utility.api.connector.APIConnectorBuilder;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class CPQRR015Abstract extends AbstractLibrary implements CPQRR015 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected APIConnector internalApiConnector;

	protected APIConnectorBuilder apiConnectorBuilder;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param internalApiConnector the this.internalApiConnector to set
	*/
	public void setInternalApiConnector(APIConnector internalApiConnector) {
		this.internalApiConnector = internalApiConnector;
	}

	/**
	* @param apiConnectorBuilder the this.apiConnectorBuilder to set
	*/
	public void setApiConnectorBuilder(APIConnectorBuilder apiConnectorBuilder) {
		this.apiConnectorBuilder = apiConnectorBuilder;
	}

}