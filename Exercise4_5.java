Ad Soyad: Cihan Akalın 
Ogrenci No: 250541107 
Odev No: 4_5

Soruların Cevapları:
1. zoop metodu ikinci kez çağrıldığında programın durumunu gösteren Stack Diyagramı

1) main başlar (Satır 10). bizz = 5, buzz = 2.

2) zoop("just for", 5) çağrılır (Satır 13). (1. Çağrı)

3) zoop çalışır, ping'i çağırır (Satır 4).

4) ping biter, zoop biter. Kontrol main'e döner (Satır 14).

5) clink(4) çağrılır (Satır 14). (2 * buzz = 4)

6) clink çalışır, "It's " yazdırılır (Satır 18).

7) zoop("breakfast ", 4) çağrılır (Satır 19). (2. Çağrı)





Konum	                       Metot Adı	                Parametreler	                   Yerel Değişkenler	           Geri Dönüş Adresi (Sonraki Satır)
En Üst (Aktif)	                zoop	                    fred = "breakfast ", bob = 4	     Yok	                               Satır 2
2.	                            clink	                    fork = 4	                         Yok	                               Satır 20
En Alt (Başlangıç)	            main	                    args (String[])	                     bizz = 5, buzz = 2	                   Satır 15


Satır	                          Metot	                          İşlem	                                      Çıktı	                       Açıklama
13	                              main	                          zoop("just for", 5) çağrısı		
2	                              zoop (1)	                      println("just for")	                      just for\n	               println satır sonu ekler.
3	                              zoop (1)	                      if (5 == 5) -> True		
4	                              zoop (1)	                      ping("not ") çağrısı		
23	                              ping	                          println("any " + "not " + "more ")          any not more \n	
14	                              main	                          clink(4) çağrısı		
18	                              clink	                          print("It's ")	                          It's	                       print satır sonu eklemez.
19	                              clink	                          zoop("breakfast ", 4) çağrısı		
2	                              zoop (2)	                      println("breakfast ")	                      breakfast \n	
3	                              zoop (2)	                      if (4 == 5) -> False		
6	                              zoop (2)	                      println("!")	                              !\n	
15	                              main	main sonu



Programın ürettiği çıktı:
    Sırasıyla;
"just for
any not more 
It's breakfast 
!"




    
