package creational_patterns.prototype.after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue prototype = new GithubIssue(repository);
        prototype.setId(1);
        prototype.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = prototype.getUrl();
        System.out.println(url);

        // 얕은 복사
        GithubIssue clone = (GithubIssue) prototype.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != prototype);
        System.out.println(clone.equals(prototype));
        System.out.println(clone.getClass() == prototype.getClass());

        // 얕은 복사여서 repository는 동일한 객체다.
        System.out.println(clone.getRepository() == prototype.getRepository());

        repository.setUser("Donghun");

        System.out.println("prototype : " + prototype.getUrl());
        System.out.println("clone : " + clone.getUrl());
    }
}
