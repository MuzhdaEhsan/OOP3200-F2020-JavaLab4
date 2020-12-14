package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    public double yearlySalary;

    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearSalary)
    {
        if(yearSalary < 0.00)
            throw new IllegalArgumentException("Yearly Salary cannot be a negative number!");

        else
            this.yearlySalary = yearSalary;
    }

    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @param employeeID
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public SalariedEmployee(String fullName, LocalDate birthDate, String employeeID, double Salary)
    {
        super(fullName, birthDate, employeeID);
        Salary = getYearlySalary();
    }

    @Override
    public double calculatePayDay()
    {
        double salary;
        double result;
        salary = getYearlySalary();

        result = salary/52;
        result = Math.round(result * 100);
        return result;
    }

    @Override
    public String toString()
    {
        String stringContent;

        //stringContent = "The HourlyWorker class constructor is:\n";
        stringContent = "First Name: " + super.getFirstName() +"\n";
        stringContent += "Birth Date: " + super.getBirthDate() +"\n";
        stringContent += "Employee ID: " + super.getEmployeeID() +"\n";
        stringContent += "Yearly Salary: $" + String.valueOf(getYearlySalary()) +"\n";

        return stringContent;
    }
}
