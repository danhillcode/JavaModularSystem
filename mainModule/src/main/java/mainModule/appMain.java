package mainModule;


//import java.util.ServiceLoader;
//RUN FROM HERE

import Greeter.Greet;

public class appMain { //implements Greetings {


    public static int age(int number) {
        return number;
    }

    public static void main(String[] args) {
        System.out.println(new Greet().regular("there"));



        //System.out.println(new Greeting().age(11));
        //System.out.println(age(110));


       /* Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class);
        for(Analyzer analyzer: analyzers){
            if(analyzer.getName() == "A1"){
                System.out.println("A1 found");
            }
*/
        }

    }
