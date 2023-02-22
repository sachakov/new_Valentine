package animals;

public class Cat extends Animals implements Comparable<Cat>{

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

// это класс Кэт, можно и не начинать методом мэйн, создаем свои методы кастомные

        private String name;                  // в Классе Кэт объемили две переменные
        private int age;


        Cat(String name, int age){
            super(name, age);            //коструктор Кэт, принимающий стрингу и инт
            this.name = name;
            this.age = age;
        }

        // пишем метод-геттер для того, чтобы вытащить имя, т.к оно тут private (инкапсуляция) в другом классе его просто
        // напечатать нельзя (обратится), а тут метод, который можно вызвать и в другом классе и посмотреть name, так
        // реализован своего рода read only
        String getName () {
            return name;
        }

        public int getAge () {
            return age;
        }

        // также, из-за того, что переменные (нейм, эйдж) private, мы не можем в другом классе установить новое имя,
        //но можем написать метод-сеттер, для задания имени/возраста.
        public void setName (String name){
            this.name = name;
        }

        public void setAge ( int age){ // тут age - локальная переменная, доступна только в этом методе и нигде более
            if (age > 0) {    //добавили верификацию
                this.age = age;
            } else {
                throw new AssertionError("Age is negative value");
            }

        }
        public void say () {
            System.out.println("MEWWW - My name is  " + name);
        }
    }
