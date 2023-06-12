package Java_2023;


        public class Z_genericiii<T> {

            T ob; // объявление объекта типа T

            // Передать конструктору ссылку на объект типа T
            Z_genericiii(T o) {
                ob = o;
            }

            // Вернуть ob
            T getob() {
                return ob;
            }

            // Показать тип T
            void showType() {
                System.out.println("Тип T: " + ob.getClass().getName());
            }
        }

// Создаём Gen-ссылку для Integer
        //Gen<Integer> iOb;

// Создаём объект Gen<Integer>
        //iOb = new Gen<Integer>(77);

// Показать тип данных, используемый iOb
        ///iOb.showType();


