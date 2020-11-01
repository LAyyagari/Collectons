import java.util.*;
public class Hey
    
    
{

    public static void main(String[] args)
    {
        HashMap<String, String> hash_map = new HashMap<String, String>();

        hash_map.put("10", "Sai");
        hash_map.put("15", "Siri");
        hash_map.put("20", "Sai Nidhi");
        hash_map.put("25", "Well");
        hash_map.put("30", "You");

        System.out.println("Total People: " + hash_map);

        for (Map.Entry<String,String> entry : hash_map.entrySet())
        {
            if (entry.getValue().startsWith("S"))
            {
                System.out.println(entry.getValue());
            }

        }



    }
}
