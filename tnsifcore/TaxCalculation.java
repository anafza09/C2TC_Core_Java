package com.tnsifcore;

public class TaxCalculation {
		// TODO Auto-generated method stub
			//method creation
			//return type method_name parameters list		
				public void calculationTax(PersonDemo person) 
				{
					if(person.getAge()>25||((Object) person.getGender()).equalsIgnoreCase("female"))
					{
						person.setTax(0);
						System.out.println("Tax not applicable");
					}
					else
					{
						if(person.getIncome()<=160000)
						{
							person.setTax(0);
						}
						else if(person.getIncome()>160000 && person.getIncome()<=500000)
						{
							person.setTax((person.getIncome()-160000)*10/100);
						}
						else if(person.getIncome()>=500000 && person.getIncome()<=800000){
							person.setTax((person.getIncome()-500000)*20/100+34000);
						}
						else 
						{
							person.setTax((person.getIncome()-800000)*30/100+94000);
						}
				}
					
		}
}