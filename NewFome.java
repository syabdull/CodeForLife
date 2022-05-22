import java.util.HashMap; 
 public class NewFome{
     public static void main(String[]args){
         HashMap<String,String>capitalCities=new HashMap<String,String>();
         capitalCities.put("Telangana","Hyd");
          capitalCities.put("Ap","Amravati");
          capitalCities.put("karnataka","Banglore");
          System.out.println(capitalCities.get("Telangana"));

     }
 }