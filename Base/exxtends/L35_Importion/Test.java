package Java_2023.Base.exxtends.L35_Importion;

 class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eating();

        Animal animal1= new Animal() { //Анонинмный класс,наследник класса animal
            public void eating() {
                System.out.println("Hrum");
            }
        };
        animal1.eating();




    }
}
