package com.br.campanha.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoRepositories("com.br.campanha.repository")
@Import(value = MongoAutoConfiguration.class)
public class MongoConfig extends AbstractMongoConfiguration {

	@Value("${spring.data.mongodb.host}")
	private String host;

	@Value("${spring.data.mongodb.database}")
	private String database;

	@Override
	protected String getDatabaseName() {
		return this.database;
	}

	@Override
	public Mongo mongo() {
		MongoClientURI uri = new MongoClientURI(this.host);

		return new MongoClient(uri);
	}

}
