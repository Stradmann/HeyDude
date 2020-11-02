package controller;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.eq;

import dao.UserDAO;
import modules.User;

public class Controller {

	public static MongoDatabase init() {
		
		MongoClientURI connectionString = new MongoClientURI("mongodb+srv://Stranger:12345@exercicecluster.3ykjx.mongodb.net/test");
		
		MongoClient mongoClient = new MongoClient(connectionString);
		
		MongoDatabase uniUsersDatabase = mongoClient.getDatabase("WalesUniversity");
		
		return uniUsersDatabase;
	}
	
	public static UserDAO setSource(MongoDatabase database) {
		
		UserDAO userDAO = new UserDAO();
		userDAO.setDataSource(database);
		
		return userDAO;
	}
	
	public static void add(UserDAO userDAO, User user) {
		
		userDAO.saveUser(user);		
	}
	
	public static void printUser(MongoDatabase uniUsersDatabase) {
		
		MongoCollection<Document> usersCollection = uniUsersDatabase.getCollection("Users");
		
		//Document tofind = new Document();
		String username = "userName";
		Document tofind = usersCollection.find(eq("username", "")).first();
	}
}
