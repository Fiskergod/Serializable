public class PeopleMark {
    private int value;
    private String teacherName;

    public PeopleMark(int value, String teacherName) {
        this.value = value;
        this.teacherName = teacherName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return value + "\nИмя учителя: " + teacherName;
    }
}