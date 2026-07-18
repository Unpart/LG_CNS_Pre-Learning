public class Teacher {
    
    public String name;
    public int age;
    public String address;
    public boolean isMarraige;

    public void eating() {
        System.out.println("강의하기 위해서 밥을 먹는다.");
    }

    public String teaching(String subject) {
        return "강사님이 가르치는 과목은 "+subject+" 입니다.";
    }
}
