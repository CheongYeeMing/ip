import java.util.*;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        // Greetings
        System.out.println("    ____________________________________________________________");
        System.out.println("     Hello! I'm Duke");
        System.out.println("     What can I do for you?");
        System.out.println("    ____________________________________________________________");

        // List to store all user inputs
        List<Task> list = new ArrayList<>();

        // Take in user input
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (!str.equals("list") && !str.contains("done")) list.add(new Task(str));
            if (str.equals("bye")) {
                System.out.println("    ____________________________________________________________");
                System.out.println("     Bye. Hope to see you again soon!");
                System.out.println("    ____________________________________________________________");
                break;
            } else if (str.equals("list")) {
                System.out.println("    ____________________________________________________________");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("     " + (i+1) + "." + list.get(i));
                }
                System.out.println("    ____________________________________________________________");
            }
            else if (str.contains("done")){
                int taskNumber = Integer.valueOf(str.substring(5));
                list.get(taskNumber-1).setIsDone(true);
                System.out.println("    ____________________________________________________________");
                System.out.println("     Nice! I've marked this task as done: ");
                System.out.println("       " + list.get(taskNumber-1));
                System.out.println("    ____________________________________________________________");
            }
            else {
                System.out.println("    ____________________________________________________________");
                System.out.println("     added: " + str);
                System.out.println("    ____________________________________________________________");
            }
        }
    }
}
