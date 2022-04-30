import java.util.List;
import java.util.Map;

public class Second {

    /**
     * Solve given tasks. (3.5 points in total)
     * In each method you should have only return statement with stream:
     *      List<Something> myMethod(Another another) {
     *        return another.getSmth().stream()....;
     *      }
     */

    record Firm(List<Department> departments) {}

    record Department(String title, List<Worker> workers, long createdAt) {}
    record Worker(String name, String jobTitle, int salary) {}


    // 1. create map Worker -> jobTitle for all departments in firm

    public static Map<Worker, String> jobTitles(Firm firm) {
        return null;
    }

    // 2. calculate total salary for given department

    public int departmentSalary(Department department) {
        return 0;
    }

    // 3. find any department with more than n workers

    Department bigDepartment(Firm firm, int n) {
        return null;
    }

    // 4. create list of workers' job titles with the smallest salary in each department.
    // format: [ JOB_1, JOB_2, ..., JOB_N ]

    private static String cheapProfessions(Firm firm) {
        return null;
    }

    // you can use this auxiliary method if needed
    private static Worker cheapestWorker(List<Worker> workers) {
        return null;
    }

    // 5. get three most resent departments

    Department[] recentDepartments(Firm firm) {
        return null;
    }
}
