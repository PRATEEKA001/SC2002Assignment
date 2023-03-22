package main.Pages;

import java.io.Console;
import java.util.Scanner;

import main.Utils.ConsoleUtils;
import main.Utils.Encryptor;
import main.Utils.FileHandler;

public class StudentMain extends Page{
    
    Scanner sc = new Scanner(System.in);
    Console console = System.console();

    String userID;
    
    public StudentMain(Page previousPage, int accesslevel, String userID){
        super(previousPage, accesslevel);
        this.userID = userID;
    }

    @Override
    public Page executable(){

        ConsoleUtils.clearScreen();
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║ ███╗   ██╗████████╗██╗   ██╗███████╗██╗   ██╗██████╗ ██╗ ║");
        System.out.println("║ ████╗  ██║╚══██╔══╝██║   ██║██╔════╝╚██╗ ██╔╝██╔══██╗██║ ║");
        System.out.println("║ ██╔██╗ ██║   ██║   ██║   ██║█████╗   ╚████╔╝ ██████╔╝██║ ║");
        System.out.println("║ ██║╚██╗██║   ██║   ██║   ██║██╔══╝    ╚██╔╝  ██╔═══╝ ██║ ║");
        System.out.println("║ ██║ ╚████║   ██║   ╚██████╔╝██║        ██║   ██║     ██║ ║");
        System.out.println("║ ╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝        ╚═╝   ╚═╝     ╚═╝ ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║                       -Student Menu-                     ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-57s║\n", "Welcome, " + this.userID);
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║[1] Reset password                                        ║");
        System.out.println("║[2] View available projects                               ║");
        System.out.println("║[3] View my project                                       ║");
        System.out.println("║[4] Request de-register project                           ║");
        System.out.println("║[5] Request project title change                          ║");
        System.out.println("║[6] View request history                                  ║");
        System.out.println("║[7] Log-out                                               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        // get option
        System.out.print("Enter your option: ");
        String optionstr = sc.nextLine().trim();
        System.out.println();

        // loop to ask for valid input
        while(!(optionstr.matches("^[1-7]{1}$"))){

            System.out.println("Enter a valid option:");
            optionstr = sc.nextLine().trim();
        }

        int option = Integer.parseInt(optionstr);

        switch (option){

            // SetPassword Page
            case 1:
                return new SetPassword(this, -1, this.userID, "1");

            case 7:
                System.out.println("Logging out.");
                return this.getPreviousPage().getPreviousPage();
        }

        return this;
    }

}