package com.foosboard.configuration;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created with IntelliJ IDEA.
 * User: skrymer
 * Date: 9/06/14
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableMongoRepositories
public class FongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "test";  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public Mongo mongo() throws Exception {
		return new Fongo("mongo-test").getMongo();
	}
}
