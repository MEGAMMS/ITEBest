package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.Visa;

public class addVisaCardToDataBase {
    public addVisaCardToDataBase(){
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1234","0000",5000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1231","1111",10000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1232","1010",20000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1233","0101",30000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1334","0011",40000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1333","2222",50000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1244","3333",60000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-1444","4444",70000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-2234","1111",80000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-4444","5555",90000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-3333","6666",10000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-2222","7777",1500));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1224-1234-1234-4444","1100",90100));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1222-1234-1234-3333","2200",10300));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1232-1234-1234-2222","0022",1540));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1334-1234-1234-4444","2020",90500));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1233-1234-1234-3333","2021",10670));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1234-1234-1234-2222","2022",1580));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1333-1234-1234-4444","2023",90980));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"1444-1342-1234-3333","2024",10650));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"4234-4324-1234-2222","2025",1530)); 
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"4434-1424-1234-3333","2026",1000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"4444-1334-1234-2222","2027",500));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"4424-1134-1234-4444","2028",92000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"3241-1224-1234-3333","2029",10000));
        Database.VisaCards.add(new Visa(Database.VisaCards.size(),"3443-1244-1234-2222","2030",15300));
    }
}