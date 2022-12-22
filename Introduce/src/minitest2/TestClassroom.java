package minitest2;

public class TestClassroom {
    public static void main(String[] args) {
        ClassroomManager classRoomManager = new ClassroomManager();

        classRoomManager.addClassroom();
        classRoomManager.addClassroom();
        classRoomManager.displayAllClassroom();

        //classRoomManager.deleteClassroomById();
        //classRoomManager.updateClassroomById();
        classRoomManager.displayClassroomById();
    }
}
