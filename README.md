Se considera un magazin de jucarii in care un cumparator poate achizitiona o jucarie, cerand pentru a o impacheta si o cutie pe masura dimensiunii jucarii.
Pentru a rezolva problema am folosit Factory Design Pattern. 
Am creat 3 pachete: Cutie, Jucarii si Magazin.
In primul pachet, am creat clasele pentru jucariile care pot avea diferite forme( cilindru, cub, paralelipiped) cu atributele care descriu dimensiunile acestora, cat si metodele necesare.
In pachetul Jucarii, am creat clase pentru 3 tipuri de jucarii: Avion, Minge, Racheta care extind clasa abstracta Jucarie. Clasa FabricaCutii, construita cu ajutorul patternului Factor, contine o constructie de obiecte de cutii pe baza dimensiunilor jucarii cerute.
In ultimul pachet, am creat clasa Main care construieste 3 obiecte pentru 3 jucarii diferite. Se afiseaza jucaria, alaturi de cutie, pretul jucariei, plus a cutiei, astfel incat cumparatorul sa aiba o evidenta a pretului per jucarie+cutie.
Datorita implementarii celor 3 obiecte intr-un tablou polimorfic, am reusit la final sa afisez suma totala a tuturor achizitiilor.

Thank u!:D
