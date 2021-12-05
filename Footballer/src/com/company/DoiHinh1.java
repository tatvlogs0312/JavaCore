package com.company;

import java.util.ArrayList;
import java.util.Random;

public class DoiHinh1 {
    public void DoiHinh1(ArrayList<Player> list){
        ArrayList<Player> selectedTeam = new ArrayList<Player>();

        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;

        System.out.println("List player: ");
        while (gateKeeperSize < 1) { //Vì GK chỉ có 1 người nên vòng lặp sẽ dừng lại khi tìm được 1 người
            int rdGateKeeper = general.nextInt(22); //tìm cầu thủ ngẫu nhiên
            //Nếu cầu thủ ở vị trí ngẫu nhiên có vị trí là GK thì thêm vào danh sach
            if (list.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(list.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            //Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
            if (list.get(rdDefender).getPosition().equals(Position.DF) && !selectedTeam.contains(list.get(rdDefender))) {
                selectedTeam.add(list.get(rdDefender));
                defenderSize++;
            }
        }

        while (midFieldSize < 4) {
            int rdMidField = general.nextInt(22);
            if (list.get(rdMidField).getPosition().equals(Position.MF) && !selectedTeam.contains(list.get(rdMidField))) {
                selectedTeam.add(list.get(rdMidField));
                midFieldSize++;
            }
        }

        while (forwaderSize < 2) {
            int rdForwader = general.nextInt(22);
            if (list.get(rdForwader).getPosition().equals(Position.FW) && !selectedTeam.contains(list.get(rdForwader))) {
                selectedTeam.add(list.get(rdForwader));
                forwaderSize++;
            }
        }

        printlist(selectedTeam);
    }

    public static void printlist(ArrayList<Player> list){
        for (Player p: list) {
            System.out.println(p);
        }
    }
}
