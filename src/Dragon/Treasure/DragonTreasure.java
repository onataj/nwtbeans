/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dragon.Treasure;


//skapar klass DragonTreasure
public class DragonTreasure {

    //skapar setupGame med datatyp Room
    public static Room[][] setupGame(){
        Key nyckel = new Key("Nyckel","�ppnar en d�rr");
        Monster drake = new Monster("Drake", 18, 1, "�r MYCKET farlig");
        Monster v�tte = new Monster("V�tte",5,1,"liten men ettrig");
        Treasure skatt = new Treasure("Skattkista","Massa glimmrande saker",50);
        Weapon sv�rd = new Weapon("Sv�rd","G�r dig starkare",1);
        Potion h�lsoDryck = new Potion("H�lsodryck","St�ker din h�lsa med 6",6);
        
        
        //skapar 2-dimesionell array inneh�llande rum, namn och beskrivning.
        Room[][] rooms = {
                {new Room("Rum Sword", "Du ser en d�d kropp p� golvet.\nDu kan g� �sterut [�]\nDu kan g� s�derut [s]", sv�rd), new Room("Rum Monster", "Du ser en brinnande fackla i rummets ena h�rn och k�nner en motbjudande stank.\nDu kan g� v�sterut [v]\nDu kan g� �sterut [�]",v�tte), new Room("Rum Exit", "Du l�mnar grottan med livet i beh�ll.")},
                {new Room("Rum Start", "Rummet �r upplyst av n�gra ljus som sitter p� ett bord framf�r dig.\nDu kan g� norrut [n]\nDu kan g� s�derut [s]")},
                {new Room("Rum Key", "Du kommer in i ett fuktigt rum med vatten sipprandes l�ngs den v�stra v�ggen.\nDu kan g� norrut [n]\nDu kan g� �sterut [�] ",nyckel), new Room("Rum Potion", "Du kommer in i ett fuktigt rum med vatten sipprandes l�ngs den v�stra v�ggen.\nDu kan g� v�sterut [v]\nDu kan g� �sterut [�]",h�lsoDryck), new Room("Rum Dragon", "D�rren �r l�st",skatt,drake)}
        };
        
       //L�ser d�rren till rummet [2][2] i arrayen 
       rooms[2][2].setLocked(true);
       
    
    

    
    
    
    return rooms;
    }
    //startar main
    public static void main(String[] args) {
        
        //startar metod playGame
        Dungeon.playGame();

    }
    //skapar endGame
    public void endGame(){
        System.out.println("Gratz, du �verlevde spelet");//skriver ut text
        System.exit(0);//avslutar spelet
        
    }

}

