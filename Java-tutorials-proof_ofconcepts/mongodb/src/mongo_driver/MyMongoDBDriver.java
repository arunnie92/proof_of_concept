package mongo_driver;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MyMongoDBDriver {

	private DB database;
	
	public MyMongoDBDriver() {
		try {
			this.setDatabase((new MongoClient("localhost", 27017))
							.getDB("4date"));
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
	
	public boolean insert() {
		DBCollection table = getCollection();
		BasicDBObject document = new BasicDBObject();
		document.put("name", "arunn");
		table.insert(document);
		return true;
	}
	
	public void delete() {}
	public void update() {}
	public void findFour() {}
	public void find() {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	private DB getDatabase() {
		return database;
	}


	private void setDatabase(DB database) {
		this.database = database;
	}
	
	private DBCollection getCollection() {
		return database.getCollection("user");
	}
}
