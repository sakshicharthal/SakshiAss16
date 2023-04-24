import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	Product product =new Product();
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the product Weight >>");
	int productWeight =scanner.nextInt();
	try {
		product.productCheck(productWeight);
	}catch(ProductException a) {
		System.out.println(a);
	}
}
}
