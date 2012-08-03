import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class crackSHA256 {
	public static void run(String wordlist, String hashfile) {
		int x=0;
		String word=null;
		String hash=null;
		BufferedReader wordstream=null;
		BufferedReader hashstream=null;	
		Boolean cracked=false;
		
		
		//open wordlist and hash files
		try{
			
			wordstream = new BufferedReader(new FileReader(wordlist));
			hashstream = new BufferedReader(new FileReader(hashfile));
			
		} catch (IOException d) {
			d.printStackTrace();
		}
		
		
		//for each word in wordlist file, encrypt(hash) and compare to
		//first hash in the hashfile 
		try{
			System.out.println("Starting. Each period has tried 500 words.\n");
			Sha256Crypt sha256=new Sha256Crypt();
			do {
				hash=hashstream.readLine();
				if(hash == null){
					break;
				}
				while((word=wordstream.readLine()) != null) {
					cracked=null;
					cracked=(sha256.verifyPassword(word,hash));
					
					if(cracked) {
						System.out.println("\n" + word + "\t==> " + hash);
						break;
					}	
					if(x==500){
						System.out.print(".");
						x=0;
					} else {
						x++;
					}
				}
			} while((hash) != null);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}
}
