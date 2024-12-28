Senaryo: Hastane Yönetim Sistemi 

Durum:

Hastalar, çeşitli bölümlerde (Kayıt, Doktor Görüşmesi, Test İşlemleri) işlem yapar.


Hasta bilgileri ve bazı genel bilgiler (örneğin, doktor bilgisi, bölüm bilgisi) tüm süreçlerde ortak kullanılır.


Hastalar üzerinde belirli analizler ve raporlamalar yapılır.

Desenlerin Rolü:

Sorumluluk Zinciri: Hastanın işlemleri, bir zincir boyunca sıralı şekilde farklı departmanlar tarafından ele alınır. (Örn: Kayıt -> Muayene -> Testler -> Tedavi).


Flyweight: Paylaşılan bilgiler, bellek kullanımını optimize etmek için saklanır. Örneğin, doktorların uzmanlık alanları ve hastane bölümleri.


Ziyaretçi: Raporlama ve analiz işlemleri her hasta için özelleştirilmiş davranışlarla gerçekleştirilir.
