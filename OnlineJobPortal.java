import java.util.ArrayList;
import java.util.Scanner;

// ---------- Job Class ----------
class Job {
    int id;
    String title;
    String company;
    String location;
    String description;

    Job(int id, String title, String company, String location, String description) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.description = description;
    }

    void displayJob() {
        System.out.println("\nJob ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
    }
}

// ---------- User Class ----------
class User {
    String name;
    String email;
    String resume;

    User(String name, String email, String resume) {
        this.name = name;
        this.email = email;
        this.resume = resume;
    }
}

// ---------- Application Class ----------
class Application {
    User user;
    Job job;

    Application(User user, Job job) {
        this.user = user;
        this.job = job;
    }
}

// ---------- Main Portal Class ----------
public class OnlineJobPortal {

    static ArrayList<Job> jobs = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Application> applications = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Demo Jobs Added
        jobs.add(new Job(1, "Software Developer", "TCS", "Noida", "Java Developer role"));
        jobs.add(new Job(2, "Web Developer", "Infosys", "Bangalore", "Frontend Developer role"));
        jobs.add(new Job(3, "Android Developer", "Wipro", "Hyderabad", "Mobile app development"));

        int choice;

        System.out.println("==== ONLINE JOB PORTAL ====");

        do {
            System.out.println("\n1. View Jobs");
            System.out.println("2. Register User");
            System.out.println("3. Apply for Job");
            System.out.println("4. View Applications");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewJobs();
                    break;

                case 2:
                    registerUser();
                    break;

                case 3:
                    applyForJob();
                    break;

                case 4:
                    viewApplications();
                    break;

                case 5:
                    System.out.println("Thank you for using Online Job Portal!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }

    // ----------- View All Jobs -----------
    static void viewJobs() {
        System.out.println("\n--- Available Jobs ---");
        for (Job j : jobs) {
            j.displayJob();
        }
    }

    // ----------- Register User -----------
    static void registerUser() {
        System.out.print("\nEnter Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Paste Resume Text: ");
        String resume = sc.nextLine();

        users.add(new User(name, email, resume));

        System.out.println("User Registered Successfully!");
    }

    // ----------- Apply For a Job -----------
    static void applyForJob() {
        System.out.print("\nEnter your Email: ");
        sc.nextLine();
        String email = sc.nextLine();

        User user = null;
        for (User u : users) {
            if (u.email.equalsIgnoreCase(email)) {
                user = u;
                break;
            }
        }

        if (user == null) {
            System.out.println("User not found! Please register first.");
            return;
        }

        System.out.println("\nSelect Job ID to apply:");
        for (Job j : jobs) {
            System.out.println(j.id + ". " + j.title + " (" + j.company + ")");
        }

        int jobId = sc.nextInt();
        Job selectedJob = null;

        for (Job j : jobs) {
            if (j.id == jobId) {
                selectedJob = j;
                break;
            }
        }

        if (selectedJob == null) {
            System.out.println("Invalid Job ID!");
            return;
        }

        applications.add(new Application(user, selectedJob));
        System.out.println("Applied Successfully for " + selectedJob.title + "!");
    }

    // ----------- View All Applications -----------
    static void viewApplications() {
        System.out.println("\n--- All Applications ---");
        if (applications.size() == 0) {
            System.out.println("No Applications yet!");
            return;
        }

        for (Application app : applications) {
            System.out.println("\nApplicant Name: " + app.user.name);
            System.out.println("Email: " + app.user.email);
            System.out.println("Applied for: " + app.job.title + " at " + app.job.company);
        }
    }
}
