package Search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SearchFromFile {

	public static void main(String[] args) {
		
		new SearchFromFile();

	}
	public SearchFromFile(){
        
	       ArrayList<Record> records = loadData();
	       System.out.println(linearSearch(records, "Douglas")); 
	    }
	    
	    public ArrayList<Record> loadData() {
	        
	        ArrayList<Record> records = new ArrayList<>();
	        
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("bookInfo.txt"));
	            String contentLine = br.readLine();
	            
	            String[] data;
	            int id;
	            String name;
	            String surname;
	            String gender;
	            String country;
	            int age;
	            String date;
	            
	            while (contentLine != null) {
	                
	                data = contentLine.split(",");
	                id = Integer.parseInt(data[0]);
	                name = data[1];
	                surname = data[2];
	                gender = data[3];
	                country = data[4];
	                age = Integer.parseInt(data[5]);
	                date = data[6];
	                records.add(new Record(id, name, surname, gender, country, age, date));
	                contentLine = br.readLine();
	            }
	            
	        } catch (IOException ex) {
	            Logger.getLogger(SearchFromFile.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        return records;
	    }
	    
	    public int linearSearch(ArrayList<Record> array, String targetName){
	        
	        // Going one by one the elements in the array
	        for(int i = 0; i < array.size(); i++){
	            System.out.println("Testing: " + array.get(i).getName());
	            // When the element is found, stop the loop and return the index
	            if(array.get(i).getName().equals(targetName)){
	                return i;
	            }            
	        }
	        return -1;
	    }
}
