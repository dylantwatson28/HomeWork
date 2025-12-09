public class Conditionals {
    String question;
    public static void main(String[] args){
        Conditionals MagicEightBall = new Conditionals();
    }
    public Conditionals() {
        question = "Do you like dogs or cats";
        System.out.println(question);
        int randomInt = (int) (Math.random() * 11);

        if (randomInt <= 4) {
            System.out.println("Cats");
        } else if (randomInt == 5) {
            System.out.println("Neither, I like turtles");
        } else if (randomInt == 6) {
            System.out.println("I like both");
        } else if (randomInt == 7) {
            System.out.println("What is a dog and cat");
        } else if (randomInt <= 8) {
            System.out.println("Dogs");
        }
    }
}
