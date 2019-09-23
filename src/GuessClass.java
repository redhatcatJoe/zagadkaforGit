import java.util.Scanner;

public class GuessClass {

    int numOfGuess =1;
    int guessLeft= 3;

    void guess(){



        while (numOfGuess<4) {
            System.out.println ("попытка номер "+numOfGuess );
            Scanner scanner= new Scanner (System.in);
            String s = scanner.nextLine ();


            switch (s) {

                case "lamp":
                    System.out.println ("Верно !" + "");/// edfvvdvdv
                    numOfGuess=4;
                    break;

                case "i dont know":
                    System.out.println ("это лампа////");
                    numOfGuess=4;
                    break;

                default:
                    numOfGuess++;
                    guessLeft--;
                   if (guessLeft==2) {
                       System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытки осталось");}
                   if (guessLeft== 1){
                       System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытка осталась");
                   }

                   if (guessLeft==0) System.out.println ("попытки закончились" );




            }


        }





    }
}
