import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String[] words = new String[5];   // Array to hold the 5 words

        for (int i = 0; i < 5; i++){        // Read five words
            if (scanner.hasNext()){
                words[i] = scanner.next();
            }
        }

        for (String word : words){
            System.out.println(word);
        }

        scanner.close();
    }
}