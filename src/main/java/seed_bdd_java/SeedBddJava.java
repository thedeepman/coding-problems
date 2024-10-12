package seed_bdd_java;

public class SeedBddJava {
    public int exampleMethod() {
        return 0;
    }

    public int methodWithExamples(int num, String taskname) {
        if (taskname.equalsIgnoreCase("add")) {
            return num + num;
        } else if (taskname.equalsIgnoreCase("multiply")) {
            return num * num;
        } else {
            return 0;
        }
    }
}
