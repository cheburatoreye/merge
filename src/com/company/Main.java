package com.company;

import java.util.*;

public class Main {


//----------------------------------------------------------------------------------------------------------------------

    private static void mergeListHashSet(List<Car> listcars, Map<String,Car> hashmapcars) {
        Map<String,Car>database=new HashMap<>();
        Scanner sc=new Scanner(System.in);

//init
            String year;                            //год из List
            String yearHash;                        //год из HashSet
            int yearHashInt;                        //год из HashSet в int
            int yearmax=0;                          //год из List в int
//нахожу наибольший год в коллекции List
            for (int i=0;i<listcars.size();i++){
                year=listcars.get(i).getYear();
                int y=Integer.valueOf(year);
                if (yearmax<y){
                    yearmax=y;
                }
            }
//Перебор коллекции HashSet с целью найти авто с годом большим чем максимальный год из коллекции List. Добавление в список
            List<Car>listcars1=new ArrayList<>();
            for (Map.Entry<String, Car> item : hashmapcars.entrySet()) {
                if (item.getValue() != null) {
                    yearHash=item.getValue().getYear();
                    yearHashInt=Integer.valueOf(yearHash);
                    if (yearHashInt>yearmax){
                        listcars.add(item.getValue());
                    }
                }
            }

//Добавляю новый лист в базу
            for (Car item : listcars) {
                database.put(item.getVin(),item);
            }
            System.out.println("\n"+"merged using year");

//печатаю базу
            for (Map.Entry<String,Car> item:database.entrySet()
                 ) {
                System.out.println(item.getValue());
                //System.out.println(item.getValue().getModel()+" "+item.getValue().getYear());
            }

    }
//----------------------------------------------------------------------------------------------------------------------



    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
//Инициализация hashset машин
        Map<String,Car>hashset=new HashMap<>();
        Car car11=new Car("OEIHFUIUE945995","ВН4568ОУ","BMW","I3","123544","1985","red","sedan","500");
        Car car12=new Car("TGHEDSWIUE94342","ВН5555ОУ","OPEL","ZAFIRA","100654","1989","GREE","sedan","800");
        Car car13=new Car("OCEDFUIUE947952","ВН3214ОУ","OPEL","VECTRA","122654","1989","blue","sedan","2000");
        Car car14=new Car("TLHLTKELW568345","ВН32456ОУ","TOYOTA","COROLLA","320214","2019","grey","sedan","3000");
        Car car15=new Car("JSJFGKELW216448","ВН8523ОУ","TOYOTA","COROLLA","300214","2018","grey","sedan","2000");
        Car car16=new Car("TGOTGKGKEW21598","ВН8548ОУ","MAZDA","CX3","22132","2016","YELLOW","SEDAN","18000");
        Car car17=new Car("MNFJUIUE9459950","ВН4090ОУ","BMW","7","523544","1985","red","sedan","500");
        Car car18=new Car("KFIRWIUE9434651","ВН1055ОУ","OPEL","ASTRA","108654","1990","GREE","sedan","18050");
        Car car19=new Car("OCGREFUNG947952","ВН3214ОУ","OPEL","ASCONA","165654","1995","blue","sedan","2200");
        Car car20=new Car("TLHLKAQDO568345","ВН3254ОУ","TOYOTA","AVALON","421214","2004","GREEN","sedan","3800");
        Car car21=new Car("RGINEUIDEW21694","ВН7503ОУ","TOYOTA","SUPRA","201024","2010","grey","sedan","2010");
        Car car22=new Car("JIDEYHEFMW62448","ВН8198ОУ","MAZDA","CX6","2652132","2013","YELLOW","SEDAN","18900");
        hashset.put("OEIHFUIUE945995",car11);
        hashset.put("TGHEDSWIUE94342",car12);
        hashset.put("OCEDFUIUE947952",car13);
        hashset.put("TLHLTKELW568345",car14);
        hashset.put("JSJFGKELW216448",car15);
        hashset.put("TGOTGKGKEW21598",car16);
        hashset.put("MNFJUIUE9459950",car17);
        hashset.put("KFIRWIUE9434651",car18);
        hashset.put("OCGREFUNG947952",car19);
        hashset.put("TLHLKAQDO568345",car20);
        hashset.put("RGINEUIDEW21694",car21);
        hashset.put("JIDEYHEFMW62448",car22);
        System.out.println("\n"+"список HashSet");
        System.out.println(hashset);
        for (Map.Entry<String,Car> item:hashset.entrySet()){
           // System.out.println(item.getValue().getModel()+" "+item.getValue().getYear());
        }
       // System.out.print(hashset);
//----------------------------------------------------------------------------------------------------------------------
//Инициализация list машин
        List<Car>listcars=new ArrayList<>();
        Car car1=new Car("OEIFIFJEUE9459343","ВН988ОУ","BMW","I3","1235234544","1995","red","sedan","1500");
        Car car2=new Car("WDEFWSWSQX9675935","ВН7872ОУ","MAZDA","6","159234544","1998","black","sedan","1600");
        Car car3=new Car("XAZDDFWW945678343","ВН7785ОУ","NIVA","2111","1242387554","2003","blue","sedan","1800");
        Car car4=new Car("PLKIFJEUE54364323","ВН123ОУ","DAEWOO","LANOS","54124","2005","GREEN","sedan","3000");
        Car car5=new Car("PEFDWJEUE55696833","ВН273ОУ","DAEWOO","NIBURA","654124","2015","WHITE","sedan","3000");
        Car car6=new Car("WDHEUWW9457866693","ВН6782ОУ","NISSAN","MAXIMA","287554","2006","blue","sedan","1580");
        Car car7=new Car("WDHEUWW5637849373","ВН5762ОУ","NISSAN","OPTIMA","1487554","2008","blue","sedan","1400");
        Car car8=new Car("KHLFEEUW685347843","ВН4775ОУ","NISSAN","SUNNY","12487524","2006","GREEN","sedan","2300");
        Car car9=new Car("SWZXSUWW073479383","ВН5762ОУ","NISSAN","OPTIMA","1387554","2008","blue","sedan","1600");
        Car car10=new Car("MNLFEEUW655768343","ВН1732ОУ","CHERY","KIMO","12787524","2006","RED","sedan","3300");
        listcars.add(car1);
        listcars.add(car2);
        listcars.add(car3);
        listcars.add(car4);
        listcars.add(car5);
        listcars.add(car6);
        listcars.add(car7);
        listcars.add(car8);
        listcars.add(car9);
        listcars.add(car10);
        System.out.println("\n"+"список List");
        //System.out.println(listcars);
        for (Car item:listcars
             ) {
            //System.out.println(item.getMark()+" "+item.getYear());
            System.out.println(item);
        }
//----------------------------------------------------------------------------------------------------------------------
        mergeListHashSet(listcars, hashset);
    }
}
