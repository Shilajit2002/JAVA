package FCFS;

import java.util.*;

class Process {
    //  Instance Variable
    int n;
    //  Process & Arrival Time & Burst Time
    private String process[];
    private int AT[];
    private int BT[];

    //  Completion Time & Turn Around Time & Waiting Time & Response Time
    private int CT[];
    private int TAT[];
    private int WT[];
    private int RT[];
    private double AWT = 0.0;
    private double ATA = 0.0;

    //  For Schedule the Array Value
    public void Schedule(String process[], int AT[], int BT[], int n) {
        this.n = n;
        //  Set the Array Size
        this.process = new String[n];
        this.AT = new int[n];
        this.BT = new int[n];

        this.CT = new int[n];
        this.TAT = new int[n];
        this.WT = new int[n];
        this.RT = new int[n];

        //  Set the Array Value
        for (int i = 0; i < n; i++) {
            this.process[i] = process[i];
            this.AT[i] = AT[i];
            this.BT[i] = BT[i];
        }
    }

    //  For Sorting
    public void Sort() {
        String pro;
        int j, key, burst;
        for (int i = 1; i < n; i++) {
            key = AT[i];
            pro = process[i];
            burst = BT[i];
            for (j = i - 1; j >= 0 && AT[j] > key; j--) {
                AT[j + 1] = AT[j];
                process[j + 1] = process[j];
                BT[j + 1] = BT[j];
            }
            AT[j + 1] = key;
            process[j + 1] = pro;
            BT[j + 1] = burst;
        }
    }

    //  Completion Time
    public void Completion() {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                CT[i] = AT[i] + BT[i];
            } else {
                if (CT[i - 1] >= AT[i]) {
                    CT[i] = CT[i - 1] + BT[i];
                } else {
                    int space = AT[i] - CT[i - 1];
                    CT[i] = CT[i - 1] + BT[i] + space;
                }
            }
        }
    }

    //  Turn Around Time
    public void TurnAround() {
        for (int i = 0; i < n; i++) {
            TAT[i] = CT[i] - AT[i];
            ATA += TAT[i];
        }
        ATA = ATA / n;
    }

    //  Waiting Time
    public void Waiting() {
        for (int i = 0; i < n; i++) {
            WT[i] = TAT[i] - BT[i];
            AWT += WT[i];
        }
        AWT = AWT / n;
    }

    //  Response Time
    public void Response() {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                RT[i] = AT[i];
            } else {
                if (CT[i - 1] >= AT[i]) {
                    RT[i] = CT[i - 1] - AT[i];
                } else {
                    RT[i] = AT[i] - AT[i];
                }
            }
        }
    }

    //  For Print
    public void Print() {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("====================================================================================================================");
                System.out.println("|Process\t| Arrival Time\t| Burst Time\t| Completion Time\t| Turn Around Time\t| Waiting Time\t| Response Time|");
                System.out.println("====================================================================================================================");
            }
            System.out.printf("|%-11s| %-14d| %-14d| %-18d| %-18d| %-14d| %-13d|\n", process[i], AT[i], BT[i], CT[i], TAT[i], WT[i], RT[i]);
        }
        System.out.println("====================================================================================================================");

        System.out.println("Average Turn Around TIme = " + ATA);
        System.out.println("Average Waiting Time = " + AWT);

        System.out.println("\n\tGnatt Chart");

        for (int i = 0; i < 8 * n + n + 1; i++) {
            System.out.print("-");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("|\t" + process[i] + "\t|");
        }
        System.out.println("");

        for (int i = 0; i < 8 * n + n + 1; i++) {
            System.out.print("-");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("0\t\t");
            }
            System.out.print(CT[i] + "\t\t");
        }
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total no. of process = ");
        int n = sc.nextInt();

        String process[] = new String[n];
        int AT[] = new int[n];
        int BT[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Process Name = ");
            process[i] = sc.next();
            System.out.print("Enter " + process[i] + " Arrival Time : ");
            AT[i] = sc.nextInt();
            System.out.print("Enter " + process[i] + " Burst Time : ");
            BT[i] = sc.nextInt();
        }

        Process P = new Process();
        P.Schedule(process, AT, BT, n);
        P.Sort();
        P.Completion();
        P.TurnAround();
        P.Waiting();
        P.Response();
        P.Print();
    }
}
