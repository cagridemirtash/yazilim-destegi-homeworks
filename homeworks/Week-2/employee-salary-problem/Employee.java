public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;
    double bonusSalary;
    double raiseOfSalary;
    double taxSalary;
    public Employee(String fullName, int salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonusSalary = 0;
        this.raiseOfSalary = 0;
        this.taxSalary = 0;
        tax();
        bonus();
        raiseSalary();
    }

    public void tax() {
        if(this.salary > 1000) {
            this.taxSalary = this.salary * 0.03;
        }
    }

    public void bonus() {
        if(this.workHours > 40) {
            this.bonusSalary = (workHours - 40) * 30;
        }
    }
    public void raiseSalary() {
        int YEAR = 2021;
        int diff = YEAR - this.hireYear;
        if(diff < 10) {
            this.raiseOfSalary += this.salary * 0.05;
        }
        if(diff > 9 && diff < 20) {
            this.raiseOfSalary += this.salary * 0.1;
        }
        if(diff > 19) {
            this.raiseOfSalary += this.salary * 0.15;
        }
    }
    public void toStringCopy() {
        System.out.println("Adı : " + this.fullName);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.taxSalary);
        System.out.println("Bonus : " + this.bonusSalary);
        System.out.println("Maaş Artışı : " + this.raiseOfSalary);
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (
                this.salary - this.taxSalary + this.bonusSalary
        ));
        System.out.println("Toplam Maaş : " + (this.salary + this.raiseOfSalary));
    }
}
