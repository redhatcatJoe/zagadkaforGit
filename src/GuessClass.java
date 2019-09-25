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
                    System.out.println ("Верно !" + "");
                    System.out.println ("wanna game? Y/N" );
                    String s2 = scanner.nextLine ();

                    if (s2.equals ("y")){                      //if (s2=="y") not work
                        System.out.println ("играем снова" );  //обнулить счетчики hh
                        guess ();
                    }
                    else
                        System.out.println ("game over" );

                    numOfGuess=4;

                    break;

                case "i dont know":
                    System.out.println ("это лампа////");

                    System.out.println ("wanna game? Y/N" );
                    String s3 = scanner.nextLine ();
                    if (s3.equals ("y")){
                        System.out.println ("играем снова" );
                        guess ();
                    }
                    else
                        System.out.println ("game over" );
                    numOfGuess=4;
                    break;

                default:
                  //  System.out.println ("default running" );
                    numOfGuess++;
                    guessLeft--;// sssssssss

                    switch (guessLeft){

                        case 2:
                            System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытки осталось" );
                          //  System.out.println ("не угадал/ попробуй снова," +" " + (3-numOfGuess)+ "Try lef");
                            break;
                        case 1:
                            System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытка осталась");
                            break;
                        case 0:
                             System.out.println ("попытки закончились" );

                            System.out.println ("wanna game? Y/N" );
                            String s4 = scanner.nextLine ();
                            switch (s4){
                                case "y":
                                    numOfGuess= 1;
                                    guessLeft = 3;
                                    System.out.println ("starting game" );
                                    guess ();
                                    break;
                                default:
                                    System.out.println ("end game" );
                            }
                             break;
                    }
//                   if (guessLeft==2) {
//                       System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытки осталось");}
//                   if (guessLeft== 1){
//                       System.out.println ("не угадал/ попробуй снова," +" " + guessLeft+"попытка осталась");
//                   }
//
//                   if (guessLeft==0) System.out.println ("попытки закончились" );




            }


        }





    }
}
