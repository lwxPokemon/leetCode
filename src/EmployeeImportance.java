import java.util.ArrayList;
import java.util.List;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
//        [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1

        return 0;
    }
}
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
