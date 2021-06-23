package com.cognixia.training.CollaberaWorkshopJune2021.common;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class MongoExample {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost" , 27017 );
		
		MongoIterable<String> dbs = mongoClient.listDatabaseNames();
		
		for (String string : dbs) {
			System.out.println(string);
		}
		MongoDatabase db = mongoClient.getDatabase("Employee1");
		
		MongoCollection<Document> collection = db.getCollection("personalinfo");
		
		System.out.println(collection.countDocuments());
	
		System.out.println(collection.find().first().toString());
		
		FindIterable<Document> documents = collection.find();
		
		Iterator it = documents.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
