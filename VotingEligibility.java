class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isEligibleToVote() {
        return age >= 18;
    }

    public String getName() {
        return name;
    }
}

public class VotingEligibility {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter like this in cmd:  java VotingEligibility <name> <age>");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible to vote.");
        }
    }
}
