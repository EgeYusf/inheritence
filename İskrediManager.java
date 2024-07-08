public class İskrediManager extends BasedkrediManager{
    @Override
    public double hesapla(double krediMiktari) {
        return krediMiktari * 1.15; // Örnek faiz oranı %15
    }
}
