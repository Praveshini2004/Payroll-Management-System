package payrollmanagementsystem;
import java.time.*;
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String position;
    private LocalDate joiningDate;
    private LocalDate terminationDate;

    public Employee() {}

    public Employee(int employeeId, String firstName, String lastName, LocalDate dateOfBirth, String gender,
                    String email, String phoneNumber, String address, String position,
                    LocalDate joiningDate, LocalDate terminationDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.position = position;
        this.joiningDate = joiningDate;
        this.terminationDate = terminationDate;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public LocalDate getJoiningDate() { return joiningDate; }
    public void setJoiningDate(LocalDate joiningDate) { this.joiningDate = joiningDate; }

    public LocalDate getTerminationDate() { return terminationDate; }
    public void setTerminationDate(LocalDate terminationDate) { this.terminationDate = terminationDate; }

    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    @Override
public String toString() {
    return 
            "Employee Id :" + employeeId +
            ", First Name : " + firstName + 
            ", Last Name : " + lastName + 
            ", Date of Birth :" + dateOfBirth +
            ", Gender : " + gender + 
            ", Email" + email + 
            ", Phone number: " + phoneNumber +
            ", Address: " + address + 
            ", Position: " + position + 
            ", Joining Date: " + joiningDate +
            ", Termination Date: " + terminationDate +
            ", Age : " + calculateAge();
           
}

}

