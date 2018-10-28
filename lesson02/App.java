package ru.kravchenko.se;

/**
 * home work lesson 02
 */

public class App 
{
   static int SIZE_CONSTANT = 4; // константа размера массива
   static String arrays[][] = new String[4][4];
   static int sumArrays = 0;

    public static void main( String[] args )
    {
        int count = 0;                              // наполняем массив строчными цифрами по порядку
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j <arrays.length ; j++) {
                arrays[i][j] = String.valueOf(count);
                count++;
            }
        }
        arrays[3][1] = "qqq"; // добавляем не корректные символы в массив
        arrays[3][2] = ";";
        arrays[3][3] = "%%";

        showArrays(arrays);
        arraysMethod(arrays);
    }

    /**
     * Основной метод, где происходит вся логика задания.
     * @param arrays двумерный массив
     */

    static void arraysMethod(String[][] arrays){
        if(arrays.length != SIZE_CONSTANT || arrays[0].length != SIZE_CONSTANT){  // проверка размеров массива (4х4)
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.err.println("Out bounds of size constant arrays (SIZE_CONSTANT = 4)");
                e.getStackTrace();
            }
        }

        for (int i = 0; i <arrays.length ; i++) { // проверка корректности элемента
            for (int j = 0; j < arrays.length; j++) {
                int tmp = 0;
                try {
                    tmp = Integer.parseInt(arrays[i][j]);
                } catch (Exception ex){
                    try {
                        throw new MyArrayDataException();
                    } catch (MyArrayDataException e) {
                        System.err.println("Not correct elemet '" + arrays[i][j] + "' (line: " + i + " column: " + j + ")");
                    }
                }
                sumArrays += tmp;
            }
        }
        System.out.println("Sum elements of arrays: " + sumArrays);
    }

    /**
     * Метод для вывода двумерного массива. Вспомогательный метод.
     * @param arrays двумерный массив
     */

    static void showArrays(String[][] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j < arrays.length ; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
