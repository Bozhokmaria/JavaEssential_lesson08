package task1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();

        try {

           for (int i = 0; i <= 5; i++){
            workers.add(createWorker());
        }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Collections.sort(workers, new Comparator<Worker>() {
            public int compare(Worker s1, Worker s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for (int i = 0; i < workers.size(); i++) {
            int exp = workExperiance(workers.get(i).getYear());
            if (exp>5) {
                System.out.println("Experiance " + workExperiance(workers.get(i).getYear()) + " years, worker name " + workers.get(i).getName());
            }
        }


    }

        public static int workExperiance(int year) {
            int now = 2020;
            int exp= now - year;
             return exp;
    }

    public static Worker createWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print worker name");
        String name = scanner.nextLine();

        System.out.println("Print workers position");
        String position = scanner.nextLine();

        System.out.println("Print year worker came to company");
        int year = scanner.nextInt();

        if (year>2020||year<1940){
            throw new IllegalArgumentException("Wrong year");
        }

        Worker worker = new Worker(name, position,year);
        return worker;
    }
}
//"C:\Program Files\Java\jdk1.8.0_271\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.3\lib\idea_rt.jar=65044:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_271\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\rt.jar;C:\Users\VsemPK\JavaEssential_lesson08\out\production\JavaEssential_lesson08" task1.Main
//Print worker name
//k
//Print workers position
//k
//Print year worker came to company
//1996
//Print worker name
//a
//Print workers position
//a
//Print year worker came to company
//2015
//Print worker name
//f
//Print workers position
//f
//Print year worker came to company
//1997
//Print worker name
//l
//Print workers position
//l
//Print year worker came to company
//2010
//Print worker name
//b
//Print workers position
//b
//Print year worker came to company
//2019
//Print worker name
//g
//Print workers position
//g
//Print year worker came to company
//1993
//Experiance 23 years, worker name f
//Experiance 27 years, worker name g
//Experiance 24 years, worker name k
//Experiance 10 years, worker name l

// Print worker name
//a
//Print workers position
//a
//Print year worker came to company
//1880
//Wrong year