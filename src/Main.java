import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  private  static final int CURRENT_YEAR = 2023;
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут");
    String name = br.readLine();

    System.out.println("Рада познакомиться, " + name + "! А какого ты года рождения?");
    int year = Integer.parseInt(br.readLine());
    if (year > CURRENT_YEAR) {
      System.out.println("Sorry, ur from future!");
    }

    int age = 2023 - year;
    System.out.println("Похоже, тебе " + age + " лет. Или " + (age - 1) + "!");

  }
}