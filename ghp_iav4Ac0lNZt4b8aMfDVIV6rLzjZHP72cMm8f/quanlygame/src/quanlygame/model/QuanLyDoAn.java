package quanlygame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class QuanLyDoAn {

	public static void main(String[] args) throws  CloneNotSupportedException {
        VuKhi vk1 = new CungTen(20.9, 100);
        VuKhi vk2 = new Choi(20.2, 80);
        //
        List<NhanVat> dsnv = new ArrayList<NhanVat>();
        PhuThuy pt1 = new PhuThuy(true, true, "dirak", 15, 1.5, new Choi(180, 80));
        PhuThuy pt2 = new PhuThuy(false, true, "syndra", 17, 2.9, new Choi(190, 50));
        dsnv.add(pt1);
        dsnv.add(pt2);
        //
        KyBinh kb1 = new KyBinh(true, true, true, "master yi", 15, 209);
        KyBinh kb2 = new KyBinh(false, true, true, "leesin", 17, 390);
        dsnv.add(kb1);
        dsnv.add(kb2);
        
        for(NhanVat item: dsnv){
            System.out.println(item);
        }
        //
          Collections.sort(dsnv, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return Integer.compare(o1.getCapdo(), o2.getCapdo());
            }
        });
        System.out.println("");
        System.out.println("Sap Xep Theo Level");
        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }
        //
        Collections.sort(dsnv, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        System.out.println("");
        System.out.println("Sap Xep Theo Ten");
        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }
        //
        Predicate<NhanVat> dk_nv = new Predicate<NhanVat>() {
            @Override
            public boolean test(NhanVat t) {
                return t.getCapdo()<= 15 && t.getCapdo()>= 3;
            }
        };
        //
         List<NhanVat> lknv = dsnv.stream()
                .filter(dk_nv)
                .toList();
        System.out.println("");
        System.out.println("Liet ke nhan vat lv 3 - 15");
        for (NhanVat nhanVat : lknv) {
            System.out.println(nhanVat);
        }
        //
        BinhDoan bd1 = new BinhDoan(69, true);
        BinhDoan bd2 = new BinhDoan(3, false);
        kb1.addBinhDoan(bd2);
        kb2.addBinhDoan(bd1);
        System.out.println("okpokoko");
        for(NhanVat item: dsnv){
            System.out.println(item);
        }
        System.out.println("");
        DoiQuan dq = new DoiQuan(1);
        dq.addBinhDoan(bd2);
        dq.addBinhDoan(bd1);
        System.out.println(dq);
    }



}
