package controller;

import model.Info;
import repository.InfoRepository;
import view.Menu;

public class InfoController extends Menu {

    protected static String[] mc = {"Phone number", "Email", "Date","Exit"};
    InfoRepository repo;

    public InfoController() {
        super("======== Validate Program =========", mc);
        repo = new InfoRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("------- Phone number --------");
                repo.checkPhone();              
                break;
            }
            case 2: {
                System.out.println("------- Email --------");
                repo.checkEmail();
                break;
            }
            case 3: {
                System.out.println("------- Date --------");
                repo.checkDate();
                break;
            }
            case 4: {
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.err.println("No such choice!");
            }
        }
    }
}