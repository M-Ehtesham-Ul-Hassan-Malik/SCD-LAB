//Create a class Teacher with the following private attributes:
// Name
// Age
// Institute
//Derive three classes from it that has Create a class Teacher with the following private attributes:
// Employee ID
// Email
// Phone Number
//Derive three classes from it with the following names: HumanitiesTeacher, ScienceTeacher, and
//MathsTeacher. Each of these derived classes should have the following members:
// Specialization (e.g., &quot;Literature&quot;, &quot;Physics&quot;, &quot;Algebra&quot;)
// Years of Experience
// Research Interests (e.g., &quot;Ancient History&quot;, &quot;Quantum Mechanics&quot;, &quot;Calculus Applications&quot;)
//Each class should include:
// Proper accessors (getters) and mutators (setters) for all attributes.
// A method to display all relevant information about the teacher.
//Requirements:
//1. Define the Teacher class with private attributes and appropriate setters and getters.
//2. Define each of the derived classes (HumanitiesTeacher, ScienceTeacher, MathsTeacher)
//with additional attributes, including setters and getters.
//3. Implement a method in each class to display the values of all attributes.
//4. Create objects for each of the derived classes.
//5. Prompt the user to input the values for each teacher&#39;s attributes.
//6. Display the values using the method implemented in each class.


import java.util.Scanner;

class teacher{
    private String name, institute;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class humanitiesTeacher extends teacher{
    private int id, phNum, yearsOfExperience;
    private String email, specialisation, researchInterest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhNum() {
        return phNum;
    }

    public void setPhNum(int phNum) {
        this.phNum = phNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getResearchInterest() {
        return researchInterest;
    }

    public void setResearchInterest(String researchInterest) {
        this.researchInterest = researchInterest;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        setName(scanner.next());
        System.out.println("Age:");
        setAge(scanner.nextInt());
        System.out.println("Institute:");
        setInstitute(scanner.next());
        System.out.println("Employee ID:");
        setId(scanner.nextInt());
        System.out.println("Email");
        setEmail(scanner.next());
        System.out.println("Phone Number:");
        setPhNum(scanner.nextInt());
        System.out.println("Years of Experience:");
        setYearsOfExperience(scanner.nextInt());
        System.out.println("Specialization:");
        setSpecialisation(scanner.next());
        System.out.println("Research Interest:");
        setResearchInterest(scanner.next());
    }

    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Institute: "+getInstitute());
        System.out.println("Employee ID: "+id);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phNum);
        System.out.println("Years of Experience: "+yearsOfExperience);
        System.out.println("Specialization: "+specialisation);
        System.out.println("Research Interests: "+researchInterest);

    }

}

class scienceTeacher extends teacher{
    private int id, phNum, yearsOfExperience;
    private String email, specialisation, researchInterest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhNum() {
        return phNum;
    }

    public void setPhNum(int phNum) {
        this.phNum = phNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getResearchInterest() {
        return researchInterest;
    }

    public void setResearchInterest(String researchInterest) {
        this.researchInterest = researchInterest;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        setName(scanner.next());
        System.out.println("Age:");
        setAge(scanner.nextInt());
        System.out.println("Institute:");
        setInstitute(scanner.next());
        System.out.println("Employee ID:");
        setId(scanner.nextInt());
        System.out.println("Email");
        setEmail(scanner.next());
        System.out.println("Phone Number:");
        setPhNum(scanner.nextInt());
        System.out.println("Years of Experience:");
        setYearsOfExperience(scanner.nextInt());
        System.out.println("Specialization:");
        setSpecialisation(scanner.next());
        System.out.println("Research Interest:");
        setResearchInterest(scanner.next());
    }

    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Institute: "+getInstitute());
        System.out.println("Employee ID: "+id);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phNum);
        System.out.println("Years of Experience: "+yearsOfExperience);
        System.out.println("Specialization: "+specialisation);
        System.out.println("Research Interests: "+researchInterest);

    }

}

class mathsTeacher extends teacher{
    private int id, phNum, yearsOfExperience;
    private String email, specialisation, researchInterest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhNum() {
        return phNum;
    }

    public void setPhNum(int phNum) {
        this.phNum = phNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getResearchInterest() {
        return researchInterest;
    }

    public void setResearchInterest(String researchInterest) {
        this.researchInterest = researchInterest;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        setName(scanner.next());
        System.out.println("Age:");
        setAge(scanner.nextInt());
        System.out.println("Institute:");
        setInstitute(scanner.next());
        System.out.println("Employee ID:");
        setId(scanner.nextInt());
        System.out.println("Email");
        setEmail(scanner.next());
        System.out.println("Phone Number:");
        setPhNum(scanner.nextInt());
        System.out.println("Years of Experience:");
        setYearsOfExperience(scanner.nextInt());
        System.out.println("Specialization:");
        setSpecialisation(scanner.next());
        System.out.println("Research Interest:");
        setResearchInterest(scanner.next());
    }

    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Institute: "+getInstitute());
        System.out.println("Employee ID: "+id);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phNum);
        System.out.println("Years of Experience: "+yearsOfExperience);
        System.out.println("Specialization: "+specialisation);
        System.out.println("Research Interests: "+researchInterest);

    }

}

public class Q2 {

    public static void main(String[] args) {
        humanitiesTeacher ht = new humanitiesTeacher();
        scienceTeacher st = new scienceTeacher();
        mathsTeacher mt = new mathsTeacher();

        ht.input();
        ht.display();
        st.input();
        st.display();
        mt.input();
        mt.display();
    }

}
