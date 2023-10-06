import random

dizi = []
cift_sayac=cift_toplam=tek_sayac=tek_toplam=0

for i in range(1000):
    dizi.append(random.randint(0,100))
    if dizi[i]%2==0:
        cift_sayac+=1
        cift_toplam+=dizi[i]
    else:
        tek_sayac += 1
        tek_toplam += dizi[i]

print(dizi)
print("------------------------------")
print("Tek sayı adedi = ",tek_sayac)
print("Tek sayı toplam =",tek_toplam)
print("Tek sayo ortlama =",tek_toplam/tek_sayac)
print("------------------------------")
print("Çift sayı adedi = ",cift_sayac)
print("Çift sayı toplam =",cift_toplam)
print("Çift sayo ortlama =",cift_toplam/cift_sayac)