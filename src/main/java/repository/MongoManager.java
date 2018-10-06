package repository;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoManager {
	DB db = null;
	
	public DB initDB() {
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return db = mongo.getDB("testdb");
	}

	public DBCollection chotKQ(){
		return initDB().getCollection("chotkq");
	}
	
	public DBCollection ketqua(){
		return initDB().getCollection("ketqua");
	}
	
	public DBCollection caudep(){
		return initDB().getCollection("caudep");
	}
}
