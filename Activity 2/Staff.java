public class Staff extends Person {
        private String school;
        private double salary;

        public Staff(String name, String address, String school, double salary) {
            super(name, address);
            this.school = school;
            this.salary = salary;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getSchool() {
            return school;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }
