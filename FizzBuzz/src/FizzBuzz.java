
public class FizzBuzz {
int[] listofnumbers = new int[101];

	public void makeList(){
		for(int count =0; count < listofnumbers.length; count++){
			listofnumbers[count] = count;
		
		}
	}
	public void printShort(String words){
		System.out.println(words);
	}
	public boolean checkFizz(int checknum){
		boolean fizz = false;
		if((checknum%4) == 0){
			fizz = true;
		}
		return fizz;
	}
	public boolean checkBuzz(int checknum){
		boolean buzz = false;
		if((checknum%4) == 0){
			buzz = true;
		}
		return buzz;
	}
	public boolean checkFizzBuzz(int checknum){
		boolean fizzbuzz = false;
		if(((checknum%4) == 0) && ((checknum%7) == 0)){
			fizzbuzz = true;
		}
		return fizzbuzz;
	}
	public void runFizzBuzz(){
		makeList();
		for(int count : listofnumbers){
			
			if(checkFizzBuzz(count)){
				printShort("Fizzbuzz");
			}
			else if(checkFizz(count)){
				printShort("Fizz");
			}
			else if(checkBuzz(count)){
				printShort("Buzz");
			}
			else{
				System.out.println(count);
				
			}
				
		}
	}
	public static void main(String[] args){
		FizzBuzz prog = new FizzBuzz();
		
		prog.runFizzBuzz();
	}
}
