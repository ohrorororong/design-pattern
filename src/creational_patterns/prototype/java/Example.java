package creational_patterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Student> studens = new ArrayList<>();

        Student student1 = new Student("가나다");
        Student student2 = new Student("마바사");

        studens.add(student1);
        studens.add(student2);

        List<Student> clone = new ArrayList<>(studens); // 얕은 복사다.



        for (int i = 0; i < 2; i++) {
            System.out.println(studens.get(i)+ ", " + clone.get(i));
        }

        // 리플렉션 기능 사용
        // ModelMapper modelMapper = new ModelMapper();
        // GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
    }
}
