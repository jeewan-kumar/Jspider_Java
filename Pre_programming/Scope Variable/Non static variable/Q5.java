class Q5 {
    String name;
    int employeeID;
    double salary;

    public static void main(String[] args) {
        Q5 emp = new Q5();
        emp.name = "John";
        emp.employeeID = 101;
        emp.salary = 50000.0;

        System.out.println("Name: " + emp.name);
        System.out.println("Employee ID: " + emp.employeeID);
        System.out.println("Salary: $" + emp.salary);
    }
}

