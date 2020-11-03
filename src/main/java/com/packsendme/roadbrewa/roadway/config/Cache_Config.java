package com.packsendme.roadbrewa.roadway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cache_Config {

	@Value(value = "${redis.cache.roadwayBRE_SA}")
	public String roadwayBRE_SA;

	@Value(value = "${redis.cache.airwayBRE_SA}")
	public String airwayBRE_SA;

	@Value(value = "${redis.cache.maritimewayBRE_SA}")
	public String maritimewayBRE_SA;

	@Value(value = "${redis.cache.executeBRE_SA}")
	public String executeBRE_SA;

	@Value(value = "${redis.cache.tollsfuelBRE_SA}")
	public String tollsfuelBRE_SA;
	
	@Value(value = "${redis.cache.financeCostDeliveryBRE_SA}")
	public String financeCostDeliveryBRE_SA;
	
	@Value(value = "${redis.cache.truckBRE_SA}")
	public String truckBRE_SA;


}
