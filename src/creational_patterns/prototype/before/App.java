package creational_patterns.prototype.before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // 기존의 인스턴스를 프로토타입으로 githubIssue.clone();
        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue2.setId(2);
        githubIssue2.setTitle("2주차 과제: xxxxx");
    }
}
