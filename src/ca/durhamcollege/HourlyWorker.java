package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    private double hourlyRate;
    private double hoursPerWeekAmount;

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourRate)
    {
        this.hourlyRate = hourRate;
        if(this.hourlyRate > 17.00 || this.hourlyRate < 17.00)
            this.hourlyRate = 17.00;
    }

    public double getHoursPerWeekAmount()
    {
        return hoursPerWeekAmount;
    }

    public void setHoursPerWeekAmount(double weekHours)
    {
        if ( weekHours <= 48.0 )
            this.hoursPerWeekAmount = weekHours;
        else
            throw new IllegalArgumentException("Hours per week must be less than or equal to 48.0 hours" );
    }

    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public HourlyWorker(String fullName, LocalDate birthDate, String employeeID, double ratePerHour, double hoursPerWeek)
    {
        super(fullName, birthDate, employeeID);
        ratePerHour = getHourlyRate();
        hoursPerWeek = getHoursPerWeekAmount();

    }

    @Override
    public double calculatePayDay()
    {
        double weekHours;
        double hourRate;
        double result;
        weekHours = getHoursPerWeekAmount();
        hourRate = getHourlyRate();

        result = weekHours * hourRate;

        result = Math.round(result * 100);
        return result;
    }

    @Override
    public String toString()
    {
        String stringContent;


        stringContent = "First Name: " + super.getFirstName() +"\n";
        stringContent += "Birth Date: " + super.getBirthDate() +"\n";
        stringContent += "Employee ID: " + super.getEmployeeID() +"\n";
        stringContent += "Hourly Rate: " + getHourlyRate() +"\n";
        stringContent += "Hours per Week: " + getHoursPerWeekAmount() +"\n";
        return stringContent;
    }
}
