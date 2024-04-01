public class removenonAlfab {
   
        public static void main(String[] args) {
            String str = "Hello123! How are you ,Mohib?";
    
            // Remove all characters except alphabets
            String result = str.replaceAll("[^a-zA-Z]", "");
    
            System.out.println("Original string: " + str);
            System.out.println("String wi
            th only alphabets: " + result);
        }
    }
    
