package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("DistrictCount", DistrictCount.class,
                    "A map/reduce program that counts the trees in each districts.");

            programDriver.addClass("Existing_species", Existing_species.class,
                    "A map/reduce program that lists species.");

            programDriver.addClass("KindCount", KindCount.class,
                    "A map/reduce program that counts the number of trees by kinds");

            programDriver.addClass("MaxHeightKind", MaxHeightKind.class,
                    "A map/reduce program that displays the maxima height for each kind");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
