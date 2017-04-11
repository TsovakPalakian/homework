package by.htp.test1optionA;

public class Main {
//0. Если возможно, создать подкласс для класса. Ответ обосновать.

    class Policy {
        private int a;
        Policy(int a){
            this.a=a;}
    }
    //Класс Policy является вложенным классом. Поэтомому создать подкласс вложенного класса не представляется возможным.

//1. В строки, помеченные комментариями //1 и //2, записать оптимальные вызовы метода execute()

    class Hope {
        public /*static*/ void execute(){}
        private void taste(){//1
            execute();
        }
    }
    class Dream {
        private Float taste(){//2
            //Hope.execute();
            return 1F;
        }
    }
//2.  Записать реализацию интерфейса

    interface Application {
        void hello();
    }

    public class Rent implements Application {
        @Override
        public void hello() {

        }
    }

//3. Если возможно, создать подкласс абстрактного класса. Ответ обосновать
    abstract class Cook {
        protected abstract void sell();
    }
    //Да, есть такая возможность. Модификатор protected поля sell делает его видимым в подклассах и в классах пакета, где класс содержащий это поле расположен.
    //Модификатор protected являестя ни чем иным, как модификатором более строгим чем public, но менее строгим, чем private.
    //Поэтому никаких ограничений на создание подкласса нет.

//4. Реализовать метод hashCode для класса
    class Quest {
        private int a;
        private short b;

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + (int) b;
            return result;
        }
    }

//5. Реализовать метод equals для класса
    class Bus {
        protected String type;

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Bus bus = (Bus) o;

            return type != null ? type.equals(bus.type) : bus.type == null;

        }
}
//6. Дана строка вида String num = "1234"; преобразовать к int n четырьмя способами.
    public static void main(String[] args) {
        String s = "1234";
        int n1 = Integer.parseInt(s);
        int n2 = Integer.valueOf(s);
        Integer n3 = new Integer(s);

        int n5 = 0;

        for (int i = 0; i < s.length(); i++) {
            int factor = 1;
            int n4 = s.charAt(i) - '0';
            for (int j = i; j < s.length() - 1; j++) {
                factor *= 10;
            }
            n5 += n4*factor;
        }
    }
}
