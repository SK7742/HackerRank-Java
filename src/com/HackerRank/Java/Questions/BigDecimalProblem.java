package com.HackerRank.Java.Questions;
import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
class BigDecimalProblem{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        char text = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        System.out.println(text);
        sc.useLocale(Locale.ENGLISH);
        List<Double> data = new ArrayList<Double>();
        for(int i=0;i<2;i++){
        	double text2 = sc.nextDouble();
        	data.add(text2);
        }
        String []s=new String[2];
        Comparator<BigDecimal> desc = 
        		((BigDecimal o1, BigDecimal o2)->  {
        			return o1.compareTo(o2);
        		});
        sc.close();

		/*
		 * List<BigDecimal> list = data.stream().sorted().toList();
		 * 
		 * list.forEach(System.out::println);
		 */
    }
}