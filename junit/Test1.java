import java.util.ArrayList;

import java.util.List;

 

import org.junit.Test; 

  

 public class Test1 { 

  

    

       @Test

    public  void testsch(){ 

              String name = "mm";

              int t1= 1;

              int t2 = 2;

              Work work = new Work(name, t1, t2);

              work.getPriority();

              Schedule result = new Schedule();

              List<Work> works=new ArrayList<Work>(); 

              works.add(work);

              result.FCFS(works);

 

    }

       

       @Test

           public  void testsch1(){ 

                     String name = "mm";

                     int t1= 1;

                     int t2 = 2;

                     Work work = new Work(name, t1, t2);

                     work.getPriority();

                     Schedule result = new Schedule();

                     List<Work> works=new ArrayList<Work>(); 

                     works.add(work);

                     result.SJF(works);

 

           }

       

       @SuppressWarnings("static-access")

       @Test

           public  void testsch2(){ 

                     String name = "mm";

                     int t1= 1;

                     int t2 = 2;

                     Work work = new Work(name, t1, t2);

                     work.getPriority();

                     Schedule result = new Schedule();

                     List<Work> works=new ArrayList<Work>(); 

                     works.add(work);

                     result.sortByServiceTime(works);

 

           }

 

 

       

 }

 

