package main.Pages;

import java.io.IOException;
import java.util.Scanner;

import main.Utils.ClearConsole;

public class Welcome extends Page{
    Scanner sc = new Scanner(System.in);
    String userPass;
    String userType;

    public Welcome(Page previousPage, int accesslevel){
        super(previousPage, accesslevel);
    }

    @Override
    public Page executable(){
        
        // print menu
        ClearConsole.clearScreen();
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║ ███╗   ██╗████████╗██╗   ██╗███████╗██╗   ██╗██████╗ ██╗ ║");
        System.out.println("║ ████╗  ██║╚══██╔══╝██║   ██║██╔════╝╚██╗ ██╔╝██╔══██╗██║ ║");
        System.out.println("║ ██╔██╗ ██║   ██║   ██║   ██║█████╗   ╚████╔╝ ██████╔╝██║ ║");
        System.out.println("║ ██║╚██╗██║   ██║   ██║   ██║██╔══╝    ╚██╔╝  ██╔═══╝ ██║ ║");
        System.out.println("║ ██║ ╚████║   ██║   ╚██████╔╝██║        ██║   ██║     ██║ ║");
        System.out.println("║ ╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝        ╚═╝   ╚═╝     ╚═╝ ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║                      -User Selection-                    ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║[1] Student                                               ║");
        System.out.println("║[2] Staff                                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        // get user type
        System.out.print("Enter your user type(empty input to exit): ");
        this.userType = sc.nextLine().trim();
        System.out.println();

        // if input not blank, loop to ask for valid input
        while(!(this.userType.matches("^[1-2]{1}$"))){

            // exit program if empty input
            if(this.userType.isBlank()){
                return new Exit(null);
            }

            System.out.println("Enter a valid user type:");
            this.userType = sc.nextLine().trim();
        }

        return new Login(this, -1, this.userType);

        
    }

}
