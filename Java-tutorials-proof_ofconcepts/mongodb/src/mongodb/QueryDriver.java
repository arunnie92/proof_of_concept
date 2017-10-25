package mongodb;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class QueryDriver {

	public static void main(String[] args) throws UnknownHostException {
		DB dB = (new MongoClient("localhost", 27017)).getDB("tutorial");
		DBCollection dBCollection = dB.getCollection("Channel");
		BasicDBObject basicDBObject = new BasicDBObject();
		DBCursor dbCursor = dBCollection.find(basicDBObject);
		while (dbCursor.hasNext()) System.out.println(dbCursor.next());
	}

}
