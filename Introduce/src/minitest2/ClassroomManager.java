package minitest2;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManager {
    private ArrayList<Classroom> classRooms= new ArrayList<>();

    private static int INDEX_CLASSROOM = 0;
    public ClassroomManager(){

    }

    public ArrayList<Classroom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ArrayList<Classroom> classRooms) {
        this.classRooms = classRooms;
    }

    public void addClassroom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp học muốn thêm:");
        String name = scanner.nextLine();
        System.out.println("Nhập trường học của lớp học muốn thêm");
        String schoolName = scanner.nextLine();
        classRooms.add(new Classroom((INDEX_CLASSROOM+1),name,schoolName));
        INDEX_CLASSROOM++;
    }
    public void displayAllClassroom(){
        for(int i = 0;i<classRooms.size();i++){
            System.out.println(classRooms.get(i).getId());
            System.out.println(classRooms.get(i).getName());
            System.out.println(classRooms.get(i).getSchoolName());
        }
    }

    public void displayClassroomById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id lớp học muốn hiển thị:");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0;i<classRooms.size();i++){
            if(classRooms.get(i).getId() == id){
                    System.out.println(classRooms.get(i).getId());
                    System.out.println(classRooms.get(i).getName());
                    System.out.println(classRooms.get(i).getSchoolName());
            }
        }

    }
    public void deleteClassroomById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id phòng học muốn xoá:");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0;i<classRooms.size();i++){
            if(classRooms.get(i).getId() == id){
                classRooms.remove(i);
            }
        }
        displayAllClassroom();
    }

    public void updateClassroomById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id lớp học muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0;i<classRooms.size();i++){
            if(classRooms.get(i).getId() == id){
                System.out.println("Nhập tên lớp học mới có id "+id);
                String name = scanner.nextLine();
                classRooms.get(i).setName(name);
                System.out.println("Nhập tên trường học mới có id "+id);
                String schoolName = scanner.nextLine();
                classRooms.get(i).setSchoolName(schoolName);
            }
        }
        displayAllClassroom();
    }
}
