package logica;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Menu langMenu = new Menu();
        Menu typeMenu = new Menu(1);
        Menu rotypeMenu = new Menu(1);
        Menu solutionHwMenu = new Menu(2);
        Menu solutionApMenu = new Menu(2);
        Menu roSolutionHwMenu = new Menu(2);
        Menu roSolutionApMenu = new Menu(2);
        Menu techMenu = new Menu(3);
        Menu roTechMenu = new Menu(3);
        langMenu.add(new Menu_Option("1", "Romana") {
            @Override
            public void menuAction() {
                System.out.println("Ai ales limba Romana!!!");
                System.out.println("#######");
                rotypeMenu.repeatMenu();
            }
        });
        langMenu.add(new Menu_Option("2", "English") {
            @Override
            public void menuAction() {
                System.out.println("You choose English language!!!");
                System.out.println("#######");
                typeMenu.repeatMenu();
            }
        });
        langMenu.add(new Menu_Option("0", "Exit") {
            @Override
            public void menuAction() {
                langMenu.repeatMenu();
            }
        });
        typeMenu.add(new Menu_Option("1", "Hardware") {
            @Override
            public void menuAction() {
                solutionHwMenu.repeatMenu();
            }
        });
        typeMenu.add(new Menu_Option("2", "Software") {
            @Override
            public void menuAction() {
                solutionApMenu.repeatMenu();
            }
        });
        typeMenu.add(new Menu_Option("0", "Exit / Go Back") {
            @Override
            public void menuAction() {
                typeMenu.repeatMenu();
            }
        });
        rotypeMenu.add(new Menu_Option("1", "Hardware") {
            @Override
            public void menuAction() {
                roSolutionHwMenu.repeatMenu();
            }
        });
        rotypeMenu.add(new Menu_Option("2", "Aplicatie") {
            @Override
            public void menuAction() {
                roSolutionApMenu.repeatMenu();
            }
        });
        rotypeMenu.add(new Menu_Option("0", "Iesire / Mergi in meniul precedent") {
            @Override
            public void menuAction() {
                langMenu.repeatMenu();
            }
        });

        roSolutionApMenu.add(new Menu_Option("1","Dezinstaleaza / Reinstaleaza aplicatia") {
            @Override
            public void menuAction() {
                System.out.println("Ai reinstalat aplicatia. Alege o optiune daca mai ai nevoie de ajutor!");
                roSolutionApMenu.repeatMenu();
            }
        });

        roSolutionApMenu.add(new Menu_Option("2","Restarteaza Aplicatia") {
            @Override
            public void menuAction() {
                roSolutionApMenu.repeatMenu();
                System.out.println("Ai restartat aplicatia. Alege o optiune daca mai ai nevoie de ajutor!");
            }
        });

        roSolutionApMenu.add(new Menu_Option("3","Ia legatura cu un technician!") {
            @Override
            public void menuAction() {
                roTechMenu.repeatMenu();
            }
        });

        roSolutionApMenu.add(new Menu_Option("0", "Iesire / Mergi in meniul precedent") {
            @Override
            public void menuAction() {
                langMenu.repeatMenu();
            }
        });

        solutionApMenu.add(new Menu_Option("1","Uninstall / Re-install application") {
            @Override
            public void menuAction() {
                System.out.println("You reinstalled your application. Please pick any option if you need more help!");
                solutionApMenu.repeatMenu();
            }
        });

        solutionApMenu.add(new Menu_Option("2","Restart Application") {
            @Override
            public void menuAction() {
                System.out.println("You restarted your application. Please pick any option if you need more help!");
                solutionApMenu.repeatMenu();
            }
        });

        solutionApMenu.add(new Menu_Option("3","Contact a technician!") {
            @Override
            public void menuAction() {
                techMenu.repeatMenu();
            }
        });

        solutionApMenu.add(new Menu_Option("0","Exit / Go Back") {
            @Override
            public void menuAction() {
                langMenu.repeatMenu();
            }
        });

        solutionHwMenu.add(new Menu_Option("1", "Restart System") {
            @Override
            public void menuAction() {
                System.out.println("You picked Restart System solution, please pick any option if you need more help!");
                System.out.println("---------------------");
                solutionHwMenu.repeatMenu();
            }
        });

        solutionHwMenu.add(new Menu_Option("2", "Plug off your System") {
            @Override
            public void menuAction() {
                System.out.println("You picked Restart System solution, please pick any option if you need more help!");
                System.out.println("---------------------");
                solutionHwMenu.repeatMenu();
            }
        });


        solutionHwMenu.add(new Menu_Option("3", "Contact a technician") {
            @Override
            public void menuAction() {
                techMenu.repeatMenu();
            }
        });

        solutionHwMenu.add(new Menu_Option("0", "Exit / Go Back") {
            @Override
            public void menuAction() {
                langMenu.repeatMenu();
            }
        });

        roSolutionHwMenu.add(new Menu_Option("1", "Reporneste Sistemul") {
            @Override
            public void menuAction() {
                System.out.println("Ai ales solutia de repornire a sistemului. Acum te intorci la meniul principal!");
                System.out.println("---------------------");
                langMenu.repeatMenu();
            }
        });

        roSolutionHwMenu.add(new Menu_Option("2", "Scoate sistemul din priza!") {
            @Override
            public void menuAction() {
                System.out.println("Dupa ce ai scos sistemul din priza alimenteaza-l din nou dupa 30 de secunde!!!");
                System.out.println("Acum te intorci la meniul principal !!!");
                System.out.println("---------------------");
                langMenu.repeatMenu();
            }
        });


        roSolutionHwMenu.add(new Menu_Option("3", "Vorbeste cu un technician") {
            @Override
            public void menuAction() {
                roTechMenu.repeatMenu();
            }
        });

        roSolutionHwMenu.add(new Menu_Option("0", "Mergi la meniul anterior") {
            @Override
            public void menuAction() {
                roTechMenu.repeatMenu();
            }
        });


        techMenu.add(new Menu_Option("1", "Describe your problem") {
            @Override
            public void menuAction() {
                Scanner s = new Scanner(System.in);
                System.out.println("Please describe your problem:");
                s.next();
                System.out.println("Your message has been received and you will be contacted by a technician. Thank you!");
                System.exit(0);
            }
        });

        techMenu.add(new Menu_Option("2", "Fix problem with technician help!") {
            @Override
            public void menuAction() {
                System.out.println(UUID.randomUUID() + " Ticket has been created. A technician will contact you!!!");
                System.exit(0);
            }
        });

        techMenu.add(new Menu_Option("0", "Exit / Go Back") {
            @Override
            public void menuAction() {
                solutionHwMenu.repeatMenu();
            }
        });

        roTechMenu.add(new Menu_Option("1", "Descrie problema") {
            @Override
            public void menuAction() {
                Scanner s = new Scanner(System.in);
                System.out.println("Te rog sa descrii problema intalnita: ");
                s.next();
                System.out.println("Mesajul tau a fost primit. O sa fii contactat de un tehnician!");
                System.exit(0);
            }
        });

        roTechMenu.add(new Menu_Option("2", "Rezolva problema cu ajutorul unui tehnician!") {
            @Override
            public void menuAction() {
                System.out.println(UUID.randomUUID() + " Ticket de sesizare a fost creat. Vei fi contactat de un tehnician!!!");
                System.exit(0);
            }
        });

        roTechMenu.add(new Menu_Option("0", "Iesire / Mergi la meniul precedent") {
            @Override
            public void menuAction() {
                roSolutionApMenu.repeatMenu();
            }
        });
        langMenu.repeatMenu();
    }

}
