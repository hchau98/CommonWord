import java.util.Arrays;
import java.util.Scanner;
public class CommonWord {
    public static void main(String[] args){
        String text = "";
        Scanner input = new Scanner(System.in);
        while(!text.equalsIgnoreCase("q")){
            System.out.println("Enter your text or press 'q' to quit:");
            text = input.nextLine();
            String[] textfinder = text.split(" ");
            String texts = "";
            for (int i = 0 ; i<textfinder.length;i++){
                if(textfinder[i].equalsIgnoreCase("the")){
                    textfinder[i]="BE";
                }
                texts += textfinder[i] + " ";
            }
            if(!text.equalsIgnoreCase("q"))
                System.out.println(texts);


        }
    }

}
