class Hello{
	public static void main(String[] args){
		char c='a';
		
		if(c>='A' && c<='Z' || c>='a' && c<='z'){
		System.out.println("It is a character" );
		}
		else if(c>='0' && c<='9'){
		System.out.println("It is a Digit" );
		}	
		else {
		System.out.println("It is a Special character" );
		}

	}
}


OUTPUT:
It is a Special character
