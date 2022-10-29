package ru.miit.ProgrammingJ2EE.SortingMethods;

import javax.enterprise.inject.Default;
import java.util.List;


@Default
public class ThreeLong implements IHeightSearch {
    @Override
    public List<Double> sort(List<Double> list) {
        System.out.println("Подсчет высоты через длины всех сторон");
        Double c = Math.pow(Math.pow(list.get(0),2)+Math.pow(list.get(1),2)-2*list.get(0)*list.get(1)*Math.cos(Math.toRadians(list.get(2))),0.5);
        Double p = (list.get(0)+list.get(1)+c)/2;
        list.set(0,2*Math.pow(p*(p-list.get(0))*(p-list.get(1))*(p-c),0.5)/list.get(0));
        list.set(1,2*Math.pow(p*(p-list.get(0))*(p-list.get(1))*(p-c),0.5)/list.get(1));
        list.set(2,2*Math.pow(p*(p-list.get(0))*(p-list.get(1))*(p-c),0.5)/c);
        return list;
    }
}
