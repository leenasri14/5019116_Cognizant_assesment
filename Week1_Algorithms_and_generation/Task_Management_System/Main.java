public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList taskList = new SinglyLinkedList();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = scanner.nextLine();

                    Task task = new Task(taskId, taskName, status);
                    taskList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter Task ID to search: ");
                    String searchId = scanner.nextLine();
                    Task foundTask = taskList.searchTask(searchId);
                    if (foundTask != null) {
                        System.out.println("Task found: " + foundTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    System.out.println("Traversing tasks:");
                    taskList.traverseTasks();
                    break;
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    String deleteId = scanner.nextLine();
                    taskList.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
