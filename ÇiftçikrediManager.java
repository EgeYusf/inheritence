public class ÇiftçikrediManager extends BasedkrediManager{
    @Override
    public double hesapla(double krediMiktari) {
        return krediMiktari * 1.07; // Örnek faiz oranı %7
    }
}
