/**
 * The NutritionInfo class models the nutritional content of a food item.
 * It includes key macronutrients, vitamins, and minerals, etc. And provides methods for displaying health-related reports.
 * 
 * @author Matias Alex Gamero Gora
 */
public class NutritionInfo {
	
	private int servingSize;
	private String servingUnit;
	private int calories;
	private double fat;
	private double saturates;
	private double trans;
	private double polyunsaturates;
	private double carbohydrate; 
	private double sugars;
	private double fiber;
	private double protein;
	private double cholesterol;
	private double sodium;
	private double potassium;
	private double calcium;
	private double iron;
	private double vitaminA; 
	private double vitaminC;
	private double thiamine;
	
	/**
	 * Default constructor that initializes all nutritional values to zero or empty.
	 */
	public NutritionInfo(){
		this(0,"",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
	}
	
	/**
	 * Parameterized constructor that initializes all nutritional information fields.
	 *
	 * @param servingSize the quantity of the food item per serving
	 * @param servingUnit the unit of measurement (e.g., "g", "mL")
	 * @param calories the number of calories per serving
	 * @param fat the total fat in grams
	 * @param saturates saturated fat in grams
	 * @param trans trans fat in grams
	 * @param polyunsaturates polyunsaturated fat in grams
	 * @param carbohydrate total carbohydrates in grams
	 * @param sugars total sugars in grams
	 * @param fiber dietary fiber in grams
	 * @param protein protein in grams
	 * @param cholesterol cholesterol in milligrams
	 * @param sodium sodium in milligrams
	 * @param potassium potassium in milligrams
	 * @param calcium calcium in milligrams
	 * @param iron iron in milligrams
	 * @param vitaminA vitamin A in milligrams
	 * @param vitaminC vitamin C in milligrams
	 * @param thiamine thiamine (vitamin B1) in milligrams
	 */
	public NutritionInfo(int servingSize, String servingUnit, int calories, double fat, double saturates, double trans, 
			double polyunsaturates, double carbohydrate, double sugars, double fiber, double protein, double cholesterol, 
			double sodium, double potassium, double calcium, double iron, double vitaminA, double vitaminC, double thiamine){
		
		this.servingSize = servingSize;
		this.servingUnit = servingUnit;
		this.calories = calories;
		this.fat = fat;
		this.saturates = saturates;
		this.trans = trans;
		this.polyunsaturates = polyunsaturates;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fiber = fiber;
		this.protein = protein;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.potassium = potassium;
		this.calcium = calcium;
		this.iron = iron;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.thiamine = thiamine;
		
	}
	
	/**
	 * Calculates the percentage of total calories that come from fat.
	 * @return fat percentage of total calories
	 */
	public double computeFatPercentage() {
		return ((fat * 9)*100) / calories;
	}
	
	/**
	 * Calculates the percentage of total calories that come from carbohydrates.
	 * @return the percentage of calories from carbohydrates
	 */
	public double computeCarbohydratePercentage() {
		return ((carbohydrate * 4)*100) / calories;
	}
	
	/**
	 * Calculates the percentage of total calories that come from protein.
	 * @return the percentage of calories from protein
	 */
	public double computeProteinPercentage() {
		return ((protein * 4)*100) / calories;
	}
	
	/**
	 * Determines if the food is a good source of potassium.
	 * @return true if potassium content is 400 mg or more, otherwise return false
	 */
	public boolean computeIsSourcePotassium() {
		return potassium >= 400;
	}
	
	/**
	 * Determines if the food is a good source of calcium.
	 * @return true if calcium content is 100 mg or more, otherwise return false
	 */
	public boolean computeIsSourceCalcium() {
		return calcium >= 100;
	}
	
	/**
	 * Determines if the food is a good source of iron.
	 * @return true if iron content is 2 mg or more, otherwise return false
	 */
	public boolean computeIsSourceIron() {
		return iron >= 2;
	}
	
	/**
	 * Determines if the food is high in fiber.
	 * @return true if fiber content is 5 g or more, otherwise return false
	 */
	public boolean computeIsHighFiber() {
		return fiber >= 5;
	}
	
	/**
	 * Determines if the food is low in fat.
	 * @return true if less than 30% of total calories come from fat, otherwise return false
	 */
	public boolean computeIsLowFat() {
		return computeFatPercentage() < 30;
	}
	
	/**
	 * Determines if the food is trans free.
	 * @return true if trans is less than or equal to 0.2 g, otherwise return false
	 */
	public boolean computeIsTransFatFree() {
		return trans <= 0.2;
	}
	
	/**
	 * Generates a report summarizing whether the food item meets certain health criteria
	 * @return a formatted string with health information
	 */
	public String printHealthReport() {
		
	    StringBuilder report = new StringBuilder();
	    
	    report.append("Macronutrients:\n");
	    report.append(String.format("Fat: %.1f%%\n", computeFatPercentage()));
	    report.append(String.format("Carbohydrates: %.1f%%\n", computeCarbohydratePercentage()));
	    report.append(String.format("Protein: %.1f%%\n", computeProteinPercentage()));
	    
	    if (computeIsSourceIron()) {
	        report.append("This food is a good source of iron\n");
	    }
	    if (computeIsSourcePotassium()) {
	        report.append("This food is a good source of potassium\n");
	    }
	    if (computeIsSourceCalcium()) {
	        report.append("This food is a good source of calcium\n");
	    }
	    if (computeIsLowFat()) {
	        report.append("This food is a low fat food\n");
	    }
	    if (computeIsTransFatFree()) {
	        report.append("This food is trans fat free\n");
	    }
	    if (computeIsHighFiber()) {
	        report.append("This food is high fiber\n");
	    }

	    return report.toString();
	}
	
	/**
	 * Generates a nutrition label for the food item.
	 * Allows customization of the serving multiplier to reflect different serving sizes.
	 * @param multiplier the multiplier to apply to the base serving size
	 * @return a formatted string representing the nutrition label
	 */
	public String printLabel(double multiplier) {
		
	    StringBuilder label = new StringBuilder();

	    label.append("Nutrition Facts\n");
	    label.append(String.format("Per %.0f %s\n", servingSize * multiplier, servingUnit));
	    label.append(String.format("Calories %.0f\n", calories * multiplier));
	    label.append("-----------------\n");

	    label.append(String.format("Fat %.1f g\n", fat * multiplier));
	    label.append(String.format("Saturated %.1f g\n", saturates * multiplier));
	    label.append(String.format("Trans %.1f g\n", trans * multiplier));
	    label.append(String.format("Polyunsaturates %.1f g\n", polyunsaturates * multiplier));
	    label.append("-----------------\n");

	    label.append(String.format("Carbohydrates %.1f g\n", carbohydrate * multiplier));
	    label.append(String.format("Sugars %.1f g\n", sugars * multiplier));
	    label.append(String.format("Fibre %.1f g\n", fiber * multiplier));
	    label.append("-----------------\n");

	    label.append(String.format("Protein %.1f g\n", protein * multiplier));
	    label.append("-----------------\n");

	    label.append(String.format("Cholesterol %.0f mg\n", cholesterol * multiplier));
	    label.append(String.format("Sodium %.0f mg\n", sodium * multiplier));
	    label.append("-----------------\n");

	    label.append(String.format("Potassium %.0f mg\n", potassium * multiplier));
	    label.append(String.format("Calcium %.0f mg\n", calcium * multiplier));
	    label.append(String.format("Iron %.0f mg\n", iron * multiplier));
	    label.append("-----------------\n");
	    
	    label.append(String.format("Viatmin-A %.0f mg\n", vitaminA * multiplier));
	    label.append(String.format("Vitamin-C %.0f mg\n", vitaminC * multiplier));
	    label.append(String.format("Thiamine %.0f mg\n", thiamine * multiplier));
	    label.append("-----------------\n");

	    label.append("----------------------------------------------------------------------------------------------------------- \n");

	    return label.toString();
	}

	/**
	 * Generates a nutrition label using the base serving size (multiplier = 1).
	 * @return a formatted string representing the nutrition label
	 */
	public String printLabel() {
		return printLabel(1);
	}
	
	

}
