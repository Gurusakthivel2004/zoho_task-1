package test;
import birds.Bird;
import child.Parrot;

class Test {
  public static void main(String[] args) {
    Bird bird = new Bird();
    Parrot parrot = new Parrot();
    bird.fly();
    parrot.speak();
  }
}
