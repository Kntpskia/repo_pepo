package Java_2023.Base;

public enum I_Enum {
   CAT("Кот"),MAY("Мяу");


   private String transl;
    private I_Enum(String transl){ //создали конструктор
        this.transl=transl;

    }



    public String getTransl() {
        return transl;
    }


}
