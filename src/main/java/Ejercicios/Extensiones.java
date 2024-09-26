package Ejercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Extensiones {
    public static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6378.0");
    private static final MathContext mc = new MathContext(34, RoundingMode.HALF_UP);

    public static BigDecimal distanciaKm(Posicion posOrigen, Posicion posDestino) {
        BigDecimal difLatitud = enRadianes(new BigDecimal(posDestino.getLatitud()).subtract(new BigDecimal(posOrigen.getLatitud()), mc));
        BigDecimal difLongitud = enRadianes(new BigDecimal(posDestino.getLongitud()).subtract(new BigDecimal(posOrigen.getLongitud()), mc));

        BigDecimal a = sinSquared(difLatitud.divide(new BigDecimal("2"), mc))
                .add(cos(enRadianes(new BigDecimal(posOrigen.getLatitud())))
                        .multiply(cos(enRadianes(new BigDecimal(posDestino.getLatitud())))
                                .multiply(sinSquared(difLongitud.divide(new BigDecimal("2"), mc)), mc), mc), mc);

        BigDecimal c = new BigDecimal("2").multiply(atan2(sqrt(a), sqrt(BigDecimal.ONE.subtract(a, mc))), mc);

        return RADIO_TIERRA_KM.multiply(c, mc);
    }

    private static BigDecimal enRadianes(BigDecimal valor) {
        return valor.multiply(new BigDecimal(Math.PI)).divide(new BigDecimal("180"), mc);
    }

    private static BigDecimal sinSquared(BigDecimal value) {
        BigDecimal sin = new BigDecimal(Math.sin(value.doubleValue()));
        return sin.multiply(sin, mc);
    }

    private static BigDecimal cos(BigDecimal value) {
        return new BigDecimal(Math.cos(value.doubleValue()));
    }

    private static BigDecimal sqrt(BigDecimal value) {
        return new BigDecimal(Math.sqrt(value.doubleValue()));
    }

    private static BigDecimal atan2(BigDecimal y, BigDecimal x) {
        return new BigDecimal(Math.atan2(y.doubleValue(), x.doubleValue()));
    }
}
