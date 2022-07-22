package structural_patterns.adapter.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {
    public static void main(String[] args) {
        //배열을 리스트로 변환해준다.
        List<String> strings = Arrays.asList("a", "b", "c"); //가변 인자

        //리스트를 넘겼는데 Enumeration을 반환해준다.
        // 즉 string가 adaptee에 해당하고 Collections.enumeration이 Adapter에 해당
        // Enumeration이 Target Interface에 해당
        Enumeration<String> enumeration = Collections.enumeration(strings);
    }
}
