package tec.poo.command.my;

import tec.poo.model.Person;
import java.util.List;
import java.util.ArrayList;

public class ForEachCommand {

    private String[] args;

    public ForEachCommand(String[] args) {
        this.args = args;
    }
    public void execute() {
        List<Person> personList = new ArrayList<>();

        Person juan = new Person();
        juan.setId(1);
        juan.setName("Juan");
        juan.setLastName("Perez");

        Person maria = new Person();
        maria.setId(2);
        maria.setName("Maria");
        maria.setLastName("Ramirez");

        Person raquel = new Person();
        raquel.setId(3);
        raquel.setName("Raquel");
        raquel.setLastName("Ledezma");

        Person pedro = new Person();
        raquel.setId(4);
        raquel.setName("Pedro");
        raquel.setLastName("Rojas");

        personList.add(juan);
        personList.add(maria);
        personList.add(raquel);
        personList.add(pedro);

        System.out.println("Person List");
        System.out.println("ID\t Name\t Last Name");
        System.out.println("==================================");
        for(Person p : personList) {
            System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getLastName());
        }
    }

    @Override
    public String toString() {
        return "ForEach Example";
    }
}
