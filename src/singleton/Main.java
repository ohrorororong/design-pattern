package singleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

//        SingletonV1 singletonV11 = SingletonV1.getInstance();
//        SingletonV1 singletonV12 = SingletonV1.getInstance();
//        System.out.println(singletonV11 == singletonV12);

        enumSingleton settings = enumSingleton.INSTANCE;

        //Constructor<enumSingleton> constructor =
                //enumSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        enumSingleton enumSingleton = constructor.newInstance();


        // 리플렉션
//        enumSingleton constructor = null;
//        Constructor<?>[] declaredConstructors = enumSingleton.class.getDeclaredConstructors();
//        for (Constructor<?> declaredConstructor : declaredConstructors) {
//            declaredConstructor.setAccessible(true);
//            constructor = (enumSingleton) declaredConstructor.newInstance("INSTANCE");
//        }


        // 직렬화 & 역직렬화
        enumSingleton singleton = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            singleton = (enumSingleton) in.readObject();
        }

        System.out.println(settings == singleton);
    }
}
