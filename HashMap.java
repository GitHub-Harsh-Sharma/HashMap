import java.util.HashMap;
import java.util.Map;
class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        print(map);
        map.put("Vishal",10);
        map.put("Sachin",30);
        map.put("Vaibhav",20);
        map.put("Neha",20);
        map.put("Vishal",50);
        System.out.println("Size of map is:- "+map.size());
        print(map);
        if(map.containsKey("Vishal"))
        {
            Integer a=map.get("Vishal");
            System.out.println("value for key\"vishal\"is;-"+a);
        }
        map.clear();
        print(map);
    }
    public static void print(Map<String,Integer>map) 
    {
        if(map.isEmpty())
        {
            System.out.println("map is empty");
        }
        else
        {
            System.out.println(map);
        }
    }
}
