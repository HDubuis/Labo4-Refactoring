
package ch.heigvd.gen2020;

public enum Size {
    XS,
    S,
    M,
    L,
    XL,
    XXL,
    INVALIDE{
        @Override
        public String toString() {
            return "Invalid Size";
        }
    };

    public String toString() {
        return super.name();
    }
}