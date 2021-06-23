package com.cognixia.training.CollaberaWorkshopJune2021.common;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDocumentReaderExample {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		
		MongoDatabase database = mongoClient.getDatabase("Employee1");
		
		MongoCollection<Document> collection = database.getCollection("personalinfo");
		
		MongoCursor<Document> cursor = collection.find().iterator();
		
		while(cursor.hasNext()) {
			Document d = cursor.next();
			System.out.println(d);
			String firstname = (String) d.get("firstname");
			System.out.println(firstname);
		}
	}
	
	

}
