package Collection_List;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Student> {

// для быстрого оверрайда - альт+инсерт - имплемент методс и первый выбрал, дописал this...
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
