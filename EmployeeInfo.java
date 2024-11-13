public class EmployeeInfo {
    // creating all variables to store employee information
    private String name;
    private String gender;
    private String jobTitle;
    private String organization;
    private String hireDate;
    private int id;

    public EmployeeInfo(){
        name = " ";
        gender = " ";
        jobTitle = " ";
        organization = " ";
        hireDate = " ";
        id = -1;
    }

    public EmployeeInfo(String name, String gender, String jobTitle, String organization, String hireDate) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.organization = organization;
        this.hireDate = hireDate;
        this.id = (int) (100000 + Math.random() * 900000); // get a random 6 digit ID number
    }
    public void displayEmployeeInfo() {
        // display all acquired information
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Organization: " + organization);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("--------------------");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
