class Student{
    String name;
    int age;
}

public class Practice4_2_3 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        for(int i = 0; i < 3; i++) {
            students[i] = new Student();
        }
        students[0].name = "鈴木太郎";
        students[0].age = 17;
        students[1].name = "佐藤明子";
        students[1].age = 16;
        students[2].name = "高橋亮";
        students[2].age = 17;
    }
}
