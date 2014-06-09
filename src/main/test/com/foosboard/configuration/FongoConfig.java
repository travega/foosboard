package com.foosboard.configuration;

import com.foursquare.fongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.foosboard.repository")
public class FongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "test";  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public Mongo mongo() throws Exception {
		return new Fongo("mongo-test").getMongo();
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception{
		return new MongoTemplate(mongo(), getDatabaseName());
	}
}
