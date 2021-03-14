package com.company;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("checkstyle:LocalVariableName")
    public static void main(final String[] args)  {

        for (Country d : Country.values()) {
            System.out.println(d);
        }

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        try {
            System.out.println("страна " + Country.valueOf(input) + " " + Country.getOpen(Country.valueOf(input)));
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
            try {
                String countryIsOpen = Country.getOpen(Country.getByRuName(input));
                System.out.println("страна " + Country.getByRuName(input) + " " + countryIsOpen);
            } catch (NoSuchCountryException exception) {
                System.out.println("Страны '" + input + "' не существует.");
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка. Значение 'input' не должно быть 'null'");
        }


        }

    }

