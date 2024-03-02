//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 10,120,100,30);
        Fighter f2 = new Fighter("Tyson", 20, 85,85,40);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}