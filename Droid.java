public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public static void main(String[] args) {
    Droid robot1 = new Droid("Codey");
    System.out.println(robot1);
    System.out.println(robot1.name);
    System.out.println(robot1.batteryLevel);

    robot1.performTask("Learning Java");
    System.out.println(robot1.batteryLevel);

    robot1.performTask("Solving Rubik's cube");
    System.out.println(robot1.batteryLevel);
  }
}