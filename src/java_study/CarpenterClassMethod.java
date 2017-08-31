package java_study;

/**我是注释
 *
 */
public class CarpenterClassMethod {
   public static void main(String[] args)
    {
        System.out.println(Tools.sayHelloToPerson("小明"));
    }
}


abstract class Tools{
    public static String sayHelloToPerson(String name)
    {
        return String.format("Good Morning ,%s",name);

    }
    abstract void process();

}
