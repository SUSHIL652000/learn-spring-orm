package com.lcwd.orm;

import com.lcwd.orm.entity.*;
import com.lcwd.orm.repositeries.CategoryRepo;
import com.lcwd.orm.repositeries.ProductRepo;
import com.lcwd.orm.repositeries.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserService userService;
	Logger logger= LoggerFactory.getLogger(LearnSpringOrmApplication.class);

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
//		User user=new User();
//		user.setName("Sushil");
//		user.setAge(23);
//		user.setCity("Agra");
//		User savedUser=userService.saveUser(user);
//		System.out.println(savedUser);
		// get all user
//		List<User> users=userService.getAllUser();
//		logger.info("Size of users {} ", users.size());
//		logger.info("Users : {} ",users);
//		User user=userService.get(2);
//		logger.info("user : {} ",user);
//		User user=new User();
//		user.setName("Arjun");
//		user.setAge(28);
//		user.setCity("Hastinapur");
//		User newUser=userService.updateUser(user,2);
//		logger.info("Updated user : {} ",newUser);
//		userService.deleteUser(2);
//		one to one mapping
//		Student student=new Student();
//		student.setStudentName("Rajeev Yadav");
//		student.setAbout("I'm software engineer");
//		student.setStudentId(11);
//		Laptop laptop=new Laptop();
//		laptop.setLaptopId(21);
//		laptop.setModelNo("12345");
//		laptop.setBrand("Lenova");
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//		Student student1=studentRepository.save(student);
//		logger.info("Saved Student {}",student1.getStudentName());

//		Optional<Student> byId = studentRepository.findById(11);
//		Student student=byId.get();
//		logger.info("Name is {}",student.getStudentName());
//		Laptop laptop = student.getLaptop();
//		logger.info("Laptop brand and model is {}, {}",laptop.getBrand(),laptop.getModelNo());

		// one to many
//		Student student=new Student();
//		student.setStudentName("Pradeep Yadav");
//		student.setAbout("I'm software engineer");
//		student.setStudentId(15);
//
//		Address address=new Address();
//		address.setAddressId(123);
//		address.setCity("Agra");
//		address.setCountry("Bharat");
//		address.setStreet("sushil nagar");
//		address.setStudent(student);
//
//		Address address1=new Address();
//		address1.setAddressId(124);
//		address1.setCity("Delhi");
//		address1.setCountry("Bharat");
//		address1.setStreet("Anand nagar");
//		address1.setStudent(student);
//		List<Address> addressList=new ArrayList<>();
//		addressList.add(address);
//		addressList.add(address1);
//		student.setAddresses(addressList);
//		Student student1=studentRepository.save(student);
//		logger.info("student has {} addresses",student1.getAddresses().size());
		Product product1=new Product();
		product1.setPId("pid1");
		product1.setProductName("Iphone15");
		Product product2=new Product();
		product2.setPId("pid2");
		product2.setProductName("Iphone16");
		Product product3=new Product();
		product3.setPId("pid3");
		product3.setProductName("Iphone17");
		Product product4=new Product();
		product4.setPId("pid4");
		product4.setProductName("Iphone18");

		Category category1=new Category();
		category1.setcId("cid1");
		category1.setTitle("Electronics");

		Category category2=new Category();
		category2.setcId("cid2");
		category2.setTitle("Mobile Phone");

       List<Product> category1products=category1.getProducts();
	   category1products.add(product1);
		category1products.add(product2);
		category1products.add(product3);

		List<Product> category2products=category2.getProducts();
		category2products.add(product1);
		category2products.add(product2);
		category2products.add(product4);
		categoryRepo.save(category1);
		categoryRepo.save(category2);

//		List<Product> allProductWhileLearningJPA = productRepo.getAllProductWhileLearningJPA();
//		allProductWhileLearningJPA.forEach(product -> System.out.println(product.getProductName()));
//
//		productRepo.getAllActiveProducts().forEach(product -> System.out.println(product.getProductName()));

	}
}
