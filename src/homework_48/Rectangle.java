package homework_48;

public class Rectangle {

  private final int length;
  private final int width;

  public Rectangle(int a, int b) {
    // ширина всегда меньше длинны
    length = Math.max(a, b);
    width = Math.min(a, b);
  }
  public int getWidth() {
    return width;
  }

  @Override
  public String toString() {
    return "Rectangle {длина";
  }
}
