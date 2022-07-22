package structural_patterns.bridge.after;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolparty아리 = new 아리(new PoolParty());
        poolparty아리.skillW();
    }
}
