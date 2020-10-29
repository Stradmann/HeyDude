package dao;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import modules.User;

public class UserDAO {

	private MongoDatabase database;
	
	
	public void setDataSource(MongoDatabase database) {
		
		this.database = database;
	}
	
	public void saveUser(User user) {
		
		MongoCollection<Document> usersCollection = this.getUsersCollection();
		
		Document birthdayMongo = new Document("_id", new ObjectId());
		birthdayMongo.append("day", user.getBirthday().getDay()).append("month", user.getBirthday().getMonth()).append("year", user.getBirthday().getYear());
		
		Document userMongo = new Document("_id", new ObjectId());
		userMongo.append("name", user.getName()).append("lastName", user.getLastName()).append("birthday", birthdayMongo).append("username", user.getUserName()).append("password", user.getPassword());
		
		usersCollection.insertOne(userMongo);
	}
	
	public MongoCollection<Document> getUsersCollection(){
		
		MongoCollection<Document> usersCollection = database.getCollection("Users");
		
		return usersCollection;
	}
}
