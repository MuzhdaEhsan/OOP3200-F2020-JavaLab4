package ca.durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person
{
    private final  String EmployeeID;

    public final String getEmployeeID()
    {
        return EmployeeID;
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
    public Employee(String fullName, LocalDate birthDate, final String employeeID)
    {
        super(fullName, birthDate);
        validateEmployeeID(employeeID);
        EmployeeID =  employeeID;
    }

    // Validate employee ID
    public void validateEmployeeID( String employeeID )
    {
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < employeeID.length(); i++)
        {
            count++;
        }
        if ( count > 8 )
            throw new IllegalArgumentException("Employee ID must be maximum of 8 characters" );
    }

    public abstract double calculatePayDay();

    public abstract String toString();
}
