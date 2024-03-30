package tec.poo.command.my;

public class SwitchCaseCommand {

    private String[] args;

    public SwitchCaseCommand(String[] args) {
        this.args = args;
    }

    public void execute() {
        // Suppose we have a day represented as an integer (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
        int day = 3;

        // Using switch case to print the name of the day
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }

    @Override
    public String toString() {
        return "Switch/Case example";
    }
}
