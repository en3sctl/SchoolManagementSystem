package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher merve = new Teacher(1, "Merve", 1250);
        Teacher tamer = new Teacher(2, "Tamer", 2000);
        Teacher aysel = new Teacher(3, "Aysel", 1750);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(merve);
        teacherList.add(tamer);
        teacherList.add(aysel);

        Student enes = new Student(26138, "Enes", 4);
        Student dilara = new Student(155, "Dilara", 4.3);
        Student recep = new Student(177, "Recep", 3.7);
        Student arda = new Student(189, "Arda", 3.8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(enes);
        studentList.add(dilara);
        studentList.add(recep);
        studentList.add(arda);

        School pjatk = new School(teacherList, studentList);

        Teacher ozlem = new Teacher(4, "Ozlem", 1500);
        pjatk.addTeacher(ozlem);

        enes.payingFees(13460);
        dilara.payingFees(15000);
        System.out.println("PJATK has earned Zl: " + pjatk.getTotalMoneyEarned());

        System.out.println("-------MAKING SCHOOL PAY SALARY-------");
        merve.receivedSalary(merve.getSalary());
        System.out.println("PJATK has spent for salary to " + merve.getName() +
                " and now has Zl: " + pjatk.getTotalMoneyEarned());

        ozlem.receivedSalary(ozlem.getSalary());
        System.out.println("PJATK has spent for salary to " + ozlem.getName() +
                " and now has Zl: " + pjatk.getTotalMoneyEarned());

        System.out.println(arda);
        System.out.println(tamer.getSalary());
        System.out.println(tamer);
    }
}
