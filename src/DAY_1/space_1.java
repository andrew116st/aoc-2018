package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class space_1 {
	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("1a_space");
		
		List<Integer> hh = new ArrayList<>();
		//System.out.println(hh);
		
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			String line = sc.nextLine();
			
			int temp = Integer.parseInt(line);
			
			hh.add(temp);

		}
		sc.close();
		int sum = 0;
		for (int i = 0; i < hh.size(); i++) {
			
			//int temp2 = hh.get(i);
			
			sum = sum + hh.get(i);
		}
		System.out.println("Сумма равна " + sum);
			
	}

}
