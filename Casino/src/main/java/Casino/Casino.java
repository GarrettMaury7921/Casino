package Casino;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
/**
 *CASINO PLAYTHROUGH CHAPTER 1 COMPLETE 6/5/2018
 * 
 * @author 20GMaury
 */
public class Casino {

    public static void waitone(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void waittwo(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void waitthree(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void waitfour(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args){
        //Game Streak
        int s = 0;
        int temp = 0;
        //battle vs RYAN
        int rolltie = 0;    
        int Ryan = 0;
        boolean zero;
            boolean rzero;
        boolean dub;
            boolean rdub;
        boolean trip;
            boolean rtrip;
        boolean jack;
            boolean rjack;
        //slots
        String YourName;
        int SlotsContinue;
        int input;
        int Yourmoney = 0;
        String cont = "n";
        int coin;
        int a;
        int b;
        int c;
        int n;
        int dubs;
        int trips;
        //craps
        int Thepoint;
        int crapscoin;
        boolean GameFinished = false;
        int crapswinnings;
        int crapscontinue;
        //blackjack
        int blackjack = 0;
        int bcoin;
        int bwinnings;
        int handvalue;
        int ace;
        int acedone;
        int hit;
        int bcontinue;
        int noloop;
        //Baccarat
        boolean bug = false;
        int baccarat = 0;
        int baccontinue;
        int bacwinnings;
        int bachand;
        int dbachand;
        int baccoin;
        int who;
        int bet;
        boolean pnatural;
        boolean dnatural;
        boolean betplayer = false;
        boolean betdealer = false;
        boolean bettie = false;
        boolean betppair = false;
        boolean betdpair = false;
        int bent = 0;
        //battle vs Kellermann
        int kellermann = 0;
        int thetie = 0;
        boolean pwin = false;
        boolean ploss = false;
        boolean kwin = false;
        boolean kloss = false;
        //other
        int menu = 0;
        
        System.out.println("Welcome To The Casino!");
        Random random = new Random();
        waittwo();
        System.out.println("Let me introduce myself, I am the owner of this casino!");
        waittwo();
        System.out.println("What would your name be?");
        Scanner reader = new Scanner(System.in);
        YourName = reader.nextLine();
        waitone();
        if ("Satan".equals(YourName) || "Lucifer".equals(YourName) || "Devil".equals(YourName)) {
            waittwo();
            System.out.println("Grr...");
            waitone();
            YourName = "Peasant";
        }
        if ("Robin".equals(YourName)){
            waittwo();
            System.out.println("Oh, i've heard about you. Your name is Ryan");
            waittwo();
            System.out.println("Wait... it's not?");
            waitthree();
        }
        if ("Schmidtz".equals(YourName)){
            waittwo();
            System.out.println("Not even your dad can beat us!");
            waitthree();
        }
        if ("Ryan".equals(YourName)){
            waittwo();
            System.out.println("R-RYAN!!!");
            waittwo();
            System.out.println("I Will Nerf You Just Like What Happened To Your A Team");
            waitthree();
        }
        if("Dan".equals(YourName)){
            waittwo();
            System.out.println("Dan!");
            waittwo();
            System.out.println("Also, good java project");
            waitthree();
        }
        if ("Mr. Schmidt".equals(YourName)){
            waittwo();
            System.out.println("I have heard things about you, Schmidt");
            waitthree();
        }
        if("Garrett".equals(YourName)){
            System.out.println("H-Hello Creator!");
            waittwo();
            System.out.println("Best Of Luck To You!");
            waitthree();
        }
        if("Chafos".equals(YourName)){
            waittwo();
            System.out.println("Yea you're very toxic");
            waittwo();
            System.out.println("We will show you what bs payout is!");
            waitthree();
        }
        if("Lorenzo".equals(YourName)){
            waittwo();
            System.out.println("Ah, so you're the kid he was talking about");
            waitthree();
        }
        if("Danny".equals(YourName)){
            waittwo();
            System.out.println("Well...let's see if you can beat it this time");
            waitthree();
        }
        if("Mr. Lucus".equals(YourName)){
            waittwo();
            System.out.println("Not even a programmer can beat this one!");
            waitthree();
        }
        if("Deez nuts".equals(YourName)){
            waittwo();
            System.out.println("Very funny");
            waitthree();
        }
        if("Pierson".equals(YourName)){
            waittwo();
            System.out.println("Ayy, this code has to be half decent right?");
            waittwo();
            System.out.println("r-right??");
            waitthree();
        }
        if("Jayo".equals(YourName)){
            waittwo();
            System.out.println("You're going to need your calculations to beat this one!");
            waittwo();
        }
        if ("Reza".equals(YourName)){
            waittwo();
            System.out.println("You should try to win this time");
            waittwo();
        }
        if ("Cuphead".equals(YourName)){
            waittwo();
            System.out.println("(This seems...)");
            waitone();
            System.out.println("(Oddly familiar...)");
            waittwo();
        }
        if ("Frieza".equals(YourName)){
            waittwo();
            System.out.println("Not Even A Galactic Emperor Can Beat Us!!!");
            waittwo();
        }
        System.out.println("Ok " + YourName + ", " + "I see you have some money");
        boolean Casino = true;
        waittwo();
        Yourmoney = Yourmoney + 100;
        System.out.println("You Have $" + Yourmoney);
        waittwo();
        System.out.println("Keep in mind we don't take change");
        waitone();
        System.out.println("Also, type in numbers to select unless told not to");
        waittwo();
        while (Casino == true){
            if (Yourmoney == 0){
                System.out.println("It appears you lost all of your money " + YourName + ".");
                waitfour();
                System.out.println("Ha Ha Ha!!");
                waitone();
                System.out.println("----------GAME OVER----------");
                break;
            }
            if (Yourmoney >= 5000 && Ryan > 0 && kellermann == 0){
                waittwo();
                System.out.println("Welcome to your second challenge!");
                waitthree();
                System.out.println("You know how craps works right?");
                waitthree();
                if("Garrett".equals(YourName)){
                    System.out.println("Where Is Your Seat?");
                    waittwo();
                }
                if ("Paul Kellermann".equals(YourName)){
                    System.out.println("Wait...i'm up against myself?");
                    waittwo();
                }
                System.out.println("==========BOSS BATTLE 2==========");
                waitthree();
                System.out.println("----------Paul Kellermann VS " + YourName + "----------");
                waittwo();
                System.out.println("Starting...");
                waitthree();
                int CrapsRoll1 = 1+random.nextInt(6);
                System.out.println("First Roll: " + CrapsRoll1);
                waittwo();
                int CrapsRoll2 = 1+random.nextInt(6);
                System.out.println("Second Roll: " + CrapsRoll2);
                waittwo();
                if (CrapsRoll1 + CrapsRoll2 == 7){
                    System.out.println("Congratulations! You Won!");
                    pwin = true;
                }
                if (CrapsRoll1 + CrapsRoll2 == 2){
                    System.out.println("Sorry, You Lost!");
                    ploss = true;
                }
                if (CrapsRoll1 + CrapsRoll2 == 11){
                    System.out.println("Congratulations! You Won!");
                    pwin = true;
                }
                if (CrapsRoll1 + CrapsRoll2 == 3){
                    System.out.println("Sorry, You Lost!");
                    ploss = true;
                }
                if (CrapsRoll1 + CrapsRoll2 == 12){
                    System.out.println("Sorry, You Lost!");
                    ploss = true;
                }
                if (CrapsRoll1 + CrapsRoll2 == 4 || CrapsRoll1 + CrapsRoll2 == 5 || CrapsRoll1 + CrapsRoll2 == 6 || CrapsRoll1 + CrapsRoll2 == 8 || CrapsRoll1 + CrapsRoll2 == 9 || CrapsRoll1 + CrapsRoll2 == 10){
                    Thepoint = CrapsRoll1 + CrapsRoll2;
                    int whileloop = 0;
                    System.out.println("The Point: " + Thepoint);
                    while (whileloop == 0){
                    waitone();
                    CrapsRoll1 = 1+random.nextInt(6);
                    System.out.println("First Roll On The Point: " + CrapsRoll1);
                    CrapsRoll2 = 1+random.nextInt(6);
                    waitone();
                    System.out.println("Second Roll On The Point: " + CrapsRoll2);
                    waitone();
                    if (CrapsRoll1 + CrapsRoll2 == 7){
                        System.out.println("Sorry, You Lost!");
                        ploss = true;
                        whileloop = 1;
                    }
                    else if (CrapsRoll1 + CrapsRoll2 == Thepoint){
                        System.out.println("Congratulations! You Won!");
                        pwin = true;
                        break;
                    }
                    
                    }
                    
                }
                waitthree();
                System.out.println("Let's see how I do now...");
                waittwo();
                System.out.println("Starting For Paul...");
                waittwo();
                int CrapsRoll3 = 1+random.nextInt(6);
                System.out.println("First Roll: " + CrapsRoll3);
                waittwo();
                int CrapsRoll4 = 1+random.nextInt(6);
                System.out.println("Second Roll: " + CrapsRoll4);
                waittwo();
                if (CrapsRoll3 + CrapsRoll4 == 7){
                    System.out.println("Congratulations! You Won!");
                    kwin = true;
                }
                if (CrapsRoll3 + CrapsRoll4 == 2){
                    System.out.println("Sorry, You Lost!");
                    kloss = true;
                }
                if (CrapsRoll3 + CrapsRoll4 == 11){
                    System.out.println("Congratulations! You Won!");
                    kwin = true;
                }
                if (CrapsRoll3 + CrapsRoll4 == 3){
                    System.out.println("Sorry, You Lost!");
                    kloss = true;
                }
                if (CrapsRoll3 + CrapsRoll4 == 12){
                    System.out.println("Sorry, You Lost!");
                    kloss = true;
                }
                if (CrapsRoll3 + CrapsRoll4 == 4 || CrapsRoll3 + CrapsRoll4 == 5 || CrapsRoll3 + CrapsRoll4 == 6 || CrapsRoll3 + CrapsRoll4 == 8 || CrapsRoll3 + CrapsRoll4 == 9 || CrapsRoll3 + CrapsRoll4 == 10){
                    Thepoint = CrapsRoll3 + CrapsRoll4;
                    int whileloop = 0;
                    System.out.println("The Point: " + Thepoint);
                    while (whileloop == 0){
                    waitone();
                    CrapsRoll1 = 1+random.nextInt(6);
                    System.out.println("First Roll On The Point: " + CrapsRoll1);
                    CrapsRoll2 = 1+random.nextInt(6);
                    waitone();
                    System.out.println("Second Roll On The Point: " + CrapsRoll2);
                    waitone();
                    if (CrapsRoll1 + CrapsRoll2 == 7){
                        System.out.println("Sorry, You Lost!");
                        kloss = true;
                        whileloop = 1;
                    }
                    else if (CrapsRoll1 + CrapsRoll2 == Thepoint){
                        System.out.println("Congratulations! You Won!");
                        kwin = true;
                        break;
                    }
                    
                    }
                    
                }
                if (pwin == true && kloss == true){
                    waittwo();
                    System.out.println("Fair game!");
                    waittwo();
                    System.out.println("You Won: $750!");
                    s += 1;
                    Yourmoney = Yourmoney + 750;
                    kellermann = kellermann + 1;
                    waitthree();
                }
                if(ploss == true && kwin == true){
                    waittwo();
                    System.out.println("Wow, You have a lot of money!");
                    waittwo();
                    Yourmoney = Yourmoney - 750;
                    s = 0;
                    System.out.println("Thanks!");
                    waitthree();
                }
                if((pwin == true && kwin == true) || (ploss == true && kloss == true)){
                    waitthree();
                    System.out.println("Well, you know how we ROLL in THIS CASINO!");
                    waitthree();
                    System.out.println("The Tie shall be decided by...");
                    waitthree();
                    System.out.println("A DICE ROLL!!!");
                    waittwo();
                    int me = 1+random.nextInt(6);
                    System.out.println("Your Roll: " + me);
                    waitthree();
                    int k = 1+random.nextInt(6);
                    System.out.println("Kellermann's Roll: " + k);
                    waitthree();
                    if(k == me){
                     System.out.println("Here We Go Again!"); 
                     waitthree();
                    }
                    if (k > me){
                        System.out.println("Nice money you have there...");
                        waitthree();
                        Yourmoney = Yourmoney - 500;
                        thetie = thetie + 1;
                        s = 0;
                    }
                    if(me > k){
                        System.out.println("Oh...");
                        waitthree();
                        System.out.println("Defeated Paul!!!");
                        waittwo();
                        System.out.println("You Won: $750!");
                        Yourmoney = Yourmoney + 750;
                        kellermann = kellermann + 1;
                        thetie = thetie + 1;
                        s += 1;
                        waittwo();
               }
            }
            }
            if(Yourmoney >= 1000 && Ryan == 0){
                waittwo();
                System.out.println("Ah! I see you've been winning quite a bit " + YourName + ".");
                waitthree();
                if ("Garrett".equals(YourName)){
                    System.out.println("You...");
                    waittwo();   
                    System.out.println("I will crush you for playing android 16 AGAINST ME!");
                    waitthree();
                }
                System.out.println("My name is Ryan");
                zero = false;
                rzero = false;
                dub = false;
                rdub = false;
                trip = false;
                rtrip = false;
                jack = false;
                rjack = false;
                waitthree();
                System.out.println("My specialty is winning!");
                waittwo();
                System.out.println("Now, you will face me in slots right now!!");
                waitthree();
                System.out.println("==========BOSS BATTLE 1==========");
                waitthree();
                System.out.println("----------RYAN VS " + YourName + "----------");
                waittwo();
                a = random.nextInt(6);
                b = random.nextInt(6);
                c = random.nextInt(6);
                n = random.nextInt(991) +10;
                System.out.println("Starting...");
                System.out.println("");
                waitone();
                switch (a){
                    case 0:
                        System.out.println("7");
                            break;
                    case 1:
                        System.out.println("Orange");
                            break;
                    case 2:
                         System.out.println("Plum");
                            break;
                    case 3:
                         System.out.println("Bell");
                            break;
                    case 4:
                        System.out.println("Melon");
                            break;
                    default:
                        System.out.println("Bar");
                }
                switch (b){
                    case 0:
                        System.out.println("7");
                            break;
                    case 1:
                        System.out.println("Orange");
                            break;
                    case 2:
                        System.out.println("Plum");
                            break;
                    case 3:
                        System.out.println("Bell");
                            break;
                    case 4:
                        System.out.println("Melon");
                            break;
                    default:
                        System.out.println("Bar");
                }
                switch (c){
                    case 0:
                        System.out.println("7");
                            break;
                    case 1:
                        System.out.println("Orange");
                            break;
                    case 2:
                        System.out.println("Plum");
                            break;
                    case 3:
                        System.out.println("Bell");
                            break;
                    case 4:
                        System.out.println("Melon");
                            break;
                    default:
                        System.out.println("Bar");
                }
                System.out.println("");
                if (a == 0 && b == 0 && c == 0) {
                    System.out.println("Congratulations!" + YourName + "You have won the jackpot in a battle!!!!!");
                    jack = true;
                }
                else if (a == b && a == c && a != 0) {
                    System.out.println("You Got Triples!");
                    trip = true;
                }
                else if (a == b || a == c || b == c) {
                    System.out.println("You Got Doubles!");
                    dub = true;
                }
                else if (a != b && a != c && b != c) {
                    System.out.println("You have won $0");
                    zero = true;
                }
                waitthree();
                System.out.println("Heh, now it's my turn");
                waitthree();
                a = random.nextInt(6);
                b = random.nextInt(6);
                c = random.nextInt(6);
                n = random.nextInt(991) +10;
                System.out.println("Starting For Ryan...");
                System.out.println("");
                waitone();
                switch (a) 
                {
                    case 0:
                        System.out.println("7");
                        break;
                    case 1:
                        System.out.println("Orange");
                        break;
                    case 2:
                        System.out.println("Plum");
                        break;
                    case 3:
                        System.out.println("Bell");
                        break;
                    case 4:
                        System.out.println("Melon");
                        break;
                    default:
                        System.out.println("Bar");
                }
                switch (b) 
                {
                    case 0:
                        System.out.println("7");
                        break;
                    case 1:
                        System.out.println("Orange");
                        break;
                    case 2:
                        System.out.println("Plum");
                        break;
                    case 3:
                        System.out.println("Bell");
                        break;
                    case 4:
                        System.out.println("Melon");
                        break;
                    default:
                        System.out.println("Bar");
                }
                switch (c) 
                {
                    case 0:
                        System.out.println("7");
                        break;
                    case 1:
                        System.out.println("Orange");
                        break;
                    case 2:
                        System.out.println("Plum");
                        break;
                    case 3:
                        System.out.println("Bell");
                        break;
                    case 4:
                        System.out.println("Melon");
                        break;
                    default:
                        System.out.println("Bar");
                }
                System.out.println("");
                if (a == 0 && b == 0 && c == 0)
                  {
                      System.out.println("Congratulations!" + YourName + "You have won the jackpot in a battle!!!!!");
                      rjack = true;
                  }
                  else if (a == b && a == c && a != 0)
                  {
                      System.out.println("You Got Triples!");
                      rtrip = true;
                  }
                  else if (a == b || a == c || b == c)
                  {
                      System.out.println("You Got Doubles!");
                      rdub = true;
                  }
                  if (a != b && a != c && b != c)
                  {
                      System.out.println("You have won $0");
                      rzero = true;
                  }                                                                                        
                        if((trip == true) && (rzero == true || rdub == true)){
                            System.out.println("Oh...");
                            waitthree();
                            System.out.println("Defeated Ryan!!!");
                            waittwo();
                            System.out.println("You Won: $500!");
                            Yourmoney = Yourmoney + 500;
                            s += 1;
                            Ryan = Ryan + 1;
                            waitone();
                        }                                  
                        if(dub == true && rzero == true){
                            System.out.println("Oh...");
                                waitthree();
                                System.out.println("Defeated Ryan!!!");
                                waittwo();
                                System.out.println("You Won: $500!");
                                Yourmoney = Yourmoney + 500;
                                s += 1;
                                Ryan = Ryan + 1;
                                waitone();
                        }                                  
                        if(jack == true && rjack != true){
                            System.out.println("Oh...");
                            waitthree();
                            System.out.println("Defeated Ryan!!!");
                            waittwo();
                            System.out.println("You Won: $500!");
                            Yourmoney = Yourmoney + 500;
                            s += 1;
                            Ryan = Ryan + 1;
                            waitone();
                        }                                  
                        if((trip == true) && (rjack == true)){
                            waitthree();
                            System.out.println("HAHAHA GIVE ME YOUR MONEY!!");
                            s = 0;
                            waittwo();
                            Yourmoney = Yourmoney - 500;
                        }                                  
                        if((dub == true) && (rtrip == true || rjack == true)){
                            waitthree();
                            System.out.println("HAHAHA GIVE ME YOUR MONEY!!");
                            s = 0;
                            waittwo();
                            Yourmoney = Yourmoney - 500;
                        }                                  
                        if((zero == true) && (rdub == true || rtrip == true || rjack == true)){
                            waitone();
                            System.out.println("HAHAHA GIVE ME YOUR MONEY!!");
                            s = 0;
                            waittwo();
                            Yourmoney = Yourmoney - 500;
                        }
                        if((zero == true && rzero == true) || (dub == true && rdub == true) || (trip == true && rtrip == true) || (jack == true && rjack == true)){
                            while(rolltie == 0){
                            System.out.println("Well, You know how we roll in the casino...literally...");
                            waitthree();
                            System.out.println("The tie shall be decided by a dice roll!");
                            waitthree();
                            System.out.println("If your roll is higher, I will nominate you as the winner!");
                            waitthree();
                            int RRollYou = 1+random.nextInt(6);
                            System.out.println("Your Roll: " + RRollYou);
                            waitthree();
                            int RyanRoll = 1+random.nextInt(6);
                            System.out.println("Ryan's Roll: " + RyanRoll);
                            waitthree();
                            if(RyanRoll == RRollYou){
                             System.out.println("Here We Go Again!"); 
                             waitthree();
                            }
                            if (RyanRoll > RRollYou){
                                System.out.println("HAHAHA!! GIVE ME YOUR MONEY!");
                                s = 0;
                                waitone();
                                Yourmoney = Yourmoney - 500;
                                rolltie = rolltie + 1;
                            }
                            if(RRollYou > RyanRoll){
                                System.out.println("Oh...");
                                waitthree();
                                System.out.println("Defeated Ryan!!!");
                                waittwo();
                                System.out.println("You Won: $500!");
                                s += 1;
                                Yourmoney = Yourmoney + 500;
                                Ryan = Ryan + 1;
                                rolltie = rolltie + 1;
                                waitone();
                            }
                        }
                    }
            }
            
            menu = 0;
            System.out.println("Your Money: $" + Yourmoney);
            if (s > 0){
                System.out.println("Winning Streak: " + s);
            }
            System.out.println("What game would you like to play?");
            System.out.println("1. Slots");
            System.out.println("2. Craps");
            System.out.println("3. G. Blackjack");
            System.out.println("4. Baccarat");
            System.out.println("5. Help");
            System.out.println("6. Leaderboards");
            
            input = reader.nextInt();
            switch(input){
                case 6:
                    while (menu == 0){
                        System.out.println("Biggest Winning Streak: (Nobody)");
                        waitone();
                        System.out.println("There is no documented evidence of someone winning yet");
                        waittwo();
                        menu = 1;
                    }
                case 5:
                    while (menu == 0){
                        waitone();
                        System.out.println("This is meant to show you how difficult each game is and how much each pays out");
                        waitthree();
                        System.out.println("The way the payout works is that you put your money in and it is subtracted from your account");
                        waitthree();
                        System.out.println("Then if you win a game you get twice the amount or three times the amount you put in");
                        waitthree();
                        System.out.println("Example: Slots - ((Has $100)Pays $25 (Has $75)...Wins...$50 is added to his account) (Balance: $125)");
                        waitfour();
                        System.out.println("Slots - Easy, get twice the amount you put in");
                        System.out.println("Craps - Easy, get twice the amount you put in");
                        System.out.println("G. Blackjack - Intermediate, get three times the amount you put in");
                        System.out.println("Baccarat - Intermediate, if you bet on the player or the dealer you get twice the amount");
                        waittwo();
                        System.out.println("    If you bet on a tie between the banker and player you can get eight times the amount you put in");
                        waittwo();
                        System.out.println("    If you bet on the player or the dealer that they will have a pair, you can get eleven times the amount you put in");
                        waitthree();
                        menu = 1;
                    }
                case 4:
                    while (menu == 0 && baccarat == 0){
                        bug = false;
                        temp = s;
                        betplayer = false;
                        betdealer = false;
                        bettie = false;
                        betppair = false;
                        betdpair = false;
                        pnatural = false;
                        dnatural = false;
                        bachand = 0;
                        dbachand = 0;
                        bet = 0;
                        System.out.println("----------BACCARAT----------");
                        waitone();
                        System.out.println("The rules followed in our baccarat follow 'Mini Baccarat'");
                        waittwo();
                        System.out.println("Your Money: $" + Yourmoney);
                        if (s > 0){
                        System.out.println("Winning Streak: " + s);
                        }
                        System.out.println("Cards Bent: " + bent);
                        System.out.println("Who would you like to bet on?");
                        waitone();
                        System.out.println("1. Player");
                        System.out.println("2. Dealer");
                        System.out.println("3. Tie");
                        System.out.println("4. Player Pair");
                        System.out.println("5. Dealer Pair");
                        who = reader.nextInt();
                        switch (who){
                            case 1:
                                betplayer = true;
                                System.out.println("You are placing your bet on the player!");
                                waitone();
                                break;
                            case 2:
                                betdealer = true;
                                System.out.println("You are placing your bet on the dealer!");
                                waitone();
                                break;
                            case 3:
                                bettie = true;
                                System.out.println("You are placing your bet on a tie!");
                                waitone();
                                break;
                            case 4:
                                betppair = true;
                                System.out.println("You are placing your bet on the player getting a pair!");
                                waitone();
                                break;
                            case 5:
                                betdpair = true;
                                System.out.println("You are placing your bet on the dealer getting a pair!");
                                waitone();
                                break;
                            default:
                                waittwo();
                                System.out.println("Select a number to bet on!");
                                waitone();
                                continue;
                        }
                        System.out.println("Your Money: $" + Yourmoney);
                        System.out.println("How much would you like to bet?");
                        if (bettie = true){
                            bet = 8;
                        }
                        if (betplayer == true || betdealer == true){
                            bet = 2;
                        }
                        if (betppair == true || betdpair == true){
                            bet = 11;
                        }
                        baccoin = reader.nextInt();
                        bacwinnings = baccoin * bet;
                        if (baccoin == 0){
                            waittwo();
                            System.out.println("You need money in order to play!");
                        }
                        if (baccoin > Yourmoney){
                            waitone();
                            System.out.println("You must put in an amount you have!");
                        }
                        if (baccoin <= Yourmoney && baccoin != 0){
                            System.out.println("Starting...");
                            waitone();
                            Yourmoney = Yourmoney - baccoin;
                            int playerbcard = 2+ random.nextInt(13);
                            if (playerbcard % 2 == 0){
                                System.out.println("You bent a card!");
                                bent++;
                                waittwo();
                            }
                            if (playerbcard == 11){
                                System.out.println("Player First Card: J");
                                waitone();
                            }
                            if (playerbcard == 12){
                                System.out.println("Player First Card: Q");
                                waitone();
                            }
                            if (playerbcard == 13){
                                System.out.println("Player First Card: K"); 
                                waitone();
                            }
                            if (playerbcard == 14){
                                System.out.println("Player First Card: A!");
                                bachand = bachand + 1;
                                waitone();
                            }
                            if(playerbcard != 11 && playerbcard != 12 && playerbcard != 13 && playerbcard != 14){
                                bachand = bachand + playerbcard;
                                System.out.println("Player First Card: " + playerbcard);
                                waittwo();
                            }
                            int playerbcard2 = 2+ random.nextInt(13);
                            if (playerbcard2 % 2 != 0){
                                System.out.println("You bent a card!");
                                bent++;
                                waittwo();
                            }
                            if (playerbcard2 == 11){
                                System.out.println("Player Second Card: J");
                                waitone();
                            }
                            if (playerbcard2 == 12){
                                System.out.println("Player Second Card: Q");
                                waitone();
                            }
                            if (playerbcard2 == 13){
                                System.out.println("Player Second Card: K"); 
                                waitone();
                            }
                            if (playerbcard2 == 14){
                                System.out.println("Player Second Card: A!");
                                bachand = bachand + 1;
                                waitone();
                            }
                            if(playerbcard2 != 11 && playerbcard2 != 12 && playerbcard2 != 13 && playerbcard2 != 14){
                                bachand = bachand + playerbcard2;
                                if (bachand == 20){
                                bachand = bachand - 20;
                                } 
                                System.out.println("Player Second Card: " + playerbcard2);
                                waittwo();
                            }
                            if (bachand >= 10){
                                bachand = bachand - 10;
                            }      
                            System.out.println("Players Hand: " + bachand);
                            if (bachand == 8 || bachand == 9){
                                pnatural = true;
                                System.out.println("Natural " + bachand + "!");
                            }
                            
                            int dbaccard = 2+ random.nextInt(13);
                             if (dbaccard == 11){
                                System.out.println("Dealer First Card: J");
                                waitone();
                            }
                            if (dbaccard == 12){
                                System.out.println("Dealer First Card: Q");
                                waitone();
                            }
                            if (dbaccard == 13){
                                System.out.println("Dealer First Card: K"); 
                                waitone();
                            }
                            if (dbaccard == 14){
                                System.out.println("Dealer First Card: A!");
                                dbachand = dbachand + 1;
                                waitone();
                            }
                            if(dbaccard != 11 && dbaccard != 12 && dbaccard != 13 && dbaccard != 14){
                                dbachand = dbachand + dbaccard;
                                System.out.println("Dealer First Card: " + dbachand);
                                waittwo();
                            }
                            int dbaccard2 = 2+ random.nextInt(13);
                            if (dbaccard2 == 11){
                                System.out.println("Dealer Second Card: J");
                                waitone();
                            }
                            if (dbaccard2 == 12){
                                System.out.println("Dealer Second Card: Q");
                                waitone();
                            }
                            if (dbaccard2 == 13){
                                System.out.println("Dealer Second Card: K"); 
                                waitone();
                            }
                            if (dbaccard2 == 14){
                                System.out.println("Dealer Second Card: A!");
                                dbachand = dbachand + 1;
                                waitone();
                            }
                            if(dbaccard2 != 11 && dbaccard2 != 12 && dbaccard2 != 13 && dbaccard2 != 14){
                                dbachand = dbachand + dbaccard2;
                                if (dbachand == 20){
                                dbachand = dbachand - 20;
                            }
                                System.out.println("Dealer Second Card: " + dbaccard2);
                                waittwo();
                            }
                            if (dbachand >= 10){
                                dbachand = dbachand - 10;
                            }
                            System.out.println("Dealer Hand: " + dbachand);
                            if (dbachand == 8 || dbachand == 9){
                                dnatural = true;
                                System.out.println("Natural " + dbachand + "!");
                            }
                            if (playerbcard == playerbcard2 && betppair == true){
                                System.out.println("The Player got a pair!");
                                waitone();
                                System.out.println("You Won: $" + bacwinnings + "!");
                                Yourmoney = Yourmoney + bacwinnings;
                                s += 1;
                            }
                            if (dbaccard == dbaccard2 && betdpair == true){
                                System.out.println("The Dealer got a pair!");
                                waitone();
                                System.out.println("You Won: $" + bacwinnings + "!");
                                Yourmoney = Yourmoney + bacwinnings;
                                s += 1;
                            }
                            if ((bachand == 1 || bachand == 2 || bachand == 3 || bachand == 4 || bachand == 5 || bachand == 0) && dnatural == false){
                               int playerthird = 2+ random.nextInt(13);
                               System.out.println("The Player Gets to draw a third card!");
                               waittwo();
                                if (playerthird % 2 != 0){
                                 System.out.println("You bent a card!");
                                 bent++;
                                 waittwo();
                                }  
                                 if (playerthird == 11){
                                     System.out.println("Player Third Card: J");
                                     waitone();
                                 }
                                 if (playerthird == 12){
                                     System.out.println("Player Third Card: Q");
                                     waitone();
                                 }
                                 if (playerthird == 13){
                                     System.out.println("Player Third Card: K"); 
                                     waitone();
                                 }
                                 if (playerthird == 14){
                                     System.out.println("Player Third Card: A!");
                                     bachand = bachand + 1;
                                     waitone();
                                 }
                                 if(playerthird != 11 && playerthird != 12 && playerthird != 13 && playerthird != 14){
                                     bachand = bachand + playerthird;
                                    if (bachand > 10){
                                     bachand = bachand - 10;
                                    }
                                     System.out.println("Player Third Card: " + playerthird);
                                     waittwo();
                                 }
                                 System.out.println("Players Hand: " + bachand);
                            }
                            if ((dbachand == 3 || dbachand == 4 || dbachand == 5 || dbachand == 6) && pnatural == false){
                                int bankerthird = 2+ random.nextInt(13);
                               System.out.println("The Dealer Gets to draw a third card!");
                               waittwo();
                                 if (bankerthird == 11){
                                     System.out.println("Dealer Third Card: J");
                                     waitone();
                                 }
                                 if (bankerthird == 12){
                                     System.out.println("Dealer Third Card: Q");
                                     waitone();
                                 }
                                 if (bankerthird == 13){
                                     System.out.println("Dealer Third Card: K"); 
                                     waitone();
                                 }
                                 if (bankerthird == 14){
                                     System.out.println("Dealer Third Card: A!");
                                     dbachand = dbachand + 1;
                                     waitone();
                                 }
                                 if(bankerthird != 11 && bankerthird != 12 && bankerthird != 13 && bankerthird != 14){
                                     dbachand = dbachand + bankerthird;
                                     if (dbachand > 10){
                                     dbachand = dbachand - 10;
                                    }
                                     System.out.println("Dealer Third Card: " + bankerthird);
                                     waittwo();
                                 }
                                 System.out.println("Dealers Hand: " + dbachand);
                            }
                            if (betplayer == true && bachand > dbachand && bachand <= 9){
                                System.out.println("Player Wins!");
                                waittwo();
                                System.out.println("You Won: $" + bacwinnings + "!");
                                Yourmoney = Yourmoney + bacwinnings;
                                s += 1;
                            }
                            if (betdealer == true && bachand < dbachand && dbachand <= 9){
                                System.out.println("Dealer Wins!");
                                waittwo();
                                System.out.println("You Won: $" + bacwinnings + "!");
                                Yourmoney = Yourmoney + bacwinnings;
                                s += 1;
                            }
                            if ((betplayer == true || betdealer == true) && bachand == dbachand){
                                System.out.println("It is a tie!");
                                waitone();
                                System.out.println("You're given your money back!");
                                waittwo();
                                Yourmoney = Yourmoney + baccoin;
                                s = 0;
                                bug = true;
                            }
                            if ((bachand == dbachand && bettie == true && betppair == false && betdpair == false) && bug == false){
                                System.out.println("It is a tie!");
                                waitone();
                                System.out.println("You Won: $" + bacwinnings + "!");
                                Yourmoney = Yourmoney + bacwinnings;
                                s += 1;
                            }
                            if (s == temp){
                                s = 0;
                            }
                            System.out.println("Enter A Number If You Would Like To Keep Playing Baccarat:");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            baccontinue = reader.nextInt();
                            if(baccontinue == 1){
                                if(Yourmoney == 0){
                                    waittwo();
                                    System.out.println("Hey! You have no money! Get Out!");
                                    waittwo();
                                    menu = 1;
                                    break;
                                }
                                continue;
                            }
                            else if(baccontinue == 2){
                                menu = 1;
                                break;
                            }
                            else if (baccontinue != 1 || baccontinue != 2){
                                if(Yourmoney == 0){
                                    waittwo();
                                    System.out.println("Hey! You have no money! Get Out!");
                                    waittwo();
                                    menu = 1;
                                    break;
                                }
                            }
                        }
                    }
                case 3:
                    while (blackjack == 0 && menu == 0){
                        handvalue = 0;
                        acedone = 0;
                        noloop = 0;
                        System.out.println("----------BLACKJACK----------");
                        waitone();
                        System.out.println("(Garrett Blackjack only adds the rule where the ace cannot go back to one)");
                        waitone();
                        System.out.println("Your Money: $" + Yourmoney);
                        if (s > 0){
                            System.out.println("Winning Streak: " + s);
                        }
                        System.out.println("How much would you like to bet? ");
                        bcoin = reader.nextInt();
                        bwinnings = bcoin * 3;
                        if (bcoin == 0){
                            waittwo();
                            System.out.println("You need money in order to play!");
                        }
                        if (bcoin > Yourmoney){
                            System.out.println("You must put in an amount you have!");
                        }
                        if (bcoin <= Yourmoney && bcoin != 0){
                            System.out.println("Starting...");
                            Yourmoney = Yourmoney - bcoin;
                            int firstbcard = 2+random.nextInt(13);
                            if (firstbcard == 11){
                                System.out.println("First Card: J");
                                handvalue = handvalue + 10;
                            }
                            if (firstbcard == 12){
                                System.out.println("First Card: Q");
                                handvalue = handvalue + 10;
                            }
                            if (firstbcard == 13){
                                System.out.println("First Card: K");
                                handvalue = handvalue + 10;
                            }
                            if (firstbcard == 14){
                                System.out.println("First Card: A!");
                                waitone();
                                System.out.println("Would you like to make your ace a 1 or 11?");
                                while (acedone == 0){
                                ace=reader.nextInt();
                                if(ace == 1){
                                    handvalue = handvalue + 1;
                                    acedone = 1;
                                }
                                if(ace == 11){
                                    handvalue = handvalue + 11;
                                    acedone = 1;
                                if(ace != 1 && ace != 11){
                                    System.out.println("Type either 1 or 11!");
                                }
                                }
                                }
                            }
                            if(firstbcard != 11 && firstbcard != 12 && firstbcard != 13 && firstbcard != 14){
                                System.out.println("First Card: " + firstbcard);
                                handvalue = handvalue + firstbcard;
                            }
                            waitone();
                            acedone = 0;
                            int secondbcard = 2+random.nextInt(13);
                            if (secondbcard == 11){
                                System.out.println("Second Card: J");
                                handvalue = handvalue + 10;
                            }
                            if (secondbcard == 12){
                                System.out.println("Second Card: Q");
                                handvalue = handvalue + 10;
                            }
                            if (secondbcard == 13){
                                System.out.println("Second Card: K");
                                handvalue = handvalue + 10;
                            }
                            if (secondbcard == 14){
                                System.out.println("Second Card: A!");
                                waitone();
                                System.out.println("Would you like to make your ace a 1 or 11?");
                                while (acedone == 0){
                                ace=reader.nextInt();
                                if(ace == 1){
                                    handvalue = handvalue + 1;
                                    acedone = 1;
                                }
                                if(ace == 11){
                                    handvalue = handvalue + 11;
                                    acedone = 1;
                                if(ace != 1 && ace != 11){
                                    System.out.println("Type either 1 or 11!");
                                }
                                }
                                }
                            }
                            if(secondbcard != 11 && secondbcard != 12 && secondbcard != 13 && secondbcard != 14){
                                System.out.println("Second Card: " + secondbcard);
                                handvalue = handvalue + secondbcard;
                            }
                            if(handvalue == 21){
                                System.out.println("Blackjack!");
                                waitone();
                                System.out.println("You Won: $" + bwinnings);
                                Yourmoney = Yourmoney + bwinnings;
                                s += 1;
                            }
                            if(handvalue > 21){
                                System.out.println("Your number is " + handvalue + ", which is more than 21");
                                waitone();
                                System.out.println("Sorry, You Lost");
                                s = 0;
                            }
                            waitone();
                            System.out.println("Your Hand Value: " + handvalue);
                            
                            while(handvalue < 21 && noloop == 0){
                                waittwo();
                                System.out.println("Would you like to take a hit?");
                                waitone();
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                hit = reader.nextInt();
                                if(hit == 1){
                                    int hitbcard = 2+random.nextInt(13);
                                    if (hitbcard == 11){
                                System.out.println("Hit Card: J");
                                handvalue = handvalue + 10;
                                System.out.println("Hand Value: " + handvalue);
                            }
                            if (hitbcard == 12){
                                System.out.println("Hit Card: Q");
                                handvalue = handvalue + 10;
                                System.out.println("Hand Value: " + handvalue);
                            }
                            if (hitbcard == 13){
                                System.out.println("Hit Card: K");
                                handvalue = handvalue + 10;
                                System.out.println("Hand Value: " + handvalue);
                            }
                            if (hitbcard == 14){
                                System.out.println("Hit Card: A!");
                                waitone();
                                System.out.println("Would you like to make your ace a 1 or 11?");
                                acedone = 0;
                                while (acedone == 0){
                                ace=reader.nextInt();
                                if(ace == 1){
                                    handvalue = handvalue + 1;
                                    acedone = 1;
                                    System.out.println("Hand Value: " + handvalue);
                                }
                                if(ace == 11){
                                    handvalue = handvalue + 11;
                                    acedone = 1;
                                    System.out.println("Hand Value: " + handvalue);
                                if(ace != 1 && ace != 11){
                                    System.out.println("Type either 1 or 11!");
                                }
                                }
                                }
                            }
                            if(hitbcard != 11 && hitbcard != 12 && hitbcard != 13 && hitbcard != 14){
                                System.out.println("Hit Card: " + hitbcard);
                                handvalue = handvalue + hitbcard;
                                System.out.println("Hand Value: " + handvalue);
                                }
                            if(handvalue == 21){
                                System.out.println("Blackjack!");
                                System.out.println("You Won: $" + bwinnings);
                                Yourmoney = Yourmoney + bwinnings;
                                noloop = 1;
                                s += 1;
                            }
                            if(handvalue > 21){
                                System.out.println("Your number is " + handvalue + ", which is more than 21");
                                waitone();
                                System.out.println("Sorry, You Lost");
                                noloop = 1;
                                s = 0;
                            }
                                }
                                if(hit == 2){
                                    int Dealer = random.nextInt(6)+16;
                                    if (Dealer > handvalue){
                                        System.out.println("Your Hand: " + handvalue);
                                        waittwo();
                                        System.out.println("Dealers Hand: " + Dealer);
                                        waitone();
                                        System.out.println("Sorry, You Lost!");
                                        s = 0;
                                        break;
                                    }
                                    if(handvalue > Dealer){
                                        System.out.println("Your Hand: " + handvalue);
                                        waittwo();
                                        System.out.println("Dealers Hand: " + Dealer);
                                        waitone();
                                        System.out.println("You Won: $" + bwinnings);
                                        Yourmoney = Yourmoney + bwinnings;
                                        noloop = 1;
                                        s += 1;
                                    }
                                }
           
                            }
           System.out.println("Enter A Number If You Would Like To Keep Playing Blackjack:");
           waitone();
           System.out.println("1. Yes");
           System.out.println("2. No");
           bcontinue = reader.nextInt();
           if(bcontinue == 1){
               if(Yourmoney == 0){
                   waittwo();
                   System.out.println("Hey! You have no money! Get Out!");
                   waittwo();
                   menu = 1;
                   break;
               }
               continue;
               
           }
           else if(bcontinue == 2){
               menu = 1;
               break;
           }
           else if (bcontinue != 1 || bcontinue != 2){
                if(Yourmoney == 0){
                    waittwo();
                    System.out.println("Hey! You have no money! Get Out!");
                    waittwo();
                    menu = 1;
                    break;
                }
            }
        }
    }
                    
                case 2:
                   while (GameFinished == false && menu == 0){
                   System.out.println("----------CRAPS----------");
                   System.out.println("Your Money: $" + Yourmoney);
                   if (s > 0){
                       System.out.println("Winning Streak: " + s);
                   }
                   waitone();
                   System.out.println("How much would you like to bet? ");
                   crapscoin = reader.nextInt();
                   crapswinnings = crapscoin * 2;
                   if (crapscoin == 0){
                        waittwo();
                        System.out.println("You need money in order to play!");
                    }
                   if (crapscoin > Yourmoney){
                        System.out.println("You must put in an amount you have!");
                        waitthree();
                    }
            if (crapscoin <= Yourmoney && crapscoin != 0){
                System.out.println("Starting...");
                waitone();
                Yourmoney = Yourmoney - crapscoin;
                int CrapsRoll1 = 1+random.nextInt(6);
                System.out.println("First Roll: " + CrapsRoll1);
                waittwo();
                int CrapsRoll2 = 1+random.nextInt(6);
                System.out.println("Second Roll: " + CrapsRoll2);
                waittwo();
                if (CrapsRoll1 + CrapsRoll2 == 7){
                    System.out.println("Congratulations! You Won: $" + crapswinnings);
                    Yourmoney = Yourmoney + crapswinnings;
                    s += 1;
                }
                if (CrapsRoll1 + CrapsRoll2 == 2){
                    System.out.println("Sorry, You Lost!");
                    s = 0;
                }
                if (CrapsRoll1 + CrapsRoll2 == 11){
                    System.out.println("Congratulations! You Won: $" + crapswinnings);
                    Yourmoney = Yourmoney + crapswinnings;
                    s += 1;
                }
                if (CrapsRoll1 + CrapsRoll2 == 3){
                    System.out.println("Sorry, You Lost!");
                    s = 0;
                }
                if (CrapsRoll1 + CrapsRoll2 == 12){
                    System.out.println("Sorry, You Lost!");
                    s = 0;
                }
                if (CrapsRoll1 + CrapsRoll2 == 4 || CrapsRoll1 + CrapsRoll2 == 5 || CrapsRoll1 + CrapsRoll2 == 6 || CrapsRoll1 + CrapsRoll2 == 8 || CrapsRoll1 + CrapsRoll2 == 9 || CrapsRoll1 + CrapsRoll2 == 10){
                    Thepoint = CrapsRoll1 + CrapsRoll2;
                    int whileloop = 0;
                    System.out.println("The Point: " + Thepoint);
                    while (whileloop == 0){
                    waitone();
                    CrapsRoll1 = 1+random.nextInt(6);
                    System.out.println("First Roll On The Point: " + CrapsRoll1);
                    CrapsRoll2 = 1+random.nextInt(6);
                    waitone();
                    System.out.println("Second Roll On The Point: " + CrapsRoll2);
                    waitone();
                    if (CrapsRoll1 + CrapsRoll2 == 7){
                        System.out.println("Sorry, You Lost!");
                        s = 0;
                        whileloop = 1;
                    }
                    else if (CrapsRoll1 + CrapsRoll2 == Thepoint){
                        System.out.println("Congratulations! You Won: $" + crapswinnings);
                        Yourmoney = Yourmoney + crapswinnings;
                        s += 1;
                        break;
                    }
                    
                    }
                    
                }
                System.out.println("Enter A Number If You Would Like To Keep Playing Craps:");
           System.out.println("1. Yes");
           System.out.println("2. No");
           crapscontinue = reader.nextInt();
           if(crapscontinue == 1){
               if(Yourmoney == 0){
                   waittwo();
                   System.out.println("Hey! You have no money! Get Out!");
                   waittwo();
                   menu = 1;
                   break;
               }
               continue;
               
           }
           else if(crapscontinue == 2){
               menu = 1;
               break;
           }
           else if (crapscontinue != 1 || crapscontinue != 2){
                if(Yourmoney == 0){
                    waittwo();
                    System.out.println("Hey! You have no money! Get Out!");
                    waittwo();
                    menu = 1;
                    break;
                }
            }
            }
        }
                   
                   
                   
                case 1:
                    while (cont.equals("n") && menu == 0){
                        a = random.nextInt(6);
                        b = random.nextInt(6);
                        c = random.nextInt(6);
                        n = random.nextInt(991) +10;
                        System.out.println("----------SLOTS----------");
                        System.out.println("Your Money: $" + Yourmoney);
                        if (s > 0){
                            System.out.println("Winning Streak: " + s);
                        }
                        waitone();
                        System.out.println("How much would you like to bet? ");
                        coin = reader.nextInt();
                        if (coin == 0){
                            waittwo();
                            System.out.println("You need money in order to play!");
                        }
                        if (coin > Yourmoney){
                            System.out.println("You must put in an amount you have!");
                            waitthree();
                        }
                        if (coin <= Yourmoney && coin != 0){
                            System.out.println("Starting...");
                            System.out.println("");
                            waitone();
                            Yourmoney = Yourmoney - coin;
                            switch (a) 
                            {
                                case 0:
                                    System.out.println("7");
                                    break;
                                case 1:
                                    System.out.println("Orange");
                                    break;
                                case 2:
                                    System.out.println("Plum");
                                    break;
                                case 3:
                                    System.out.println("Bell");
                                    break;
                                case 4:
                                    System.out.println("Melon");
                                    break;
                                default:
                                    System.out.println("Bar");
                            }
                            switch (b) 
                            {
                                case 0:
                                    System.out.println("7");
                                    break;
                                case 1:
                                    System.out.println("Orange");
                                    break;
                                case 2:
                                    System.out.println("Plum");
                                    break;
                                case 3:
                                    System.out.println("Bell");
                                    break;
                                case 4:
                                    System.out.println("Melon");
                                    break;
                                default:
                                    System.out.println("Bar");
                            }
                            switch (c) 
                            {
                                case 0:
                                    System.out.println("7");
                                    break;
                                case 1:
                                    System.out.println("Orange");
                                    break;
                                case 2:
                                    System.out.println("Plum");
                                    break;
                                case 3:
                                    System.out.println("Bell");
                                    break;
                                case 4:
                                    System.out.println("Melon");
                                    break;
                                default:
                                    System.out.println("Bar");
                            }
                            System.out.println("");
                            if (a == 0 && b == 0 && c == 0){
                                System.out.println("Congratulations!" + YourName + "You have won the jackpot of $" 
                                    + (coin * n));
                                Yourmoney = Yourmoney + coin;
                                s += 1;
                            }
                            else if (a == b && a == c && a != 0)
                            {
                                trips = coin * 3;
                                System.out.println("Triples!");
                                waitone();
                                System.out.println("Congratulations, you have won $" + trips);
                                Yourmoney = Yourmoney + trips;
                                if (trips == 0){
                                 Yourmoney = Yourmoney - coin;
                                }
                                s += 1;
                            }
                            else if (a == b || a == c || b == c)
                            {
                                dubs = coin * 2;
                                System.out.println("Doubles!");
                                waitone();
                                System.out.println("Congratulations, you have won $" + dubs);
                                Yourmoney = Yourmoney + dubs;
                                if (dubs == 0){
                                 Yourmoney = Yourmoney - coin;
                                }
                                s += 1;
                            }
                            else if (a != b && a != c && b != c)
                            {
                                System.out.println("You have won $0");
                                s = 0;
                            }
                            System.out.println("Enter A Number If You Would Like To Keep Playing Slots:");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            SlotsContinue = reader.nextInt();
                            if(SlotsContinue == 1){
                                if(Yourmoney == 0){
                                    waittwo();
                                    System.out.println("Hey! You have no money! Get Out!");
                                    waittwo();
                                    break;
                                }
                                continue;
                            }
                            else if(SlotsContinue == 2){
                                break;
                    }
                else if (SlotsContinue != 1 || SlotsContinue != 2){
                if(Yourmoney == 0){
                    waittwo();
                    System.out.println("Hey! You have no money! Get Out!");
                    waittwo();
                    menu = 1;
                    break;
                }
            }
                 }
                 }
            }
        }
        }
    }