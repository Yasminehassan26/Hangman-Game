package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class app {
public static String[] words=new String[1000000];
public int attempts=10;
public String[]array;
public static String Secretword ;
public static String category;
public static int found;
public static char[] Secret2;
public static char[] Secret1;
 public int error=0;
 public int d=0;
public int j=0;
	private BufferedReader br;
public void read (String name)  {
		

		try {
		br = new BufferedReader(new FileReader(name));
		String line=br.readLine();
		while(line!=null && (j< words.length) ) {
			if (line.length()!=0) {
			words[j]=line.toLowerCase();
			j++;
		}
			line=br.readLine();
	
	} br.close();
  }
		  catch (IOException e) {
		      System.out.println("An error occurred.");
		    } 
	}
	

	public String selectRandomSecretWord() {
		int check=0;
		Random r=new Random();
		int randomNumber=r.nextInt(j);
		Secretword =words[randomNumber];
		System.out.println(Secretword);
		 Secret1 = Secretword.toCharArray();
		 Secret2 = Secretword.toCharArray();
			System.out.println(String.copyValueOf(Secret2));
	for (int index = 0; index < Secretword.length(); index++){
		      if(Secret1[index]!=' '  ) {
			        Secret2[index] = '-';
			}
		      else {
			        Secret2[index] = ' ';
               check++;
		      }
	}
	found=check;

		return words[randomNumber];
		
	}

	
	public int guess(Character c)  {
		int i;
	c=Character.toLowerCase(c);

		int count=0;
		for(i=0;i<Secretword.length();i++) {
		if (c==Secret1[i] ) {
			
			Secret2[i]=c;
			 d++;
			 count=1;
			 }
			
		}
		
		if(count==0) {
			if(Character.isLetter(c)) {	
				error++;
				if(error==10) {
					return 3;
				}
				return 0;
				}
			
		}
	else if(d==Secretword.length()) {
			return 2;
			}
	else  {
			 if(d==(Secretword.length()-found)&&(found>0)) {
					return 2;}
			 		return 1;			
	}
		return 0;		
	}	 
}


