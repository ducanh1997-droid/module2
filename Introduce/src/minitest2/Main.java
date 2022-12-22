package minitest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        ClassroomManager classroomManager = new ClassroomManager();
        classroomManager.addClassroom();
        classroomManager.addClassroom();
        studentManager.createListStudent(classroomManager.getClassRooms());
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1.Hiểm thị tất cả sinh viên");
            System.out.println("2.Thêm 1 sinh viên");
            System.out.println("3.Hiển thị sinh viên có điểm cao nhất, thấp nhất");
            System.out.println("4.Xoá 1 sinh viên theo tên");
            System.out.println("5.Tìm kiếm sinh viên theo tên");
            System.out.println("6.Hiển thị tất cả sinh viên theo giới tính");
            System.out.println("7.Sửa 1 sinh viên theo id được nhập");
            System.out.println("8.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    studentManager.displayAllStudent(studentManager.getStudents());
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    studentManager.studentMinScore();
                    studentManager.studentMaxScore();
                    break;
                case 4:
                    studentManager.deleteStudent();
                    break;
                case 5:
                    studentManager.searchStudentByName();
                    break;
                case 6:
                    studentManager.showStudentByGender();
                    break;
                case 7:
                    studentManager.updateStudentById();
                    break;
                case 8:
                    System.exit(0);
            }
        }while(true);

//        studentManager.studentMaxScore();
//        studentManager.studentMinScore();
//        studentManager.addStudent();
//        studentManager.deleteStudent();
//        studentManager.searchStudentByName();
//        studentManager.showStudentByGender();
//        studentManager.updateStudentById();
    }
}
