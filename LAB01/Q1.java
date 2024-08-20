import java.util.Scanner;

//Define a class to represent a student. Include the following members
//Data Members (all attributes must be private):
//Student's First Name
//Student's Last Name
//Student's Roll Number
//Major
//Number of Credits Completed
//Total Credits Required
//GPA
//Member Functions:
//Setters and Getters: To set and get all attributes.
//Calculate GPA: To compute the GPA based on completed credits and total credits required.
//Display Details: To show the student's first name, last name, roll number, and GPA.
//Note: You must ask the user to input the values
public class Q1 {

    static class studnet{
        private String fName, lName, rollNo, major;
        private int completedCreditHour, totalCreditHour;
        private float gpa, sum;

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public int getCompletedCreditHour() {
            return completedCreditHour;
        }

        public void setCompletedCreditHour(int completedCreditHour) {
            this.completedCreditHour = completedCreditHour;
        }

        public int getTotalCreditHour() {
            return totalCreditHour;
        }

        public void setTotalCreditHour(int totalCreditHour) {
            this.totalCreditHour = totalCreditHour;
        }

        public float getGpa() {
            return gpa;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }

        public float getSum() {
            return sum;
        }

        public void setSum(float sum) {
            this.sum = sum;
        }

        public void calculateGPA(int completedCreditHour, float sum){
            gpa = (float) sum / completedCreditHour;
        }

        public void display(){
            System.out.println("First Name: "+fName);
            System.out.println("Last Name: "+lName);
            System.out.println("Roll No: "+rollNo);
            System.out.println("GPA: "+gpa);

        }

    }

    public static void main(String[] args) {
        studnet s1 = new studnet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");
        s1.setfName(scanner.next());
        System.out.println("Last Name:");
        s1.setlName(scanner.next());
        System.out.println("RollNo:");
        s1.setRollNo(scanner.next());
        System.out.println("Major:");
        s1.setMajor(scanner.next());
        System.out.println("Total credit hour:");
        s1.setTotalCreditHour(scanner.nextInt());
        System.out.println("Completed Credit Hours:");
        s1.setCompletedCreditHour(scanner.nextInt());
        System.out.println("Sum of the course points to calculate gpa:");
        s1.setSum(scanner.nextFloat());

        s1.calculateGPA(s1.getCompletedCreditHour(),s1.getSum());
        s1.display();
    }
}
