package ru.miit.ProgrammingJ2EE.SortingMethods;

import java.util.List;

@SQUARE_SIDE
        //@Alternative
public class SquareSide implements IHeightSearch {
    @Override
    public List<Double> sort(List<Double> list) {
        System.out.println("Подсчет высоты по площади и сторне");
        Double s = 0.5* list.get(0)*list.get(1)*Math.sin( Math.toRadians(list.get(2)));
        Double c = Math.pow(Math.pow(list.get(0),2)+Math.pow(list.get(1),2)-2*list.get(0)*list.get(1)*Math.cos(Math.toRadians(list.get(2))),0.5);
        list.set(0,2*s/list.get(0));
        list.set(1,2*s/list.get(1));
        list.set(2,2*s/c);
        return list;
    }
}
