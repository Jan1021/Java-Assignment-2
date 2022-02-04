 public class Shape {
               public static void main(String[] args) {
                Shapes r = new Rectangle();
                r.draw();
                Shapes l = new Line();
                l.draw();
              }
            }

            abstract class Shapes{
              abstract void draw();
            }

            class Rectangle extends Shapes{
              void draw() {
                System.out.println("Rectangle");
              }
            }

            class Line extends Shapes{
              void draw() {
                System.out.println("Line");
              }
            }

            class Cube extends Shapes{
              void draw() {
                System.out.println("Cube");
              }
            }