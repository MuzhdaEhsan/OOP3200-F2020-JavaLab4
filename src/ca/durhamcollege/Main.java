/**
 * @author: Muzhda Ehsan
 * @date: 2020-12-13
 * @program: Java Lab4
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee(  "Bob", LocalDate.parse("1961-12-13")  ,  "12345678", 500.0 );

        SalariedEmployee salariedEmployee2 =
                new SalariedEmployee(  "Bob", LocalDate.parse("1961-12-13")  ,  "12345678", 300.0 );

        HourlyWorker hourlyWorker =
                new HourlyWorker("Smith", LocalDate.parse("1990-09-12"), "22334455",  Double.parseDouble("14.0"),  Double.parseDouble("34.0"));

        HourlyWorker hourlyWorker2 =
                new HourlyWorker("Smith", LocalDate.parse("1990-09-12"), "22334455",  Double.parseDouble("17.0"),  Double.parseDouble("20.0"));


        System.out.println("First time print of Salaried Employee\n" + salariedEmployee.toString());
        System.out.println("Salaried Employee with changed yearly salary\n" + salariedEmployee2.toString());
        System.out.println("The first values of Hourly Worker:\n" + hourlyWorker.toString());
        System.out.println("The first values of Hourly Worker:\n" + hourlyWorker.toString());


        // create Employee array
        Employee[] employees = new Employee[  2 ];
        // initialize array
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyWorker;

        System.out.println( "Employee details from Array:\n" );
        // generically process each element in array employees
        for ( Employee currentEmployee : employees )
        {
            System.out.println(currentEmployee);
        }

        // get the elements of employees array
        for ( int j = 0; j < employees.length; j++ )
            System.out.printf(  "Employee %d is: %s\n", j+1,
                   "ID: " + employees[ j ].getEmployeeID() + ", Name: " + employees[j].getFirstName() + ", WeeklyPayment: $" + salariedEmployee.calculatePayDay());
    }
}
