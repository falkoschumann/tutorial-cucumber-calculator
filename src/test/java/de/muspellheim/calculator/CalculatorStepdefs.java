/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Falko Schumann
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.muspellheim.calculator;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Gegebensei;
import cucumber.api.java.de.Wenn;

import static org.junit.Assert.assertEquals;

/**
 * Implementiert die Schritt des Tests der Funktionalitäten des Taschenrechners.
 */
public class CalculatorStepdefs {

    private Calculator calculator = new Calculator();

    @Gegebensei("^ich habe (\\d+) im Taschenrechner eingegeben$")
    public void zahlEingegeben(int zahl) throws Throwable {
        calculator.enter(zahl);
    }

    @Wenn("^ich Addieren drücke$")
    public void addieren() throws Throwable {
        calculator.add();
    }

    @Dann("^sollte das Ergebnis (\\d+) auf dem Bildschirm erscheinen$")
    public void pruefeErgebnis(int erwartetesErgebnis) throws Throwable {
        assertEquals(erwartetesErgebnis, calculator.result());
    }

}
