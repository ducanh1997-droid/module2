package minitest2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private static int INDEX = 0;
    public StudentManager(){
    }
    public Student[] getStudents() {
        return students;
    }
    public void createListStudent(ArrayList<Classroom> classroom){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n số lượng sinh viên:");
        int n = Integer.parseInt(scanner.nextLine());
        students = new Student[n];
        for(int i = 0;i<students.length;i++){
            System.out.println("Nhập tên sinh viên thứ "+ (i+1));
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi sinh viên thứ "+ (i+1));
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính sinh viên thứ "+(i+1));
            String gender = scanner.nextLine();
            System.out.println("Nhập địa chỉ sinh viên thứ "+(i+1));
            String address = scanner.nextLine();
            System.out.println("Nhập điểm trung bình sinh viên thứ "+ (i+1));
            double average = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập ");
//          Classroom classroom = new Classroom("C1022i1");
            students[i] = new Student((INDEX+1),name,age,gender,address,average,classroom.get(0));
            INDEX++;
        }
    }
    public void createStudent(int index,Student[] students){
        System.out.printf("%-20s%s",students[index].getId()," ");
        System.out.printf("%-20s%s",students[index].getName()," ");
        System.out.printf("%-20s%s",students[index].getAge()," ");
        System.out.printf("%-20s%s",students[index].getGender()," ");
        System.out.printf("%-20s%s",students[index].getAddress()," ");
        System.out.printf("%-20s%s",students[index].getAverage()," ");
        System.out.printf("%-20s%s",students[index].getClassRoom().getName()," ");
        System.out.println();
    }
    public void displayAllStudent(Student[] students){
        if(students == null){
            System.out.println("Không có sinh viên nào!");
        }else{
            for(int i = 0;i<students.length;i++){
                if(i==0){
                    System.out.printf("%-20s%s","Id"," ");
                    System.out.printf("%-20s%s","Tên"," ");
                    System.out.printf("%-20s%s","Tuổi"," ");
                    System.out.printf("%-20s%s","Giới tính"," ");
                    System.out.printf("%-20s%s","Địa chỉ"," ");
                    System.out.printf("%-20s%s","Điểm trung bình"," ");
                    System.out.printf("%-20s%s","Lớp"," ");
                    System.out.println();
                }
                createStudent(i,students);
            }
        }

    }

    public void studentMaxScore(){
        double maxScore = students[0].getAverage();
        for (Student student : students) {
            if (maxScore < student.getAverage()) {
                maxScore = student.getAverage();
            }
        }
        System.out.println("Sinh viên điểm cao nhất là:");
        for(int i = 0;i<students.length;i++){
            if(maxScore == students[i].getAverage()){
                createStudent(i,students);
            }
        }
    }

    public void studentMinScore(){
        double minScore = students[0].getAverage();
        for (Student student : students) {
            if (minScore > student.getAverage()) {
                minScore = student.getAverage();
            }
        }
        System.out.println("Sinh viên điểm thấp nhất là:");
        for(int i = 0;i<students.length;i++){
            if(minScore == students[i].getAverage()){
                createStudent(i,students);
            }
        }
    }
    public void addStudent(){
        Classroom classroom = new Classroom("C1022i1");
        Scanner scanner = new Scanner(System.in);
        Student[] temp;
        temp = students;
        students = new Student[students.length+1];
        System.out.println("Nhập tên sinh viên muốn thêm ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên muốn thêm ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính sinh viên muốn thêm ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên muốn thêm ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình sinh viên muốn thêm ");
        double average = Double.parseDouble(scanner.nextLine());
        for(int i = 0;i<students.length;i++){
            if(i == students.length-1){
                students[i] = new Student((INDEX+1),name,age,gender,address,average,classroom);
                INDEX++;
            }else{
                students[i]=temp[i];
            }
        }
        displayAllStudent(students);
    }

    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên muốn xoá");
        String name = scanner.nextLine();
        Student[] temp;
        temp = students;
        for(int i = 0;i<students.length;i++){
            if(temp[i].getName().equals(name)){
                temp[i].setName("deleted");
            }
        }
        students = new Student[students.length-1];
        for(int i = 0,j=0;i<students.length;i++){
            if(!temp[i].getName().equals("deleted")){
                students[j] = temp[i];
                j++;
            }
        }
        displayAllStudent(students);
    }

    public void searchStudentByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm:");
        String name = scanner.nextLine();
        int count = 0;

        for (Student student : students) {
            if (student.getName().contains(name)) {
                count++;
            } else {
                student.setName("not selected");
            }
        }
        Student[] temp = new Student[count];
        for(int i = 0,j=0;i<students.length;i++){
            if(!students[i].getName().equals("not selected")){
                temp[j] = students[i];
                j++;
            }
        }
        students = temp;
        displayAllStudent(students);
    }
    public void showStudentByGender(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1.Hiển thị sinh viên giới tính nam");
            System.out.println("2.Hiển thị sinh viên giới tính nữ");
            System.out.println("0.Thoát");
            System.out.println("Nhập vào lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int count = 0;
                    for (Student student : students) {
                        if (student.getGender().equals("nam")) {
                            count++;
                        }
                    }
                    Student[] temp = new Student[count];
                    for (int i = 0, j = 0; i < students.length; i++) {
                        if (students[i].getGender().equals("nam")) {
                            temp[j] = students[i];
                            j++;
                        }
                    }
                    displayAllStudent(temp);
                    break;
                case 2:
                    int count1 = 0;
                    for (Student student : students) {
                        if (student.getGender().equals("nữ")) {
                            count1++;
                        }
                    }
                    Student[] temp1 = new Student[count1];
                    for (int i = 0, j = 0; i < students.length; i++) {
                        if (students[i].getGender().equals("nữ")) {
                            temp1[j] = students[i];
                            j++;
                        }
                    }
                    System.out.println(temp1[0].getGender());
                    displayAllStudent(temp1);
                    break;
                case 0 : System.exit(0);
            }
        }while(true);
    }
    public void updateStudentById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0;i<students.length;i++){
            if(id == (i+1)){
                System.out.println("Sửa tên sinh viên thứ "+id);
                String name = scanner.nextLine();
                if(!Objects.equals(name, "")){
                    students[i].setName(name);
                }
                System.out.println("Sửa tuổi sinh viên thứ "+id);
                int age = Integer.parseInt(scanner.nextLine());
                if(age != 0){
                    students[i].setAge(age);
                }
                System.out.println("Sửa giới tính sinh viên thứ "+id);
                String gender = scanner.nextLine();
                if(!Objects.equals(gender, "")){
                    students[i].setGender(gender);
                }
                System.out.println("Sửa địa chỉ sinh viên thứ "+id);
                String address = scanner.nextLine();
                if(!Objects.equals(address, "")){
                    students[i].setAddress(address);
                }
                System.out.println("Sửa điểm trung bình sinh viên thứ"+id);
                Double average = Double.parseDouble(scanner.nextLine());
                if(average != 0){
                    students[i].setAverage(average);
                }
            }
        }
        displayAllStudent(students);
    }
}
