/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

import java.util.Scanner;

//skapar klass Dungeon
public class Dungeon {
    //skapar metod playGame
    public static void playGame() {
        Scanner scanner = new Scanner(System.in); //skapar instans av Scanner
        DragonTreasure dT = new DragonTreasure();
        Room[][] rooms = DragonTreasure.setupGame(); //tillskriver värde till variabeln room från setupGame i DragonTreasure

        System.out.println("Välkommen till Dragon Treasure");
        System.out.println("Skriv ditt namn och tryck på [Enter] för att starta ett nytt spel..."); //utskrifter i prombten
        String playerName = scanner.nextLine(); //nästa värde från användaren tilldelas variablen playerName (namnet på spelaren

        Player player = new Player(playerName, 1, 0, null); //skapar ny instans av Player och sötter första rummet till [0][1]

        System.out.println("Välkommen " + playerName + " till din skattjakt.");

        System.out.printf("%nDu står utanför en grotta. Det luktar svavel från öppningen.%n");


        System.out.println("Grottöppningen är österut. Skriv \"ö\" och tryck på [Enter] för att komma in i grottan"); //ustrikfter i prompt
//        
        String riktning = scanner.nextLine(); //nästa värde från användaren tilldelas variablen riktning
        while (!riktning.equals("ö")) {//loop om användaren skriver in annat värde än ö
            System.out.println("Felaktning riktning");
            System.out.println("Grottöppningen är österut. Skriv \"ö\" och tryck på [Enter] för att komma in i grottan"); //ustrikfter i prompt
//        
            riktning = scanner.nextLine(); //nästa värde från användaren tilldelas variablen riktning

        }
        System.out.println("När du går in i grottan kollapsar ingången bakom dig.\n");
        System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut namn och beskrivning i första rummet

        
         do {//startat loop
            System.out.println("Navigera: (n,v,s,ö)"); //skriver ut alternativ för olika input
            String userInput = scanner.nextLine(); //nästa värde från användaren tilldelas userInput
            player.Move(userInput, rooms); //använder metoden move i klassen Player med det nya värdet för userInput
            var currentRoom = player.getCurrentRoomForPlayer(rooms);
            var monster = currentRoom.getMonster();
            var items = currentRoom.getItem();
            Item[] inventory = player.getItems();
           
           
            if(items!=null)
            System.out.println("I rummet hittar du "+items.getName()+".");
            System.out.println("Du undersöker "+items.getItemDesc());
           
            
            System.out.println("Plocka upp "+items.getName()+" [p]");
            var plockaUpp = scanner.nextLine();
            if(plockaUpp.equals("p"))
              player.setItems(inventory);
              
          
            
            
           
            if(monster != null) {
                System.out.println("Du hittar en " +monster.getName()+ " i rummet som är " +monster.getMonsterDesc()+ "!");
                System.out.println("Ni börjar slåss!");
                var fighting = true;
                while (player.getHealthPoints() > 0 && fighting ){
                    System.out.println("Du attackerar " +monster.getName()+"n!");
                    for(Item item:inventory){
                        
                    
                if(item!=null)
                 if(item instanceof Weapon){
                    player.setDamage(player.getDamage() + ((Weapon) item).getIncreaseDamage()); 
                    monster.setHealthPoints(monster.getHealthPoints() - player.getDamage());
                    if(monster.getHealthPoints() <= 0){
                        fighting = false;
                        System.out.println("Du dödade " +monster.getName()+ "n!");
                        continue;
                    }
                 }
                    System.out.println(monster.getName()+ "n har nu " + monster.getHealthPoints() + " liv");
                    System.out.println(monster.getName()+ "n attackerar dig");
                    player.setHealthPoints(player.getHealthPoints() - monster.getDamage());
                    if(player.getHealthPoints() <= 0){
                        fighting = false;
                        System.out.println("Du dog");
                        System.exit(0);
                        continue;
                    }
                }
                    
                    System.out.println("Du har nu " + player.getHealthPoints() + " liv");
                
                System.out.println("");
                //Battle here
                }
          }
            System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut det nya nuvarande rum

        } while (player.getCurrentRoomForPlayer(rooms) != rooms[0][2]);//Loopen avslutas när koordinaten blir [0][2]
                
       dT.endGame(); //startar metoden endGame    
    
           }
           }
    
        


    



        


           
                          