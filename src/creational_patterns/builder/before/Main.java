package creational_patterns.builder.before;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZeroBaseBackEndSchool school1 = new ZeroBaseBackEndSchool();
        school1.setCurriculum(Arrays.asList("자바 기초 강의", ""));
    }
}
