package repository;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoManager {

	public DBCollection initMongoDB(){
		DB db = null;
		try {
			MongoClient mongo = new MongoClient("localhost", 27017);
			db = mongo.getDB("testdb");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return db.getCollection("kqxs");
	}
	
	
}
