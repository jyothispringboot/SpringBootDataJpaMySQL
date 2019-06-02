package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Insert details into Product table in mysql5.5 version
		repo.save(new Product(11,"B",4.4));
		repo.save(new Product(12,"e",3.4));
		repo.save(new Product(14,"A",6.4));
		repo.save(new Product(15,"C",8.4));
		
		//Update the details of product table in mysql 5.5 version
		repo.save(new Product(14,"Z",4.2));
		
		//insert details into product table in a bulk format at a time 
		List<Product> list=Arrays.asList(new Product(101,"bl",9.9),
				new Product(103,"c1",2.9),new Product(104,"d2",4.9),
				new Product(105,"e1",6.9));
		repo.saveAll(list);
		
		//Fetch one row from product table by using Optional class which is used to avoid null pointer exception
		Optional<Product> p =repo.findById(13);
		if(p.isPresent()) {
			Product prd=p.get();
			System.out.println(prd.getProdCode());
		}
			else {
				System.out.println("row not existed");
			
			  }
		
		//fetch all rows from product table
		List<Product> prds=repo.findAll();
		System.out.println("All row values-------"+prds);
		
		//delete a particular record from product table
		repo.deleteById(103);
		
	   //delete all records from product table
		//repo.deleteAll();
		//repo.deleteAllInBatch();
	}

}
