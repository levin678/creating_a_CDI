package ru.miit.ProgrammingJ2EE.SortingMethods;

import javax.enterprise.inject.Alternative;
import java.util.List;

@Alternative
public class SideAngle implements IHeightSearch {
    @Override
    public List<Double> sort(List<Double> list){
        System.out.println("Подсчет высоты через длину прилежащей стороны и синус угла");
        Double c = Math.pow(Math.pow(list.get(0),2)+Math.pow(list.get(1),2)-2*list.get(0)*list.get(1)*Math.cos(Math.toRadians(list.get(2))),0.5);
        Double sina=(Math.pow(list.get(0),2)+Math.pow(c,2)-Math.pow(list.get(1),2))/(2*list.get(0)*c);
        list.set(0,list.get(0)*Math.sin(Math.toRadians(list.get(2))));
        list.set(1,list.get(1)*Math.sin(Math.toRadians(180-sina-list.get(2))));
        list.set(2,c*Math.sin(Math.toRadians(sina)));
        return list;
    }
}
