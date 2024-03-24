package com.berkay.solid;

public class Runner {
    public static void main(String[] args) {
        /**
         * SOLID
         * Amaç;
         * - Kodlarınızı daha esnek ve geliştirilebilir kılar.
         * - Kodun yeniden kullanılabilirliğini arttırır.
         * - Kodların anlaşılır olmasını ve okunurluğunu sağlar.
         * - Kodların gereksiz tekrarlarını engeller.
         * - Kodlama zamanını kısaltır, performansı arttırır.
         * ----------------------------------------------------------------------------------------
         * S -> Single Responsibility - Tek Sorumluluk İlkesi
         * Bir sınıf, bir method sadece tek bir göreve odaklanmalı ve tek bir iş yapmalıdır.
         * IPostRepository, UserProfileController - save(), findById, getAllByUserNameAndPassword()
         * ----------------------------------------------------------------------------------------
         * O -> Open/Closed - Açıklık Kapalılık İlkesi
         * (Bir sınıf Değişime KAPALI, gelişime AÇIK olmalıdır). Bir sınıfı kodlarken
         * nihayi halini kodlamalısınız yani o sınıf için yazılabilecek gerekli nihayi
         * kodları yazmalısınız. Böylece sınıf değişime kapalı olur, ancak bu sınıd yeni
         * geliştirmelere açk olabilir bunu da bu sınıftan SubClass türeterek sağlarız.
         * ---------------------------------------------------------------------------------------
         * L -> Liskov Substutition - Liskov Prensibi
         * Gereksiz method tanımlamaları ve kullanımlarından uzak durmalısınız. Eğer sınıflar
         * arasında ortak method tanımlamaları var ise mutlaka bir ParentClass içinde toplanarak
         * miras alınmalıdır. Ek özellikler ve method tanımlamaları mutlaka interface aracılığı
         * ile tanımlamalı ve kullanılmalıdır.
         * ---------------------------------------------------------------------------------------
         * I -> Interface Segregation - Genel Arayüz Tanımlama İlkesi
         * Uyglamarı kullanırken genellikle Interface lerden yararlanırız, ancak genel tanımlı
         * interface oluşturmak uygulamayı geliştirirken gayet verimli ve gelişime açık olmasını
         * sağlıyor.
         * -> Repository
         *   -> JpaRepository (İlişkisel DB ler için işlemler gerçekleştirir)
         *     -> ListCrudRepository
         *       ->CrudRepository
         *   -> JDBCRepository (Java DB Connection İşlemleri)
         *   -> MongoRepository (MongoDB için DB İşlemlerini Yönetiyor)
         * ---------------------------------------------------------------------------------------
         * D -> Dependency Inversion
         * Sınıflar için birbirlerine belli bir noktadab sonra bağımlılık atfetmeye başlar ve bu
         * kaçınılmazdır. Ancak uygulamamızda bu bağımlılıkların mümkün olduğunca zayıflatılmasına
         * çalışmalıyız.
         */
    }
}
