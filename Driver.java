/**
 * This class demonstrates the usage of the NutritionInfo class, including its constructors and methods, 
 * using tomato and chicken as example food items. 
 * It prints both the health report and the nutrition label for each item.
 * @author Matias Alex Gamero Gora 
*/
public class Driver {
	
	/**
	 * Default constructor for Driver class.
	 */
	public Driver() {
	    // Nothing needed here, it's just for documentation purposes.
	}
	
	/**
	 * The main method creates two NutritionInfo objects representing 
	 * tomato and chicken, and displays their health reports and nutrition labels.
	 *
	 * @param args command-line arguments (not used in this application)
	 */
	public static void main(String[] args) {
		
		NutritionInfo tomato = new NutritionInfo(
			100, // Serving Size 
			"g", // Serving Unit 
			20,  // Calories
			0.2, // Fat (g)
			0.0, // Saturates (g) 
			0.0, // Trans (g) 
			0.1, // Polyunsaturates (g)
			4,   // Carbohydrate (g)
			3,   // Sugars (g) 
			1,   // Fiber (g) 
			1,   // Protein (g) 
			0,   // Cholesterol (mg) 
			5,   // Sodium (mg) 
			225, // Potassium (mg) 
			18,  // Calcium (mg) 
			0.5, // Iron (mg) 
			0.042, // Vitamin A (mg)
			14,  // Vitamin C (mg) 
			0.037 // Thiamine (mg) 
			);
		
		System.out.println("Tomato On The Vine Red: \n");
		System.out.println(tomato.printHealthReport());
		System.out.println(tomato.printLabel());
		
		NutritionInfo chicken = new NutritionInfo(
				113, // Serving Size 
				"g", // Serving Unit 
				130,  // Calories 
				2, // Fat (g) 
				0.5, // Saturates (g) 
				0.0, // Trans (g) 
				0.4, // Polyunsaturates (g) 
				0,   // Carbohydrate (g) 
				0,   // Sugars (g) 
				0,   // Fiber (g) 
				26,   // Protein (g) 
				65,   // Cholesterol (mg) 
				65,   // Sodium (mg) 
				300, // Potassium (mg) 
				12,  // Calcium (mg) 
				0.81, // Iron (mg) 
				0.007, // Vitamin A (mg) 
				1.3,  // Vitamin C (mg) 
				0.094 // Thiamine (mg) 
				);
			
			System.out.println("Chicken Breast Boneless Skinless Club Pack: \n");
			System.out.println(chicken.printHealthReport());
			System.out.println(chicken.printLabel());
	}

}
