

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

/**
 *
 * @author haidar
 */
public class Ukl {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> Uang = new ArrayList<Integer>();
        Random rand = new Random();

        boolean lanjut = true;

        while (lanjut == true) {

            System.out.println("Masukkan Soal 1-7 : ");
            int soal = input.nextInt();
            input.nextLine();
            switch (soal) {

                case 1: {
                    System.out.println("Perhitungan Bilangan Prima(10-100) : ");

                    System.out.println("Masukkan Angka : ");
                    int angka = input.nextInt();
                    if (angka < 10 || angka > 100) {
                        System.out.println("Angka Salah");
                    } else {
                        boolean prima = true;

                        for (int x = 2; x < angka; x++) {
                            if (angka % x == 0) {
                                prima = false;
                            }
                        }

                        if (prima) {
                            System.out.println("Bilangan Prima");
                        } else {
                            System.out.println("Bukan Bilangan Prima");
                        }
                    }

                }
                break;

                case 2: {
                    int[] money = {1000000 ,100000 ,50000, 20000, 10000, 5000, 2000, 1000, 500, 250, 100, 50, 10};
                System.out.println("Masukkan Uang : ");
                    int uang = input.nextInt();

                    if (String.valueOf(uang).length() > 7) {
                        System.out.println("Gak bisa");
                    } else {
                        for (int i = 0; i < money.length; i++) {
                            int lembar = uang / money[i];
                            uang = uang % money[i];

                            if (lembar > 0) {
                                if (money[i] > 5) {
                                    System.out.println(lembar + " Lembar " + money[i]);
                                } else if (lembar < 5) {
                                    System.out.println(lembar + " Koin " + money[i]);
                                }
                                
                            }
                        }
                        
                        System.out.println("sisa " + uang);
                    }
                }

                //maksimal 7 digit, pecahan terbesar 50000, terkecil 1 koin
                break;

                case 3: {
                    boolean lanjut2 = true;

                    while (lanjut2 == true) {
                        String[] operasi = {"/", "*", "%", "+"};
                        System.out.println("Pilih Operator : ");
                        String op = input.next();

                        int c = rand.nextInt(99) + 1;
                        int d = rand.nextInt(99) + 1;

                        if (op.equals("/") || op.equals("%")) {
                            if (c < d) {
                                int temp = c;
                                c = d;
                                d = temp;

                            }

                        }

                        int jawaban = 0;
                        switch (op) {
                            case "/":
                                jawaban = c / d;
                                break;
                            case "*":
                                jawaban = c * d;
                                break;
                            case "%":
                                jawaban = c % d;
                                break;
                            case "+":
                                jawaban = c + d;
                                break;
                        }

                        System.out.println("Berapa Hasil Dari " + c + " " + op + " " + d + " =?");
                        int jawabanuser = input.nextInt();

                        if (jawabanuser == jawaban) {
                            System.out.println("Jawaban benar");
                        } else if (jawabanuser != jawaban) {
                            System.out.println("Salah Jawabannya adalah " + jawaban);
                        }

                        System.out.println("Mau Lagi tidak? (y/n)");
                        String jawaban2 = input.next();
                        if (jawaban2.equalsIgnoreCase("n")) {
                            System.out.println("Baik");
                            lanjut2 = false;
                        }

                    }

                }
                break;

                case 4: {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    System.out.println("Mau berapa angka? ");
                    int list2 = input.nextInt();

                    for (int y = 0; y < list2; y++) {
                        System.out.println("Masukkan Angka " + (y + 1 + ":"));
                        int angkaa = input.nextInt();
                        list.add(angkaa);
                    }

                    System.out.println("List : " + list);

                    Set<Integer> unique = new HashSet<>();
                    Set<Integer> duplicates = new HashSet<>();

                    for (int num : list) {
                        if (!unique.add(num)) {
                            duplicates.add(num);
                        }
                    }

                    if (duplicates.isEmpty()) {
                        System.out.println("Tidak ada bilangan duplikat");
                    } else {
                        System.out.println("Ada duplikat " + duplicates);
                    }

                }
                break;

                case 5: {
                    ArrayList<Integer> Robot = new ArrayList<Integer>();
                    ArrayList<Integer> Player = new ArrayList<Integer>();
                    int PlayerMenang = 0;
                    int RobotMenang = 0;
                    System.out.println("Permainan Dadu robot vs player");
                    for (int h = 1; h <= 5; h++) {
                        int f = rand.nextInt(6) + 1;
                        Robot.add(f);
                        System.out.println("Bilang Ya untuk melakukan lemparan dadu");
                        String lempar = input.nextLine();

                        if (lempar.equalsIgnoreCase("Ya")) {
                            System.out.println("Pilih dadu (1-6) : ");
                            int pilihan = input.nextInt();
                            Player.add(pilihan);

                            System.out.println("Robot : " + f);
                            System.out.println("Player : " + pilihan);

                            if (f > pilihan) {
                                System.out.println("Robot Menang");
                                RobotMenang++;
                            } else if (f < pilihan) {
                                System.out.println("Player Menang");
                                PlayerMenang++;
                            } else if (f == pilihan) {
                                System.out.println("Seri");
                                RobotMenang++;
                                PlayerMenang++;

                            }
                        }
                        input.nextLine();
                    }

                    System.out.println("");
                    if (RobotMenang > PlayerMenang) {
                        System.out.println("Robot Pemenangnyaa!!");
                    } else if (RobotMenang < PlayerMenang) {
                        System.out.println("Player yang menang!!");
                    } else if (RobotMenang == PlayerMenang) {
                        System.out.println("Serii");
                    }
                    System.out.println(Robot);
                    System.out.println(Player);

                }
                break;

                case 6: {

                    int kata = 2000;
                    int katb = 1500;
                    int katc = 1000;
                    int katd = 5000;
                    int denda = 0;
                    int total1 = 0;
                    int awal = 0;
                    System.out.println("Nama peminjam : ");
                    String nama = input.nextLine();
                    System.out.println("Judul Buku : ");
                    String Judul = input.nextLine();
                    System.out.println("Kategori buku(A,B,C,D) : ");
                    String kat = input.next();
                    System.out.println("Lama peminjaman (hari) : ");
                    int lama = input.nextInt();

                    if (kat.equalsIgnoreCase("A")) {
                        total1 = kata * lama;
                        awal = kata * lama;
                    } else if (kat.equalsIgnoreCase("B")) {
                        total1 = katb * lama;
                        awal = katb * lama;
                    } else if (kat.equalsIgnoreCase("C")) {
                        total1 = katc * lama;
                        awal = katc * lama;
                    } else if (kat.equalsIgnoreCase("D")) {
                        total1 = katd * lama;
                        awal = katd * lama;
                    }

                    if (lama > 7) {
                        int terlambat = lama - 7;
                        denda = terlambat * 500;
                        total1 += denda;
                    }

                    System.out.println("Rincian");
                    System.out.println("Nama : " + nama);
                    System.out.println("Judul Buku : " + Judul);
                    System.out.println("Kategori Buku : " + kat);
                    System.out.println("Lama pinjam : " + lama);
                    System.out.println("Biaya Awal; : " + awal);
                    System.out.println("Denda : " + denda);
                    System.out.println("Total: " + total1);

                }
                break;

                case 7: {

                    ArrayList<String> cookies = new ArrayList<String>();
                    ArrayList<Integer> totalbiaya = new ArrayList<Integer>();
                    ArrayList<Integer> totalpendapatan = new ArrayList<Integer>();
                    ArrayList<Integer> labarugi = new ArrayList<Integer>();
                    ArrayList<String> stts = new ArrayList<String>();
                    int status = 0;

                    System.out.println("Masukkan jumlah cookies : ");
                    int cook = input.nextInt();
                    input.nextLine();
                    for (int j = 0; j < cook; j++) {
                        System.out.println("Cookies ke " + (j + 1));
                        System.out.println("Nama cookies : ");
                        String namacook = input.nextLine();
                        cookies.add(namacook);
                        System.out.println("Harga Porduksi Per Bungkus : ");
                        int hargapb = input.nextInt();
                        System.out.println("Harga Jual Per Bungkus : ");
                        int hargajp = input.nextInt();
                        System.out.println("Jumlah Terjual : ");

                        int jmlh = input.nextInt();
                        int tb = hargapb * jmlh;
                        totalbiaya.add(tb);
                        int tp = hargajp * jmlh;
                        totalpendapatan.add(tp);
                        int rugi = tp - tb;
                        labarugi.add(rugi);
                        if ((tp - tb) < 0) {
                            stts.add("Rugi");
                        } else if ((tp - tb) > 0) {
                            stts.add("Laba");
                        }
                        input.nextLine();

                    }

                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Statis");
                    System.out.println("--------------------------------------------------------------------");
                    for (int n = 0; n < cook; n++) {
                        System.out.println(cookies.get(n) + " | " + totalbiaya.get(n) + " | " + totalpendapatan.get(n) + " | " + labarugi.get(n) + " | " + stts.get(n));

                    }
                    System.out.println();
                    
                    int biayat = totalbiaya.get(0);
                    int perbandiangan = 0;
                    int indextertinggi = 0;
                    
                    
                    for (int k = 1; k < totalbiaya.size(); k++){
                      if (totalbiaya.get(k) > biayat){
                      biayat = totalbiaya.get(k);
                      indextertinggi = k;
                        
                    }
                      
                        
                    
                    }
                    System.out.println("Biaya Termahal dimenangkan oleh "+cookies.get(indextertinggi) + " dengan biaya produksi sebesar "+ biayat);

                }
                break;

            }
            System.out.print("Lanjut tidak? (y/n)");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
                System.out.println("Terimakasih");
                System.exit(0);
            } else {
                lanjut = true;
            }

        }
    }
}
