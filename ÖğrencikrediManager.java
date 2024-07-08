public class ÖğrencikrediManager extends BasedkrediManager{
    @Override
    public double hesapla(double krediMiktari) {
        return krediMiktari * 1.05; // Örnek faiz oranı %5
    }
}
