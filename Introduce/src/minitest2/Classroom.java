package minitest2;

public class Classroom {
    private int id;
    private String name;
    private String schoolName;

    public Classroom(){

    }
    public Classroom(String name){
        this.name = name;
    }
    public Classroom(int id,String name,String schoolName){
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
