public class pranav {
              public static void main(String[] args) {
                  Sing s1 = Sing.getSing();
              }
          }

          class Sing{
             private static Sing s = new Sing();

              private Sing() { }

              public static Sing getSing() {
                  System.out.println("pranav");
                  return s;
              }
          }