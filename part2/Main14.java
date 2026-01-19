package part2;
public class Main14 {
    public static void main(String[] args) {
        String color = "red";
        // if (color=="green"){
        //     System.out.println("Go");
        // }
        // else if(color=="red"){
        //     System.out.println("Stop");
        // }
        switch (color) {
            case "green":
                System.out.println("Go");
                break;
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Slow");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
