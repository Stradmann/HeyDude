package service;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connection {

	public static MongoClient createConnection() {
		
		MongoClientURI connectionString = new MongoClientURI("mongodb+srv://Stranger:12345@exercicecluster.3ykjx.mongodb.net/test");
		
		MongoClient mongoClient = new MongoClient(connectionString);
		
		return mongoClient;
	}
}
