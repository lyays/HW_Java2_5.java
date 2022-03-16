package java2hw.hw5;

import java2hw.hw2.MyArrayDataException;

import java.util.Arrays;

public class AppData {
        private String[] header;
        private int[][] data;

        public AppData(String[] header, int[][] data) {
                this.header = header;
                this.data = data;
        }

        public String toString() {
                String result = "";
                for(int i=0; i<header.length; i++){
                        result=result+header[i];
                        if(i<header.length-1){
                                result=result+";";
                        }
                }
                result=result+"\r\n";
                for (int i = 0; i < data.length; i++) {  //идём по строкам
                        for (int j = 0; j < data[i].length; j++) {   //идем по столбцам
                                result=result+data[i][j];
                                if(j<data[i].length-1){
                                        result=result+";";
                                }
                        }
                        if(i<data.length-1){
                                result=result+"\r\n";
                        }

                }
                return result;
        }

}
