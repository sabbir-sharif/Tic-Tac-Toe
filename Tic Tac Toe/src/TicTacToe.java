import java.util.Scanner;

public class TicTacToe {

    static char[][] box ={{' ', '-', '-', '-'},
                          {' ','-', '-', '-'},
                          {' ','-', '-', '-'},
                          {' ','-', '-', '-'}};

    static void shape(int r, int c, int player){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(i == r && j == c && (player % 2 == 0)){
                    box[i][j] = 'X';
                    System.out.print(box[i][j]);
                }
                else if(i == r && j == c && (player % 2 == 1)){
                    box[i][j] = '0';
                    System.out.print(box[i][j]);
                }
                else
                    System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }
//    Win Check
    static boolean winCheck(){

        if(box[1][1] == '0' && box[2][1] == '0' && box[3][1] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[1][2] == '0' && box[2][2] == '0' && box[3][2] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[1][3] == '0' && box[2][3] == '0' && box[3][3] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        if(box[1][1] == '0' && box[1][2] == '0' && box[1][3] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[2][1] == '0' && box[2][2] == '0' && box[2][3] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[3][1] == '0' && box[3][2] == '0' && box[3][3] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[1][1] == '0' && box[2][2] == '0' && box[3][3] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
        else if(box[1][3] == '0' && box[2][2] == '0' && box[3][1] == '0'){
            System.out.println("Player 1 win!!");
            return true;
        }
    //  Player 2
        else if(box[1][1] == 'X' && box[2][1] == 'X' && box[3][1] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[1][2] == 'X' && box[2][2] == 'X' && box[3][2] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[1][3] == 'X' && box[2][3] == 'X' && box[3][3] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        if(box[1][1] == 'X' && box[1][2] == 'X' && box[1][3] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[2][1] == 'X' && box[2][2] == 'X' && box[2][3] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[3][1] == 'X' && box[3][2] == 'X' && box[3][3] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[1][1] == 'X' && box[2][2] == 'X' && box[3][3] == 'X'){
            System.out.println("Player 2 win!!");
            return true;
        }
        else if(box[1][3] == 'X' && box[2][2] == 'X' && box[3][1] == 'X'){
            System.out.println("Player 1 win!!");
            return true;
        }

        return false;
    }

//    Validation Check
    static boolean validCheck(int r, int c){
        if(box[r][c] != '0' && box[r][c] != 'X'){
            return true;
        }
        return false;
    }

//    Main Method starts from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape(0,0, 0);
        int t = 1;
        while(t!=10){
            System.out.print("Enter Row: ");
            int r = sc.nextInt();

            //boolean invalid = true;
            while(r < 1 || r > 3){
                System.out.print("Enter Row: ");
                r = sc.nextInt();
            }

            System.out.print("Enter Column: ");
            int c = sc.nextInt();

            while(c < 1 || c > 3){
                System.out.print("Enter Column: ");
                c = sc.nextInt();
            }
            boolean valid = validCheck(r, c);
            if(!valid){
                System.out.println("Already taken!");
                continue;
            }
            shape(r, c, t);
            boolean win = winCheck();
            if(win)break;
            t++;
        }
    }
}