/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variable
        int numPar = 0;
        boolean introOK = false;
        boolean parOK = false;
        
        do {
            do {
                try {
                    System.out.print("Introduce un número par: ");
                    numPar = SCN.nextInt();
                    introOK = true;
                } catch (Exception e) {
                    System.out.println("ERROR: Introduce un número par");
                } finally {
                    SCN.nextLine();
                }
            } while (!introOK);

            parOK = numPar % 2 == 0;

        } while (!parOK);

        System.out.printf("Número par ...:  %d%n", numPar);
    }
}