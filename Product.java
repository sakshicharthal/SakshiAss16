/*Assignment 16*/

/*1. Design the Product class in which 
 * design void productCheck(int weight) in check 
 * whether weight is less than 100, then throw the
 *  ProductException  with a meaningful message. 
 */
public class Product {
	void productCheck(int weight) {
		if (weight <100) {
			throw new ProductException("Invalid Weight ,weight must be above 100,");
		}
	}

}
