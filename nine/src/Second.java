import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return firm.departments().stream()
                .flatMap(d -> d.workers().stream())
                .collect(Collectors.toMap(w -> w, Worker::jobTitle));
    }

    // 2. calculate total salary for given department

    public int departmentSalary(Department department) {
        return department.workers().stream()
                .mapToInt(Worker::salary)
                .sum();
    }

    // 3. find any department with more than n workers

    Department bigDepartment(Firm firm, int n) {
        return firm.departments().stream()
                .filter(d -> d.workers().size() > n)
                .findAny()
                .orElse(null);
    }

    // 4. create list of workers' job titles with the smallest salary in each department.
    // format: [ JOB_1, JOB_2, ..., JOB_N ]

    private static String cheapProfessions(Firm firm) {
        return firm.departments().stream()
                .map(d -> cheapestWorker(d.workers()))
                .map(Worker::jobTitle)
                .collect(Collectors.joining(", ", "[ ", " ]"));
    }

    // you can use this auxiliary method if needed
    private static Worker cheapestWorker(List<Worker> workers) {
        class WorkerComparator implements Comparator<Worker> {

            @Override
            public int compare(Worker o1, Worker o2) {
                return Integer.compare(o1.salary(), o2.salary());
            }
        }
        return workers.stream()
                .min(new WorkerComparator())
                .get();
    }

    // 5. get three most resent departments

    private static Department[] recentDepartments(Firm firm) {
        return firm.departments().stream()
                .sorted(Comparator.comparingLong(Department::createdAt).reversed())
                .limit(3)
                .toArray(Department[]::new);
    }
}
