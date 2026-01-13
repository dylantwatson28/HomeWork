public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }

    public Loops() {
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
    }

    public void countUp() {
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }
    }

        public void countByThrees() {
            for (int y = 3; y <= 15; y = y + 3)
                System.out.print(y + " ");
            System.out.println();
        }

        public void countDown() {
            for (int i = 10; i >= 1; i = i - 1)
                System.out.print(i + " ");
            System.out.println();
            System.out.println("Happy Loop Year");
        }

        public void nestedLoop() {
            for (int z = 1; z <= 5; z++) {
                for (int h = 1; h <= z; h++) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
        }
    }