# ROCK-PAPER-SCISSORS-GAME-IN-JAVA
ROCK PAPER SCISSORS GAME USING JAVA

/*This is ROCK PAPER SCISSORS GAME 
 * ROCK PAPER SCISSOR GAME USING JAVA
 */

import java.util.Scanner;
interface BaseOfGame //This is interface of R_P_S game
{
    int random_number(); //This is a function of create random_number (0-9)
    char conversion(int n); //This is a function to change the random_number into char(S,P,R)
    void result(char you,char com); //This is a function to decide the result
}   
abstract class random_number implements BaseOfGame
{
    public int random_number()
    {
    double n = Math.random()*10;
    int n1= (int) Math.round(n);
    return n1;
    }
    public char conversion(int n)
    {
        if(n>=0 && n<=3){
            return 'R';}
        else
        if(n>=4 && n<=6){
            return 'P' ;}
        else
        if(n>=7 && n<=9){
            return 'S' ;}
        else{
            return 'R';}
    }
    public abstract void result(char you, char com);

}
class resultOfGame extends random_number
{
    public void result(char you ,char com)
    {
        if(you=='R')
        {
            if(com=='R')
            {System.out.println("Draw");
            System.out.println("you choose 'ROCK' & computer choose 'ROCK' then you Drow the Game");
            System.out.println("");
            }
            else
            if(com=='P')
            {System.out.println("Loss");
            System.out.println("you choose 'ROCK' & computer choose 'PAPER' then you Loss the Game");
            System.out.println("");
            }
            else 
            if(com=='S')
            {System.out.println("Win");
            System.out.println("you choose 'ROCK' & computer choose 'SCISSORS' then you Win the Game");
            System.out.println("");
            }
        }
        if(you=='P')
        {
            if(com=='R')
            {System.out.println("Win");
            System.out.println("you choose 'PAPER' & computer choose 'ROCK' then you Win the Game");
            System.out.println("");
            }
            else
            if(com=='P')
            {System.out.println("drow");
            System.out.println("you choose 'PAPER' & computer choose 'PAPER' then you Drow the Game");
            System.out.println("");
            }
            else 
            if(com=='S')
            {System.out.println("Loss");
            System.out.println("you choose 'PAPER' & computer choose 'SCISSORS' then you Loss the Game");
            System.out.println("");
            }

        }
        if(you=='S')
        {
            if(com=='R')
            {System.out.println("Loss");
            System.out.println("you choose 'SCISSORS' & computer choose 'ROCK' then you Loss the Game");
            System.out.println("");
            }
            else
            if(com=='P')
            {System.out.println("Win");
            System.out.println("you choose 'SCISSORS' & computer choose 'PAPER' then you Win the Game");
            System.out.println("");
            }
            else 
            if(com=='S')
            {System.out.println("Drow");
            System.out.println("you choose 'SCISSORS' & computer choose 'SCISSORS' then you Drow the Game");
            System.out.println("");
            }
        }
              
    }
    void correct_input(char you)
    {
        if(you=='P' || you=='S' || you=='R')
        {
            System.out.println();
        }
        else
        {
            System.out.println("wrong input \n YOU CAN CHOODE ONLY R,P&S");
        }
        
        
    }
 }
class Rock_paper_scissors
{
    public static void main(String[] args) 
    {
        resultOfGame a=new resultOfGame();
        
        
        Scanner s=new Scanner(System.in);
        int i=1;
        System.out.println(" WECOME THE GAME \n THIS IS ROCK PAPER SCISSORS GAME\n YOU HAVE THREE CHANCE \n ALL THE BEST PLAYER ");
        do{
            int n=a.random_number();
            //System.out.println(n);

            //System.out.println(a.conversion(n));
            System.out.println("R main rock\np main paper\ns main scisser" );
            char com= a.conversion(n);
            //System.out.println(com); //this is computer choose
            //char com ='P';

            char you1= s.next().charAt(0);
            char you = Character.toUpperCase(you1); 
            a.correct_input(you);
            a.result(you,com);
            i++;
        }while(i<=3);
        System.out.println("....GAME IS OVER....");
    }
}
/*THANK YOU  */
