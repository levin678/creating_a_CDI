package ru.miit.ProgrammingJ2EE;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import ru.miit.ProgrammingJ2EE.Component.CollectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class lab1Start {
    protected static Weld weld;
    protected static WeldContainer container;

    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int i,i1,k,g,l,h,j;
            k=0;
            for (i = 0; i < n-1; ++i) {
                k=k+(int)Math.pow(2,i);
            }
            g=0;
            for (i = 1; i < n; ++i) {
                g=g+(int)Math.pow(2,i*2-1);
            }
            for (i = k; i <= g; ++i) {
                String s="(";
                String v="";
                l=0;
                h=0;
                j=1;
                for (i1 = 2*(n-1)-1; i1 >= 0; --i1){
                    if ((i/(int) Math.pow(2, i1))%2==0){
                        s=s+"(";
                        l++;
                        if (j>=0){
                            ++j;
                        }
                    }
                    else {
                        s=s+")";
                        h++;
                        if (j>=0){
                            --j;
                        }
                    }
                }
                s=s+")";
                if ((l==h)&&(l==n-1)&&(j==1)) {
                    //System.out.println(i+" "+s);
                    v=s;
                }
                    s="(";
                    j=1;
                    for (i1 = 2*(n-1)-1; i1 >= 0; --i1){
                        if ((i/(int) Math.pow(2, i1))%2==0){
                            s=s+"(";

                            if (j>=0){
                                ++j;
                            }
                        }
                        else {
                            s=s+")";

                            if (j>=0){
                                --j;
                            }
                        }
                    }
                    s=s+")";
                    if ((j==1)&&(v!=s)){
                        System.out.println(v+"   "+s);
                    }

            }






            CollectionSort collectionSort = container.instance().select(CollectionSort.class).get();

            //List<Integer> integerList = Arrays.asList(6,23,35,12,7,41,3,9,4,8,12,5,2);
            List<Double> integerList = new ArrayList<Double>();
            integerList.add(new Double(Math.random()*9+1));
            integerList.add(new Double(Math.random()*9+1));
            integerList.add(new Double(Math.random()*178+1));
            //integerList.add(new Double(4));
            //integerList.add(new Double(3));
            //integerList.add(new Double(90));

                integerList.set(0,new Double(Math.random()*9+1));
                integerList.set(1,new Double(Math.random()*9+1));
                integerList.set(2,new Double(Math.random()*178+1));
                System.out.println("сторона, сторона, угол");
                System.out.println(integerList);
                collectionSort.sort(integerList);
                System.out.println("высота при a, высота при b, высота при c");
                System.out.println(integerList);

        }
        finally {
            weld.shutdown();
        }
    }
}
