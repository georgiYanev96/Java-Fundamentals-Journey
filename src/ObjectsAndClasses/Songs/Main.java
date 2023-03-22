package ObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define a class Song, which holds the following information about songs: Type List, Name and Time.
//On the first line you will receive the number of songs - N.
//On the next N-lines you will be receiving data in the following format: "{typeList}_{name}_{time}".
//On the last line you will receive "Type List" / "all". Print only the Names of the songs which are from that Type List / All songs.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> playList = new ArrayList<>();
        while (n > 0){
            String[] input = scanner.nextLine().split("_");
            Song current = new Song();
            current.setTypeList(input[0]);
            current.setName(input[1]);
            current.setTime(input[2]);
            playList.add(current);
            n--;
        }
        String input = scanner.nextLine();
        for (int i = 0; i < playList.size(); i++) {
            if(playList.get(i).getTypeList().equals(input)){
                System.out.println(playList.get(i).getName());
            }
        }
    }
}
