public class ÖğretmenkrediManager extends BasedkrediManager{
    @Override
    public double hesapla(double krediMiktari) {
        return krediMiktari * 1.09; // Örnek faiz oranı %9
    }
}
