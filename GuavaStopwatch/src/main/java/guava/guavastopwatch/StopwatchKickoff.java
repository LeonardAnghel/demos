package guava.guavastopwatch;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

public class StopwatchKickoff {

    public static void startProcess() {
        System.out.println("Starting process ... this will take some while ...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Hmmm ... I was starting a process here!", e);
        }

        System.out.println("Process successfully started!");
    }

    public static void printElapsedTime(final Stopwatch stopwatch) {
        if (stopwatch.isRunning()) {
            System.out.println("WARNING... Your stopwatch is still running!");
        } else {
            System.out.println("\t" + stopwatch.toString());
            System.out.println("\t" + stopwatch.elapsed(TimeUnit.MINUTES) + " minutes");
            System.out.println("\t" + stopwatch.elapsed(TimeUnit.SECONDS) + " seconds");
            System.out.println("\t" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + " milliseconds");
            System.out.println("\t" + stopwatch.elapsed(TimeUnit.NANOSECONDS) + " nanoseconds");
        }
    }

    public static void main(String[] args) {

        final Stopwatch stopwatch = Stopwatch.createUnstarted();

        stopwatch.start();
        startProcess();
        stopwatch.stop();
        printElapsedTime(stopwatch);
    }
}
