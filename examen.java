//LUIS DURÁN FLORES - 177406
public class examen {

	String myString;
	
	public String primeraMayuscula(String myString) {
		this.myString = myString;
		String newString = myString.toUpperCase().charAt(0) + myString.substring(1, myString.length()).toLowerCase();
		return newString;
	}

    public String invertirCadena(String myString){
    	this.myString = myString;
    	String newString = "";
    	for(int posicion = myString.length() - 1; posicion >= 0; posicion--) {
    		newString = newString += myString.charAt(posicion);
    	}
    	return newString;
    }
    
    public String vocalesMayuscula(String myString) {
    	this.myString = myString;
    	String end = "";
    	String[] newString = myString.split("");
    	for(int i = 0; i < myString.length(); i++) {
    		if(newString[i].equals("a")) {
    			myString = myString.replace("a", "A");
    			continue;
    		}else {
    			if(newString[i].equals("e")) {
    				myString = myString.replace("e", "E");
    				continue;
    		   } else {
    			   if(newString[i].equals("i")) {
    	    			myString = myString.replace("i", "I");
    	    			continue;
    	    		} else {
    	    			if(newString[i].equals("o")) {
    	        			myString = myString.replace("o", "O");
    	        			continue;
    	        		} else {
    	        			if(newString[i].equals("u")) {
    	            			myString = myString.replace("u", "U");
    	            			continue;
    	            		}
    	        		}
    	    		}
    		   }
    		} 
    	}
    	end = end.concat(myString);
    	return end;
 }
    
    public String fizzBuzz(String myString) {
    	//Para este ejercicio se ingresa el número entero límite del que se desea imprimir la cadena
    	int x;
    	x = Integer.parseInt(myString);
    	int i;
    	String newString = "";
    	for(i = 1; i <= x; i++) {
    		if(i % 3 == 0 || i % 5 == 0) {
    			if(i % 3 == 0 && i % 5 == 0) {
    				newString = newString.concat(" Fizzbuzz");
    			}else {
    				if(i % 3 == 0) {
    					newString = newString.concat(" Fizz");
    				}else {
    					if(i % 5 == 0) {
    						newString = newString.concat(" Buzz");
    					}
    				}
    			}
    		}
    		else {
    			newString = newString.concat(" "+i);
    		}
    	}
    	return newString;
    }
    
    public String palindromo(String myString) {
    	this.myString = myString;
    	String newString = "";
    	String plndrmo = "";
    	for(int posicion = myString.length() - 1; posicion >= 0; posicion--) {
    		newString = newString += myString.charAt(posicion);
    	}
    	myString = myString.replace(" ", "");
    	newString = newString.replace(" ", "");
    	if(newString.equals(myString)) {
    		plndrmo = myString.concat(":  Su cadena SI es un palíndromo.");    	
    	}else {
    		plndrmo = myString.concat(":  Su cadena NO es un palíndromo.");
    	}
    	return plndrmo;
}
}