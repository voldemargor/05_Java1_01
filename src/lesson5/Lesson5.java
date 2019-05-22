package lesson5;

public class Lesson5
{
    public static void main(String[] args)
    {
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Tina Torres", "Engineer", "tina.torres65@example.com", "3903539446", 30000, 31);
        employeesArr[1] = new Employee("Bruce Stone", "Developer", "bruce.stone11@example.com", "6985415245", 40000, 32);
        employeesArr[2] = new Employee("Brayden Gardner", "Android Developer", "brayden.gardner50@example.com", "1969724393", 50000, 41);
        employeesArr[3] = new Employee("Gladys Scott", "UI Designer", "gladys.scott99@example.com", "9279971283", 60000, 34);
        employeesArr[4] = new Employee("Alex Douglas", "iOS Developer", "alex.douglas48@example.com", "1603971074", 70000, 42);

//        for (int i = 0; i < employeesArr.length; i++)
//        {
//            if (employeesArr[i].getAge() >= 40)
//            {
//                employeesArr[i].printEmployeeInfo();
//            }
//        }

        for (Employee i : employeesArr)
        {
            if (i.getAge() >= 40)
            {
                i.printEmployeeInfo();
            }
        }
    }
}
