public class InheritanceSample {

    public static void main(String[] args) {
        // Create a Student instance

        Student student = new Student("Jarey", "880 San Piro Balayan", "BSIT", 2);
        System.out.println("Student Information:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        // Create a Staff instance
        Staff staff = new Staff("Ron", "Calantas Calaca City", "Mathematics Department", 50000.0);
        System.out.println("\nStaff Information:");
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: " + staff.getSalary());
    }
}