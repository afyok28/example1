package com.example.ogun;

import java.util.Scanner;

import com.example.ogun.controller.ProductService;
import com.example.ogun.controller.ProductServiceImpl;
import com.example.ogun.controller.UserService;
import com.example.ogun.controller.UserServiceImpl;
import com.example.ogun.model.Product;
import com.example.ogun.model.User;

public class MainProje {
	static final ProductService productService = new ProductServiceImpl();
	static final UserService userService = new UserServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Scanner scanner = new Scanner(System.in);

		int menuId = 0;

		do {
			System.out.println("menu id:");

			menuId=scanner.nextInt();
			switch (menuId) {
			
			case 1:
				System.out.println("URUN EKLE:");
				productService.add(new Product(scanner.next()));// 0
				break;
			case 2:
				System.out.println("URUN List.........");
				productService.print();
				break;
			case 3:
				case3(scanner);
				break;
			case 4:
				System.out.println("user List.........");

				userService.print();
				break;
			case 5:
				System.out.print("min urun gir: ");
				System.out.println(userService.getMinMoney(scanner.nextInt()).toString());
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.err.println("1-6");
				break;
			}
		} while (menuId != 6);



	}

	private static void case3(  Scanner scanner ) {
		System.out.println("User add...");
		User user=new User();
		System.out.print ("phone number: ");
		user.setPhoneNumber(scanner.next());
		System.out.print ("money: ");
		user.setMoney(scanner.nextInt());
		System.out.print ("Fiyat verilcek ürün: ");
		user.setProductId(scanner.nextInt());
		userService.add(user);
	}
}
