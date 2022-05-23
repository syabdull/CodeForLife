 import java.util.HashMap;
public class YetNew{
     public static void main(String[]args){
         HashMap<String,String>capi=new HashMap<String,String>();
          capi.put("Alampur","source");
           capi.put("telangana","force");
            capi.put("kalam","Abdul");
            System.out.println(capi.get("telangana"));
            System.out.println(capi.get("kalam"));
            for(String i:capi.keySet()){
                System.out.println(i);

            }
            for(String i:capi.values()){
                 System.out.println(i);
            }
            for(String i:capi.keySet()){
                System.out.println("key->"+i+"values->"+capi.get(i));
                 
            }
// All these are not in order when get printed 
// All these are not in order, when get printed 
// All these are not in orer , when get printed 
// All these  are not in order , when get  printed 
//All these are not in order , when get printed 
//All these are not in order ,when get printed 
          
     }
}