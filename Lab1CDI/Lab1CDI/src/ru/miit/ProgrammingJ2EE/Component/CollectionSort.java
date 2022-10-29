package ru.miit.ProgrammingJ2EE.Component;

import ru.miit.ProgrammingJ2EE.Interceptors.ProfileInterceptor;
import ru.miit.ProgrammingJ2EE.SortingMethods.IHeightSearch;
import ru.miit.ProgrammingJ2EE.SortingMethods.SQUARE_SIDE;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import java.util.List;

@Interceptors(ProfileInterceptor.class) // Перехватчик
public class CollectionSort<T> {
    /**
     * Внедрение аннотации. Точка внедрения.
     */
    @Inject
    @SQUARE_SIDE
    private IHeightSearch collectionSorter;

    public List<Double> sort(List<Double> list) {
        collectionSorter.sort(list);
        return list;
    }
}
