package unit_2;


public class Drill_1 {

	public static void main(String[] args) {
		int salary = 8000;
		int graduationYear = 2017;
		int currentYear = 2018;
		float socialSecurityPercentage = .05f;
		int mealsIrregularityReduction = 200;
		
		final float PENSION_FUND_PERCENTAGES = .08f;
		final float EDUCATION_FUN_PERCENTAGES = .08f;
		
		// Tax Calculation
		final float INCOME_TAX_SECOND_STEP = .9f;
		final float INCOME_TAX_THIRD_STEP = .85f;
		final float INCOME_TAX_FOURTH_STEP = .8f;
		final float INCOME_TAX_FIFTH_STEP = .75f;
		final float INCOME_TAX_SIXTH_STEP = .70f;
		
		final int SALARY_BULK = 5000;
		final int TAX_RELIEF_BULK = 50;
		final int SALARY_FIRST_LAYER = SALARY_BULK;
		final int SALARY_SECOND_LAYER = (int)(SALARY_FIRST_LAYER + SALARY_BULK * INCOME_TAX_SECOND_STEP);
		final int SALARY_THIRD_LAYER = (int)(SALARY_SECOND_LAYER + SALARY_BULK * INCOME_TAX_THIRD_STEP);
		final int SALARY_FOURTH_LAYER = (int)(SALARY_THIRD_LAYER + SALARY_BULK * INCOME_TAX_FOURTH_STEP);
		final int SALARY_FIFTH_LAYER = (int)(SALARY_FOURTH_LAYER + SALARY_BULK * INCOME_TAX_FIFTH_STEP);
		
		int salaryAfterTax;
		Boolean isEntitledForTaxRelief = currentYear - graduationYear <= 1;
		if(salary < 5000){
			salaryAfterTax = salary;
		}
		else if(salary < 10000){
			salaryAfterTax = (int)(SALARY_FIRST_LAYER + (salary - SALARY_BULK) * INCOME_TAX_SECOND_STEP) + 
					(isEntitledForTaxRelief ? TAX_RELIEF_BULK : 0);
		}
		else if(salary < 15000){
			salaryAfterTax = (int)(SALARY_SECOND_LAYER + (salary - SALARY_BULK * 2) * INCOME_TAX_THIRD_STEP) + 
					(isEntitledForTaxRelief ? TAX_RELIEF_BULK * 2 : 0);
		}
		else if(salary < 20000){
			salaryAfterTax = (int)(SALARY_THIRD_LAYER + (salary - SALARY_BULK * 3) * INCOME_TAX_FOURTH_STEP) + 
					(isEntitledForTaxRelief ? TAX_RELIEF_BULK * 3 : 0);
		}
		else if(salary < 25000){
			salaryAfterTax = (int)(SALARY_FOURTH_LAYER + (salary - SALARY_BULK * 4) * INCOME_TAX_FIFTH_STEP) + 
					(isEntitledForTaxRelief ? TAX_RELIEF_BULK * 4 : 0);
		}
		else{
			salaryAfterTax = (int)(SALARY_FIFTH_LAYER + (salary - SALARY_BULK * 5) * INCOME_TAX_SIXTH_STEP) + 
					(isEntitledForTaxRelief ? TAX_RELIEF_BULK * 5 : 0);
		}
		
		int taxReduction = salary - salaryAfterTax;
		
		// Social Security Calculation
		int socialSecurityReduction = (int)(salary * socialSecurityPercentage);
		
		// Funds Reduction
		int pensionFundReduction = (int)(salary * PENSION_FUND_PERCENTAGES);
		int educationFundReduction = (int)(salary * EDUCATION_FUN_PERCENTAGES);
		
		// Calculating net
		int net = salaryAfterTax;
		net -= socialSecurityReduction;
		net -= pensionFundReduction;
		net -= educationFundReduction;
		net -= mealsIrregularityReduction;
		
		// Summary
		System.out.printf("The initial salary is %d and the net is %d.\nDetails of reductions:\n"
				+ "*\tTax Reduction: %d (you are %seligable for tax reduction)\n"
				+ "*\tSocial Security Reduction: %d\n"
				+ "*\tPension fund Reduction: %d\n"
				+ "*\tEducation Fund Reduction: %d\n"
				+ "*\t%s\n", 
				salary, net, 
				taxReduction, isEntitledForTaxRelief ? "" : "not ", 
				socialSecurityReduction,
				pensionFundReduction,
				educationFundReduction,
				mealsIrregularityReduction > 0 ? "Meals Irregularity Reduction: " + mealsIrregularityReduction : "No meals reduction");
	}
}