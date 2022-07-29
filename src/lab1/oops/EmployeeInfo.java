package lab1.oops;

public class EmployeeInfo extends Employee implements Department{

    public static void main(String[] args) {
        // obj 1
        Employee emp = new Employee();
        emp.setDepartment("CS");
        emp.setName("ABC");
        System.out.println("Emp Name: " + emp.getName());
        System.out.println("Dept Name: " + emp.getDepartment());

        // obj 2
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.deptName("IT");
        employeeInfo.facultyName("XYZ");
    }

    @Override
    public void deptName(String dName) {
        System.out.println("Department Name from interface: " + dName);
    }

    @Override
    public void facultyName(String fName) {
        System.out.println("Faculty Name from interface: " + fName);
    }
}
