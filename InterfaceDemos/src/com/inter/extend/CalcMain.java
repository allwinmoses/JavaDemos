package com.inter.extend;

import com.inter.basics.ICompressor;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new BasicCalculator();
        iCalculator.add(10,20);
        IScientific scientific=new ScientificCal();
        scientific.cube(3);
        scientific.add(1,10);
        scientific.sub(1,0);

    }
}
