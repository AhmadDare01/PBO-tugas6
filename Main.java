/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            Manusia mns1 = new Manusia("MUNIR", "215150601111014", false, true);
            Manusia mns2 = new Manusia("WIRDA", "215150601111015", true, true);
            Manusia mns3 = new Manusia("MANSUR", "205150601111017", true, false);
            ArrayList<Manusia> output = new ArrayList<Manusia>();
            output.add(mns1);
            output.add(mns2);
            output.add(mns3);

            System.out.println("===== CLASS MANUSIA =====");
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i).toString());
            }
            System.out.println("==========================");

            Mahasiswa mhs1 = new Mahasiswa("ADI", "3506272311030002", false, false, "215150601111056", 3.2);
            Mahasiswa mhs2 = new Mahasiswa("WINDAH", "3507142212010003", false, true, "215150601111007", 4.5);
            Mahasiswa mhs3 = new Mahasiswa("BASUDARA", "3506290106030001", false, false, "215150600111034", 3.0);
            ArrayList<Mahasiswa> output1 = new ArrayList<Mahasiswa>();
            output1.add(mhs1);
            output1.add(mhs2);
            output1.add(mhs3);

            System.out.println();
            System.out.println("====== DAFTAR MAHASISWA ======");
            for(int i=0;i<output1.size();i++){
                System.out.println(output1.get(i).toString());
            }
            System.out.println("=====================================");

            Pekerja pkj1 = new Pekerja("AZZRAH", "351167356892568", false, true, 7, 28, "13654331");
            Pekerja pkj2 = new Pekerja("AYU", "351198743076268", true, false, 11, 22, "13654331");
            Pekerja pkj3 = new Pekerja("SAGITA", "3511075378294610", false, true, 15, 16, "13654331");
            ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
            output2.add(pkj1);
            output2.add(pkj2);
            output2.add(pkj3);

            System.out.println();
            System.out.println("========== CLASS PEKERJA ==========");
            for(int i=0;i<output2.size();i++){
                System.out.println(output2.get(i).toString());
            }
            System.out.println("===================================");

            Manager mnj1 = new Manager("INDAH", "3415272304050003", false, true,8, 27,"1654311", 3789);
            Manager mnj2 = new Manager("SANIA", "3415220712560004", false, false,9, 26,"1654311", 3789);
            Manager mnj3 = new Manager("PUTRI", "3426471309020005", true, true,11, 22,"1654311", 3432);
            ArrayList<Manager> output3 = new ArrayList<Manager>();
            output3.add(mnj1);
            output3.add(mnj2);
            output3.add(mnj3);

            System.out.println();
            System.out.println("=========== CLASS MANAGER ==========");
            for(int i=0;i<output3.size();i++){
                System.out.println(output3.get(i).toString());
            }
            System.out.println("=====================================");

        }
    }