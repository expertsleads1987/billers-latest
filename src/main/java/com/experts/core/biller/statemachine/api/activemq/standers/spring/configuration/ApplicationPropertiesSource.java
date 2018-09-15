package com.experts.core.biller.statemachine.api.activemq.standers.spring.configuration;

public interface ApplicationPropertiesSource {
	String getJdbcConnectionDatabaseName();
	String getJdbcConnectionPassword();
	int getJdbcConnectionPortNumber();
	String getJdbcConnectionServerName();
	String getJdbcConnectionUrl();
	String getJdbcConnectionUserName();
	String getJdbcDataSourceClassName();
	String getJmsBrokerPassword();
	String getJmsBrokerUrl();
	String getJmsBrokerUserName();
}
