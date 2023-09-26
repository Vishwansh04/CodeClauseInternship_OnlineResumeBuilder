import java.util.Scanner;

public class ResBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your email address: ");
        String email = input.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = input.nextLine();

        System.out.println("Enter your summary: ");
        String summary = input.nextLine();

        System.out.println("Enter your work experience: ");
        String experience = input.nextLine();

        System.out.println("Enter your education: ");
        String education = input.nextLine();

        System.out.println("Enter your skills: ");
        String skills = input.nextLine();
        
        System.out.println("Enter your projects: ");
        String projects = input.nextLine();

        System.out.println("Enter any certifications: ");
        String certifications = input.nextLine();

        String resume = MakeResume(name, email, phone, summary, experience, education, skills,projects, certifications);

        System.out.println(resume);
    }
    
    public static String MakeResume(String name, String email, String phone, String summary, String experience, String education, String skills, String projects, String certifications) {
        String str= "";
        str+="\n\n";
        str+="-----------------------"+name+"'s Resume-----------------------\n";
        str+="--------------------------------------------------------------- \n";
        str+= "Name: " + name + "\n\n";
        str+= "Email: " + email + "\n\n";
        str+= "Phone: " + phone + "\n\n";
        str+= "Summary:\n" + summary + "\n\n";
        str+= "Work Experience:\n" + experience + "\n\n";
        str+= "Education:\n" + education + "\n\n";
        str+= "Skills:\n" + skills + "\n\n";
        str+= "projects:\n" + projects + "\n\n";
        str+= "Certifications:\n" + certifications + "\n\n";
        str+="--------------------------------------------------------------- \n";

        return str;
    }
}
