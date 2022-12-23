package project_utils;

public class StringMethods {



    public String farewell (String str){

        if (!str.isEmpty()){
            String tremed = str.trim();

            if (str.length() == tremed.length()){

                return "Пробелов не было";
            }

            return "Лишние пробелы удалены";
        }

        return "Строка пустая";
    }

}





