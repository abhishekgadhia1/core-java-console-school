package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher melisa = new Teacher(2, "Melisa", 700);
		Teacher vandana = new Teacher(3, "Vandana", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(melisa);
		teacherList.add(vandana);
		
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		School riverside = new School(teacherList, studentList);
		
		Teacher sunita = new Teacher(4,"Sunita",900);
		riverside.addTeachers(sunita);
		
		System.out.println("Riverside School has earned Rs. "+riverside.getTotalMoneyEarned());
		
		tamasha.payFees(5000);
		
		System.out.println("Riverside School has earned Rs. "+riverside.getTotalMoneyEarned());
		
		rakshith.payFees(6000);
		
		System.out.println("Riverside School has earned Rs. "+riverside.getTotalMoneyEarned());
		
		lizzy.receiveSalary(lizzy.getSalary());
		
		System.out.println("Riverside has spent for salary to "+lizzy.getName()+" and now has "+riverside.getTotalMoneyEarned());
		
		vandana.receiveSalary(vandana.getSalary());
		
		System.out.println("Riverside has spent for salary to "+vandana.getName()+" and now has "+riverside.getTotalMoneyEarned());
		
		System.out.println(rakshith);
		melisa.receiveSalary(melisa.getSalary());
		System.out.println(melisa);
		sunita.receiveSalary(sunita.getSalary());
		System.out.println(sunita);
	}
}
