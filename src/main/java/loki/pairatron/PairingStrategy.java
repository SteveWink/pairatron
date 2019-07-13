package loki.pairatron;

import java.time.LocalDate;
import java.util.List;

public interface PairingStrategy {

    public List<Pairing> doPairing(List<String> availableDevs, List<String> streams,
                                   List<List<Pairing>> history,  LocalDate dateToPlanFor );
}

