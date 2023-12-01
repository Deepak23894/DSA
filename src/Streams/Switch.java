package Streams;

public class Switch
{
    public static void main(String[] args) {
        String id = "Deepak";
        String department = "work";
        switch (id) {
            case "Rana":
                System.out.println("test");
                break;
            case "Suresh":
                System.out.println("LInux");
                break;
            case "Deepak":
                System.out.println("IT");
                switch (department){
                    case "HR":
                        System.out.println("Salary");
                        break;
                    case "work":
                        System.out.println("Awesome");
                        break;
                    default:
                        System.out.println("need to improve");
                }
                break;
            default:
                System.out.println("give proper name");
        }
    }
}
