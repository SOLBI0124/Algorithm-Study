package a_inputOutput;

public class BK220317 {
	public static void main(String[] args) {
	/**
	 * 2557
	 */
/*		
		public class Main{
			public static void main(String arg[]){
				System.out.println("Hello World");
			}
		}
*/
		
	/**
	 * 1000
	 * 2558 
	 * a,b 스캐너로 입력받아서 합 출력
	 */
/*		import java.util.Scanner;
		public class Main{
		    public static void main(String arg[]){
		        Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        System.out.println(a+b);
		    }
		}
*/

	/**
	 * 10950 
	 * 몇번 입력할지 받아서 합 출력
	 */
/*		
		import java.util.Scanner;

		public class Main{
		    public static void main(String arg[]){
		        Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();	//a번 입력
				
		        for(int i=0; i<a; i++){
		            int b = sc.nextInt();
		            int c = sc.nextInt();
		            System.out.println(b+c);
		        }       
		    }
		}
*/
		
		/**
		 * 10951 
		 * 더 이상 입력이 없다는 것을 판단할 부분이 필요합니다. Scanner에서는 hasNext, hasNextInt, hasNextLong등과 같은 메소드로 판단할 수 있습니다.
		 */
/*
		public class Main{
		    public static void main(String arrg[]){
		        Scanner sc = new Scanner(System.in);
		    
		    while(sc.hasNextInt()){ //true로 하면 exception발생
		        int a = sc.nextInt();
		        int b = sc.nextInt(); 
		        System.out.println(a+b);
		        }
		    }
		}
*/
	}

}
