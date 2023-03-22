import java.util.Random;
class random {
  public static void main(String[] args) {
    Random random = new Random(1000);
    for (int i = 0; i < 100; i++) {
      System.out.format("%5d", random.nextInt(49));
      
    }
  }
}