public class krediUI {
    public void hesapla(BasedkrediManager basedkrediManager){
        basedkrediManager.krediHesapla();
    }

    public void hesapla(double krediMiktari, BasedkrediManager basedkrediManager) {
        double sonuc = basedkrediManager.hesapla(krediMiktari); // Doğru kullanım, örnek olarak BasedkrediManager'in örneğini kullanıyoruz.
        System.out.println("Kredi miktarı: " + krediMiktari + ", Hesaplanan tutar: " + sonuc);
    }
}

