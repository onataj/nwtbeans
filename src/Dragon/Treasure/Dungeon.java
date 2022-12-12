/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

import java.util.Scanner; //importerar Scanner

//skapar klass Dungeon
public class Dungeon {
    //skapar metod playGame
    public static void playGame(){
        Scanner scanner = new Scanner(System.in); //skapar instans av Scanner
        DragonTreasure dT = new DragonTreasure();
        Room [][] rooms = DragonTreasure.setupGame(); //tillskriver v�rde till variabeln room fr�n setupGame i DragonTreasure
        
        System.out.println("V�lkommen till Dragon Treasure");
        System.out.println("Skriv ditt namn och tryck p� [Enter] f�r att starta ett nytt spel..."); //utskrifter i prombten
        String playerName = scanner.nextLine(); //n�sta v�rde fr�n anv�ndaren tilldelas variablen playerName (namnet p� spelaren

        Player player = new Player(playerName, 1, 0); //skapar ny instans av Player och s�tter f�rsta rummet till [0][1]
        
        System.out.println("V�lkommen " +playerName+ " till din skattjakt."); 
        
        System.out.printf( "%nDu st�r utanf�r en grotta. Det luktar svavel fr�n �ppningen.%n"); 
        
        

        System.out.println("Grott�ppningen �r �sterut. Skriv \"�\" och tryck p� [Enter] f�r att komma in i grottan"); //ustrikfter i prompt
//        
        String riktning = scanner.nextLine(); //n�sta v�rde fr�n anv�ndaren tilldelas variablen riktning
        while(!riktning.equals("�")){//loop om anv�ndaren skriver in annat v�rde �n �
        System.out.println("Felaktning riktning");
        System.out.println("Grott�ppningen �r �sterut. Skriv \"�\" och tryck p� [Enter] f�r att komma in i grottan"); //ustrikfter i prompt
//        
        riktning = scanner.nextLine(); //n�sta v�rde fr�n anv�ndaren tilldelas variablen riktning
        
        }if(riktning.equals("�"))  //n�r anv�ndare skriver �, skriv ut nedan och forts�tt
            System.out.println("N�r du g�r in i grottan kollapsar ing�ngen bakom dig.\n");


        System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut namn och beskrivning i f�rsta rummet
    
       do {//startat loop
            System.out.println("Navigera: (n,v,s,�)"); //skriver ut alternativ f�r olika input
            String userInput = scanner.nextLine(); //n�sta v�rde fr�n anv�ndaren tilldelas userInput
            player.Move(userInput, rooms); //anv�nder metoden move i klassen Player med det nya v�rdet f�r userInput 
            System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut det nya nuvarande rum
        } while(player.getCurrentRoomForPlayer(rooms) != rooms[0][2]);//Loopen avslutas n�r koordinaten blir [0][2]   
            
        dT.endGame(); //startar metoden endGame
        }
        
       
        
    }


