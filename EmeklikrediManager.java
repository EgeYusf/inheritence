public class EmeklikrediManager extends BasedkrediManager{
    @Override
    public double hesapla(double krediMiktari) {
        return krediMiktari * 1.12; // Örnek faiz oranı %12
    }
}

