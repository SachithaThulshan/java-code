class Employee {
    private int empNo;
    private String email;
    private float salary;
    private long accNo;
    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public int getEmpNo() {
        return empNo;
    }
    public String getEmail() {
        return email;
    }
    public float getSalary() {
        return salary;
    }
    public long getAccNo() {
        return accNo;
    }
}
class Run {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpNo(100204);
        employee.setEmail("ThulshanSachitha99@gmail.com");
        employee.setSalary(75054.85F);
        employee.setAccNo(450044284582L);

        System.out.println("Employee Number : "+employee.getEmpNo());
        System.out.println("Employee E-mail : "+employee.getEmail());
        System.out.println("Employee Salary : Rs. "+employee.getSalary());
        System.out.println("Employee Account Number : "+employee.getAccNo());
    }
}
